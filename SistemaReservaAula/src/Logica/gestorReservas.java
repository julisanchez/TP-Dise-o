package Logica;

import DTO.condicionDTO;
import DTO.reservaDTO;
import Datos.bedel;
import Datos.en;
import Datos.periodo;
import Datos.reserva;
import Interfaces.menuBedel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author julisanchez
 */

public class gestorReservas {
    
    public static void registrar(reservaDTO reserva){
        
        reserva nuevaReserva = new reserva();
        nuevaReserva.cantidadAlumnos = reserva.getCant_alumnos();
        nuevaReserva.clase = claseDAO.getClase(reserva.getIdClase());
        nuevaReserva.docente = docenteDAO.getDocente(reserva.getIdDocente());
        nuevaReserva.bedel =(bedel)  usuarioDAO.getBedel(menuBedel.bedelOnline.getUsername());
        
        periodo periodoReserva = new periodo();
        
        if(reserva.getTipo().equals("Periodica")){
            System.out.println("Id reserva: "+reserva.getIdPeriodo());
            periodoReserva = reservasDAO.getPeriodo(reserva.getIdPeriodo());
        }
        
        for(int i=0; i<reserva.getHorarios().size(); i++){
            en reservaEn = new en();
            reservaEn.tipo = reserva.getTipo();
            reservaEn.horario = reserva.getHorarios().get(i);
            reservaEn.duracion = reserva.getDuracion().get(i);
            reservaEn.fecha = reserva.getFechas().get(i);
            reservaEn.idAula = aulaDAO.getAula(reserva.getIdAulas().get(i));
            
            if(reserva.getTipo().equals("Periodica")){
                reservaEn.idPeriodo = periodoReserva;
            }
            else{
                System.out.println("Id reserva: "+reserva.getHorarios().get(i).toString());
                reservaEn.idPeriodo = reservasDAO.getPeriodo(reserva.getHorarios().get(i));
                if(reservaEn.idPeriodo.idPeriodo == 0) reservaEn.idPeriodo = null;
            }
            
            nuevaReserva.ens.add(reservaEn);
        }
        
        reservasDAO.guardar(nuevaReserva);
    }
    
    //retorna las aulas disponibles por cada dia
    public static List<List<Integer>> buscarDisponibles(List<Integer> idAulas, condicionDTO condicion){
        List<en> reservas = reservasDAO.buscarReservas(idAulas);
        List<List<Integer>> aulasPorDia = new ArrayList<>();
        
        for(String dia: condicion.dias){
            aulasPorDia.add(idAulas);
        }
        
        for(int i=0; i<aulasPorDia.size();i++){
            for(en reserva : reservas){
            //fijarse si esa 
                if(aulasPorDia.get(i).contains(new Integer(reserva.idAula.idAula))){
                    if(compartenHorario(reserva, condicion, i)){
                        aulasPorDia.get(i).remove(new Integer(reserva.idAula.idAula));
                    }
                }
            }
        }
        
        return aulasPorDia;
    }
    
    private static boolean compartenHorario(en reserva, condicionDTO condicion, int diaNumero){
        
        return (compartenDia(reserva, condicion, diaNumero) && superponeHorario(reserva, condicion, diaNumero));
     
    }
    
    private static boolean compartenDia(en reserva, condicionDTO condicion, int diaNumero){
        
        
        if(condicion.tipo.equals("Periodica") ){
            if(reserva.tipo.equals("Periodica")){
                if((condicion.periodo == reserva.idPeriodo.getPeriodo() ||
                   reserva.idPeriodo.getPeriodo() == 3 ||
                   condicion.periodo == 3) &&
                   condicion.dias.get(diaNumero).equals(reserva.fecha) &&
                   reserva.idPeriodo.getAnio() == condicion.periodo){
                    return true;
                }
                //TODO: ver si pertenecen al mismo año
            }
            else{
                if(reserva.fecha.equals(condicion.dias.get(diaNumero))  && 
                  (reserva.idPeriodo.getPeriodo() == condicion.periodo ||
                   condicion.periodo == 3) &&
                   reserva.idPeriodo.getAnio() == condicion.periodo) return true;
                    // TODO: ver si el dia de la reserva pertenece al mismo cuatrimestre de la condicion
                    //TODO: ver si pertenecen al mismo año
            }
        }
        else{
            if(reserva.tipo.equals("Periodica")){
                if(reserva.fecha.equals(condicion.dias.get(diaNumero)) &&
                   (reserva.idPeriodo.getPeriodo() == condicion.periodo ||
                   reserva.idPeriodo.getPeriodo() == 3) &&
                    reserva.idPeriodo.getAnio() == condicion.fechas.get(diaNumero).get(Calendar.YEAR)) return true;
                    //TODO: ver si pertenecen al mismo año
            }
            else{
                Calendar diaReserva = Calendar.getInstance();
                diaReserva.set(reserva.horario.get(Calendar.YEAR), reserva.horario.get(Calendar.MONTH), reserva.horario.get(Calendar.DAY_OF_MONTH));
                Calendar diaCondicion = Calendar.getInstance();
                diaCondicion.set(condicion.fechas.get(diaNumero).get(Calendar.YEAR), condicion.fechas.get(diaNumero).get(Calendar.MONTH), condicion.fechas.get(diaNumero).get(Calendar.DAY_OF_MONTH));
                if(diaReserva.equals(diaCondicion)) return true;
            }
        }
        
        return false;
    }
    
    private static boolean superponeHorario(en reserva, condicionDTO condicion, int diaNumero){
        Calendar horarioInicio = Calendar.getInstance();
        horarioInicio.set(Calendar.HOUR_OF_DAY,condicion.horarios.get(diaNumero).getHours());
        horarioInicio.set(Calendar.MINUTE,condicion.horarios.get(diaNumero).getMinutes());
        
        Calendar horarioFin = Calendar.getInstance();
        horarioFin.set(Calendar.HOUR_OF_DAY,condicion.duracion.get(diaNumero).getHours());
        horarioFin.set(Calendar.MINUTE,condicion.duracion.get(diaNumero).getMinutes());
        
        horarioFin.add(Calendar.MINUTE, horarioInicio.get(Calendar.MINUTE));
        horarioFin.add(Calendar.HOUR_OF_DAY, horarioInicio.get(Calendar.HOUR_OF_DAY));

        
        Calendar horarioInicioReserva = Calendar.getInstance();
        horarioInicioReserva.set(Calendar.HOUR_OF_DAY,reserva.horario.get(Calendar.HOUR_OF_DAY));
        horarioInicioReserva.set(Calendar.MINUTE,reserva.horario.get(Calendar.MINUTE));
        
        Calendar horarioFinReserva = horarioInicioReserva;
        
        horarioFinReserva.add(Calendar.MINUTE, reserva.duracion.getMinutes());
        horarioFinReserva.add(Calendar.HOUR_OF_DAY, reserva.duracion.getHours());
        
        return !(horarioInicioReserva.after(horarioFin) || horarioFinReserva.before(horarioInicio));
    }
    
    public static List<String> getDiasSemanas(List<Calendar> fechas){
        List<String> diasSemanas = new ArrayList<>();
        String dia = "";
        
        for(Calendar fecha:fechas){
            switch (fecha.get(Calendar.DAY_OF_WEEK)){
                case 1:
                    dia = "Domingo";
                    break;
                case 2: 
                    dia = "Lunes";
                    break;
                case 3:
                    dia = "Martes";
                    break;
                case 4:
                    dia = "Miercoles";
                    break;
                case 5:
                    dia = "Jueves";
                    break;
                case 6:
                    dia = "Viernes";
                    break;
                case 7:
                    dia = "Sabado";
                    break;
            }
            
            diasSemanas.add(dia);
        }
        
        return diasSemanas;
    }
    
    public static List<periodo> obtenerPeriodos(){
        return reservasDAO.getPeriodosDisponibles();
    }
}

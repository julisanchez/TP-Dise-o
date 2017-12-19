/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import DTO.condicionDTO;
import Datos.aula;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author julisanchez
 */
public class gestorAula {
    public static aula[] buscarDisponibilidad(condicionDTO condicion){
        aula[] aulas = new aula[3];
        
        List<Integer> idAulas = aulaDAO.buscarAula(condicion);
        gestorReservas.buscarDisponibles(idAulas, condicion);
        
        for(Calendar fecha:condicion.fechas){
            
        }
        
        return aulas;
    }
    
    public aula[] selecciona3(){
        aula[] aulas = new aula[3];
        return aulas;
    }
}

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
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author julisanchez
 */
public class gestorAula {
    public static List<aula[]> buscarDisponibilidad(condicionDTO condicion){
        aula[] aulas;
        List<aula[]> resultado = new ArrayList<>();
        
        List<Integer> idAulas = aulaDAO.buscarAula(condicion);
        List<List<Integer>> aulasDisponibles = gestorReservas.buscarDisponibles(idAulas, condicion);
        for(List<Integer> aulasPorDia : aulasDisponibles){
            aulas = selecciona3(aulasPorDia);
            resultado.add(aulas);
        }
        
        return resultado;
    }
    
    public static aula[] selecciona3(List<Integer> aulasDisponibles){
        
        class CapacidadComparator implements Comparator<aula> {
            @Override
            public int compare(aula a, aula b) {
                //     return 1 if b should be before a 
                //     return -1 if a should be before b
                //     return 0 otherwise
                return a.capacidad < b.capacidad ? -1: b.capacidad < a.capacidad? 1:0;
            }
        }
        
        aula[] aulas = new aula[3];
        List<aula> aulasTemp = new ArrayList<>();
        
        for(Integer idAula:aulasDisponibles){
            aulasTemp.add(aulaDAO.getAula(idAula));
        }
        
        aulasTemp.sort(new CapacidadComparator());
        
        for(int i=0; i<3; i++){
            aulas[i] = aulasTemp.get(i);
        }
        
        return aulas;
    }
}

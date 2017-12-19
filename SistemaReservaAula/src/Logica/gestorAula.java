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
    public static List<aula[]> buscarDisponibilidad(condicionDTO condicion){
        aula[] aulas = new aula[3];
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
        aula[] aulas = new aula[3];
        return aulas;
    }
}

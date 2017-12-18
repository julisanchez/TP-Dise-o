/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author julisanchez
 */
public class condicionDTO {
    public int cant_alumnos;
    public String tipo;
    /*
    Valores variable tipo
    Periodica
    Esporadica
    */
    public String tipoAula;
    public List<Calendar> fechas;
    public List<String> dias;
    public List<Time> horarios;
    public List<Time> duracion;
    public int periodo;
    /*
    Valores variable periodo
    1-Primer cuatrimestre
    2-Segundo Cuatrimestre
    3-Anual
    */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    public List<Calendar> fechas = new ArrayList<>();
    public List<String> dias = new ArrayList<>();
    public List<Date> horarios = new ArrayList<>();
    public List<Date> duracion = new ArrayList<>();
    public int periodo;
    /*
    Valores variable periodo
    1-Primer cuatrimestre
    2-Segundo Cuatrimestre
    3-Anual
    */
}

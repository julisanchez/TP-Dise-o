/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexis Mandracchia
 */
public class reservaDTO {
    private String tipo;
    private int cant_alumnos;
    // Lunes, martes, miercoles, etc
    private List<String> fechas;
    private List<Calendar> horarios;
    private List<Date> duracion;
    private List<Integer> idAulas;
    private int idPeriodo;
    private int idDocente;
    private int idClase;

    public reservaDTO(String tipo, int cant_alumnos, List<String> fechas, List<Calendar> horarios, List<Date> duracion, List<Integer> idAulas, int idPeriodo, int idDocente, int idClase) {
        this.tipo = tipo;
        this.cant_alumnos = cant_alumnos;
        this.fechas = fechas;
        this.horarios = horarios;
        this.duracion = duracion;
        this.idAulas = idAulas;
        this.idPeriodo = idPeriodo;
        this.idDocente = idDocente;
        this.idClase = idClase;
    }

    public reservaDTO() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCant_alumnos() {
        return cant_alumnos;
    }

    public void setCant_alumnos(int cant_alumnos) {
        this.cant_alumnos = cant_alumnos;
    }

    public List<String> getFechas() {
        return fechas;
    }

    public void setFechas(List<String> fechas) {
        this.fechas = fechas;
    }

    public List<Calendar> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Calendar> horarios) {
        this.horarios = horarios;
    }

    public List<Date> getDuracion() {
        return duracion;
    }

    public void setDuracion(List<Date> duracion) {
        this.duracion = duracion;
    }

    public List<Integer> getIdAulas() {
        return idAulas;
    }

    public void setIdAulas(List<Integer> idAulas) {
        this.idAulas = idAulas;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }    
    
}

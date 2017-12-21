/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class en implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int idEn;
    //@Id
    @ManyToOne
    @JoinColumn(name="idAula")
    @Fetch(FetchMode.JOIN)
    public aula idAula;
    //@Id
    @ManyToOne
    @JoinColumn(name="idReserva")
    @Fetch(FetchMode.JOIN)
    public reserva idReserva;
    @ManyToOne
    @JoinColumn(name="idPeriodo")
    @Fetch(FetchMode.JOIN)
    public periodo idPeriodo;
    //Fecha es el dia de la semana, ej: Martes,Miercoles,Jueves,etc. Se usa tanto en esporadica como en periodica
    public String fecha;
    @Temporal(TemporalType.TIMESTAMP)
    //Horario es la fecha conpleta de la clase con su dia, hora y minutos si es esporadica y si es periodica solamente la hora y los minutos
    //@Id
    public Calendar horario;
    @Temporal(TemporalType.TIME)
    // Duracion es la duracion de la clase, ej: 2:30 hs
    public Date duracion;
    //Esporadica o Periodica
    public String tipo;

    public en() {
    }
    
    
}

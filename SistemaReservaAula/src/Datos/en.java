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
    @ManyToOne
    @JoinColumn(name="idAula")
    @Fetch(FetchMode.JOIN)
    public aula idAula;
    @Id
    @ManyToOne
    @JoinColumn(name="idReserva")
    @Fetch(FetchMode.JOIN)
    public reserva idReserva;
    @ManyToOne
    @JoinColumn(name="idPeriodo")
    @Fetch(FetchMode.JOIN)
    public periodo idPeriodo;
    public String fecha;
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar horario;
    @Temporal(TemporalType.TIME)
    public Date duracion;
    public String tipo;

    public en() {
    }
    
    
}

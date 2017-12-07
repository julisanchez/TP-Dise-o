/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    private aula idAula;
    @Id
    @ManyToOne
    @JoinColumn(name="idReserva")
    private reserva idReserva;
    @ManyToOne
    @JoinColumn(name="idPeriodo")
    private periodo idPeriodo;
    private String fecha;
    @Temporal(TemporalType.TIME)
    private Date horario;
    @Temporal(TemporalType.TIME)
    private Date duracion;
    private String tipo;

    public en() {
    }
}

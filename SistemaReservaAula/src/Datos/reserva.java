/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class reserva implements Serializable {
    @Id
    private int idReserva;
    private int cantidadAlumnos;
    @ManyToOne
    @JoinColumn(name="bedel")
    private bedel bedel;
    @ManyToOne
    @JoinColumn(name="docente")
    private docente docente;
    @ManyToOne
    @JoinColumn(name="clase")
    private clase clase;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="idReserva")
    @OrderColumn
    private List<en> ens;

    public reserva() {
    }
}

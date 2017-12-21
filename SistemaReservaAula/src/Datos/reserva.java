/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class reserva implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int idReserva;
    public int cantidadAlumnos;
    @ManyToOne
    @JoinColumn(name="bedel")
    public bedel bedel;
    @ManyToOne
    @JoinColumn(name="docente")
    public docente docente;
    @ManyToOne
    @JoinColumn(name="clase")
    public clase clase;
    
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="idReserva")
    @OrderColumn
    public List<en> ens = new ArrayList<>();

    public reserva() {
    }
}

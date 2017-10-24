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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class clase implements Serializable {
    @Id
    private int idClase;
    private String nombre;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="clase")
    @IndexColumn(name="idx")
    private List<reserva> reservas;

    public clase() {
    }
}
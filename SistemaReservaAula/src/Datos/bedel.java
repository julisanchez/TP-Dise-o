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
public class bedel extends usuario implements Serializable {
    private String apellido;
    private String nombre;
    private String turno;
    private int usuario;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="bedel")
    @IndexColumn(name="idx")
    private List<reserva> reservas;

    public bedel() {
    }
}

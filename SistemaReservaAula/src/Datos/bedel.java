/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import DTO.bedelDTO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.Type;

/**
 *
 * @author julisanchez
 */
@Entity
public class bedel extends usuario implements Serializable {
    private String apellido;
    private String nombre;
    private String turno;
    @Type(type="boolean")
    private boolean activo;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="bedel")
    @OrderColumn
    private List<reserva> reservas;

    public bedel() {
    }

    public bedel(String apellido, String nombre, String turno, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.turno = turno;
        this.activo = activo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<reserva> reservas) {
        this.reservas = reservas;
    }
    
    public void modificar(bedelDTO bedel){
        this.apellido = bedel.getApellido();
        this.nombre = bedel.getNombre();
        this.turno = bedel.getTurno();
    }

}

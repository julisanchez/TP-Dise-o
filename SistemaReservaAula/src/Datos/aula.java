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
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.Type;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class aula implements Serializable {
    @Id
    public int idAula;
    private int num;
    private int piso;
    private int capacidad;
    @Type(type="boolean")
    private Boolean estado;
    @Type(type="boolean")
    private Boolean ac;
    private int pizarron;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="idAula")
    @OrderColumn
    private List<en> ens;

    public aula() {
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class periodo implements Serializable {
    @Id
    public int idPeriodo;
    @Temporal(TemporalType.DATE)
    public Calendar inicio;
    @Temporal(TemporalType.DATE)
    public Calendar fin;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="idPeriodo")
    @OrderColumn
    public List<en> ens;

    public periodo() {
    }
    
    public int getPeriodo(){
        return idPeriodo/100;
    }
    public int getAnio(){
        return 2000+(idPeriodo%100);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.Date;
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
import org.hibernate.annotations.IndexColumn;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class periodo implements Serializable {
    @Id
    private int idPeriodo;
    @Temporal(TemporalType.DATE)
    private Date inicio;
    @Temporal(TemporalType.DATE)
    private Date fin;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="idPeriodo")
    @OrderColumn
    private List<en> ens;

    public periodo() {
    }
}

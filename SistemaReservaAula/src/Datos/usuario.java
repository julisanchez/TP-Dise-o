/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.IndexColumn;



/**
 *
 * @author julisanchez
 */
@Entity
@Inheritance()
public class usuario implements Serializable {
    
    @Id
    @Column
    private int idUsuario;
    
    @Column
    private String username;
    
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="usuario")
    @IndexColumn(name="idx")
    private List<password> passwords;

    public usuario() {
    }
}


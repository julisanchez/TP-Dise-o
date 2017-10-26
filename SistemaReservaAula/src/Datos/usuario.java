/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idUsuario;
    
    @Column(unique=true)
    private String username;
    
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="usuario")
    @IndexColumn(name="idx")
    private List<password> passwords;

    public usuario() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<password> getPasswords() {
        return passwords;
    }

    public void setPasswords(List<password> passwords) {
        this.passwords = passwords;
    }
     
    
}


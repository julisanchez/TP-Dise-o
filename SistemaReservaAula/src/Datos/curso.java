/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author julisanchez
 */
@Entity
@Table
public class curso extends clase implements Serializable {
    private String profesores;
    private int clase;

    public curso() {
    }
}

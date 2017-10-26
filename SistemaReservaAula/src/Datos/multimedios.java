/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author julisanchez
 */
@Entity
public class multimedios extends aula implements Serializable {
    @Type(type="yes_no")
    private Boolean televisor;
    @Type(type="yes_no")
    private Boolean proyector;
    @Type(type="yes_no")
    private Boolean pc;
    @Type(type="yes_no")
    private Boolean dvd;

    public multimedios() {
    }
}

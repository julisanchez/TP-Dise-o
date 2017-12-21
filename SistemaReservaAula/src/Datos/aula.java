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
    public int num;
    public int piso;
    public int capacidad;
    @Type(type="boolean")
    public Boolean estado;
    @Type(type="boolean")
    public Boolean ac;
    public int pizarron;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="idAula")
    @OrderColumn
    private List<en> ens;

    public aula() {
    }
    
    public static String getTipoAula(String StringAula) {
        String tipo = "";
        
        switch (StringAula){
            case "Sin recursos adicionales":
                tipo = "sinRecursos";
                break;
            case "Informática":
                tipo = "informatica";
                break;
            case "Multimedios":
                tipo = "multimedios";
                break;
        }
        
        return tipo;
    }
}

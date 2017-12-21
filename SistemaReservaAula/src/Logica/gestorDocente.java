/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.docente;
import java.util.List;

/**
 *
 * @author julisanchez
 */
public class gestorDocente {
    public static List<docente> obtenerDocentes(){
        return docenteDAO.getDocentes();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;

/**
 *
 * @author julisanchez
 */
public class fInicio {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
}

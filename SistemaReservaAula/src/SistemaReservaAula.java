/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Interfaces.menuInicio;
import Logica.conexion;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author julisanchez
 */
public class SistemaReservaAula {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        conexion conex = conexion.getInstance();
        
        try {
            conex.setUp();
        } catch (Exception ex) {
            Logger.getLogger(SistemaReservaAula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new menuInicio().setVisible(true);
        
    }
    
}

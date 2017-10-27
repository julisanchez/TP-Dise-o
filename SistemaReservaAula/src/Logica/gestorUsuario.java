/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Interfaces.menuAdmin;
import javax.swing.JOptionPane;

/**
 *
 * @author julisanchez
 */
public class gestorUsuario {
    public void registrar(DTO.bedelDTO Bedel){
        usuarioDAO usuario = new usuarioDAO();
        
        if(!usuario.validarU(Bedel.getUsername())){ //validar si ya exite un username.Devuelve #T no existe, #F lo contrario.
            JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese nombre.","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(usuario.crearBedel(Bedel)){
            JOptionPane.showMessageDialog(null,"El usuario se creó correctamente.","Usuario creado",JOptionPane.PLAIN_MESSAGE);
            
            new menuAdmin().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"El usuario no se ha podido crear.","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}

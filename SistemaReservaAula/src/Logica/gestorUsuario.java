/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import DTO.bedelDTO;
import Datos.bedel;
import Datos.password;
import Datos.usuario;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author julisanchez
 */
public class gestorUsuario {
    public static int registrar(DTO.bedelDTO Bedel){
        usuarioDAO usuario = new usuarioDAO();
        if(!usuario.validarU(Bedel.getUsername())){ //validar si ya exite un username.Devuelve #T no existe, #F lo contrario.
            //JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese nombre","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        else if(!politicasDeContrasenia.validarC(Bedel.getPass(),Bedel.getUsername())){
            return 2;
        }
        else if(crearBedel(Bedel)){
            //JOptionPane.showMessageDialog(null,"El usuario se creo correctamente","Usuario creado",JOptionPane.PLAIN_MESSAGE);
            return 0;
            }
            else{
                //JOptionPane.showMessageDialog(null,"El usuario no se a podido crear","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
            return 3;
            }
    }
    public static boolean crearBedel(bedelDTO registrarBedelDTO){
        
        bedel Bedel = new bedel();
        
        Bedel.setApellido(registrarBedelDTO.getApellido());
        Bedel.setNombre(registrarBedelDTO.getNombre());
        Bedel.setTurno(registrarBedelDTO.getTurno());
        Bedel.setActivo(true);
        Bedel.setUsername(registrarBedelDTO.getUsername());
        
        password Password = new password();
        
        Password.setCodigo(registrarBedelDTO.getPass());
        Password.setFechaCreacion(LocalDateTime.now());
        
        List<password> Passwords = new ArrayList<>();
        Passwords.add(Password);
        
        Bedel.setPasswords(Passwords);
         
        usuarioDAO usuario = new usuarioDAO();
        return usuario.guardar(Bedel);
        
    }
    
    public List<bedelDTO> buscar(String sApellido, String sTurno){
        usuarioDAO usuario = new usuarioDAO();
        List<bedelDTO> bedeles;
        bedeles = usuario.buscarBedeles(sApellido, sTurno);
        return bedeles;
    } 
    
    public static int modificar(bedelDTO bedelNuevo){
        
        bedel bedelViejo = usuarioDAO.getBedel(bedelNuevo.getUsername());
        if(!bedelViejo.getPassword().getCodigo().equals(bedelNuevo.getPass())){
            if(!politicasDeContrasenia.validarC(bedelNuevo.getPass(),bedelNuevo.getUsername())) return 0;
            password pass = new password(bedelNuevo.getPass());
            bedelViejo.addHistorial(pass);
            
        }
        bedelViejo.modificar(bedelNuevo);
        if(usuarioDAO.guardar(bedelViejo)){
            return 1;
        }
        else{
            return 2;
        }
    } 
    
    public static <T extends usuario> T iniciarSesion(String usuario, String contrasenia){
        
    }
}

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
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author julisanchez
 */
public class usuarioDAO {
    
    //Valida si el usuario existe en la base de datos. Si es asi retorna true
    public boolean validarU(String username){
        
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        
        Query query = session.createQuery("SELECT idUsuario FROM usuario where username=:username");
        query.setParameter( "username", username);
        
        try {
            String id = query.getSingleResult().toString();
        } catch (NoResultException nre) {
            session.close();
            return true;
        }
 
        session.close();
        return false; 
    }
    
    public boolean crearBedel(bedelDTO registrarBedelDTO){
        
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
         
        return guardar(Bedel,Password);
        
    }
    
    private boolean guardar(bedel Bedel, password Password){
        try {
            SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(Bedel);
            session.save(Password);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            return false;
        }
       return true; 
    }

    
}

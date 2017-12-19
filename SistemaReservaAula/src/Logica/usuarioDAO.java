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
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author julisanchez
 */
public class usuarioDAO {
    
    //Valida si el usuario existe en la base de datos. Si es asi retorna true
    public static boolean validarU(String username){
        
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
    
    
    
    public static boolean guardar(bedel Bedel){
        try {
            SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(Bedel);
           // session.save(Password);
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println(e);
            return false;
        }
       return true; 
    }

    public static List<bedelDTO> buscarBedeles(String sApellido, String sTurno){
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query;
        String where="WHERE DTYPE='bedel'";
        
        if(!sApellido.isEmpty()){
            where += " AND apellido=:apellido";
        }
        if(!"Todos".equals(sTurno)){
            where+=" AND turno=:turno"; 
        }
        query = session.createQuery("SELECT u.idUsuario, u.apellido, u.nombre,u.turno,u.username, MAXELEMENT(passwords) FROM bedel u "+where+"  GROUP BY u.idUsuario");

        if(!sApellido.isEmpty()){
            query.setParameter( "apellido", sApellido);
        }
        if(!"Todos".equals(sTurno)){
            query.setParameter( "turno", sTurno);
        }
        
        List<bedelDTO> bedelList = new ArrayList<bedelDTO>();
        bedelDTO temp = null;
        try {
            
            List<Object[]> bedeles = query.getResultList();
            for (Object[] bedel : bedeles) {
                System.out.println(bedel[1].toString() + ", "  + bedel[2].toString()+" / "+bedel[3].toString()+" / "+bedel[4]+" / "+((password)bedel[5]).getCodigo());
                temp = new bedelDTO((int) bedel[0],bedel[1].toString(),bedel[2].toString(),bedel[3].toString(),bedel[4].toString(),((password)bedel[5]).getCodigo());
                bedelList.add(temp);
                temp = null;
            }
            session.close();
            return bedelList;
  
         
        } catch (NoResultException nre) {
            session.close();
            return null;
        }
        
    }
    
    public static bedel getBedel(String username){
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT u FROM bedel u WHERE u.username=:username");
        query.setParameter( "username", username);
       
        bedel Bedel = (bedel) query.getSingleResult();
        session.close();
        return Bedel;
    }

    static <T extends usuario> T iniciarSesion(String username, String contrasenia) {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        
        T user = (T) session.bySimpleNaturalId( usuario.class ).getReference(username);
        
        if(user.getPassword().getCodigo().equals(contrasenia)){
            System.out.println(user.getUsername()+ " ha iniciado sesion");
            session.close();
            return (T) user;
        }
        System.out.println(user);
        System.out.println("La contrasenia es incorrecta");
        session.close();
        return null;
    }
    
    static String getUserType(usuario user){
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT type(u) FROM usuario u WHERE u.username=:user");
        query.setParameter( "user", user.getUsername());
       
        Class temp = (Class) query.getSingleResult();
        String tipo = temp.getSimpleName();
        
        session.close();
        return tipo;
    }
    
    
}

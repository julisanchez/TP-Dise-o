/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import DTO.condicionDTO;
import Datos.aula;
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
public class aulaDAO {
    
    public static List<Integer> buscarAula(condicionDTO condicion){
        List<Integer> lista = new ArrayList<>();
        
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query;
        
        //query = session.createSQLQuery("SELECT * FROM aula a WHERE a.estado=true AND a.capacidad>=:capacidad AND a.DTYPE=:tipo");
        query = session.createQuery("FROM "+ condicion.tipoAula +" a WHERE a.estado=true AND a.capacidad>=:capacidad");
        
        query.setParameter("capacidad", condicion.cant_alumnos);
        //query.setParameter("tipo", condicion.tipoAula);
        
        try {
            List<aula> temp = query.getResultList();
            
            for(aula s : temp){
                lista.add(s.idAula);
            }

        }catch (NoResultException nre) {

        }
        finally{
            session.close();
        }
        
        return lista;
    }

    static aula getAula(Integer aulaId) {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        
        aula Aula = session.byId(aula.class).getReference(aulaId);
     
        session.close();
        
        return Aula;
    }
}

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
        
        query = session.createQuery("a.idAula FROM :entity a WHERE a.estado=true AND a.capacidad>=:capacidad");
        
        query.setParameter("entity", condicion.tipoAula);
        query.setParameter("capacidad", condicion.cant_alumnos);
        
        try {
            lista = query.getResultList();

        }catch (NoResultException nre) {

        }
        finally{
            session.close();
        }
        
        return lista;
    }

    static aula getAula(Integer get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

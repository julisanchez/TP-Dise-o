/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.clase;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author julisanchez
 */
class claseDAO {

    static clase getClase(int idClase) {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        
        clase Clase = session.byId(clase.class).getReference(idClase);
     
        session.close();
        
        return Clase;
    }

    static List<clase> getClases() {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM clase");
       
        List<clase> clases = query.getResultList();
        session.close();
        return clases;
    }
    
}

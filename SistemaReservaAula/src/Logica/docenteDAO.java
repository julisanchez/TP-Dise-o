/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.docente;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author julisanchez
 */
class docenteDAO {

    static docente getDocente(int idDocente) {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        
        docente doc = session.byId(docente.class).getReference(idDocente);
     
        session.close();
        
        return doc;

    }
    
    static List<docente> getDocentes() {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM docente");
       
        List<docente> docList = query.getResultList();
        session.close();
        return docList;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.en;
import Datos.reserva;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author julisanchez
 */
public class reservasDAO {
    public static List<en>  buscarReservas(List<Integer> aulas){
        List<en> lista = new ArrayList<>();
        
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = null;
        
        for(int idAula : aulas){
            query = session.createQuery("FROM en e WHERE e.idAula.idAula=:idAula");
            query.setParameter("idAula", idAula);
            try {
                lista.addAll(query.getResultList());
            }catch(Exception e) {
                session.close();
                return null;
            }
            
        }
        
        session.close();
        
        return lista;
    }
}

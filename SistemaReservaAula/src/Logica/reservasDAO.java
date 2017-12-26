/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.en;
import Datos.periodo;
import Datos.reserva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
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
                lista = query.getResultList();
            }catch(Exception e) {
                session.close();
                return null;
            }
            
        }
        
        session.close();
        
        return lista;
    }

    static periodo getPeriodo(int idPeriodo) {
        System.out.println("Periodo en getPeriodo" +idPeriodo);
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        
        periodo Periodo = session.get(periodo.class, idPeriodo);
     
        session.close();
        
        return Periodo;
    }
    
    static List<periodo> getPeriodosDisponibles(){
        List<periodo> periodos;
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM periodo p WHERE  p.fin > :fecha");
        query.setParameter("fecha", Calendar.getInstance());
        
        periodos = query.getResultList();
     
        session.close();
        
        return periodos;
    }
    
    //Busca el periodo cuatrimestral al que pertence la fecha
    static periodo getPeriodo(Calendar fecha) {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM periodo p WHERE p.inicio >= :fecha AND p.fin <= :fecha");
        query.setParameter("fecha", fecha);
        periodo Periodo = new periodo();
        try {
            Periodo = (periodo) query.getResultList().get(0);
        } catch (Exception e) {
            Periodo.idPeriodo=0;
        }
        
     
        session.close();
        
        return Periodo;
    }

    static void guardar(reserva nuevaReserva) {
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        //session.clear();
        try { 
            session.beginTransaction();
            session.save(nuevaReserva);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e);
        }
        finally{
            session.close();
        }
    }
}

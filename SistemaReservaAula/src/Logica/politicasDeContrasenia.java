/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Datos.password;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author julisanchez
 */
public class politicasDeContrasenia {

/*
Las contraseñas deberán ajustarse a la política de la organización vigente.
Las políticas de contraseña de la organización se obtienen desde un sistema externo. Las
políticas definidas externamente son:
o Longitud mínima de la contraseña
o Si la contraseña debe contener signos especiales (@#$%&*)
o Si la contraseña debe contener al menos una letra mayúscula.
o Si la contraseña debe contener al menos un dígito.
o Si la contraseña puede ser igual a una contraseña anterior del usuario.
*/
   
    private static int longitud = 5;
    private static boolean signosEsp = false;
    private static boolean letraMayuscula = true;
    private static boolean numero = true;
    private static boolean contraseniaIgual = true;
    
    public static boolean validarC(password pass){
        String contrasenia = pass.getCodigo();
        boolean tieneEspeciales = contrasenia.matches("^.*[^a-zA-Z0-9]+.*$");
        boolean tieneMayusculas = contrasenia.matches("^.*[A-Z]+.*$");
        boolean tieneNumeros = contrasenia.matches("^.*[0-9]+.*$");
        
        if(contrasenia.length() < longitud){
            System.out.println("La contraseña debe tener longitud mayor o igual a "+longitud);
            return false;
        }
        
        else if(tieneEspeciales && !signosEsp){
            System.out.println("La contraseña no debe tener caracteres especiales");
            return false;
        }
        else if(!tieneEspeciales && signosEsp){
            System.out.println("La contraseña debe tener caracteres especiales");
            return false;
        }
        else if(tieneMayusculas && !letraMayuscula){
            System.out.println("La contraseña no debe tener letras mayusculas");
            return false;
        }
        else if(!tieneMayusculas && letraMayuscula){
            System.out.println("La contraseña debe tener letras mayusculas");
            return false;
        }
        else if(tieneNumeros && !numero){
            System.out.println("La contraseña no debe tener numeros");
            return false;
        }
        else if(!tieneNumeros && numero){
            System.out.println("La contraseña debe tener numeros");
            return false;
        }
        else if(existeContrasenia(pass) && !contraseniaIgual){
            System.out.println("La contraseña no se debe repetir");
            return false;
        }
        else return true;
    }
    
    public static boolean validarC(String contrasenia, String usuario){
        boolean tieneEspeciales = contrasenia.matches("^.*[^a-zA-Z0-9]+.*$");
        boolean tieneMayusculas = contrasenia.matches("^.*[A-Z]+.*$");
        boolean tieneNumeros = contrasenia.matches("^.*[0-9]+.*$");
        
        if(contrasenia.length() < longitud){
            System.out.println("La contraseña debe tener longitud mayor o igual a "+longitud);
            return false;
        }
        
        else if(tieneEspeciales && !signosEsp){
            System.out.println("La contraseña no debe tener caracteres especiales");
            return false;
        }
        else if(!tieneEspeciales && signosEsp){
            System.out.println("La contraseña debe tener caracteres especiales");
            return false;
        }
        else if(tieneMayusculas && !letraMayuscula){
            System.out.println("La contraseña no debe tener letras mayusculas");
            return false;
        }
        else if(!tieneMayusculas && letraMayuscula){
            System.out.println("La contraseña debe tener letras mayusculas");
            return false;
        }
        else if(tieneNumeros && !numero){
            System.out.println("La contraseña no debe tener numeros");
            return false;
        }
        else if(!tieneNumeros && numero){
            System.out.println("La contraseña debe tener numeros");
            return false;
        }
        else if(existeContrasenia(contrasenia,usuario) && !contraseniaIgual){
            System.out.println("La contraseña no se debe repetir");
            return false;
        }
        else return true;
    }
    
    public static boolean existeContrasenia(password contrasenia){
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT pass FROM password pass WHERE codigo=:codigo AND usuario=:usuario");
        query.setParameter( "codigo", contrasenia.getCodigo());
        query.setParameter("usuario", contrasenia.getUsuario());
        if(query.getFirstResult()==0){
            session.close();
            return false;
        }
        
        session.close();
        return true;
    }
    
     public static boolean existeContrasenia(String contrasenia, String username){
        SessionFactory sessionFactory = conexion.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT pass FROM password pass WHERE pass.codigo=:codigo AND pass.usuario.username=:usuario");
        query.setParameter("codigo", contrasenia);
        query.setParameter("usuario", username);
        if(query.getFirstResult()==0){
            session.close();
            return false;
        }
        
        session.close();
        return true;
    }
}

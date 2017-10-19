package Logica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author julisanchez
 */
public class conexion {
    public String db="heroku_fecacb5447852a5";
    public String url="jdbc:mysql://us-cdbr-iron-east-05.cleardb.net:3306/"+db;
    public String user="bd91e7489764bf";
    public String pass="37e445a2";
    
    public conexion(){
        
    }
    
    public Connection conectar(){
        Connection link = null;
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return link;
    }
    
    
}

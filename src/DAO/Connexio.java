/*
 * To change this template, choose Tools | Templates
 * and open dosmilquinzethe template in the editor.
 */
package DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sergi
 */
public class Connexio {
    protected Connection connection = null;
    protected ResultSet resultSet = null;
    protected Statement statement = null;
    protected PreparedStatement preparedStatement = null;
    protected String db= "lib/Examen2016.sqlite";    

    public void Connexio() {}
    
    public Connexio() throws Exception{
        
            System.out.println("Conectant");
//Constructor de clase que se conecta a la base de datos SQLite 
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + this.db);
            System.out.println("Conectado a la base de datos SQLite [ " + this.db + "]");
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception("Error connectant");
        }
        
    }
    
    public void tancarConnexio() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
    

    
}

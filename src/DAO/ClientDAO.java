/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entitat.Client;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bernalastic
 */
public class ClientDAO extends Connexio{
    
    public ClientDAO() throws Exception{
        super();
    }
    
    public ArrayList<Client> ObtenirClients() throws Exception{
        ArrayList<Client> llistaClients=new ArrayList<>();
        try {
          statement = connection.createStatement();
          resultSet = statement.executeQuery("SELECT * FROM Clients; ");
           
          while (resultSet.next())
          {
              Client c=new Client();
              c.setId(resultSet.getInt("id"));              
              c.setNom(resultSet.getString("Nom"));
              c.setCarrer(resultSet.getString("Carrer"));
              c.setData_naixement(resultSet.getDate("data_naixement"));
              c.setCognoms(resultSet.getString("Cognoms"));

              
              llistaClients.add(c);
          }
         }
         catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception("Error obtenint el llistat de Clients");
         }
        return llistaClients;
     }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entitat.Article;
import Entitat.Categoria;
import Entitat.Client;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bernalastic
 */
public class CategoriaDAO extends Connexio{
    
    public CategoriaDAO() throws Exception{
        super();
    }
    
    public Categoria ObtenirArticlesCategoria(Categoria cat) throws Exception{
        ArrayList<Article> llistaArticles=new ArrayList<>();
        try {
          statement = connection.createStatement();
          resultSet = statement.executeQuery("SELECT * FROM Articles WHERE familia ="+cat.getId()+"; ");
           
          while (resultSet.next())
          {
              Article c=new Article();
              c.setId(resultSet.getInt("id"));              
              c.setNom(resultSet.getString("nom"));
              c.setDescripcio(resultSet.getString("descripcio"));
              c.setFamilia(resultSet.getInt("familia"));
              c.setPreu(resultSet.getInt("preu"));
              
              
              llistaArticles.add(c);
          }
         }
         catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception("Error obtenint el llistat d'Articles d'una categoria");
         }
        cat.setArticles(llistaArticles);
        return cat;
     }
    
    public ArrayList<Categoria> ObtenirCategories() throws Exception{
        ArrayList<Categoria> llistaCategories=new ArrayList<>();
        try {
          statement = connection.createStatement();
          resultSet = statement.executeQuery("SELECT * FROM Familia; ");
           
          while (resultSet.next())
          {
              Categoria c=new Categoria();
              c.setId(resultSet.getInt("id"));              
              c.setDescripcio(resultSet.getString("nom"));
              
              
              llistaCategories.add(c);
          }
         }
         catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception("Error obtenint el llistat de categories");
         }
        return llistaCategories;
     }
}

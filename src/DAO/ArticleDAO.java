/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entitat.Article;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author bernalastic
 */
public class ArticleDAO extends Connexio{
    
    public ArticleDAO() throws Exception{
        super();
    }
    
    public ArrayList<Article> ObtenirArticles() throws Exception{
        ArrayList<Article> llistaArticles=new ArrayList<>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Articles; ");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
          while (resultSet.next()) {
              
                java.util.Date dataC = df.parse(resultSet.getString("data"));
                java.sql.Date dataC2 = new java.sql.Date(dataC.getTime());
              
              Article a=new Article();
              a.setId(resultSet.getInt("id"));              
              a.setNom(resultSet.getString("nom"));
              a.setDescripcio(resultSet.getString("descripcio"));
              a.setFamilia(resultSet.getInt("familia"));
              a.setPreu(resultSet.getInt("preu"));
              a.setData(dataC2);
              
              
              llistaArticles.add(a);
          }
         }
         catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception("Error obtenint el llistat d'Articles");
         }
        return llistaArticles;
     }
    
    public void inserirArticle (Article article) throws Exception {
        String sentencia = "INSERT INTO Articles VALUES (?, ?, ?, ?, ?, ?)";
        try {
            
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            
            preparedStatement = connection.prepareStatement(sentencia);
            preparedStatement.setInt(1, article.getId());
            preparedStatement.setString(2, article.getNom());
            preparedStatement.setString(3, article.getDescripcio());
            preparedStatement.setInt(4, article.getFamilia());
            preparedStatement.setInt(5, article.getPreu());
            preparedStatement.setString(6, formateador.format(article.getData()));
            preparedStatement.executeUpdate();
            
        }
        catch (SQLException e) { System.out.println(e.getMessage());
            throw new Exception("Ha hagut un error al inserir el article en la base de dades.");
        }
    }
    
    public void editarArticle (Article article) throws Exception {
        String sentencia = "UPDATE Articles SET nom = ?, descripcio = ?, familia = ?, preu = ?, data = ?"
                + " WHERE id = ? ";
        try {
            
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            
            preparedStatement = connection.prepareStatement(sentencia);
            preparedStatement.setString(1, article.getNom());
            preparedStatement.setString(2, article.getDescripcio());
            preparedStatement.setInt(3, article.getFamilia());
            preparedStatement.setDouble(4, article.getPreu());
            preparedStatement.setString(5, formateador.format(article.getData()));
            preparedStatement.setInt(6, article.getId());
            preparedStatement.executeUpdate();
            
        }
        catch (SQLException e) { System.out.println(e.getMessage());
            throw new Exception("Ha hagut un error al guardar el article en la base de dades.");
        }
    }
    
    public void esborrarArticle (Article article) throws Exception {
        String sentencia = "DELETE FROM Articles WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(sentencia);
            preparedStatement.setInt(1, article.getId());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new Exception("Error al esborrar el article de la base de dades.");
        }
    }
    
    public Article obtindreNovaID() throws Exception {
        Article article = new Article();
        String sentencia = "SELECT max(id) as id FROM Articles";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sentencia);
            while (resultSet.next()) {
                article.setId(resultSet.getInt("id"));
            }
        }
        catch (SQLException e) {
            throw new Exception("Ha hagut un error al obtindre el nou codi del article.");
        }
        return article;
    }
    
    
}

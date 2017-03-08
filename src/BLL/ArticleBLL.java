package BLL;

import DAO.ArticleDAO;
import Entitat.Article;
import java.sql.SQLException;
import java.util.ArrayList;

/*@author Isidro*/

public class ArticleBLL {
    
    public ArrayList<Article> obtenirArticles() throws Exception {
        
        ArrayList<Article> articles = null;
        
        try{
            ArticleDAO aDAO= new ArticleDAO();
            articles= aDAO.ObtenirArticles();
            aDAO.tancarConnexio();
        }
        catch (Exception ex){
           throw ex;
        }
        return articles;

    }
    
    public void inserirArticle (Article article) throws Exception {
       
        try {
            ArticleDAO cDAO = new ArticleDAO();
            cDAO.inserirArticle(article);
            cDAO.tancarConnexio();
        }
        catch (SQLException e) {
            throw new Exception("Ha hagut un error al tancar la connexió amb la base de dades.");
        }
        catch (Exception e) {
            throw e;
        }
    }
    
    public void editarArticle (Article article) throws Exception {
        try {
            ArticleDAO cDAO = new ArticleDAO();
            cDAO.editarArticle(article);
            cDAO.tancarConnexio();
        }
        catch (SQLException e) {
            throw new Exception("Ha hagut un error al tancar la connexió amb la base de dades.");
        }
        catch (Exception e) {
            throw e;
        }
    }
    
    public void esborrarArticle (Article article) throws Exception {
        try {
            ArticleDAO cDAO = new ArticleDAO();
            cDAO.esborrarArticle(article);
            cDAO.tancarConnexio();
        }
        catch (SQLException e) {
            throw new Exception("Ha hagut un error al tancar la connexió amb la base de dades.");
        }
        catch (Exception e) {
            throw e;
        }
    }
    
    public Article obtindreNovaID () throws Exception {
        
        Article p;
        
        try {
            ArticleDAO aDAO = new ArticleDAO();
            p = aDAO.obtindreNovaID();
            aDAO.tancarConnexio();
            
            p.setId(p.getId()+1);
            
        }
        catch (SQLException e) {
            throw new Exception("Ha hagut un error al tancar la connexió amb la base de dades.");
        }
        catch (Exception e) {
            throw e;
        }
        return p;
    }
}

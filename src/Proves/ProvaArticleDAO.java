/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proves;

import DAO.ArticleDAO;
import DAO.CategoriaDAO;
import Entitat.Article;
import Entitat.Categoria;
import java.sql.Date;
import java.util.Iterator;

/**
 *
 * @author sergi
 */
public class ProvaArticleDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Article art= new Article();
        try{
            ArticleDAO aDAO= new ArticleDAO();
            
            // prova obtenir articles 
            System.out.println("Obtenim els articles");
            Iterator<Article> it=aDAO.ObtenirArticles().iterator();
            while (it.hasNext()){
                art=it.next();
                System.out.println(art.toString());
            }
            
            System.out.println("Obtenim la nova ID: ");
            art = aDAO.obtindreNovaID();
            System.out.println("Nova ID: "+art.toString());
            art.setId(art.getId()+1);
            art.setNom("Hamburguesa");
            art.setDescripcio("Del MC Donalds");
            art.setFamilia(1);
            art.setPreu(22);
            art.setData(new Date(System.currentTimeMillis()));
            
            System.out.println("Inserint el article");
            aDAO.inserirArticle(art);
            
            // prova obtenir articles 
            System.out.println("Obtenim els articles");
            it=aDAO.ObtenirArticles().iterator();
            while (it.hasNext()){
                art=it.next();
                System.out.println(art.toString());
            }
            
            System.out.println("Editant el article");
            art.setNom("Hamburguesaaaaaa");
            art.setDescripcio("Del MC Donaldssssss");
            aDAO.editarArticle(art);
            
            // prova obtenir articles 
            System.out.println("Obtenim els articles");
            it=aDAO.ObtenirArticles().iterator();
            while (it.hasNext()){
                art=it.next();
                System.out.println(art.toString());
            }
            
            System.out.println("Esborrant el article");
            aDAO.esborrarArticle(art);
            
            // prova obtenir articles 
            System.out.println("Obtenim els articles");
            it=aDAO.ObtenirArticles().iterator();
            while (it.hasNext()){
                art=it.next();
                System.out.println(art.toString());
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}

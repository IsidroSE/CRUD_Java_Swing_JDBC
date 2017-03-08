/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proves;

import DAO.CategoriaDAO;
import Entitat.Article;
import Entitat.Categoria;
import java.util.Iterator;

/**
 *
 * @author sergi
 */
public class ProvaCategoriaDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Categoria cat= new Categoria();
        try{
            CategoriaDAO catDAO= new CategoriaDAO();
            cat.setId(2);
            
            // prova obtenir articles d'una categoria 
            System.out.println("Obtenim els articles d'una categoria");
            catDAO.ObtenirArticlesCategoria(cat);
            Iterator<Article> it=cat.getArticles().iterator();
            while (it.hasNext()){
                Article art=it.next();
                System.out.println(art.getNom());
            }
            //prova obtenir categoria
            System.out.println("Obtenim les categories:");
           Iterator<Categoria> categories= catDAO.ObtenirCategories().iterator();
            while(categories.hasNext()){
                cat=categories.next();
                System.out.println(cat.getDescripcio());
                
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}

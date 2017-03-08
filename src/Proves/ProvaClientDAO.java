/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proves;

import DAO.ArticleDAO;
import DAO.CategoriaDAO;
import DAO.ClientDAO;
import Entitat.Article;
import Entitat.Categoria;
import Entitat.Client;
import java.util.Iterator;

/**
 *
 * @author sergi
 */
public class ProvaClientDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client cli= new Client();
        try{
            ClientDAO cliDAO= new ClientDAO();
            
            
            // prova obtenir articles 
            System.out.println("Obtenim els Clients");
            ;
            Iterator<Client> it=cliDAO.ObtenirClients().iterator();
            while (it.hasNext()){
                cli=it.next();
                System.out.println(cli.getNom()+" "+cli.getCognoms()+" "+cli.getCarrer());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}

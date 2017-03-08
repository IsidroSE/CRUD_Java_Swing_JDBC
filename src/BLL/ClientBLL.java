/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.ClientDAO;
import Entitat.Client;
import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class ClientBLL {
    
    public ArrayList<Client> obtenirClients() throws Exception {
        ArrayList<Client> Clients=null;
        try{
            ClientDAO cDAO= new ClientDAO();
            Clients= cDAO.ObtenirClients();
        
        }catch (Exception ex){
            throw ex;
        }
        return Clients;

    }
    
}

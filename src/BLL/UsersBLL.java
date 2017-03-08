package BLL;

import DAO.UsersDAO;
import Entitat.User;
import java.util.ArrayList;

/*@author Isidro*/

public class UsersBLL {

    public ArrayList<User> obtenirUsuaris() throws Exception {
        
        ArrayList<User> articles = null;
        
        try{
            UsersDAO uDAO = new UsersDAO();
            articles= uDAO.obtenirUsuaris();
            uDAO.tancarConnexio();
        }
        catch (Exception ex){
           throw ex;
        }
        return articles;

    }
    
}

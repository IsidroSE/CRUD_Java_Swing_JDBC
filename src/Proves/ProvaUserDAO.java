package Proves;

import DAO.UsersDAO;
import Entitat.User;
import java.util.Iterator;

/*@author Isidro*/

public class ProvaUserDAO {
    public static void main(String[] args) {
        User user = new User();
        try{
            UsersDAO cliDAO= new UsersDAO();
            
            
            // prova obtenir articles 
            System.out.println("Obtenim els users");
            Iterator<User> it=cliDAO.obtenirUsuaris().iterator();
            while (it.hasNext()){
                user=it.next();
                System.out.println(user.toString());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

package DAO;

import Entitat.User;
import java.sql.SQLException;
import java.util.ArrayList;

/*@author Isidro*/

public class UsersDAO extends Connexio {
    
    public UsersDAO() throws Exception{
        super();
    }

    public ArrayList<User> obtenirUsuaris() throws Exception {
        ArrayList <User> llistaUsuaris = new ArrayList<>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM users; ");
            
            while (resultSet.next()) {
                User u = new User();
                u.setUsuari(resultSet.getString("usuari"));
                u.setPass(resultSet.getString("password"));
                llistaUsuaris.add(u);
            }
         }
         catch (SQLException ex) { System.out.println(ex);
            throw new Exception("Error obtenint el llistat de users");
         }
        return llistaUsuaris;
     }
    
}

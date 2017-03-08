package Entitat;

/*@author Isidro*/

public class User {
    
    String usuari;
    String pass;

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" + "usuari=" + usuari + ", pass=" + pass + '}';
    }

}

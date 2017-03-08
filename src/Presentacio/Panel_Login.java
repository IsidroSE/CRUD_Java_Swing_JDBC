package Presentacio;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*@author Isidro*/

public class Panel_Login extends JPanel {
    
    private JLabel lUser;
    private JTextField tfUser;
    private JLabel lPass;
    private JPasswordField tfPass;
    private JLabel error;

    public Panel_Login () {
        setLayout(new GridLayout(5, 1));
        
        lUser = new JLabel("User:");
        tfUser = new JTextField();
        add(lUser);
        add(tfUser);
        
        lPass = new JLabel("Password:");
        tfPass = new JPasswordField();
        add(lPass);
        add(tfPass);
        
        error = new JLabel();
        add(error);
    }
    
    public String getUser () {
        String nom;
        
        nom = tfUser.getText();
        
        return nom;
    }
    
    public String getPass () {
        String pass;
        
        pass = new String(tfPass.getPassword());
        
        return pass;
    }
    
    public void setError (String error) {
        this.error.setText(error);
    }
    
    public void netejarText () {
        tfUser.setText("");
        tfPass.setText("");
    }
    
}

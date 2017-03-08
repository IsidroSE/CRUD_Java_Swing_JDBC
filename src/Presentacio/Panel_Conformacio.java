package Presentacio;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*@author Isidro*/

public class Panel_Conformacio extends JPanel {
    
    private JLabel ltext1;
    private JComboBox cbConfirmar;
    private JLabel ltext2;
    private JLabel ltext3;
    private JTextField tfConfirmar;

    public Panel_Conformacio () {
        setLayout(new GridLayout(5, 1));
        
        ltext1 = new JLabel("¿Està segur que desitja realitzar la operació?");
        cbConfirmar = new JComboBox();
        cbConfirmar.addItem("Si");
        cbConfirmar.addItem("No");
        add(ltext1);
        add(cbConfirmar);
        
        ltext2 = new JLabel("Per confirmar escriga la paraula següent en el quadre de text");
        ltext3 = new JLabel("CONFIRMAR");
        tfConfirmar = new JTextField();
        add(ltext2);
        add(ltext3);
        add(tfConfirmar);
    }
    
    public String getCB () {
        String cb;
        
        cb = cbConfirmar.getSelectedItem().toString();
        
        return cb;
    }
    
    public String getConfirmacio () {
        String confirmacio;
        
        confirmacio = tfConfirmar.getText();
        
        return confirmacio;
    }
    
}

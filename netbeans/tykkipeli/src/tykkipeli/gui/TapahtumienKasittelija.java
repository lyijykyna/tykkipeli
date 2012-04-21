package tykkipeli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author
 */
public class TapahtumienKasittelija implements ActionListener{

    private JTextField teksti;

    public TapahtumienKasittelija(JTextField teksti) {
        this.teksti = teksti;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Ammuttiin tykillä korolla "+this.teksti.getText());
    }
    
    
}

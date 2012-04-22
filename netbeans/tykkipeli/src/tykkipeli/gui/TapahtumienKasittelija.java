package tykkipeli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import tykkipeli.controller.Tykkipeli;
import tykkipeli.fysiikka.Lentorata;
import tykkipeli.model.Pelaaja;

/**
 *
 * @author
 */
public class TapahtumienKasittelija implements ActionListener{

    private Tykkipeli peli;
    private JLabel pelaaja;
    private JTextField teho;
    private JTextField koro;

    public TapahtumienKasittelija(Tykkipeli peli, JLabel pelaaja, JTextField teho, JTextField koro) {
        this.peli = peli;
        this.pelaaja = pelaaja;
        this.teho = teho;
        this.koro = koro;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Pelaaja vuorossa = peli.getVuorossaOlevaPelaaja();
        System.out.println("Ammuttiin tykillä teholla "+this.teho.getText()+" ja korolla "+this.koro.getText());
        vuorossa.setTeho(Double.parseDouble(teho.getText()));
        vuorossa.setKoro(Double.parseDouble(koro.getText()));
        Lentorata rata = peli.pelaajaAmpuu(vuorossa, vuorossa.getTeho(), vuorossa.getKoro());
        for(int i=0;i<10;i++) {
            rata.iteroiRata();
            System.out.println(""+rata.getAmmus().getSijainti());
        }
        this.peli.muutaVuoro();
        pelaaja.setText(peli.getVuorossaOlevaPelaaja().getNimi());
        teho.setText(""+peli.getVuorossaOlevaPelaaja().getTeho());
        koro.setText(""+peli.getVuorossaOlevaPelaaja().getKoro());
        
    }
    
    
}

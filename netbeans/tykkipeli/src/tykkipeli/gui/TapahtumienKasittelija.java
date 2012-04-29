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
    private Pelialue pelialue;
    private JLabel pelaaja;
    private JTextField teho;
    private JTextField koro;

    public TapahtumienKasittelija(Tykkipeli peli, Pelialue pelialue, JLabel pelaaja, JTextField teho, JTextField koro) {
        this.peli = peli;
        this.pelialue = pelialue;
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
        Lentorata rata = peli.pelaajaAmpuu(vuorossa, vuorossa.getKoro(), vuorossa.getTeho());
        //for(int i=0;i<10;i++) {
	while(rata.getAmmus().getSijainti().y >= 0) {
            rata.iteroiRata();
            //System.out.println(""+rata.getAmmus().getSijainti());
            if(peli.getVuorossaOlevaPelaaja().equals(peli.getPelaajat().get(0)))
                peli.getPeliMaailma().tormaysTarkistus(rata.getAmmus(), peli.getPelaajat().get(1));
            else
                peli.getPeliMaailma().tormaysTarkistus(rata.getAmmus(), peli.getPelaajat().get(0));
	    peli.getPeliMaailma().lisaaObjekti(rata.getAmmus());
            pelialue.repaint();
        }
        this.peli.muutaVuoro();
        pelaaja.setText(peli.getVuorossaOlevaPelaaja().getNimi());
        teho.setText(""+peli.getVuorossaOlevaPelaaja().getTeho());
        koro.setText(""+peli.getVuorossaOlevaPelaaja().getKoro());
        
        //pelialue.repaint();
    }
    
    
}

package tykkipeli.gui;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;
import java.awt.*;
import javax.swing.*;
import tykkipeli.controller.Tykkipeli;

/**
 *
 * @author 
 */
public class Ikkuna implements Runnable{
    
    private JFrame frame;
    private Tykkipeli peli;
    
    public Ikkuna(Tykkipeli tykkipeli) {
        this.peli = tykkipeli;
    }

    @Override
    public void run() {
        frame = new JFrame("Tykkipeli");
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    
    
    private void luoKomponentit(Container container) {
        Pelialue pelialue = new Pelialue(peli);
        container.add(pelialue,BorderLayout.CENTER);
        container.add(luoTykinHallinta(pelialue),BorderLayout.SOUTH);
        
    }
    
    private JPanel luoTykinHallinta(Pelialue pelialue) {
        JPanel paneeli = new JPanel();
        JPanel koro = new JPanel();
        JPanel teho = new JPanel();
        
        JLabel pelaaja = new JLabel(peli.getVuorossaOlevaPelaaja().getNimi());
        paneeli.add(pelaaja);
        JButton ammu = new JButton("Ammu");
        paneeli.add(ammu,BorderLayout.WEST);
        
        teho.add(new JLabel("Teho"),BorderLayout.NORTH);
        JTextField tehoTeksti = new JTextField(""+peli.getVuorossaOlevaPelaaja().getTeho());
        teho.add(tehoTeksti,BorderLayout.EAST);
        paneeli.add(teho);
        
        koro.add(new JLabel("Koro"),BorderLayout.NORTH);
        JTextField koroTeksti = new JTextField(""+peli.getVuorossaOlevaPelaaja().getKoro());
        koro.add(koroTeksti,BorderLayout.EAST);
        paneeli.add(koro,BorderLayout.EAST);
        
        TapahtumienKasittelija tk = new TapahtumienKasittelija(peli,pelialue,pelaaja,tehoTeksti, koroTeksti);
        ammu.addActionListener(tk);
        
        return paneeli;
    }
    
    public JFrame getFrame() {
        return this.frame;
    }
    
}

package tykkipeli.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        frame.setJMenuBar(luoApuaMenu());
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    
    
    private void luoKomponentit(Container container) {
        Pelialue pelialue = new Pelialue(peli);
        container.add(pelialue,BorderLayout.CENTER);
        container.add(luoTykinHallinta(pelialue),BorderLayout.SOUTH);
        
    }
    
    private JMenuBar luoApuaMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Ohje");
        JMenuItem ohje = new JMenuItem("Apua");
        menu.add(ohje);
        menuBar.add(menu);
        OhjeDialogi ohjeD = new OhjeDialogi();
        ohje.addActionListener(ohjeD);
        return menuBar;
    }
    
    private JDialog luoApuIkkuna() {
        JDialog apuIkkuna = new JDialog();
        apuIkkuna.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        JTextPane teksti = new JTextPane();
        teksti.setText("Tykkipeli\n\n" + 
                       "Pelaaja asettaa tykkinsä ampumistehon ja korokulman ja " +
                       "ampuu tykillä painamalla \"Ammu\" nappulaa. \n" +
                       "Pelaaja, joka osuu ensimmäisenä toisen pelaajan tykkiin" +
                       "voittaa pelin. \n" +
                       "HUOM! Oikeanpuolimmaisen pelaajan pitää huomioida, että" +
                       "hänen tykkinsä korokulman pitää olla aina yli 90° jos hän" +
                       "ampua kohti toista tykkiä!" +
                       "");
        teksti.setEditable(false);
        apuIkkuna.getContentPane().add(teksti);
        apuIkkuna.setTitle("Tykkpelin ohje");
        apuIkkuna.setLocationRelativeTo(frame);
        apuIkkuna.pack();
        apuIkkuna.setSize(new Dimension(300,200));
        apuIkkuna.setVisible(true);
        return apuIkkuna;
    }
    
    private class OhjeDialogi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            luoApuIkkuna();
        }
        
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

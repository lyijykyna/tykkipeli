package tykkipeli.gui;

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
        container.add(pelialue,BoxLayout.X_AXIS);
        container.add(luoTykinHallinta(),BorderLayout.SOUTH);
        
    }
    
    private JPanel luoTykinHallinta() {
        JPanel paneeli = new JPanel();
        JPanel koro = new JPanel();
        JPanel teho = new JPanel();
        
        paneeli.add(new JLabel(peli.getVuoro().getNimi()));
        paneeli.add(new JButton("Ammu"),BorderLayout.WEST);
        
        teho.add(new JLabel("Teho"),BorderLayout.NORTH);
        teho.add(new JTextField("             "),BorderLayout.EAST);
        paneeli.add(teho);
        
        koro.add(new JLabel("Koro"),BorderLayout.NORTH);
        koro.add(new JTextField("             "),BorderLayout.EAST);
        paneeli.add(koro,BorderLayout.EAST);
        return paneeli;
    }
    
    public JFrame getFrame() {
        return this.frame;
    }
    
}

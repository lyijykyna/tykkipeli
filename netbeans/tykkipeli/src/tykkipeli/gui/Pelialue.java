package tykkipeli.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import tykkipeli.controller.Tykkipeli;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.PeliObjekti;

/**
 *
 * @author 
 */
public class Pelialue extends JPanel {
    
    private Tykkipeli tykkipeli;
    
    public Pelialue(Tykkipeli tykkipeli) {
        this.tykkipeli = tykkipeli;
        this.setPreferredSize(new Dimension(tykkipeli.getPeliMaailma().getLEVEYS(),tykkipeli.getPeliMaailma().getKORKEUS()));
        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(new ImageIcon("res/tausta.png").getImage(),0,0,this);
        
//        for(Pelaaja p : tykkipeli.getPelaajat()) {
//            g.fillRect(p.getSijainti().x, p.getSijainti().y+tykkipeli.getPeliMaailma().getKORKEUS()-20, 20, 20);
//        }
        for(PeliObjekti o : tykkipeli.getPeliMaailma().getObjektit()) {
            g.fillRect(o.getSijainti().x, o.getSijainti().y+tykkipeli.getPeliMaailma().getKORKEUS()-20, 20, 20);
        }
    }
    
    
}

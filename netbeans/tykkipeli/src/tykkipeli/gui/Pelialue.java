package tykkipeli.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import tykkipeli.controller.Tykkipeli;
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
        
        String kuvaPolku = "res/tausta.png";
        //ImageIcon taustaIkoni = new ImageIcon(kuvaPolku);
        ImageIcon taustaIkoni = new ImageIcon(getClass().getClassLoader().getResource(kuvaPolku));
        g.drawImage(taustaIkoni.getImage(),0,0,this);
        
        
//        for(Pelaaja p : tykkipeli.getPelaajat()) {
//            g.fillRect(p.getSijainti().x, p.getSijainti().y+tykkipeli.getPeliMaailma().getKORKEUS()-20, 20, 20);
//        }
        //System.out.println("Pelissä objekteja:");
        for(PeliObjekti o : tykkipeli.getPeliMaailma().getObjektit()) {
            //System.out.println(tykkipeli.getPeliMaailma().getObjektit());
            //g.fillRect(o.getSijainti().x, o.getSijainti().y+tykkipeli.getPeliMaailma().getKORKEUS()-20, 20, 20);
	    g.fillRect(o.getSijainti().x, o.getSijainti().y, 20, 20);
        }
    }
    
    
}

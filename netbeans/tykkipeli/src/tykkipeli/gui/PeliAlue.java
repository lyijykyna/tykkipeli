package tykkipeli.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import tykkipeli.controller.Maailma;
import tykkipeli.model.PeliObjekti;
import tykkipeli.model.Tykki;

/**
 *
 * @author 
 */
public class PeliAlue extends JPanel{

    private Maailma peliMaailma;
    
    public PeliAlue(Maailma peliMaailma) {
	this.peliMaailma = peliMaailma;
	this.setSize(peliMaailma.getLEVEYS(), peliMaailma.getKORKEUS());
	this.setDoubleBuffered(true);
    }
    
    @Override
    public void paint(Graphics g) {
	super.paint(g);
//	g.drawRect(20, 20, 50, 40);
//	g.drawOval(320, 180, 100, 100);
//	g.drawString("Moikka!", 40, 400);
//	addMouseListener(this);
	for(PeliObjekti o : this.peliMaailma.getObjektit()) {
	    System.out.println(this.peliMaailma.getObjektit());
	    g.drawRect(o.getSijainti().x, o.getSijainti().y, 50, 40);
	    System.out.println(o.getSijainti());
	}
    }
    
    public JPanel getThis() {
	return this;
    }
    
}

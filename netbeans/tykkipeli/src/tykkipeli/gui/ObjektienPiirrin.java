package tykkipeli.gui;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import tykkipeli.model.PeliObjekti;


public class ObjektienPiirrin extends JPanel{

    List<PeliObjekti> objektit = new ArrayList();
    
    @Override
    public void paint(Graphics g) {
	super.paint(g);
	for(PeliObjekti o: this.objektit) {
	    g.drawRect(o.getSijainti().x, o.getSijainti().y, 5, 5);
	    System.out.println("Piirrettiin "+o+" sijaintiin "+o.getSijainti());
	}
	
    }

    public List<PeliObjekti> getObjektit() {
	return objektit;
    }

    public void setObjektit(List<PeliObjekti> objektit) {
	this.objektit = objektit;
    }
    
    public void lisaaObjekti(PeliObjekti objekti) {
	this.objektit.add(objekti);
	System.out.println("Lisättiin "+objekti.toString()+" sijaintiin"+objekti.getSijainti());
    }
    
}

package tykkipeli.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import tykkipeli.fysiikka.Lentorata;
import tykkipeli.model.Ammus;

/**
 *
 * 
 */
public class GraafinenKayttoliittyma extends JDialog {
    
    public GraafinenKayttoliittyma() {
	setTitle("Tykkipeli");
	setSize(640, 480);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	MaanPiirrin maa = new MaanPiirrin();
	ObjektienPiirrin objektit = new ObjektienPiirrin();
	
	//TODO: Tämä jotenkin järkevästi
	Ammus kuula1 = new Ammus(0,1);
	Ammus kuula2 = new Ammus(new Point(100,100));
	objektit.lisaaObjekti(kuula1);
	objektit.lisaaObjekti(kuula2);
	
	//Huono ratkaisu, mutta menköön, lisätään uusi objekti lentoradan pisteiden mukaan
//	Lentorata rata = new Lentorata(0, 200, 50, 50, 0);
//	for(int i=0;i<12;i++) {
//            kuula1.setSijainti(rata.iteroiRata(kuula1));
//	    Ammus dummy = new Ammus(kuula1.getSijainti());
//	    objektit.lisaaObjekti(dummy);
//	}
	
	System.out.println(objektit.getObjektit());
	getContentPane().add(maa); //TODO: Pitäisi saada piirtymään samaan aikaan
	getContentPane().add(objektit);
	pack();
	setVisible(true);
    }
}

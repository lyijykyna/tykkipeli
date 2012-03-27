package tykkipeli;

import java.awt.Point;
import tykkipeli.gui.GraafinenKayttoliittyma;
import tykkipeli.model.Ammus;

/**
 *
 * 
 */
public class Tykkipeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Ammus kuula1 = new Ammus(0,1);
	Ammus kuula2 = new Ammus(new Point(100,100));
	GraafinenKayttoliittyma gui = new GraafinenKayttoliittyma();
	gui.setSize(640, 480);
    }
}

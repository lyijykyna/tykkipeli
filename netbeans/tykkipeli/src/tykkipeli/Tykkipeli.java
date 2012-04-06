package tykkipeli;

import java.awt.Point;
import tykkipeli.gui.GraafinenKayttoliittyma;
import tykkipeli.model.Ammus;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.Tykki;

/**
 *
 * 
 */
public class Tykkipeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	//pelaajan testausta
	Tykki tykki = new Tykki();
	Pelaaja pelaaja = new Pelaaja("Pelaaja1");
	Pelaaja pelaaja2 = new Pelaaja("Pelaaja2");
	pelaaja2.setTykki(tykki);
	pelaaja.ammu();
	pelaaja2.ammu();
	
	GraafinenKayttoliittyma gui = new GraafinenKayttoliittyma();
	gui.setSize(640, 480);
    }
}

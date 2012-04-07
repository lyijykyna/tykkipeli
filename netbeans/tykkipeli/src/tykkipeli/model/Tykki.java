package tykkipeli.model;

import java.awt.Point;

/**
 *Tykkipelissä on tykkejä
 * 
 */
public class Tykki extends PeliObjekti {
    
    /**
     * Oletuskonstruktori tykki-luokalle.
     * Luo tykin pisteeseen (0,0) pelimaailman koordinaateissa
     */
    public Tykki() {
	super.setSijainti(new Point(0,0));
    }
    
    /**
     * Parametrillinen konstruktori Tykki-luokalle. Luo tykin pisteeseen
     * (x,y) pelimaailman koordinaateissa.
     * 
     * @param x tykin x-koordinaatti
     * @param y tykin y-koordinaatti
     */
    public Tykki(int x, int y) {
	super.setSijainti(new Point(x,y));
    }
    
    /**
     * Parametrillinen konstruktori Tykki-luokalle. Luo Tykki-olion Point-olion
     * määrittämään sijaintiin pelimaailman koordinaateissa.
     * 
     * @param sijainti Tykin sijainti
     */
    public Tykki(Point sijainti) {
	super.setSijainti(sijainti);
    }
    
}

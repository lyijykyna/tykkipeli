package tykkipeli.model;

import java.awt.Point;

/**
 *Tykit ampuvat ammuksia
 * 
 */
public class Ammus extends PeliObjekti {
    
    /**
     * Oletuskonstruktori ammus-luokalle.
     * Luo ammuksen pisteeseen (0,0) pelimaailman koordinaateissa
     */
    public Ammus() {
	super.setSijainti(new Point(0,0));
    }
    
    /**
     * Parametrillinen konstruktori Ammus-luokalle. Luo ammuksen pisteeseen
     * (x,y) pelimaailman koordinaateissa.
     * 
     * @param x Ammuksen x-koordinaatti
     * @param y Ammuksen y-koordinaatti
     */
    public Ammus(int x, int y) {
	super.setSijainti(new Point(x,y));
    }
    
    /**
     * Parametrillinen konstruktori Ammus-luokalle. Luo Ammus-olion Point-olion
     * määrittämään sijaintiin pelimaailman koordinaateissa.
     * 
     * @param sijainti Ammuksen sijainti
     */
    public Ammus(Point sijainti) {
	super.setSijainti(sijainti);
    }
}

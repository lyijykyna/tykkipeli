package tykkipeli.model;

import java.awt.Point;

/**
 *Abstrakti yläluokka pelin objekteille.
 * 
 */
public abstract class PeliObjekti {
    
    private Point sijainti;

    
    /**
     * Metodi antaa peliobjektin sijainnin pelimaailman koordinaateissa
     * 
     * @return peliobjektin sijainti
     */
    public Point getSijainti() {
	return sijainti;
    }

    /**
     * Metodi asettaa peliobjektin sijainnin uuteen pisteeseen pelimaailman
     * koordinaateissa
     * 
     * @param sijainti Uusi piste
     */
    public void setSijainti(Point sijainti) {
	this.sijainti = sijainti;
    }
    
    
}

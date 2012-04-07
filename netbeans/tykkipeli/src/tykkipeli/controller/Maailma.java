package tykkipeli.controller;

import java.util.List;
import tykkipeli.model.PeliObjekti;

/**
 *
 * @author 
 */
public class Maailma {
    
    private List<PeliObjekti> objektit;
    private static int LEVEYS = 640;
    private static int KORKEUS = 480;

    public List<PeliObjekti> getObjektit() {
	return objektit;
    }

    public void setObjektit(List<PeliObjekti> objektit) {
	this.objektit = objektit;
    }

    public static int getKORKEUS() {
	return KORKEUS;
    }

    public static void setKORKEUS(int KORKEUS) {
	Maailma.KORKEUS = KORKEUS;
    }

    public static int getLEVEYS() {
	return LEVEYS;
    }

    public static void setLEVEYS(int LEVEYS) {
	Maailma.LEVEYS = LEVEYS;
    }
    
    public boolean tormaysTarkistus(PeliObjekti o1, PeliObjekti o2) {
	if(o1.getSijainti().distance(o2.getSijainti()) < 0.1)
	    return true;
	else
	    return false;
    }
}

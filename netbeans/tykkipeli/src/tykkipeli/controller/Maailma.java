package tykkipeli.controller;

import java.util.ArrayList;
import java.util.List;
import tykkipeli.model.Ammus;
import tykkipeli.model.PeliObjekti;
import tykkipeli.model.Tykki;

/**
 *
 * @author 
 */
public class Maailma {
    
    private List<PeliObjekti> objektit;
    //TODO: taitaa olla static vähän väärä ja pitäisi ehkä olla final
    private static int LEVEYS = 640;
    private static int KORKEUS = 480;

    
    public Maailma() {
	objektit = new ArrayList();
    }
    
    public List<PeliObjekti> getObjektit() {
	return objektit;
    }

    public void setObjektit(List<PeliObjekti> objektit) {
	this.objektit = objektit;
    }

    
    //TODO: Geneerinen metodi?
    public void lisaaObjekti(PeliObjekti lisattava) {
	this.objektit.add(lisattava);
    }
    
    public void lisaaObjekti(Ammus lisattava) {
	this.objektit.add(lisattava);
    }
    
    public void lisaaObjekti(Tykki lisattava) {
	this.objektit.add(lisattava);
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
	if(o1.getSijainti().distance(o2.getSijainti()) < 0.1) {
	    System.out.println("OSUMA!");
	    return true;
	}
	else
	    return false;
    }
}

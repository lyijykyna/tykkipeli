package tykkipeli.controller;

import java.util.ArrayList;
import java.util.List;
import tykkipeli.model.Ammus;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.PeliObjekti;
import tykkipeli.model.Tykki;

/**
 *Pelimaailman rajat sekä objektit sisältävä luokka.
 *
 */
public class Maailma {
    
    private List<PeliObjekti> objektit;
    private int leveys = 640;
    private int korkeus = 480;

    
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
    
    public int getKorkeus() {
	return korkeus;
    }

    public void setKorkeus(int korkeus) {
	this.korkeus = korkeus;
    }

    public int getLeveys() {
	return leveys;
    }

    public void setLeveys(int leveys) {
	this.leveys = leveys;
    }
    
    public boolean tormaysTarkistus(PeliObjekti o1, PeliObjekti o2) {
	if(o1.getSijainti().distance(o2.getSijainti()) < 0.1) {
	    //System.out.println("OSUMA!");
	    return true;
	}
	else
	    return false;
    }
    
    public boolean tormaysTarkistus(Ammus o1, Pelaaja o2) {
	if(o1.getSijainti().distance(o2.getSijainti()) < 10) {
	    //System.out.println("OSUMA!");
	    return true;
	}
	else
	    return false;
    }
}

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

    /**
     * Oletuskonstruktori Maailma-luokalle.
     */
    public Maailma() {
	objektit = new ArrayList();
    }
    
    public List<PeliObjekti> getObjektit() {
	return objektit;
    }

    public void setObjektit(List<PeliObjekti> objektit) {
	this.objektit = objektit;
    }

    
    /**
     * Metodi PeliObjekti tyyppisen olion lisäämiseen Maailma-luokan objektilis-
     * taan.
     * @param lisattava PeliObjekti -tyyppinen olio. 
     */
    public void lisaaObjekti(PeliObjekti lisattava) {
	this.objektit.add(lisattava);
    }
    
    /**
     * Metodi Ammus tyyppisen olion lisäämiseen Maailma-luokan objektilistaan
     * @param lisattava Ammus -tyyppinen olio.
     */
    public void lisaaObjekti(Ammus lisattava) {
	this.objektit.add(lisattava);
    }
    
    /**
     * Metodi Tykki tyyppisen olion lisäämiseen Maailma-luokan objektilistaan
     * @param lisattava Tykki -tyyppinen olio.
     */
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
    
    /**
     * Metodi kahden PeliObjekti tyyppisen olion sijaintien vertaamiseen
     * @param o1 PeliObjekti -tyyppinen olio.
     * @param o2 PeliObjekti -tyyppinen olio.
     * @return true, jos etäisyys on alle 0.1
     *         false, jos etäisyys on >= 0.1
     */
    public boolean tormaysTarkistus(PeliObjekti o1, PeliObjekti o2) {
	if(o1.getSijainti().distance(o2.getSijainti()) < 0.1) {
	    //System.out.println("OSUMA!");
	    return true;
	}
	else
	    return false;
    }
    
    /**
     * Metodi Ammus -tyyppisen ja Pelaaja -tyyppisen olioiden etäisyyden tarkas-
     * telemiseen
     * @param o1 Ammus -tyyppinen olio.
     * @param o2 Pelaaja -tyyppinen olio.
     * @return true, jos etäisyys on alle 10
     *         false, jos etäisyys on >= 10
     */
    public boolean tormaysTarkistus(Ammus o1, Pelaaja o2) {
	if(o1.getSijainti().distance(o2.getSijainti()) < 10) {
	    //System.out.println("OSUMA!");
	    return true;
	}
	else
	    return false;
    }
}

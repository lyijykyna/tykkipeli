package tykkipeli.controller;

import java.util.ArrayList;
import java.util.List;
import tykkipeli.model.Pelaaja;

/**
 *
 * 
 */
public class Tykkipeli {

    private int pelaajienLukumaara;
    private List<Pelaaja> pelaajat;
    private Maailma peliMaailma;

    public Tykkipeli() {
	this.pelaajat = new ArrayList<Pelaaja>();
    }
    
    public Tykkipeli(int pelaajienLukumaara) {
	this.pelaajienLukumaara = pelaajienLukumaara;
	this.pelaajat = new ArrayList<Pelaaja>();
    }
    
    public int getPelaajienLukumaara() {
	return pelaajienLukumaara;
    }

    public void setPelaajienLukumaara(int pelaajienLukumaara) {
	this.pelaajienLukumaara = pelaajienLukumaara;
    }
    
    public List<Pelaaja> getPelaajat() {
	return pelaajat;
    }

    public void setPelaajat(List<Pelaaja> pelaajat) {
	this.pelaajat = pelaajat;
    }

    public Maailma getPeliMaailma() {
	return peliMaailma;
    }

    public void setPeliMaailma(Maailma peliMaailma) {
	this.peliMaailma = peliMaailma;
    }
    
    public void lisaaPelaaja(Pelaaja pelaaja) {
	this.pelaajat.add(pelaaja);
    }
    
}

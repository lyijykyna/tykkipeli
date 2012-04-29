package tykkipeli.controller;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tykkipeli.fysiikka.Lentorata;
import tykkipeli.model.Ammus;
import tykkipeli.model.Pelaaja;

/**
 *
 * 
 */
public class Tykkipeli {

    private int pelaajienLukumaara;
    private List<Pelaaja> pelaajat;
    private Maailma peliMaailma;
    private int vuoro;

    public Tykkipeli() {
	this.pelaajat = new ArrayList<Pelaaja>();
        this.vuoro = 0;
    }
    
//    public Tykkipeli(int pelaajienLukumaara) {
//	this.pelaajienLukumaara = pelaajienLukumaara;
//	this.pelaajat = new ArrayList<Pelaaja>();
//    }
    
    public int getPelaajienLukumaara() {
	return pelaajat.size();
    }

    //poistetaan tämä, koska pelaajienLukumäärä riippuu vain taulukon koosta
//    public void setPelaajienLukumaara(int pelaajienLukumaara) {
//	this.pelaajienLukumaara = pelaajienLukumaara;
//    }
    
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
    
    public void arvoPelaajienPaikat() {
	int x = 0;
	int y = 0;
	int min = 0;
	int max = this.peliMaailma.getLEVEYS()/getPelaajienLukumaara();
	Random random = new Random();
	for(Pelaaja p : this.pelaajat) {
	    x = random.nextInt(max-min)+min;
	    //pelaajalla on nyt oma sijainti, ehkä siitä tehdään sittenkin
	    //merkitsevä sijainti tykille
	    //p.getTykki().setSijainti(new Point(x,y));
	    p.setSijainti(x,y);
	    min = max;
	    max += this.peliMaailma.getLEVEYS()/getPelaajienLukumaara();
	}
    }
    
    public Lentorata pelaajaAmpuu(Pelaaja pelaaja, double koro, double teho) {
	pelaaja.setKoro(koro);
	pelaaja.setTeho(teho);
	Point alkupsijainti = pelaaja.getTykki().getSijainti();
	Ammus ammuttu = new Ammus(alkupsijainti);
	Lentorata rata = new Lentorata(alkupsijainti.x, alkupsijainti.y, pelaaja.getTeho()*Math.cos(pelaaja.getKoroRadiaaneina()), pelaaja.getTeho()*Math.sin(pelaaja.getKoroRadiaaneina()), 0);
	System.out.println("Ammutaan korolla "+ koro+"° ja teholla "+teho);
	System.out.println("Ammutaan alkunopeudella: "+pelaaja.getTeho()*Math.cos(pelaaja.getKoroRadiaaneina())+"i + "+pelaaja.getTeho()*Math.sin(pelaaja.getKoroRadiaaneina())+"j");
	rata.setAmmus(ammuttu);
	return rata;
    }

    public int getVuoro() {
        return vuoro;
    }

    public void setVuoro(int vuoro) {
        this.vuoro = vuoro;
    }
    
    public void muutaVuoro() {
        if(this.vuoro < this.getPelaajienLukumaara()-1) {
            vuoro++;
            System.out.println("Muutettiin vuoroa");
        }
        else {
            vuoro = 0;
            System.out.println("Palautettiin vuoro ensimmäiselle pelaajalle");
        }
    }
    
    public Pelaaja getVuorossaOlevaPelaaja() {
        return this.pelaajat.get(vuoro);
    }
    
}

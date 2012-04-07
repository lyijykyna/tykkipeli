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
    
    public void arvoPelaajienPaikat() {
	int x = 0;
	int y = 0;
	int min = 0;
	int max = this.peliMaailma.getLEVEYS()/this.pelaajienLukumaara;
	Random random = new Random();
	for(Pelaaja p : this.pelaajat) {
	    x = random.nextInt(max-min)+min;
	    p.getTykki().setSijainti(new Point(x,y));
	    min = max;
	    max += this.peliMaailma.getLEVEYS()/this.pelaajienLukumaara;
	}
    }
    
    public Lentorata pelaajaAmpuu(Pelaaja pelaaja, double koro, int teho) {
	pelaaja.setKoro(koro);
	pelaaja.setTeho(teho);
	Point alkupsijainti = pelaaja.getTykki().getSijainti();
	Ammus ammuttu = new Ammus(alkupsijainti);
	Lentorata rata = new Lentorata(alkupsijainti.x, alkupsijainti.y, pelaaja.getTeho()*Math.cos(pelaaja.getKoro()), pelaaja.getTeho()*Math.sin(pelaaja.getKoro()), 0);
	rata.setAmmus(ammuttu);
	return rata;
    }
}

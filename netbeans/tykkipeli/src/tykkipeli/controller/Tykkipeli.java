package tykkipeli.controller;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tykkipeli.fysiikka.Lentorata;
import tykkipeli.model.Ammus;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.Tykki;

/**
 *Luokka, joka sisältää tiedot tykkipelin pelimaailmasta, pelaajista, pitää
 * huolta vuoroista ja niiden vaihtamisesta (ja pitäisi pitää huolta myös pelin
 * voittamisen selvittämisestä).
 * 
 */
public class Tykkipeli {

    private int pelaajienLukumaara;
    private List<Pelaaja> pelaajat;
    private Maailma peliMaailma;
    private int vuoro;

    /**
     * Oletuskonstruktori Tykkipeli-luokalle.
     */
    public Tykkipeli() {
	this.pelaajat = new ArrayList<Pelaaja>();
        this.vuoro = 0;
    }
    
    /**
     * Metodi peli aloitukseen. Asettaa pelaajat pelimaailmaan ja lisää heille
     * tykit.
     */
    public void alusta() {
        this.setPeliMaailma(new Maailma());
	//System.out.println("Aloitetaan ohjelma");
	//lisätään pelaajat
	for(int i=0;i<2;i++) {
	    this.lisaaPelaaja(new Pelaaja("Pelaaja"+(i+1)));
	    //System.out.println("Lisättiin pelaaja "+this.getPelaajat().get(i).getNimi());
	    this.getPelaajat().get(i).setTykki(new Tykki());
	    //System.out.println("Lisättiin pelaajalle tykki");
            this.getPeliMaailma().lisaaObjekti(this.getPelaajat().get(i).getTykki());
	    //tykkipeli.arvoPelaajienPaikat();
	    for(Pelaaja p : this.getPelaajat())
		p.setSijainti(p.getSijainti().x, p.getSijainti().y);
	    //System.out.println("Sijoitettiin pelaajan tykki pisteeseen"+this.getPelaajat().get(i).getTykki().getSijainti());
	    //System.out.println("---------------------------------------------");
	}
	this.arvoPelaajienPaikat();
        Pelaaja p1 = this.getPelaajat().get(0);
        Pelaaja p2 = this.getPelaajat().get(1);
        //System.out.println("Arvottiin pelaajien paikat. Uudet paikat tämän jälkeen:");
        //System.out.println("Pelaaja1: "+p1.getSijainti());
        //System.out.println("Pelaaja2: "+p2.getSijainti());
	//System.out.println("Aloitetaan peli");
	p1.setKoro(45);
	p1.setTeho(10);
        //System.out.println(this.getPelaajienLukumaara());
    }
    
    public int getPelaajienLukumaara() {
	return pelaajat.size();
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
    
    /**
     * Lisää Pelaaja-tyyppisen olion Tykkipeli-luokan Pelaaja-listaan
     * @param pelaaja Pelaaja tyyppinen olio.
     */
    public void lisaaPelaaja(Pelaaja pelaaja) {
	this.pelaajat.add(pelaaja);
    }
    
    /**
     * Metodi, jolla arvotaan pelaajien paikat pelimaailmassa. Metodi ottaa huo-
     * mioon pelaajien lukumäärän ja pelimaailman rajat. Pelimaailma jaetaan pe-
     * laajien lukumäärällä ja jokaiselle pelaajalle annetaan oma alue, johon
     * heidän tykkinsä sijoitetaan.
     */
    public void arvoPelaajienPaikat() {
	int x = 0;
	int y = 0;
	int min = 0;
	int max = this.peliMaailma.getLeveys()/getPelaajienLukumaara();
	Random random = new Random();
	for(Pelaaja p : this.pelaajat) {
	    x = random.nextInt(max-min)+min;
	    //pelaajalla on nyt oma sijainti, ehkä siitä tehdään sittenkin
	    //merkitsevä sijainti tykille
	    //p.getTykki().setSijainti(new Point(x,y));
	    p.setSijainti(x,y);
	    min = max;
	    max += this.peliMaailma.getLeveys()/getPelaajienLukumaara();
	}
    }
    
    /**
     * Metodi, jota käytetään ampumistapahtumassa. Otetaan pelaajan antamat
     * arvot korokulmalle ja teholle ja luodaan Lentorata näiden arvojen
     * perusteella.
     * @param pelaaja Pelaaja, joka ampuu
     * @param koro pelaajan antama tykin korokulma
     * @param teho pelaajan antama tykin ampumisteho
     * @return Lentorata alkuarvojen mukaan.
     */
    public Lentorata pelaajaAmpuu(Pelaaja pelaaja, double koro, double teho) {
	pelaaja.setKoro(koro);
	pelaaja.setTeho(teho);
	Point alkupsijainti = pelaaja.getTykki().getSijainti();
	Ammus ammuttu = new Ammus(alkupsijainti);
	Lentorata rata = new Lentorata(alkupsijainti.x, alkupsijainti.y, pelaaja.getTeho()*Math.cos(pelaaja.getKoroRadiaaneina()), pelaaja.getTeho()*Math.sin(pelaaja.getKoroRadiaaneina()), 0);
	//System.out.println("Ammutaan korolla "+ koro+"° ja teholla "+teho);
	//System.out.println("Ammutaan alkunopeudella: "+pelaaja.getTeho()*Math.cos(pelaaja.getKoroRadiaaneina())+"i + "+pelaaja.getTeho()*Math.sin(pelaaja.getKoroRadiaaneina())+"j");
	rata.setAmmus(ammuttu);
	return rata;
    }

    public int getVuoro() {
        return vuoro;
    }

    public void setVuoro(int vuoro) {
        this.vuoro = vuoro;
    }
    
    /**
     * Metodi, jolla vaihdetaan vuoroa.
     */
    public void muutaVuoro() {
        if(this.vuoro < this.getPelaajienLukumaara()-1) {
            vuoro++;
            //System.out.println("Muutettiin vuoroa");
        }
        else {
            vuoro = 0;
            //System.out.println("Palautettiin vuoro ensimmäiselle pelaajalle");
        }
    }
    
    public Pelaaja getVuorossaOlevaPelaaja() {
        return this.pelaajat.get(vuoro);
    }
    
}

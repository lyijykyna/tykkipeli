package tykkipeli;

import java.awt.Point;
import java.util.Random;
import tykkipeli.controller.Maailma;
import tykkipeli.controller.Tykkipeli;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.Tykki;

/**
 *
 * @author
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	Tykkipeli tykkipeli = new Tykkipeli(2);
	tykkipeli.setPeliMaailma(new Maailma());
	System.out.println("Aloitetaan ohjelma");
	//lisätään pelaajat
	for(int i=0;i<tykkipeli.getPelaajienLukumaara();i++) {
	    tykkipeli.lisaaPelaaja(new Pelaaja("Pelaaja"+(i+1)));
	    System.out.println("Lisättiin pelaaja "+tykkipeli.getPelaajat().get(i).getNimi());
	    tykkipeli.getPelaajat().get(i).setTykki(new Tykki());
	    System.out.println("Lisättiin pelaajalle tykki");
	    //random 0--LEVEYS/pelaajia -> seuraava alkaa LEVEYS/pelaajia--max
	    Random satunnainen = new Random();
	    int nro = satunnainen.nextInt((i*tykkipeli.getPeliMaailma().getLEVEYS()/2)+(tykkipeli.getPeliMaailma().getLEVEYS()/2));
	    tykkipeli.getPelaajat().get(i).getTykki().setSijainti(new Point(nro,0));
	    System.out.println("Sijoitettiin pelaajan tykki pisteeseen"+tykkipeli.getPelaajat().get(i).getTykki().getSijainti());
	}
	System.out.println("Aloitetaan peli");
	    System.out.println("Pelaaja1 ampuu tykillä");
	System.out.println("Lopetetaan peli");
	System.out.println("Lopetetaan ohjelma");
    }
}

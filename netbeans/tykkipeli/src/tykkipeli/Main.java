package tykkipeli;

import java.awt.FlowLayout;
import javax.swing.*;
import tykkipeli.controller.Maailma;
import tykkipeli.controller.Tykkipeli;
import tykkipeli.gui.Ikkuna;
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
	
	Tykkipeli tykkipeli = new Tykkipeli();
	tykkipeli.setPeliMaailma(new Maailma());
	System.out.println("Aloitetaan ohjelma");
	//lisätään pelaajat
	for(int i=0;i<2;i++) {
	    tykkipeli.lisaaPelaaja(new Pelaaja("Pelaaja"+(i+1)));
	    System.out.println("Lisättiin pelaaja "+tykkipeli.getPelaajat().get(i).getNimi());
	    tykkipeli.getPelaajat().get(i).setTykki(new Tykki());
	    System.out.println("Lisättiin pelaajalle tykki");
	    //tykkipeli.arvoPelaajienPaikat();
	    System.out.println("Sijoitettiin pelaajan tykki pisteeseen"+tykkipeli.getPelaajat().get(i).getTykki().getSijainti());
	    System.out.println("---------------------------------------------");
	}
	tykkipeli.arvoPelaajienPaikat();
        Pelaaja p1 = tykkipeli.getPelaajat().get(0);
        Pelaaja p2 = tykkipeli.getPelaajat().get(1);
        System.out.println("Arvottiin pelaajien paikat. Uudet paikat tämän jälkeen:");
        System.out.println("Pelaaja1: "+p1.getSijainti());
        System.out.println("Pelaaja2: "+p2.getSijainti());
	System.out.println("Aloitetaan peli");
	p1.setKoro(45);
	p1.setTeho(10);
        System.out.println(tykkipeli.getPelaajienLukumaara());
        
        Ikkuna ikkuna = new Ikkuna(tykkipeli);
        SwingUtilities.invokeLater(ikkuna);
    }
}

package tykkipeli;

import tykkipeli.controller.Maailma;
import tykkipeli.controller.Tykkipeli;
import tykkipeli.fysiikka.Lentorata;
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
	    tykkipeli.arvoPelaajienPaikat();
	    System.out.println("Sijoitettiin pelaajan tykki pisteeseen"+tykkipeli.getPelaajat().get(i).getTykki().getSijainti());
	}
	System.out.println("Aloitetaan peli");
	Pelaaja p1 = tykkipeli.getPelaajat().get(0);
	p1.setKoro(45);
	p1.setTeho(10);
	Pelaaja p2 = tykkipeli.getPelaajat().get(1);
	int l=0;
	while(p1.isPelissa() && p2.isPelissa()) {
	    System.out.println("Pelaaja1 ampuu tykillä");
	    Lentorata rata = tykkipeli.pelaajaAmpuu(p1);
	    int iii = 0;
	    while(!tykkipeli.getPeliMaailma().tormaysTarkistus(rata.getAmmus(), p2.getTykki()) && iii<50) {
		rata.iteroiRata(rata.getAmmus());
		iii++;
	    }
	    System.out.println(p2.getNimi()+" ampuu");
	    p2.ammu();
	    if(l==3)
		p2.poistaPelista();
	    l++;
	}
	if(p1.isPelissa() && !p2.isPelissa())
	    System.out.println(p1.getNimi()+" voitti pelin!");
	else if(p2.isPelissa() && !p1.isPelissa())
	    System.out.println(p2.getNimi()+" voitti pelin!");
	else
	    System.out.println("Tasapeli!");
	System.out.println("Lopetetaan peli");
	System.out.println("Lopetetaan ohjelma");
    }
}

package tykkipeli;

import java.util.Random;
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
	    System.out.println("---------------------------------------------");
	}
	System.out.println("Aloitetaan peli");
	Pelaaja p1 = tykkipeli.getPelaajat().get(0);
	p1.setKoro(45);
	p1.setTeho(10);
	Pelaaja p2 = tykkipeli.getPelaajat().get(1);
	int l=0;
	while(p1.isPelissa() && p2.isPelissa()) {
	    System.out.println("Pelaaja1 ampuu tykillä");
	    //TODO: pelaajaAmpuu metodiin teho ja koro ja siellä metodissa pelaajaluokan päivitys näillä arvoilla
	    Random random = new Random(l*3);
	    int nro1 = random.nextInt(90);
	    int nro2 = random.nextInt(100)+20;
	    Lentorata rata = tykkipeli.pelaajaAmpuu(p1,nro1,nro2);
	    int iii = 0;
	    while(!tykkipeli.getPeliMaailma().tormaysTarkistus(rata.getAmmus(), p2.getTykki()) && iii<500 && rata.getAmmus().getSijainti().y >= 0) {
		rata.getAmmus().setSijainti(rata.iteroiRata(rata.getAmmus()));
		iii++;
	    }
	    System.out.println("Rataa iteroitiin "+iii+" kertaa");
	    System.out.println("Pelaajan1 ja -2 välinen etäisyys: "+p1.getTykki().getSijainti().distance(p2.getTykki().getSijainti()));
	    System.out.println("Ammus lensi "+p1.getTykki().getSijainti().distance(rata.getAmmus().getSijainti()));
	    System.out.println("Etäisyys maaliin: "+rata.getAmmus().getSijainti().distance(p2.getTykki().getSijainti()));
	    if(rata.getAmmus().getSijainti().x > p2.getTykki().getSijainti().x)
		System.out.println("YLI!");
	    else
		System.out.println("JÄI VAJAAKSI!");
	    System.out.println("Ammuksen sijainti: "+rata.getAmmus().getSijainti());
	    System.out.println("-----------------------------------------------");
	    //System.out.println(p2.getNimi()+" ampuu");
	    //p2.ammu();
	    if(l==30)
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
	Pelaaja testi = new Pelaaja("testi");
	testi.setKoro(90);
	System.out.println(testi.getKoroRadiaaneina());
	System.out.println(Math.PI/2);
    }
}

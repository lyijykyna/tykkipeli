package tykkipeli.model;

import java.awt.Point;

/**
 * Pelaajan tiedot ja toiminnot sisältävä luokka
 * 
 */
public class Pelaaja {
    
    private String nimi;
    private Tykki tykki;
    private boolean pelissa;
    private double teho; //TODO: tälle jotkut raja-arvot? ja testit
    private double koro; //TODO: Päätä pistetäänkö pyörähtämään nollaan täyden jälkeen, sekä rajoitetaanko vain 180° ja testit tälle
    private Point sijainti;

    /**
     * Parametrillinen konstruktori Pelaaja-luokalle
     * @param nimi pelaajan nimi
     */
    public Pelaaja(String nimi) {
	this.nimi = nimi;
	this.pelissa = true;
	this.sijainti = null;
    }
    
    /**
     * Metodi, jolla pelaaja ampuu tykillään
     */
    public void ammu() {
	if(tykki != null) {
	    System.out.println("PUM!");
	}
	else
	    System.out.println("Pelaajalla ei ole tykkiä!");
    }
    
    /**
     * Metodi antaa pelaajan nimen
     * @return pelaajan nimi
     */
    public String getNimi() {
	return nimi;
    }

    /**
     * Metodi asettaa pelaajan nimen
     * @param nimi pelaajan nimi
     */
    public void setNimi(String nimi) {
	this.nimi = nimi;
    }

    /**
     * Metodi antaa pelaajaan yhdistetyn Tykki-olion
     * @return pelaajan tykki
     */
    public Tykki getTykki() {
	return tykki;
    }

    /**
     * Metodi asettaa pelaajalle Tykki-olion
     * @param tykki pelaajaan yhdistettävä tykki
     */
    public void setTykki(Tykki tykki) {
	if(this.sijainti == null)
	    this.sijainti = tykki.getSijainti();
	else
	    tykki.setSijainti(this.sijainti);
	this.tykki = tykki;
    }

    /**
     * Metodi joka antaa totuusarvon pelaajan pelissäolemisesta
     * @return true = pelaaja on pelissä, false = pelaaja on poissa pelistä
     */
    public boolean isPelissa() {
	return pelissa;
    }

    /**
     * Metodi, jolla asetetaan pelaajan pelissäolemiseen liittyvä totuusarvo
     * @param pelissa true = pelaaja on pelissä, false = pelaaja ei ole pelissä
     */
    public void setPelissa(boolean pelissa) {
	this.pelissa = pelissa;
    }
    
    /**
     * Metodi, jolla pelaaja poistetaan pelistä eli muutetaan pelaajan pelissä-
     * olemista kuvaava totuusarvo falseksi
     */
    public void poistaPelista() {
	this.setPelissa(false);
    }

    public double getTeho() {
	return teho;
    }

    public void setTeho(double teho) {
	this.teho = teho;
    }

    public double getKoro() {
	return koro;
    }
    
    public double getKoroRadiaaneina() {
	return (koro/180)*Math.PI;
    }

    public void setKoro(double koro) {
	this.koro = koro;
    }

    public Point getSijainti() {
	return sijainti;
    }

    public void setSijainti(Point sijainti) {
	if(this.tykki != null)
	    this.tykki.setSijainti(sijainti);
	this.sijainti = sijainti;
    }
    
    public void setSijainti(int x, int y) {
	if(this.tykki != null)
	    this.tykki.setSijainti(new Point(x,y));
	this. sijainti = new Point(x,y);
    }
}

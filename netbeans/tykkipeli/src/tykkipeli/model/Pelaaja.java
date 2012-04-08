package tykkipeli.model;

/**
 * Pelaajan tiedot ja toiminnot sisältävä luokka
 * 
 */
public class Pelaaja {
    
    private String nimi;
    private Tykki tykki;
    private boolean pelissa;
    private int teho;
    private double koro;

    /**
     * Parametrillinen konstruktori Pelaaja-luokalle
     * @param nimi pelaajan nimi
     */
    public Pelaaja(String nimi) {
	this.nimi = nimi;
	this.pelissa = true;
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

    public int getTeho() {
	return teho;
    }

    public void setTeho(int teho) {
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
    
    
}

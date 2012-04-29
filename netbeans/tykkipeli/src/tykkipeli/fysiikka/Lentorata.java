package tykkipeli.fysiikka;

import java.awt.Point;
import tykkipeli.controller.Maailma;
import tykkipeli.model.Ammus;

/**
 * Tykin ampuman ammuksen lentoradan laskemisen hoitava luokka.
 * 
 */
public class Lentorata {
    private double putoamiskiihtyvyys = 10;
    private double aikaAskel = 0.1; //0.1 on melko hyvä 640x480 maailmalle
    private int alkuX;
    private int alkuY;
    private double alkuNopeusX;
    private double alkuNopeusY;
    private int alkuAika;
    private double ajanMuutos;
    private Ammus ammus;

    /**
     * Parametrillinen konstruktori Lentorata-luokalle
     * @param x0 ammutun ammuksen x-alkukoordinaatti
     * @param y0 ammutun ammuksen y-alkukoordinaatti
     * @param v0x ammutun ammuksen x-suuntainen alkunopeus
     * @param v0y ammutun ammuksen y-suuntainen alkunopeus
     * @param t0 ampumistapahtuman alkuhetki, yleensä 0
     */
    public Lentorata(int x0, int y0, double v0x, double v0y, int t0) {
        this.alkuX = x0;
        this.alkuY = y0;
        this.alkuNopeusX = v0x;
        this.alkuNopeusY = v0y;
        this.alkuAika = t0;
    }

    
    /**
     * Metodi antaa laskemisessa käytetyn putoamiskiihtyvyyden arvon
     * @return putoamiskiihtyvyyden arvo
     */
    public double getPutoamiskiihtyvyys() {
        return putoamiskiihtyvyys;
    }

    /**
     * Metodilla asetetaan lentoradan laskemisessa käytetyn putoamiskiihtyvyyden
     * arvo
     * @param putoamiskiihtyvyys putoamiskiihtyvyyden arvo
     */
    public void setPutoamiskiihtyvyys(double putoamiskiihtyvyys) {
        this.putoamiskiihtyvyys = putoamiskiihtyvyys;
    }

    /**
     * Metodi antaa lentoradan laskemisessa käytetyn aika-askeleen arvon
     * @return aika-askel
     */
    public double getAikaAskel() {
        return aikaAskel;
    }

    /**
     * Metodilla asetetaan lentoradan laskemisessa käytetyn aika-askeleen arvo
     * @param aikaAskel
     */
    public void setAikaAskel(double aikaAskel) {
        this.aikaAskel = aikaAskel;
    }
    
    /**
     * Metodi antaa kuluneen ajan iterointien perusteella, ajanMuutos lasketaan
     * radan iteroinnin yhteydessä ajanMuutos = ajanMuutos + aikaAskel. Vastaa
     * koordinaattia "t" v(x,t) esityksessä
     * @return ampumisen alusta asti kulunut aika aikaAskelien summana
     */
    public double getAjanMuutos() {
        return ajanMuutos;
    }

    /**
     * Metodilla asetetaan ajanMuutos haluttuun arvoon. Metodia tuskin tarvitaan
     * @param dt
     */
    public void setAjanMuutos(int dt) {
        this.ajanMuutos = dt;
    }

    /**
     * Metodi antaa ajan alkuhetken arvon, yleensä 0
     * @return ajan alkuhetki
     */
    public int getAlkuAika() {
        return alkuAika;
    }

    /**
     * Metodilla asetetaan ajan alkuhetki haluttuun arvoon
     * @param alkuAika
     */
    public void setAlkuAika(int alkuAika) {
        this.alkuAika = alkuAika;
    }

    /**
     * Metodi antaa x-suuntaisen nopeuden alkuarvon
     * @return alkunopeuden x-suuntainen komponentti
     */
    public double getAlkuNopeusX() {
        return alkuNopeusX;
    }

    /**
     * Metodilla asetetaan alkunopeuden x-suuntainen komponentti
     * @param alkuNopeusX
     */
    public void setAlkuNopeusX(double alkuNopeusX) {
        this.alkuNopeusX = alkuNopeusX;
    }

    /**
     * Metodi antaa alkunopeuden y-suuntaisen komponentin
     * @return alkunopeuden y-suuntainen komponentti
     */
    public double getAlkuNopeusY() {
        return alkuNopeusY;
    }

    /**
     * Metodilla asetetaan alkunopeuden y-suuntainen komponentti
     * @param alkuNopeusY
     */
    public void setAlkuNopeusY(double alkuNopeusY) {
        this.alkuNopeusY = alkuNopeusY;
    }

    /**
     * Metodi antaa x-koordinaatin, josta lentoradan laskeminen aloitetaan
     * @return alkuperäinen x-koordinaatti
     */
    public int getAlkuX() {
        return alkuX;
    }

    /**
     * Metodilla asetetaan x-koordinaatti, josta lentoradan laskeminen alkaa
     * @param alkuX
     */
    public void setAlkuX(int alkuX) {
        this.alkuX = alkuX;
    }

    /**
     * Metodi antaa y-koordinaatin, josta lentoradan laskeminen aloitetaan
     * @return alkuperäinen y-koordinaatti
     */
    public int getAlkuY() {
        return alkuY;
    }

    /**
     * Metodilla asetetaan y-koordinaatti, josta lentoradan laskeminen alkaa
     * @param alkuY
     */
    public void setAlkuY(int alkuY) {
        this.alkuY = alkuY;
    }

    /**
     * Metodi antaa Ammus-luokan ilmentymän, jonka lentorataa luokka laskee
     * @return lentävä ammus
     */
    public Ammus getAmmus() {
	return ammus;
    }

    /**
     * Metodilla asetetaan ammus, jonka lentorataa luokka laskee
     * @param ammus
     */
    public void setAmmus(Ammus ammus) {
	this.ammus = ammus;
    }
    
    /**
     * Metodilla lasketaan ammuksen lentorataa iteroimalla sitä suhteessa ammuk-
     * sen edelliseen sijaintiin sekä Lentorata-luokan sisältämään putoamiskiih-
     * tyvyyteen sekä aika-askeleeseen. Laskemisessa käytetään vinon heittoliik-
     * keen fysiikkaa.
     */
    public void iteroiRata() {
        Point uusiPiste = new Point();
        //r(t)=(x_0+v_0*x*t)i+(y_0+v_0y*t-½*g*t^2)j
        //uusi t = alkuAika+deltat
        //x
        //System.out.println(this.alkuX+alkuNopeusX*(this.alkuAika+this.ajanMuutos));
        uusiPiste.x = (int) (this.alkuX+alkuNopeusX*(this.alkuAika+this.ajanMuutos));
        //y
        //System.out.println(this.alkuY+this.alkuNopeusY*(this.alkuAika+this.ajanMuutos)-0.5*putoamiskiihtyvyys*(this.alkuAika+this.ajanMuutos)*(this.alkuAika+this.ajanMuutos));
        uusiPiste.y = (int) (this.alkuY+this.alkuNopeusY*(this.alkuAika+this.ajanMuutos)-0.5*putoamiskiihtyvyys*(this.alkuAika+this.ajanMuutos)*(this.alkuAika+this.ajanMuutos));
        //System.out.println("Aika-askel: "+this.ajanMuutos);
        ajanMuutos+=aikaAskel;
        this.ammus.setSijainti(uusiPiste);
    }
}

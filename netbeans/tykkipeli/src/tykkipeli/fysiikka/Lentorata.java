package tykkipeli.fysiikka;

import java.awt.Point;
import tykkipeli.controller.Maailma;
import tykkipeli.model.Ammus;


public class Lentorata {
    private double putoamiskiihtyvyys = 10;
    private double aikaAskel = 0.1; //0.1 on melko hyvä 640x480 maailmalle
    private Maailma maailma;
    private int alkuX;
    private int alkuY;
    private double alkuNopeusX;
    private double alkuNopeusY;
    private int alkuAika;
    private double ajanMuutos;
    private Ammus ammus;

    public Lentorata(Maailma maailma, int x0, int y0, double v0x, double v0y, int t0) {
        this.maailma = maailma;
        this.alkuX = x0;
        this.alkuY = y0;
        this.alkuNopeusX = v0x;
        this.alkuNopeusY = v0y;
        this.alkuAika = t0;
    }

    
    
    public double getPutoamiskiihtyvyys() {
        return putoamiskiihtyvyys;
    }

    public void setPutoamiskiihtyvyys(double putoamiskiihtyvyys) {
        this.putoamiskiihtyvyys = putoamiskiihtyvyys;
    }

    public double getAikaAskel() {
        return aikaAskel;
    }

    public void setAikaAskel(double aikaAskel) {
        this.aikaAskel = aikaAskel;
    }

    public Maailma getMaailma() {
        return maailma;
    }

    public void setMaailma(Maailma maailma) {
        this.maailma = maailma;
    }
    
    public double getAjanMuutos() {
        return ajanMuutos;
    }

    public void setAjanMuutos(int dt) {
        this.ajanMuutos = dt;
    }

    public int getAlkuAika() {
        return alkuAika;
    }

    public void setAlkuAika(int alkuAika) {
        this.alkuAika = alkuAika;
    }

    public double getAlkuNopeusX() {
        return alkuNopeusX;
    }

    public void setAlkuNopeusX(double alkuNopeusX) {
        this.alkuNopeusX = alkuNopeusX;
    }

    public double getAlkuNopeusY() {
        return alkuNopeusY;
    }

    public void setAlkuNopeusY(double alkuNopeusY) {
        this.alkuNopeusY = alkuNopeusY;
    }

    public int getAlkuX() {
        return alkuX;
    }

    public void setAlkuX(int alkuX) {
        this.alkuX = alkuX;
    }

    public int getAlkuY() {
        return alkuY;
    }

    public void setAlkuY(int alkuY) {
        this.alkuY = alkuY;
    }

    public Ammus getAmmus() {
	return ammus;
    }

    public void setAmmus(Ammus ammus) {
	this.ammus = ammus;
    }
    
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

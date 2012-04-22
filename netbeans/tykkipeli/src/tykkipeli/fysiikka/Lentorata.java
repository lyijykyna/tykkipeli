package tykkipeli.fysiikka;

import java.awt.Point;
import tykkipeli.controller.Maailma;
import tykkipeli.model.Ammus;


public class Lentorata {
    private static double PUTOAMISKIIHTYVYYS = -10;
    private static double aikaAskel = 0.1; //0.1 on melko hyvä 640x480 maailmalle
    private Maailma maailma;
    private int x0;
    private int y0;
    private double v0x;
    private double v0y;
    private int t0;
    private double dt;
    private Ammus ammus;

    public Lentorata(Maailma maailma, int x0, int y0, double v0x, double v0y, int t0) {
        this.maailma = maailma;
        this.x0 = x0;
        this.y0 = y0;
        this.v0x = v0x;
        this.v0y = v0y;
        this.t0 = t0;
    }

    
    
    public static double getPUTOAMISKIIHTYVYYS() {
        return PUTOAMISKIIHTYVYYS;
    }

    public static void setPUTOAMISKIIHTYVYYS(double PUTOAMISKIIHTYVYYS) {
        Lentorata.PUTOAMISKIIHTYVYYS = PUTOAMISKIIHTYVYYS;
    }

    public static double getAikaAskel() {
        return aikaAskel;
    }

    public static void setAikaAskel(double aikaAskel) {
        Lentorata.aikaAskel = aikaAskel;
    }

    public Maailma getMaailma() {
        return maailma;
    }

    public void setMaailma(Maailma maailma) {
        this.maailma = maailma;
    }
    
    public double getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getT0() {
        return t0;
    }

    public void setT0(int t0) {
        this.t0 = t0;
    }

    public double getV0x() {
        return v0x;
    }

    public void setV0x(double v0) {
        this.v0x = v0;
    }

    public int getX0() {
        return x0;
    }

    public double getV0y() {
        return v0y;
    }

    public void setV0y(double v0y) {
        this.v0y = v0y;
    }

    
    
    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
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
        //uusi t = t0+deltat
        //x
        //System.out.println(this.x0+v0x*(this.t0+this.dt));
        uusiPiste.x = (int) (this.x0+v0x*(this.t0+this.dt));
        //y
        //System.out.println(this.y0+this.v0y*(this.t0+this.dt)-0.5*PUTOAMISKIIHTYVYYS*(this.t0+this.dt)*(this.t0+this.dt));
        uusiPiste.y = (int) (this.y0+this.v0y*(this.t0+this.dt)-0.5*PUTOAMISKIIHTYVYYS*(this.t0+this.dt)*(this.t0+this.dt));
        //System.out.println("Aika-askel: "+this.dt);
        dt+=aikaAskel;
        this.ammus.setSijainti(uusiPiste);
        this.maailma.lisaaObjekti(ammus);
    }
}

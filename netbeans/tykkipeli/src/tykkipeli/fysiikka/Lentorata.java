package tykkipeli.fysiikka;

import java.awt.Point;
import tykkipeli.model.Ammus;


public class Lentorata {
    private static double PUTOAMISKIIHTYVYYS = 10;
    private static double aikaAskel = 0.01;
    private int x0;
    private int y0;
    private int v0x;
    private int v0y;
    private int t0;
    private double dt;

    public Lentorata(int x0, int y0, int v0x, int v0y, int t0) {
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

    public int getV0x() {
        return v0x;
    }

    public void setV0x(int v0) {
        this.v0x = v0;
    }

    public int getX0() {
        return x0;
    }

    public int getV0y() {
        return v0y;
    }

    public void setV0y(int v0y) {
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
    
    public Point iteroiRata(Ammus ammus) {
        Point uusiPiste = new Point();
        //r(t)=(x_0+v_0*x*t)i+(y_0+v_0y*t-½*g*t^2)j
        //uusi t = t0+deltat
        //x
        //System.out.println(this.x0+v0x*(this.t0+this.dt));
        uusiPiste.x = (int) (this.x0+v0x*(this.t0+this.dt));
        //y
        //System.out.println(this.y0+this.v0y*(this.t0+this.dt)-0.5*PUTOAMISKIIHTYVYYS*(this.t0+this.dt)*(this.t0+this.dt));
        uusiPiste.y = (int) (this.y0+this.v0y*(this.t0+this.dt)-0.5*PUTOAMISKIIHTYVYYS*(this.t0+this.dt)*(this.t0+this.dt));
        System.out.println("Aika-askel: "+this.dt);
        dt+=aikaAskel;
        return uusiPiste;
    }
}

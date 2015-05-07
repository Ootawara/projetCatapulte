package form;

import bean.Catapulte;

/**
 * Created by tamiand on 07/05/2015.
 */
public class Siege {

    Catapulte catapulte;
    private double angleAlpha; private double angleForceTraction;
    private double brasLM; private double masseMB; private double mc;
    private double mp; private double baseLR;

    //constructor
    public Siege(){}

    //getters
    public double getAngleAlpha(){return angleAlpha;}
    public double getAngleForceTraction(){return angleAlpha;}
    public double getBrasLM(){return angleAlpha;}
    public double getMasseMB(){return angleAlpha;}
    public double getMc(){return angleAlpha;}
    public double getMp(){return angleAlpha;}
    public double getBaseLR(){return angleAlpha;}

    //setters
    public void setAngleAlpha(double d){this.angleAlpha=d;}
    public void setAngleForceTraction(double d){this.angleForceTraction=d;}
    public void setBrasLM(double d){this.brasLM=d;}
    public void setMasseMB(double d){this.masseMB=d;}
    public void setMc(double d){this.mc=d;}
    public void setMp(double d){this.mp=d;}
    public void setBaseLR(double d){this.baseLR=d;}

    @Override
    public String toString() {
        return "Siege{" +
                " angleAlpha=" + angleAlpha +
                ", angleForceTraction=" + angleForceTraction +
                ", brasLM=" + brasLM +
                ", masseMB=" + masseMB +
                ", mc=" + mc +
                ", mp=" + mp +
                ", baseLR=" + baseLR +
                '}';
    }
}

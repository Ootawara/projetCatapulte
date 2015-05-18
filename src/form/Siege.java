package form;

import bean.Catapulte;

/**
 * Created by tamiand on 07/05/2015.
 */
public class Siege {
	
    Catapulte catapulte;
    private double angleAlphaHauteurButee; private double angleBetaForceTraction;
    private double longueurBrasLB; private double masseBrasMB; private double masseContrepoidsMC;
    private double masseProjectileMP; private double longueurBaseLR;

    //constructor
    public Siege(){}

    //getters
    public double getAngleAlpha(){return angleAlphaHauteurButee;}
    public double getAngleForceTraction(){return angleBetaForceTraction;}
    public double getBrasLM(){return longueurBrasLB;}
    public double getMasseMB(){return masseBrasMB;}
    public double getMc(){return masseContrepoidsMC;}
    public double getMp(){return masseProjectileMP;}
    public double getBaseLR(){return longueurBaseLR;}

    //setters
    public void setAngleAlpha(double d){this.angleAlphaHauteurButee=d;}
    public void setAngleForceTraction(double d){this.angleBetaForceTraction=d;}
    public void setBrasLM(double d){this.longueurBrasLB=d;}
    public void setMasseMB(double d){this.masseBrasMB=d;}
    public void setMc(double d){this.masseContrepoidsMC=d;}
    public void setMp(double d){this.masseProjectileMP=d;}
    public void setBaseLR(double d){this.longueurBaseLR=d;}

    @Override
    public String toString() {
        return "Siege{" +
                " angleAlphaHauteurButee=" + angleAlphaHauteurButee +
                ", angleBetaForceTraction=" + angleBetaForceTraction +
                ", longueurBrasLB=" + longueurBrasLB +
                ", masseBrasMB=" + masseBrasMB +
                ", masseContrepoidsMC=" + masseContrepoidsMC +
                ", masseProjectileMP=" + masseProjectileMP +
                ", longueurBaseLR=" + longueurBaseLR +
                '}';
    }
}

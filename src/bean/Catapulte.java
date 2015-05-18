package bean;

public class Catapulte {

	public double angleAlphaHauteurButee;
	public double angleBetaForceTraction;
	public double longueurBrasLB;
	public double masseBrasMB;
	public double masseContrepoidsMC;
	public double masseProjectileMP;
	public double longueurBaseLR;
	
	/**
	 * 
	 * @param angleAlphaHauteurButee (en degres)
	 * @param angleBetaForceTraction (en degres)
	 * @param longueurBrasLB (en metres)
	 * @param masseBrasMB (en kg)
	 * @param masseContrepoidsMC (en kg)
	 * @param masseProjectileMP (en kg)
	 * @param longueurBaseLR (en metres)
	 */
	public Catapulte(double angleAlphaHauteurButee, double angleBetaForceTraction,
			double longueurBrasLB, double masseBrasMB, double masseContrepoidsMC, double masseProjectileMP, double longueurBaseLR) {
		this.angleAlphaHauteurButee = angleAlphaHauteurButee;
		this.angleBetaForceTraction = angleBetaForceTraction;
		this.longueurBrasLB = longueurBrasLB;
		this.masseBrasMB = masseBrasMB;
		this.masseContrepoidsMC = masseContrepoidsMC;
		this.masseProjectileMP = masseProjectileMP;
		this.longueurBaseLR = longueurBaseLR;
	}

	public double getAngleAlphaHauteurButee() {
		return angleAlphaHauteurButee;
	}

	public void setAngleAlphaHauteurButee(double angleAlphaHauteurButee) {
		this.angleAlphaHauteurButee = angleAlphaHauteurButee;
	}

	public double getAngleBetaForceTraction() {
		return angleBetaForceTraction;
	}

	public void setAngleBetaForceTraction(double angleBetaForceTraction) {
		this.angleBetaForceTraction = angleBetaForceTraction;
	}

	public double getLongueurBrasLB() {
		return longueurBrasLB;
	}

	public void setLongueurBrasLB(double longueurBrasLB) {
		this.longueurBrasLB = longueurBrasLB;
	}

	public double getMasseBrasMB() {
		return masseBrasMB;
	}

	public void setMasseBrasMB(double masseBrasMB) {
		this.masseBrasMB = masseBrasMB;
	}

	public double getMasseContrepoidsMC() {
		return masseContrepoidsMC;
	}

	public void setMasseContrepoidsMC(double masseContrepoidsMC) {
		this.masseContrepoidsMC = masseContrepoidsMC;
	}

	public double getMasseProjectileMP() {
		return masseProjectileMP;
	}

	public void setMasseProjectileMP(double masseProjectileMP) {
		this.masseProjectileMP = masseProjectileMP;
	}

	public double getLongueurBaseLR() {
		return longueurBaseLR;
	}

	public void setLongueurBaseLR(double longueurBaseLR) {
		this.longueurBaseLR = longueurBaseLR;
	}
	
}

package bean;

public class Catapulte {

	public double angleAlpha;
	public double angleForceTraction;
	public double brasLB;
	public double masseMB;
	public double mc;
	public double mp;
	public double baseLR;

	/**
	 * 
	 * @param angleAlpha
	 * @param angleForceTraction
	 * @param brasLB
	 * @param masseMB
	 * @param mc
	 * @param mp
	 * @param baseLR
	 */
	public Catapulte(double angleAlpha, double angleForceTraction,
			double brasLB, double masseMB, double mc, double mp, double baseLR) {
		this.angleAlpha = angleAlpha;
		this.angleForceTraction = angleForceTraction;
		this.brasLB = brasLB;
		this.masseMB = masseMB;
		this.mc = mc;
		this.mp = mp;
		this.baseLR = baseLR;
	}

	public double getAngleAlpha() {
		return angleAlpha;
	}

	public void setAngleAlpha(float angleAlpha) {
		this.angleAlpha = angleAlpha;
	}

	public double getAngleForceTraction() {
		return angleForceTraction;
	}

	public void setAngleForceTraction(float angleForceTraction) {
		this.angleForceTraction = angleForceTraction;
	}

	public double getBrasLB() {
		return brasLB;
	}

	public void setBrasLB(double brasLB) {
		this.brasLB = brasLB;
	}

	public double getMasseMB() {
		return masseMB;
	}

	public void setMasseMB(double masseMB) {
		this.masseMB = masseMB;
	}

	public double getMc() {
		return mc;
	}

	public void setMc(double mc) {
		this.mc = mc;
	}

	public double getMp() {
		return mp;
	}

	public void setMp(double mp) {
		this.mp = mp;
	}

	public double getBaseLR() {
		return baseLR;
	}

	public void setBaseLR(double baseLR) {
		this.baseLR = baseLR;
	}

}

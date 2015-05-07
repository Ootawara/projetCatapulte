package formules;

import datas.Constantes;

public class Formules {

	/**
	 * 
	 * @param mc
	 * @param mp
	 * @param angleAlpha
	 * @param angleBeta
	 * @return Force de traction F (en N)
	 */
	public double forceTraction(double mc, double mp, double angleAlpha,
			double angleBeta) {
		return ((mc * Constantes.graviteTerre) * Math.sin(angleBeta))
				- ((mp * Constantes.graviteTerre) * Math.sin(angleAlpha));
	}

	/**
	 * 
	 * @param forceTraction
	 * @param longeurBras
	 * @return moment du bras M
	 */
	public double momentLong(double forceTraction, double longeurBras) {
		return (forceTraction * longeurBras);
	}

	/**
	 * 
	 * @param masseBras
	 * @param longeurBras
	 * @return moment d'inertie du bras I
	 */
	public double momentInert(double masseBras, double longeurBras) {
		return ((masseBras * (longeurBras * longeurBras)) / 3);
	}

	/**
	 * 
	 * @param momentLong
	 * @param momentInert
	 * @return acceleration angulaire uniforme a
	 */
	public double accelarationAngulaire(double momentLong, double momentInert) {
		return (momentLong / momentInert);
	}

	/**
	 * 
	 * @param accelerationAngulaire
	 * @param longeurBras
	 * @return vélocité V en m/s
	 */
	public double velocite(double accelerationAngulaire, double longeurBras) {
		return (accelerationAngulaire * longeurBras);
	}

	/**
	 * 
	 * @param velocite
	 * @param angleAlpha
	 * @return portée du tir en m
	 */
	public double portee(double velocite, double angleAlpha) {
		return ((velocite * velocite) / Constantes.graviteTerre)
				* (Math.sin(2 * (90 - angleAlpha)));
	}

	/**
	 * 
	 * @param masseProjectile
	 * @param velocite
	 * @return energie d'impact Ec en joules
	 */
	public double energieImpact(double masseProjectile, double velocite) {
		return (1 / 2) * (masseProjectile * (velocite * velocite));
	}

	/**
	 * La construction envisag�e est-elle viable ?
	 * 
	 * @param angleAlpha
	 * @param lB
	 * @param lR
	 * @param mc
	 * @param mp
	 * @return true si viable
	 */
	public boolean isBuildEnabled(double angleAlpha, double lB, double lR,
			double mc, double mp) {

		double form1 = (Math.sin(angleAlpha) * lB);
		double form2 = (Math.cos(angleAlpha) * lB - lR);
		double form3 = (Math.sin(angleAlpha) * (mp * Constantes.graviteTerre));
		double form4 = (lR * (mc * Constantes.graviteTerre));

		if (((((form1) * (form1)) + (((form2) * (form2)) * form3))) > form4) {
			return true;
		}

		return false;

	}

	/**
	 * Equivalence Joule et gramme de TNT
	 * 
	 * @param energieJoule
	 * @param kgJouleTNT
	 * @return Energie TNT en joule
	 */
	public double energieTNT(double energieJoule) {

		return (energieJoule / Constantes.kgJouleTNT);

	}
}

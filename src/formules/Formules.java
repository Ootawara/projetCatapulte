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
	public double momentLong(double forceTraction, double longeurBras){
		return (forceTraction * longeurBras);
	}

	/**
	 *
	 * @param masseBras
	 * @param longeurBras
	 * @return moment d'inertie du bras I
	 */
	public double momentInert(double masseBras, double longeurBras){
		return ((masseBras * (longeurBras*longeurBras))/3);
	}

	/**
	 *
	 * @param momentLong
	 * @param momentInert
	 * @return acceleration angulaire uniforme a
	 */
	public double accelarationAngulaire(double momentLong, double momentInert){
		return (momentLong/momentInert);
	}

	/**
	 *
	 * @param accelerationAngulaire
	 * @param longeurBras
	 * @return vélocité V en m/s
	 */
	public double velocite(double accelerationAngulaire, double longeurBras){
		return (accelerationAngulaire * longeurBras);
	}

	/**
	 *
	 * @param velocite
	 * @param angleAlpha
	 * @return portée du tir en m
	 */
	public double portee(double velocite, double angleAlpha){
		return ((velocite*velocite)/Constantes.graviteTerre)*(Math.sin(2*(90-angleAlpha)));
	}

	/**
	 *
	 * @param masseProjectile
	 * @param velocite
	 * @return energie d'impact Ec en joules
	 */
	public double energieImpact(double masseProjectile, double velocite){
		return (1/2)*(masseProjectile*(velocite*velocite));
	}
}

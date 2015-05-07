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

}

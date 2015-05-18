package formules;

import datas.Constantes;

public class Viabilite {
	
	

	/**
	 * La construction envisagée est-elle viable ?
	 * 
	 * @param angleAlpha
	 * @param longueur bras
	 * @param longueur base
	 * @param masse contrepoids (mc)
	 * @param masse projectile (mp)
	 * @return true si viable
	 */
	public boolean isBuildEnabled(double angleAlpha, double lB, double lR, double mc, double mp) {
		
		double form1 = (Math.sin(angleAlpha)*lB);
		double form2 = (Math.cos(angleAlpha)*lB - lR);
		double form3 = (Math.sin(angleAlpha)*(mp*Constantes.graviteTerre));
		double form4 = (lR*(mc*Constantes.graviteTerre));
		
		 if (((((form1)*(form1)) + (((form2)*(form2))* form3))) > form4  ) {
			 		System.out.println("Construction viable");
					return true;
				}

		 System.out.println("Construction non viable");
		return false;
				
	}
	
	/**
	 * 
	 * @param build
	 */
	public void buildUnenabled(boolean build) {
		
		
		
	}

}

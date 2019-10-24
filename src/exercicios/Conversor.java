package exercicios;

public class Conversor {
	
	
	public static double converter(double precoDolar , double qtdDolar) {		
	 double tudo = precoDolar * qtdDolar ;
     double restante = tudo - tudo*6/100;
     return restante;
	}

}

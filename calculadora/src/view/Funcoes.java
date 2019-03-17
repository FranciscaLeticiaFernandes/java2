package view;

public class Funcoes {
	public double soma(double a,double b ) {
		double resultado;
		resultado = a+b;
		return resultado;
	}
	
	public double subtracao (double a,double b) {
		double resultado;
		resultado= a-b;
		return resultado;
	}

	public double multiplicacao (double a,double b) {
		double resultado;
		resultado= a*b;
		return resultado;
	}
	 public double divisao (double a,double b) {
		 double resultado;
		 resultado =a/b;
		 return resultado;
	 }
	 public double porcento (double a,double b) {
		  double resultado;
		  resultado = (a*b)/100;
		  return resultado;
	 }
	 public double raiz (double a) {
		 double resultado;
		 resultado= Math.sqrt(a);
		 return resultado;
	 }
	 public double fracao (double a) {
		 double resultado;
		 resultado=1/a;
		 return resultado;
	 }
	 
	 public double negativo (double a) {
	    double resultado;
	    resultado= a*(-1);
	    return resultado;
	    }
}
   

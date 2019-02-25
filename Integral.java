Import java.math.*;
/** Metodo para calcular el valor de una integral.*/

public class Principal{
	public static double s(double h, double a, double b){
		double suma = 0;
		for (double i=a; i<=(b/h);i++) suma+=Math.exp(Math.pow(i*h, 2))*h;
		return suma;
	}

	public static void main (String[] args){
		System out.println(0.1,0.1);
	}
}

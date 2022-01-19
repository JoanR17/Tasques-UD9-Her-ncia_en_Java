package Ejercicio4;

/**
 * @author Adrián Rodriguez
 */

public class Raices {

	//Atributos
	
	private double a;
	private double b;
	private double c;
	
	//Constructores
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Método obtenerRaices
	
	public void obtenerRaices() {
		double raiz1 = (-b + Math.sqrt(getDiscriminate())) / (2*a);
		double raiz2 = (-b - Math.sqrt(getDiscriminate())) / (2*a);
		
		System.out.println("La primera solución es: " + raiz1);
		System.out.println("La segunda solución es: " + raiz2);
	}
	
	//Método obtenerRaiz
	
	public void obtenerRaiz() {
		double raiz = (-b) / (2*a);
		
		System.out.println("La solución es: " + raiz);
	}
	
	//Getter Discriminate
	
	public double getDiscriminate() {
		return Math.pow(b, 2) - (4*a*c);
	}
	
	//Método tieneRaices
	
	public boolean tieneRaices() {
		return getDiscriminate() > 0;
	}
	
	//Método tieneRaiz
	
	public boolean tieneRaiz() {
		return getDiscriminate() == 0;
	}
	
	//Método calcular
	
	public void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("No es posible sacar una solución");
		}
	}
}

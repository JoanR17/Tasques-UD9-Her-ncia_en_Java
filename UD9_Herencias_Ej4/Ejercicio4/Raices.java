
public class Raices {

	private double a;
	private double b;
	private double c;
	
	public Raice(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static void obtenerRaices() {
		double raiz1 = (-b + Math.sqrt(getDiscriminate())) / (2*a);
		double raiz2 = (-b - Math.sqrt(getDiscriminate())) / (2*a);
		
		System.out.println("La primera solución es: " + raiz1);
		System.out.println("La segunda solución es: " + raiz2);
	}
	
	public static void obtenerRaiz() {
		double raiz = (-b) / (2*a);
		
		System.out.println("La solución es: " + raiz);
	}
	
	public static double getDiscriminate() {
		return Math.pow(b, 2) - (4*a*c);
	}
	
	public static boolean tieneRaices() {
		return getDiscriminate() > 0;
	}
	
	public static boolean tieneRaiz() {
		return getDiscriminate() == 0;
	}
	
	public static void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("No es posible sacar una solución");
		}
	}
}

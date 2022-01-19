package Objetos;

/**
 * @author Adrián Rodriguez
 */

public class Television extends Electrodomestico {

	//Constantes
	
	private final static int RESOLUCION = 20;
	private final static boolean SINTONIZADOR = false;
	
	//Atributos
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	//Constructores
	
	public Television() {
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR;
	}
	
	public Television (double precio_base, double peso) {
		super(precio_base, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR;
	}
	
	public Television(double precio_base, String color, char consumo_energetico, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precio_base, color, consumo_energetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	//Getters resolucion y sintonizadorTDT

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//Método precioFinal
	
	public double precioFinal() {
		double precioF = super.precioFinal();
		
		if (resolucion > 40) {
			precioF += precio_base*0.3;
		}
		if (sintonizadorTDT) {
			precioF += 50;
		}
		return precioF;
	}
}

package Objetos;

/**
 * @author Adri�n Rodriguez
 */

public class Lavadora extends Electrodomestico {
	
	//Constante
	
	private final int CARGA = 5;
	
	//Atributo
	
	private int carga;
	
	//Constructores
	
	public Lavadora() {
		this.carga = CARGA;
	}
	
	public Lavadora (double precio_base, double peso) {
		super(precio_base, peso);
		this.carga = CARGA;
	}
	
	public Lavadora(double precio_base, String color, char consumo_energetico, double peso, int carga) {
		super(precio_base, color, consumo_energetico, peso);
		this.carga = carga;
	}
	
	//Getter de carga

	public int getCarga() {
		return carga;
	}
	
	//M�todo precioFinal
	
	public double precioFinal() {
		double precioF = super.precioFinal();
		
		if (carga > 30) {
			precioF += 50;
		}
		return precioF;
	}
}

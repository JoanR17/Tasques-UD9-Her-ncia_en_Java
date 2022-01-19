package Objetos;

public class Lavadora extends Electrodomestico {
	
	private final int CARGA = 5;
	private int carga;
	
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

	public int getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double precioF = super.precioFinal();
		
		if (carga > 30) {
			precioF += 50;
		}
		return precioF;
	}
}

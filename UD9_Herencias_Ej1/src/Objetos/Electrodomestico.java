package Objetos;

public class Electrodomestico {
	private final static double PRECIO = 100;
	private final static String COLOR = "blanco";
	private final static char CONSUMO = 'F';
	private final double PESO = 5;
	
	protected double precio_base;
	protected String color;
	protected char consumo_energetico;
	protected double peso;
	
	public Electrodomestico() {
		this.precio_base = PRECIO;
		this.color = COLOR;
		this.consumo_energetico = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.color = COLOR;
		this.consumo_energetico = CONSUMO;
		this.peso = peso;
	}
	
	public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}
	
	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comprobarColor(String color) {
		String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean correcto = false;
		
		for(int i = 0; i < colores.length && !correcto; i++) {
			if (colores[i].equals(color)) {
				correcto = true;
			}
		}
		
		if(correcto) {
			this.color = color;
		} else {
			this.color = COLOR;
		}
	}
	
	public void comprobarConsumo (char consumo_energetico) {
		if (consumo_energetico >= 65 && consumo_energetico <= 70) {
			this.consumo_energetico = consumo_energetico;
		} else {
			this.consumo_energetico = CONSUMO;
		}
	}
	
	public double precioFinal() {
		double precioF = 0;
		switch(consumo_energetico) {
		case 'A':
			precioF += 100;
			break;
		case 'B':
			precioF += 80;
			break;
		case 'C':
			precioF += 60;
			break;
		case 'D':
			precioF += 50;
			break;
		case 'E':
			precioF += 30;
			break;
		case 'F':
			precioF += 10;
			break;
		default:
			System.out.println("No has puesto la letra correcta");
			break;
		}
		if (peso >= 0 && peso < 19) {
			precioF += 10;
		} else if (peso >= 20 && peso < 49) {
			precioF += 50;
		} else if (peso >= 50 && peso < 79) {
			precioF += 80;
		} else if (peso > 80) {
			precioF += 100;
		}
		return precio_base + precioF;
	}

	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
}

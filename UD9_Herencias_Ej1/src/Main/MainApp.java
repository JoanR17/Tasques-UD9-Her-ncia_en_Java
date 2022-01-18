package Main;

import Objetos.Electrodomestico;
import Objetos.Lavadora;
import Objetos.Television;

public class MainApp {
	public static void main(String[] args) {
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		
		electrodomesticos[0] = new Electrodomestico(50, "blanco", 'A', 10);
		electrodomesticos[1] = new Television(100, "negro", 'B', 20);
		electrodomesticos[2] = new Lavadora(120, "azul", 'C', 40);
		electrodomesticos[3] = new Electrodomestico(150, "rojo", 'D', 60);
		electrodomesticos[4] = new Television(170, "gris", 'E', 70);
		electrodomesticos[5] = new Lavadora(190, "blanco", 'F', 80);
		electrodomesticos[6] = new Electrodomestico(200, "negro", 'A', 90);
		electrodomesticos[7] = new Television(220, "azul", 'B', 110);
		electrodomesticos[8] = new Lavadora(230, "rojo", 'C', 120);
		electrodomesticos[9] = new Electrodomestico(240, "gris", 'D', 140);
		
		double sumaE = 0;
		double sumaL = 0;
		double sumaT = 0;
		
		for(int i = 0; i < electrodomesticos.length; i++) {
			if(electrodomesticos[i] instanceof Electrodomestico) {
				sumaE += electrodomesticos[i].precioFinal();
			}
			if(electrodomesticos[i] instanceof Lavadora) {
				sumaL += electrodomesticos[i].precioFinal();
			}
			if(electrodomesticos[i] instanceof Television) {
				sumaT += electrodomesticos[i].precioFinal();
			}
		}
		
		System.out.println("La suma del precio de todos los electrodomesticos es: " + sumaE);
		System.out.println("La suma del precio de todos los electrodomesticos es: " + sumaL);
		System.out.println("La suma del precio de todos los electrodomesticos es: " + sumaT);
	}
}

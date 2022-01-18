package Main;

import Objetos.*;

public class MainApp {

	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		
		series[0] = new Serie();
		series[1] = new Serie("Arcane", "League of Legends");
		series[2] = new Serie("Cobra Kai", "Accion", "Jon Hurwitz", 4);
		series[3] = new Serie("The Office", "Greg Daniels", "Comedia", 9);
		series[4] = new Serie("Friends", "Marta Kauffman y David Crane", "Comedia", 10);
		
		videojuegos[0] = new Videojuego();
		videojuegos[1] = new Videojuego("League of Legends", 300);
		videojuegos[2] = new Videojuego("Valorant", "Shooter","Riot Games", 300);
		videojuegos[3] = new Videojuego("The Last Of Us", "Zombies", "Naughty Dog", 50);
		videojuegos[4] = new Videojuego("Kingdom Hearts", "Acción", "Square Enix/Disney", 70);
		
		System.out.println(series[1].isEntregado());
		System.out.println(series[3].isEntregado());
		System.out.println(videojuegos[2].isEntregado());
		System.out.println(videojuegos[4].isEntregado());
		
		//Recorrer los array para contar cuantos hay entregados y devolverlos
		
		int entregados = 0;
		
		for(int i = 0; i < series.length; i++) {
			if (series[i].isEntregado()) {
				entregados++;
				series[i].devolver();
			}
			
			if (videojuegos[i].isEntregado()) {
				entregados++;
				videojuegos[i].devolver();
			}
		}
		
		System.out.println("Hay " + entregados + " articulos entregados");
		
		//Averiguar que serie tiene más temporadas y que videojuego tiene más horas
		
		int serieMasTemporadas = 0;
		int videojuegoMasHoras = 0;
		
		/*for(int i = 1; i < series.length; i++) {
			if (series[i].compareTo(series[serieMasTemporadas])) {
				entregados++;
				series[i].devolver();
			}
			
			if (videojuegos[i].isEntregado()) {
				entregados++;
				videojuegos[i].devolver();
			}
		} */
	}

}

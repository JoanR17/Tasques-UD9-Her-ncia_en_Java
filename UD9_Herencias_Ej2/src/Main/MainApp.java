package Main;

import Objetos.*;

public class MainApp {

	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		
		series[0] = new Serie();
		series[1] = new Serie("Arcane", "League of Legends");
		series[2] = new Serie("Arcane", "League of Legends", "Accion", 2);
		series[3] = new Serie("The Office", "Greg Daniels", "Comedia", 9);
		series[4] = new Serie("Friends", "Marta Kauffman y David Crane", "Comedia", 10);
		
		videojuegos[0] = new Videojuego();
		videojuegos[1] = new Videojuego("League of Legends", 300);
		videojuegos[2] = new Videojuego("League of Legends", "MOBA","Riot Games", 300);
		videojuegos[3] = new Videojuego("The Lasty Of Us", "Zombies", "Naughty Dog", 50);
		videojuegos[4] = new Videojuego("The Lasty Of Us II", "Zombies", "Naughty Dog", 70);
		
		System.out.println(videojuegos[1].compareTo(videojuegos[2]));

	}

}

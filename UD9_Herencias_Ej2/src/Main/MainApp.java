package Main;

import Objetos.Serie;
import Objetos.Videojuego;

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
		videojuegos[2] = new Videojuego("League of Legends", "MOBA","Riot Games", 300);
		videojuegos[3] = new Videojuego("The Lasty Of Us", "Zombies", "Naughty Dog", 50);
		videojuegos[4] = new Videojuego("The Lasty Of Us II", "Zombies", "Naughty Dog", 70);
		
		series[1].entregar();
		series[3].entregar();
		videojuegos[2].entregar();
		videojuegos[4].entregar();
		
		//Recorrer los array para contar cuantos hay entregados y devolverlos
		
		System.out.println("Hay " + entregadosSeries(series) + " series entregadas");
		System.out.println("Hay " + entregadosVideojuegos(videojuegos) + " videojuegos entregados");
		
		System.out.println("\nLa serie con mas temporadas es " + maxTemporadasSeries(series).getTitulo() + " con " + maxTemporadasSeries(series).getNumTemporadas() + " temporadas.");
		System.out.println("El videojuego con mas horas estimadas es " + maxHorasVideojuegos(videojuegos).getTitulo() + " con " + maxHorasVideojuegos(videojuegos).getHorasEstimadas() + " horas.");
	}
	
	/**
	 * Funcion para saber cuantas series hay entregadas
	 * @param series
	 * @return
	 */
	public static int entregadosSeries(Serie[] series)
	{
		int entregadosSeries = 0;
		for (Serie serie : series) 
		{
			if (serie.isEntregado()) 
			{
				entregadosSeries++;
				serie.devolver();
			}
		}
		return entregadosSeries;
	}
	
	/**
	 * Funcion para saber cuantos videojuegos hay entregados
	 * @param videojuegos
	 * @return
	 */
	public static int entregadosVideojuegos(Videojuego[] videojuegos)
	{
		int entregadosVideojuegos = 0;
		for (Videojuego videojuego : videojuegos) 
		{
			if (videojuego.isEntregado()) 
			{
				entregadosVideojuegos++;
				videojuego.devolver();
			}
		}
		
		return entregadosVideojuegos;
	}
	
	/**
	 * Funcion para saber que serie tiene mas temporadas
	 * @param series
	 * @return
	 */
	public static Serie maxTemporadasSeries(Serie[] series)
	{
		Serie serieMasTemporadas = series[0];
		for(int i = 1; i < series.length; i++) 
		{
			if (series[i].compareTo(serieMasTemporadas)) 
			{
				serieMasTemporadas = series[i];
			}
		} 
		return serieMasTemporadas;
	}
	
	/**
	 * Funcion para saber que videojuego tiene mas horas
	 * @param videojuegos
	 * @return
	 */
	public static Videojuego maxHorasVideojuegos(Videojuego[] videojuegos)
	{
		Videojuego videojuegoMasHoras = videojuegos[0];
		for(int i = 1; i < videojuegos.length; i++) 
		{
			if (videojuegos[i].compareTo(videojuegoMasHoras)) 
			{
				videojuegoMasHoras = videojuegos[i];
			}
		} 
		return videojuegoMasHoras;
	}

}

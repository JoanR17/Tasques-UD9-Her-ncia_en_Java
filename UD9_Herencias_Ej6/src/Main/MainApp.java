package Main;

import Objetos.*;

public class MainApp {

	public static void main(String[] args) {

		Pelicula peli = new Pelicula("The Amazin Spiderman 2", "Marc Webb", 141, 13);
		Cine cine = new Cine(peli, 8.55);
		Espectador[] espectadores = new Espectador[10];
		String[][] sala = new String[8][9];
		
		rellenarSala(sala);
		rellenarEspectadores(espectadores);
		
		sentarEspectadores(espectadores, sala, cine, peli);
		
		mostrarSala(sala);

	}

	/**
	 * Funcion para sentar un array de espectadores en la sala de cine
	 * @param espectadores
	 * @param sala
	 * @param cine
	 * @param peli
	 */
	private static void sentarEspectadores(Espectador[] espectadores, String[][] sala, Cine cine, Pelicula peli) 
	{

		for (Espectador espectador : espectadores) 
		{
			if(espectador.getEdad() >= peli.getEdadMinima() && espectador.getDinero() >= cine.getPrecioEntrada())
			{
				boolean libre = false;
				int i, j;
				do 
				{
					i = (int)(Math.random()*(sala.length));
					j = (int)(Math.random()*(sala[0].length));
					
					if(!sala[i][j].equalsIgnoreCase("x"))
					{
						libre = !libre;
					}
				} 
				while (!libre);
				
				System.out.println("Espectador: " + espectador.getNombre() + " - " + espectador.getEdad() + " años - " + espectador.getDinero() + "€ - Silla: " + sala[i][j]);
				sala[i][j] = "XX";
			}
			else
			{
				System.out.println("Espectador: " + espectador.getNombre() + " - " + espectador.getEdad() + " años - " + espectador.getDinero() + "€ - No cumple los requisitos");
			}
		}
		System.out.println();
		
	}

	/**
	 * Funcion para crear una sala de cine
	 * @param sala
	 */
	private static void rellenarSala(String[][] sala) 
	{
		int x = 8;
		for (int i = 0; i < sala.length; i++) 
		{
			char letra = 65;
			for (int j = 0; j < sala[i].length; j++) 
			{
				sala[i][j] = x + "" + letra;
				letra++;
			}
			x--;
		}
		
	}

	/**
	 * Funcion para crear Espectadores aleatorios
	 * @param espectadores
	 */
	private static void rellenarEspectadores(Espectador[] espectadores) 
	{
		String[] nombres = {"Joan", "Olga", "Eric", "Jordi", "Kevin", "Jonathan", "Robert", "Laura", "Andrea", "Enya"};
		
		for (int i = 0; i < espectadores.length; i++) 
		{
			espectadores[i] = new Espectador(nombres[(int)(Math.random()*(nombres.length))], (int)(Math.random()*60+5), (Math.round((Math.random()*30+2.5) * 100.0) / 100.0));
		}
		
	}

	/**
	 * Funcion para mostrar la sala de cine por pantalla
	 * @param sala
	 */
	private static void mostrarSala(String[][] sala) 
	{
		for (String[] strings : sala) 
		{
			for (String strings2 : strings) 
			{
				System.out.print(strings2 + " ");
			}
			System.out.println();
		}
	}

}

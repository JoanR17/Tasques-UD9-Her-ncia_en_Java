/**
 * @author JOAN
 */
package Main;

import Objetos.*;

public class MainApp {

	public static void main(String[] args) {

		Aula aula = new Aula(112, 24, "Matemáticas");
		Estudiante[] estudiantes = new Estudiante[aula.getNumMaxEstudiantes()];
		Profesor profe = new Profesor("Jose", "Matemáticas", (int)(Math.random()*(65+1-20)+20), 'H');


		rellenarEstudiantes(estudiantes);
		
		if(sePuedeDarClase(estudiantes, profe, aula))
		{
			mostrarAlumnosAprovados(estudiantes);
		}
		else
		{
			System.out.println("No se ha podido dar clase.");
			if(!profe.isDisponible())
			{
				System.out.println("El profesor no estaba.");
			}
			else if(!profe.getMateria().equalsIgnoreCase(aula.getUso()))
			{
				System.out.println("El profesor no da esta materia.");
			}
			else
			{
				System.out.println("\nMas de la mitad de la clase ha faltado\n");

				System.out.println("Nombre\tEdad\tSexo\tNotas\tNovillos\n");
				for (int i = 0; i < estudiantes.length; i++) 
				{
					System.out.println(estudiantes[i].getNombre() + "\t" + estudiantes[i].getEdad() + "\t" + estudiantes[i].getSexo() + "\t" + estudiantes[i].getCalificacion() + "\t" + estudiantes[i].isNovillos());
				}
			}
		}
	}

	/**
	 * Funcion para mostrar alumnos aprovados
	 * @param estudiantes
	 */
	private static void mostrarAlumnosAprovados(Estudiante[] estudiantes) 
	{
		String chicos = "Alumnos aprovados:\n", chicas = "Alumnas aprovadas:\n";
		
		for (int i = 0; i < estudiantes.length; i++) 
		{
			if(estudiantes[i].getCalificacion() >= 5)
			{
				if(estudiantes[i].getSexo() == 'H')
				{
					chicos += "\tNombre: " + estudiantes[i].getNombre() + "\tNota: " + estudiantes[i].getCalificacion() + "\n";
				}
				else
				{
					chicas += "\tNombre: " + estudiantes[i].getNombre() + "\tNota: " + estudiantes[i].getCalificacion() + "\n";
				}
			}
		}
		
		System.out.println(chicos);
		System.out.println(chicas);
		
	}

	/**
	 * Funcion para comprobar si se cumplen las condiciones para hacer clase
	 * @param estudiantes
	 * @param profe
	 * @param aula
	 * @return
	 */
	private static boolean sePuedeDarClase(Estudiante[] estudiantes, Profesor profe, Aula aula) 
	{
		if(!profe.isDisponible())
		{
			return false;
		}
		if(!profe.getMateria().equalsIgnoreCase(aula.getUso()))
		{
			return false;
		}
		
		int cont = 0;
		
		for (int i = 0; i < estudiantes.length; i++) 
		{
			if(!estudiantes[i].isNovillos())
			{
				cont++;
			}
		}
		
		return (cont >= (aula.getNumMaxEstudiantes() / 2));
	}

	/**
	 * Funcion para rellenar estudiantes en el array
	 * @param estudiantes
	 */
	private static void rellenarEstudiantes(Estudiante[] estudiantes) 
	{

		String[] nombresChicos = {"Joan", "Eric", "Jordi", "Kevin", "Nathan", "Robert", "Joel", "Adrian", "Carlos"};
		String[] nombresChicas = {"Olga", "Laura", "Andrea", "Enya", "Alba", "Irene", "Laia", "Eva", "Maria", "Marta"};
		char[] sexos = {'H', 'M'};
		
		for (int i = 0; i < estudiantes.length; i++) 
		{
			char sexo = sexos[(int)(Math.random()*(sexos.length))];
			estudiantes[i] = new Estudiante(((sexo == 'H') ? nombresChicos[(int)(Math.random()*(nombresChicos.length))] : nombresChicas[(int)(Math.random()*(nombresChicas.length))]), (int)(Math.random()*(25+1-10)+10), sexo, (int)(Math.random()*11));
		}
	}

}

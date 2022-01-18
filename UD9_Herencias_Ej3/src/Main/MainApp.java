package Main;

import Objetos.Libro;

public class MainApp {

	public static void main(String[] args) {

		Libro libro1 = new Libro("34562-2135-555-7846", "Harry Potter y la piedra filosofal", "J. K. Rowling", 1280);
		Libro libro2 = new Libro("4563-566-798-32564", "Juego de tronos", "George R. R. Martin", 1065);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		if (libro1.compareTo(libro2)) 
		{
			System.out.println("\nEl libro \"" + libro1.getTitulo() + "\" tiene mas paginas que \"" + libro2.getTitulo() + "\"");
		}
		else
		{
			System.out.println("\nEl libro \"" + libro2.getTitulo() + "\" tiene mas paginas que \"" + libro1.getTitulo() + "\"");
		}
	}

}

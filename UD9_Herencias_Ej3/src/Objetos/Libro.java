/**
 * @author JOAN
 */
package Objetos;

public class Libro {
	
	//Atributos
	
	private String isbn, titulo, autor;
	private int numPaginas;
	
	//Constructores
	
	public Libro(String isbn, String titulo, String autor, int numPaginas)
	{
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	//ToString reescrito

	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numPaginas + " páginas.";
	}

	//Getters y Setters
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	/**
	 * Funcion para comparar que libro tiene mas paginas
	 * @param libro
	 * @return
	 */
	public boolean compareTo(Libro libro) 
	{
		if(this.numPaginas > libro.numPaginas)
		{
			return true;
		}
		return false;
		
	}
	
}

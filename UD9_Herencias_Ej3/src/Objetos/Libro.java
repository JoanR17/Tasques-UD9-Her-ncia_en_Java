package Objetos;

public class Libro {
	
	private String isbn, titulo, autor;
	private int numPaginas;
	
	public Libro(String isbn, String titulo, String autor, int numPaginas)
	{
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numPaginas + " páginas.";
	}

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
	
	public boolean compareTo(Libro libro) 
	{
		if(this.numPaginas > libro.numPaginas)
		{
			return true;
		}
		return false;
		
	}
	
}

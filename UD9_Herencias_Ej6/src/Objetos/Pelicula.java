package Objetos;

public class Pelicula {
	
	//Atributos
	
	private String titulo, director;
	private int edadMinima, duracion;
	
	//Constructor
	
	public Pelicula(String titulo, String director, int duracion, int edadMinima) 
	{
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
	}


	//Getters y Setters
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	

}

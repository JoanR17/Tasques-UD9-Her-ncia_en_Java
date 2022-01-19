package Objetos;

public class Cine {
	
	//Atributos
	
	private Pelicula pelicula;
	private double precioEntrada;
	
	//Constructor
	
	public Cine(Pelicula pelicula, double precioEntrada) 
	{
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
	}


	//Getters y Setters
	

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	

}

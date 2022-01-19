/**
 * @author JOAN
 */
package Objetos;

public class Videojuego implements Entregable {
	
	//Atributos

	private String titulo, genero, compania;
	private int horasEstimadas;
	private boolean entregado;
	
	//Constructores
	
	public Videojuego() 
	{
		this.titulo = "";
		this.genero = "";
		this.compania = "";
		this.horasEstimadas = 10;
		this.entregado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas) 
	{
		this.titulo = titulo;
		this.genero = "";
		this.compania = "";
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
	}
	
	public Videojuego(String titulo, String genero, String compania, int horasEstimadas) 
	{
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
	}

	//Getters y Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	//ToString reescrito

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", compania=" + compania + ", horasEstimadas="
				+ horasEstimadas + ", entregado=" + entregado + "]";
	}

	//Metodos de la interfaz

	@Override
	public void entregar() 
	{
		entregado = true;
	}

	@Override
	public void devolver() 
	{
		entregado = false;
	}

	@Override
	public boolean isEntregado() 
	{
		return entregado;
	}

	@Override
	public boolean compareTo(Object object) 
	{
		if(horasEstimadas > ((Videojuego)object).getHorasEstimadas())
		{
			return true;
		}
		return false;
	}
	
}

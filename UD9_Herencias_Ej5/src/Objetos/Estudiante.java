package Objetos;

public class Estudiante {
	
	private String nombre;
	private int edad;
	private char sexo;
	private int calificacion;
	private boolean novillos;
	
	
	public Estudiante(String nombre, int edad, char sexo, int calificacion) 
	{
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexoCorrecto(sexo);
		this.calificacion = calificacionCorrecta(calificacion);
		this.novillos = calcularProbabilidad();
	}


	private char sexoCorrecto(char sexo2) 
	{
		if(sexo2 == 'H' || sexo2 == 'M')
		{
			return sexo2;
		}
		else if(sexo2 == 'h' || sexo2 == 'm')
		{
			return (char)(sexo2 - 32);
		}
		return 'H';
	}


	private int calificacionCorrecta(int calificacion2) 
	{
		if(calificacion2 >= 0 && calificacion2 <= 10)
		{
			return calificacion2;
		}
		return 5;
	}


	private boolean calcularProbabilidad() 
	{
		return (0.5 > Math.random());
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	public boolean isNovillos() {
		return novillos;
	}


	public void setNovillos(boolean novillos) {
		this.novillos = novillos;
	}
	
	
}

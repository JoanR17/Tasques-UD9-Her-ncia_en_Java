package Objetos;

public class Estudiante extends Persona {
	
	private int calificacion;
	private boolean novillos;
	
	
	public Estudiante(String nombre, int edad, char sexo, int calificacion) 
	{
		super(nombre, edad, sexo);
		this.calificacion = calificacionCorrecta(calificacion);
		this.novillos = calcularProbabilidad();
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

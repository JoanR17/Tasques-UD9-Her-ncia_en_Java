/**
 * @author JOAN
 */
package Objetos;

public class Estudiante extends Persona {
	
	//Atributos
	
	private int calificacion;
	private boolean novillos;
	
	//Constructor
	
	public Estudiante(String nombre, int edad, char sexo, int calificacion) 
	{
		super(nombre, edad, sexo);
		this.calificacion = calificacionCorrecta(calificacion);
		this.novillos = calcularProbabilidad();
	}

	/**
	 * Funcion para comprobar que la calificación es correcta
	 * @param calificacion2
	 * @return
	 */
	private int calificacionCorrecta(int calificacion2) 
	{
		if(calificacion2 >= 0 && calificacion2 <= 10)
		{
			return calificacion2;
		}
		return 5;
	}

	/**
	 * Funcion para calcular la probabilidad de hacer novillos
	 * @return
	 */
	private boolean calcularProbabilidad() 
	{
		return (0.5 > Math.random());
	}


	//Getters y Setters
	

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

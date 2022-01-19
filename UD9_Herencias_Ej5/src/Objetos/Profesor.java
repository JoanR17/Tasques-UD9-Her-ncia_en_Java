/**
 * @author JOAN
 */
package Objetos;

public class Profesor extends Persona {
	
	//Atributos
	
	private String materia;
	private boolean disponible;
	
	//Constructor
	
	public Profesor(String nombre, String materia, int edad, char sexo) 
	{
		super(nombre, edad, sexo);
		this.materia = comprobarMateria(materia);
		this.disponible = calcularProbabilidad();;
	}

	/**
	 * Funcion para comprobar que la materia del profesor sea correcta
	 * @param materia
	 * @return
	 */
	private String comprobarMateria(String materia) 
	{
		if(materia.equalsIgnoreCase("matemáticas") || materia.equalsIgnoreCase("filosofía") || materia.equalsIgnoreCase("física"))
		{
			return materia;
		}
		return "matemáticas";
	}

	/**
	 * Funcion para calcular la probabilidad de que el profesor venga 
	 * @return
	 */
	private boolean calcularProbabilidad() 
	{
		return (0.2 < Math.random());
	}


	//Getters y Setters
	

	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}

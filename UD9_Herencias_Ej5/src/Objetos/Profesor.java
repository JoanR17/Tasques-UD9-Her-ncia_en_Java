package Objetos;

public class Profesor extends Persona {
	
	private String materia;
	private boolean disponible;
	
	
	public Profesor(String nombre, String materia, int edad, char sexo) 
	{
		super(nombre, edad, sexo);
		this.materia = comprobarMateria(materia);
		this.disponible = calcularProbabilidad();;
	}


	private String comprobarMateria(String materia) 
	{
		if(materia.equalsIgnoreCase("matemáticas") || materia.equalsIgnoreCase("filosofía") || materia.equalsIgnoreCase("física"))
		{
			return materia;
		}
		return "matemáticas";
	}


	private boolean calcularProbabilidad() 
	{
		return (0.2 < Math.random());
	}


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

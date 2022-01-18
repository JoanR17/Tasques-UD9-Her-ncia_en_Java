package Objetos;

public class Profesor {
	
	private String nombre, materia;
	private int edad;
	private char sexo;
	private boolean disponible;
	
	
	public Profesor(String nombre, String materia, int edad, char sexo) 
	{
		this.nombre = nombre;
		this.materia = comprobarMateria(materia);
		this.edad = edad;
		this.sexo = sexoCorrecto(sexo);
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


	private boolean calcularProbabilidad() 
	{
		return (0.2 < Math.random());
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
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


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}

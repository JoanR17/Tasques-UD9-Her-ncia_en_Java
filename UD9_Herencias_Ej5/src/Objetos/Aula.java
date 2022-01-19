/**
 * @author JOAN
 */
package Objetos;

public class Aula {
	
	//Atributos
	
	private int identificador, numMaxEstudiantes;
	private String uso;
	
	//Constructor
	
	public Aula(int identificador, int numMaxEstudiantes, String uso) 
	{
		this.identificador = identificador;
		this.numMaxEstudiantes = numMaxEstudiantes;
		this.uso = comprobarUso(uso);
	}

	/**
	 * Funcion para comprobar que la materia del aula sea correcta
	 * @param uso2
	 * @return
	 */
	private String comprobarUso(String uso2) 
	{
		if(uso2.equalsIgnoreCase("matemáticas") || uso2.equalsIgnoreCase("filosofía") || uso2.equalsIgnoreCase("física"))
		{
			return uso2;
		}
		return "matemáticas";
	}

	//Getters y Setters

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getNumMaxEstudiantes() {
		return numMaxEstudiantes;
	}

	public void setNumMaxEstudiantes(int numMaxEstudiantes) {
		this.numMaxEstudiantes = numMaxEstudiantes;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	
}

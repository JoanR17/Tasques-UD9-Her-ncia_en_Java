/**
 * @author JOAN
 */
package Objetos;

public abstract class Persona {
	
	//Atributos
	
	private String nombre;
	private int edad;
	private char sexo;
	
	//Constructor
	
	public Persona(String nombre, int edad, char sexo) 
	{
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexoCorrecto(sexo);
	}

	/**
	 * Funcion para comprobar que el sexo introducido sea correcto
	 * @param sexo2
	 * @return
	 */
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


	//Getters y Setters
	

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

}

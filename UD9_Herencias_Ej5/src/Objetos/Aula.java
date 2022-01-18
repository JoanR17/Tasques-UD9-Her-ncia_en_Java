package Objetos;

public class Aula 
{
	private int identificador, numMaxEstudiantes;
	private String uso;
	
	public Aula(int identificador, int numMaxEstudiantes, String uso) 
	{
		this.identificador = identificador;
		this.numMaxEstudiantes = numMaxEstudiantes;
		this.uso = comprobarUso(uso);
	}

	private String comprobarUso(String uso2) 
	{
		if(uso2.equalsIgnoreCase("matem�ticas") || uso2.equalsIgnoreCase("filosof�a") || uso2.equalsIgnoreCase("f�sica"))
		{
			return uso2;
		}
		return "matem�ticas";
	}

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

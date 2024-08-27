package laboratorioColecciones;

public class Persona implements Comparable<Persona> {
	
	String nombre;
	String genero;
	int edad;
	int estatura;
	
	public Persona(String nombre, String genero, int edad, int estatura) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}


	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}


}

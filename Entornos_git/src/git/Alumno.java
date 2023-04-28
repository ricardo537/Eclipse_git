package git;

public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	
	Alumno(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	Alumno () {
		
	}
	
}

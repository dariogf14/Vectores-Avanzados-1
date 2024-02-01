package vectores_avanzados_1;

public class Aula {

	private char Aula;
	private Alumno alumnos[];
	private int i=0;
	
	public Aula(char letra) {
		this.Aula=letra;
		alumnos = new Alumno[5];
	}
	
	public void addAlumno(String nombre, String apellidos, String telefono) {
		alumnos[i].setNombre(nombre);
		alumnos[i].setApellidos(apellidos);
		alumnos[i].setTelefono(telefono);
		alumnos[i].setAsignaturas(4);
		i++;
	}
	
	
	
}

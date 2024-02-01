package vectores_avanzados_1;

public class Alumno {

	
	private String nombre;
	private String apellidos;
	private String telefono;
	private Asignatura asignaturas[];
	
	public Alumno(String Nombre, String Apellidos, String Telefono) {
		this.nombre=Nombre;
		this.apellidos=Apellidos;
		this.telefono=Telefono;
		asignaturas = new Asignatura[4];
	}
	
}

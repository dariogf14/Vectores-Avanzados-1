package vectores_avanzados_1;

public class Alumno {

	
	private String nombre;
	private String apellidos;
	private String telefono;
	private Asignatura asignaturas[];
	private int i = 0;
	
	public Alumno(String nombre, String apellidos, String telefono) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		asignaturas = new Asignatura[4];
	}
	
	public void addAsignatura(String nombre, int nota1, int nota2, int notafinal) {
		asignaturas[i].setNombre(nombre);
		asignaturas[i].setNota1eva(nota1);
		asignaturas[i].setNota2eva(nota2);
		asignaturas[i].setNotaFinal(notafinal);
		i++;
	}
	
}

package vectores_avanzados_1;

public class Alumno {

	
	private String nombre;
	private String apellidos;
	private String telefono;
	private Asignatura asignaturas[];
	private int i = 0;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int numero) {
		asignaturas = new Asignatura[numero];
	}

	public void addAsignatura(String nombre, int nota1, int nota2, int notafinal) {
		asignaturas[i].setNombre(nombre);
		asignaturas[i].setNota1eva(nota1);
		asignaturas[i].setNota2eva(nota2);
		asignaturas[i].setNotaFinal(notafinal);
		i++;
	}
	
	
	
}

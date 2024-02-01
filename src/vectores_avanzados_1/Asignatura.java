package vectores_avanzados_1;

public class Asignatura {

	
	private String nombre;
	private int nota1eva;
	private int nota2eva;
	private int notaFinal;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota1eva() {
		return nota1eva;
	}
	public void setNota1eva(int nota1eva) {
		this.nota1eva = nota1eva;
	}
	public int getNota2eva() {
		return nota2eva;
	}
	public void setNota2eva(int nota2eva) {
		this.nota2eva = nota2eva;
	}
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota1eva=" + nota1eva + ", nota2eva=" + nota2eva + ", notaFinal="
				+ notaFinal + "]";
	}
	
	
	
	
}

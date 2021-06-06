package facultad;

public class Catedra {
	
	private String nombre;
	private String docente;
	private int cantidadAlumnos;
	private int cantidadHoras;
	

	public Catedra() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	public Catedra(String nombre, String docente, int cantidadAlumnos, int cantidadHoras) {
		super();
		this.nombre = nombre;
		this.docente = docente;
		this.cantidadAlumnos = cantidadAlumnos;
		this.cantidadHoras = cantidadHoras;
	}

	// get-> obtener el dato y set -> ingresar un dato
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public int getCantidadAlumnos() {
		return cantidadAlumnos;
	}
	public void setCantidadAlumnos(int cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}
	public int getCantidadHoras() {
		return cantidadHoras;
	}
	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
		
	
}

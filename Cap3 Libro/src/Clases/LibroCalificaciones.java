package Clases;

public class LibroCalificaciones {

	private String nombreDelCurso; // Variable local de Libro Calificaciones
	
	public void establecerNombreDelCurso(String nombre) { // Setter que asigna un valor a la variable privada
		nombreDelCurso = nombre;
	}

	public String devolverNombreDelCurso() { // Getter que retorna el valor de la variable privada
		return nombreDelCurso;
	}

	public void mostrarMensaje(){ // El metodo que muestra el nombre del curso usando el getter
		
		System.out.printf("Welcome to the calification book of %s!\n",devolverNombreDelCurso());
	}
}
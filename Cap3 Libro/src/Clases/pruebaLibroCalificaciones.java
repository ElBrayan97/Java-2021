
package Clases; 
import java.util.Scanner;

/*Esta se conoce como la clase controladora del programa, porque realiza llamadas a los metodos de otras clases del mismo paquete.
Esta clase es la unica con un metodo principal (main) mediante el cual se ejecutan los metodos de las demas clases
*/

public class pruebaLibroCalificaciones {

	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in);
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
		LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones();
		
		System.out.print("Type the name of the course 0: ");
		String nombre = object.nextLine(); // Creo y uso la variable
		miLibroCalificaciones.setNombreDelCurso(nombre);
		
		System.out.print("Type the name of the course 1: ");
		nombre = object.nextLine(); // la variable anteriormente creada la reutilizo
		miLibroCalificaciones1.setNombreDelCurso(nombre);
		System.out.println();
		System.out.println("Libro 1:");
		miLibroCalificaciones.mostrarMensaje();
		System.out.println("Libro 2:");
		miLibroCalificaciones1.mostrarMensaje();
		object.close();
		
	}

}
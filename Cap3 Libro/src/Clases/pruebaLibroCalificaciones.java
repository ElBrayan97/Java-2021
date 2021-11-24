
package Clases; 
import java.util.Scanner;

/*Esta se conoce como la clase controladora del programa, porque realiza llamadas a los metodos de otras clases del mismo paquete.
Esta clase es la unica con un metodo principal (main) mediante el cual se ejecutan los metodos de las demas clases
*/

public class pruebaLibroCalificaciones {

	public static void main(String[] args) {
		
		Scanner escanner = new Scanner(System.in);
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
		
		System.out.print("Type the name of the course: ");
		String nombre = escanner.nextLine();
		System.out.println();
		miLibroCalificaciones.establecerNombreDelCurso(nombre);
		miLibroCalificaciones.mostrarMensaje();
		
	}

}
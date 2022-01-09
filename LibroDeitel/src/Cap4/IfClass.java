package Cap4;

import Cap3.LibroCalificaciones; //Importo la clase creada en el capítulo 3


public class IfClass {

	public static void main(String[] args) 
	{
		LibroCalificaciones book = new LibroCalificaciones(); //creo un objeto libro calificaciones q llamo book
		int promedio = 0;
		
		promedio = book.determinarPromedio(); //Recibo el promedio del objeto book
		
		if (promedio>=6) 
		{
			System.out.println("Aprobado");
		}
		else 
		{
			System.out.println("Desaprobado");
		}
	}
}

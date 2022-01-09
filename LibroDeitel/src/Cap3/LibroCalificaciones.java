package Cap3;

import java.util.Scanner;

public class LibroCalificaciones {

	private String nombreDelCurso; // Variable local de Libro Calificaciones
	
	public void setNombreDelCurso(String nombre) { // Setter que asigna un valor a la variable privada
		nombreDelCurso = nombre;
	}

	public String getNombreDelCurso() { // Getter que retorna el valor de la variable privada
		return nombreDelCurso;
	}

	public void mostrarMensaje(){ // El metodo que muestra el nombre del curso usando el getter
		
		System.out.printf("Welcome to the calification book of %s!\n",getNombreDelCurso());
	}
	
	public int determinarPromedio()
	{
		Scanner entrada = new Scanner(System.in); //Creo un objeto scanner
		
		int total = 0;
		int contadorCalif = 1;
		int nota;
		int promedio;
		int ciclos = 4;
		
		while(contadorCalif <= ciclos) // Ciclo Mientras
		{
			System.out.println("Ingrese la calificacion");
			nota = entrada.nextInt();
			total = (total + nota);
			contadorCalif = (contadorCalif+1);
		}
		promedio = (total/ciclos); //calculo el promedio
		System.out.println("Promedio Final del Libro: "+promedio);
		entrada.close();
		return promedio; //Retorno el promedio
		
	}
}
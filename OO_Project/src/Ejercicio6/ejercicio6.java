package Ejercicio6;

import java.util.Scanner;

public class ejercicio6 
	{
		static Scanner num = new Scanner(System.in);
		public static void main(String[] args) 
			{
				
				int numero = Integer.parseInt(num.nextLine());
				
				while (numero != 0);
				{ 			
					System.out.println("ingrese el numero");
					entero e = new entero(numero);
					System.out.println("El numero ingresado es: "+e.getNumero());
					System.out.println("El cuadrado de " + e.getNumero() + " es: " +e.cuadrado());
					System.out.println("El numero ingresado es impar? " + e.esPar() );
					System.out.println("El numero de manera factorial da: " + e.factorial() );
					System.out.println("El numero ingresado es primo?  " + e.isPrimo() );
					numero = Integer.parseInt(num.nextLine());
				}
				num.close();
			}
	}
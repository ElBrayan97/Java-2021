package Cap2;

import java.util.Scanner;

public class IntegerSum { //Clase Suma
	
	public static void main(String[]args){ //Método Main
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		System.out.print("Escriba un numero: ");
		num1 = input.nextInt();
		
		System.out.print("Escriba un numero: ");
		num2 = input.nextInt();
		
		sum = (num1 + num2);
		
		System.out.printf("La suma es:%2d\n", sum);	//Formateado de clases(% -> caracter de escape) 

		input.close();
		} //Fin método main

	} //fin Clase Suma
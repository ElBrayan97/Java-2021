package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner num = new Scanner(System.in);
		
	public static void main(String[] args) {
		Ejercicio2.algoritmo();
	
	}

	public static void algoritmo() {
		
		int num1 = Integer.parseInt(num.nextLine());
		int num2 = Integer.parseInt(num.nextLine());
		int num3 = Integer.parseInt(num.nextLine());
		//Leer variables y con parse convertir a integer

		
		if (num1 >= 0) {
			System.out.println(num2 * num3);
		} else {
			System.out.println(num2 + num3);
		}
		System.out.println("Queres probar mi super código denuevo? :V");
		
		String resp = num.nextLine();
		
		if( resp != "si") {
			resp = " ";
			algoritmo();
			
		} else {
			System.out.println("Que te valla bien perri! :V");
		}
	}
}

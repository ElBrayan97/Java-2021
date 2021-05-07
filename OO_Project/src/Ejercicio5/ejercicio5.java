package Ejercicio5;

import java.util.Scanner;
public class ejercicio5 {
	public static void main(String[] args) {
		
		Scanner var = new Scanner (System.in);
		double mayorsueldo = 0;
		String mayornombre = " ";
		int i = 0;
			
		while (i < 5) {
			
			System.out.println("Ingresa nombre del empleado");
			String nombre = var.nextLine();
			
			System.out.println("Ingresa el sueldo");
			int sueldo = Integer.parseInt(var.nextLine());
			var.close();
			if (sueldo >= mayorsueldo) {
				mayorsueldo = sueldo;
				mayornombre = nombre;
			}
			i++;
		}
		System.out.println(mayornombre+" recibe el sueldo mayor, que es de $"+ mayorsueldo);
	}
}
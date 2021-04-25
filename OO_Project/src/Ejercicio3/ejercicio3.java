package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		String cadena = keyboard.nextLine();
		String invertida = "";
		
			for (int i = cadena.length() - 1; i >= 0; i--){	
				invertida += cadena.charAt(i);
			}
		
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);
		
			if (cadena.equals(invertida) == true){
				System.out.println("La palabra "+ cadena +" es un palíndromo");
			} else {
				System.out.println("La palabra "+ invertida +" NO es un palíndromo");
			}
	}
}
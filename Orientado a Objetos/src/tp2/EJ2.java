package tp2;

import java.util.Scanner;

public class EJ2 {
	static int pedirNumero() {
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese un numero de mieda!: ");
		String text = in.nextLine();
		int num = Integer.parseInt(text);
		in.close();
		return (num);
	}
		
	public static void main(String[] args) { //convierte un String a int
		int valor = 0;
		valor = pedirNumero();
		if(valor != 0) {
			System.out.println("funciono!");
		}
	}

}
package tp2;

import java.util.Scanner;

public class EJ2 {
	static int pedirNumero() {
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		String text = in.nextLine();
		int num = Integer.parseInt(text);
		return (num);
	}
		
	public static void main(String[] args) {
		int N1 = pedirNumero();
		int N2 = pedirNumero();
		int N3 = pedirNumero();
		if(N1>0) 
			System.out.println("Producto: " + N2*N3);
		else 
			System.out.println("Suma: "+ (N2+N3));
		
	}
}
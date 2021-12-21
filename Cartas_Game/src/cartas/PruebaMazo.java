package cartas;

import java.util.Scanner;

public class PruebaMazo {
	
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		boolean winner = false;
		// TODO Auto-generated method stub
		
		Mazo mazo = new Mazo();
		
		System.out.println(mazo);
		
		mazo.barajar();
		System.out.println("Mazo mezclado");
		System.out.println(mazo);
		System.out.println("Naipe de abajo");
		System.out.println(mazo.getNaipeAbajo());
		System.out.println("Naipe de Arriba");
		System.out.println(mazo.getNaipeArriba());
		System.out.println("Mazo final");
		System.out.println(mazo);

		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		
		String family = "";
		int num = 1;
		
		while (winner == false){
			
			System.out.println("Jugador 1 elija un Mazo y un Numero");
			family = escaner.nextLine();
			family = family.toUpperCase();
			num = escaner.nextInt();
			jugador1.setFamilia(family);
			jugador1.setNumero(num);
			System.out.println("Jugador 2 elija un Mazo y un Numero");
			family = escaner.nextLine();
			family = family.toUpperCase();
			num = escaner.nextInt();
			jugador2.setFamilia(family);
			jugador2.setNumero(num);

			
			System.out.println(jugador1.getFamilia());
			System.out.println(jugador1.getNumero());
		}
	}

}

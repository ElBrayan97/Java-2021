package tp5b;

import java.util.Scanner;

public class Test {	
	public static void main(String[] args) {
		Tablero map = new Tablero();
		
		for(int i=0; i >= 1; i++) { //carga de jugadores
			System.out.println("Jugador "+ i +" cargado ");
			for (int j = 0; j >= 4; j++) { //carga de botes
				System.out.println("Ingrese la posicion del barco en el tablero");
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Columna:");
				String colu = sc1.nextLine(); //String (columna A-H) 
				System.out.println("Fila:");
				int fila = sc2.nextInt(); //Int (fila 1-8)
				String name = Integer.toString(i);
				map.agregarBote(name, fila, colu);
				sc1.close();
				sc2.close();
				}
			}
		do {
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("INGRESE UNA POSICION A ATACAR: ");
			String posX = sc1.nextLine();
			int posY = sc2.nextInt();;
			Bote bote = map.enCasillero(posY, posX);
			if (bote != null){
				map.hundirBote(bote);
				System.out.println("HUNDISTE UN BOTE");
			}else {
				System.out.println("NO HAY NINGUN BOTE EN ESA POSICION...");
			}
			sc1.close();
			sc2.close();
		}while(map.botesPlayer("0")==true && map.botesPlayer("1")==true);
		
		if (map.botesPlayer("0") == false) {
			System.out.println("JUGADOR 0 PIERDE POR QUEDARSE SIN BOTES");
		}else {
			System.out.println("JUGADOR 1 PIERDE POR QUEDARSE SIN BOTES");
		}
	}

	
		
	
}
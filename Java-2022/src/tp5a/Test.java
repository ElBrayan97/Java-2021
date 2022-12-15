package tp5a;

//import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Mazo mazo = new Mazo(); // Nuevo Mazo
		Juego game = new Juego(); // Nueva Partida
		Naipe carta;
		
		//carga jugador 1
		System.out.println("Ingrese datos jugador 1");
		String name = "A"; 
		String family = "copa";
		family = family.toUpperCase();
		int num = 4;
		game.newPlayer(name, family, num);
		
		//carga jugador 2
		System.out.println("Ingrese datos jugador 2");
		name = "B";
		family = "basto";
		family = family.toUpperCase();
		num = 4;
		game.newPlayer(name, family, num);
		
		System.out.println("Jugadores Listos!!!");
		
		do {
		boolean resultado = false;
		mazo.barajar();
		
		System.out.println("Mazo Mezclado!");
			for (int i=0; i<(game.getmaxRound()-1); i++) {
				carta = game.Ronda(mazo);
				if (carta!=null) {
					resultado = game.ganador(carta);
					if (resultado==true) {
						break;
						}
				else
					{
					mazo.getEmpty();
					}
				}
			}
		}while(game.maximosPuntos()==null);	
		
	}
}
























































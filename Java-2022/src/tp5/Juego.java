package tp5;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {
	private int maxRound = 48; 
	private int puntajeGanador = 5;
	private int round = 0;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	
	public int getPuntajeGanador() {
		return puntajeGanador;
	}
	
	public void seePlayers() {
		Jugador player = new Jugador();
		Iterator<Jugador> it = jugadores.iterator();
		while (it.hasNext()){
			player = it.next();
			System.out.println(player.getNombre()+" - "+player.getPuntos());

		}
	}
	
	public void setPuntajeGanador(int PuntajeGanador) {
		this.puntajeGanador = PuntajeGanador;
	}
	
	public int getmaxRound() {
		return maxRound;
	}
	
	public Naipe Ronda(Mazo mazo) {
		return mazo.getNaipeUp();
	}
	
	public Jugador maximosPuntos() {
		Jugador player = new Jugador(); // comentar esto seria tonto :V
		int size = jugadores.size();
		for (int i=0; i<=(size-1); i++){ //ciclo sobre ela arraylist de jugadores
			player = jugadores.get(i);
			if (player.getPuntos()>=puntajeGanador) {
				return player;
			}
	
		}
		return null;
	}

	public void newPlayer(String name, String familia, int num){
		Jugador player = new Jugador();
		player.setFamilia(familia);
		player.setNumero(num);
		player.setNombre(name);
		jugadores.add(player);
	}
	
	public boolean ganador(Naipe card) {
		Jugador player = new Jugador(); // comentar esto seria tonto :V
		int size = jugadores.size();
				
			for (int i=0; i<=(size-1); i++){ //ciclo sobre ela arraylist de jugadores
				player = jugadores.get(i); // obtengo un jugador
				String family = player.getFamilia(); 
				int num = player.getNumero();
				Palo palo = card.getPalo();
				
				if (palo.getNombre().toUpperCase().contains(family)	 && (card.getNum() == num)){ // verifico si la eleccion del usuario coinicide con la carta que saque del mazo
					int puntos = player.getPuntos();
					puntos++;
					player.setPuntos(puntos); // le sumo un punto al player
					jugadores.set(i,player); // cargo el player actualizado al array list
					System.out.println("El jugador "+ player.getNombre() +" obtuvo puntos... " + player.getPuntos());
					return true;
				}
			}
		return false;
	}
}


















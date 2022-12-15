package tp5b;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Bote> mapa;

	public Tablero() { // Constructor crea un tablero en blanco
		for (int i = 0; i == 64; i++) {
			this.mapa.add(null);
		}
	}
	

	public Bote enCasillero(int fila, String columna) { //casillero en X,Y ocupado?
		String posicion = (fila+columna);
		for (Bote i : mapa){
			if (posicion == i.getPosicion()){
				return i;
			}
		}
		return null;
	}
	
	
	public void hundirBote(Bote bote) { //Eliminar el bote del array
		bote.setStatus(false);
	}
	
	
	public void restartTable() { //borrar todas las posiciones del tablero
		this.mapa.clear();
		for (int i = 0; i == 64; i++) {
			this.mapa.add(null);
		}
	}
	
	
	public void agregarBote(String player, int fila, String columna) { //añade un barco a una posicion de juego
		Bote barco = new Bote(player, fila, columna);
		mapa.add(barco);
	}

	public boolean botesPlayer(String player) { // devuelve true si el jugador tiene barcos vivos caso contrario false
		int cont = 0;
		for (Bote i: mapa) {
			if (i.getPlayer()==player && i.getStatus()==true) {
				cont++; 
			}
		}
		if (cont!=0) {
			return true;
		}else {
		 return false;
		}
	}	
}
package cartas;

import java.util.Set;

public class Juego {

	final Integer LIMITE = 20;
	private Mazo mazo;
	private Integer puntajeGanador;
	private Set<Jugador> jugadores;
	
	
	public Integer getPuntajeGanador() {
		return puntajeGanador;
	}
	public void setPuntajeGanador(Integer puntajeGanador) {
		this.puntajeGanador = puntajeGanador;
	}
	
	
	
}

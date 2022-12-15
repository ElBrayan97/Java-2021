package tp5b;

public class Bote {
	private boolean vivo; //vivo o muerto
	private int fila; 
	private String columna;
	private String player; //nombre del jugador

	public Bote(String jugador, int fila, String columna) {
		this.vivo = true;
		this.fila = fila;
		this.columna = columna;
	}
	
	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public boolean getStatus() {
		return this.vivo;
	}
	
	public void setStatus(boolean estado) {
		this.vivo = estado;
	}
	
	public String getPosicion() {
		return (this.fila+this.columna);
	}
}

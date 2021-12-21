package cartas;

public class Jugador {
	private int puntos = 0;
	private String familia;
	private int numero;
	
	
	public String getFamilia() {
		return familia;
	}
	
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
}
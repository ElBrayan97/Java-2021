package tp5a;

public class Jugador {
	private int puntos = 0;
	private String familia;
	private int numero;
	private String nombre = "";
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFamilia(){
		return familia;
	}
	
	public void setFamilia(String family) {
		this.familia = family;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int num) {
		this.numero = num;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
}

package cartas;

public enum Palo {
	
	ORO("Oro", "O"),
	ESPADA("Espada", "E"),
	COPA("Copa", "C"),
	BASTO("Basto", "B");
	
	private String nombre;
	private String simbolo;
	
	private Palo(String nombre, String simbolo){
		this.nombre = nombre;
		this.simbolo = simbolo;
	}
}

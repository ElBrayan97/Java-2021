package tp5;

public enum Palo{
	ORO("Oro","O"), BASTO("Basto","B"), ESPADA("Espada","E"), COPA("Copa","C");

	
	private String name;
	private String simbol;
	
	private Palo(String nombre, String simbolo) {
		this.name = nombre;
		this.simbol = simbolo;
	}
	
}

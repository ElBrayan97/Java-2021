package tp6_Herencia;

public class Forma {
	String color = null;
	Punto centro = null;
	String name = null;
	
	public Forma(String n, String c, int x, int y) {
		centro = new Punto(x,y);
		name = n;
		color = c; 
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void printForma() {
		System.out.print("Nombre: "+name+"\nColor: "+color+"\nCentro: "+"("+centro.getX()+","+centro.getY()+")"+"\r");
		
	}
		
}


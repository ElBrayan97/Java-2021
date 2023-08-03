package tp6_Herencia;

public class Rectangulo extends Forma{
	float mayor = 0;
	float menor = 0;
	
	public Rectangulo(String n, String c, int x, int y, int M, int m) //Nombre, Color, posX,  posY, mayor, menor
	{
		super(n, c, x, y);
		this.mayor = M;
		this.menor = m;
	}

	public void setMayor(float mayor) {
		this.mayor = mayor;
	}

	public void setMenor(float menor) {
		this.menor = menor;
	}
	
	@Override
	public void printForma() {
		System.out.print("Nombre: "+name+"\nColor: "+color+"\nCentro: "+"("+centro.getX()+","+centro.getY()+")"+
		"\nLado Mayor: "+mayor+"\nLado Menor: "+menor+"\r");
		
	}
	
	public float getArea() {
		return (this.mayor*this.menor);
	}

	public float getPerimtero() {
		return (this.mayor*2+this.menor*2);
	}
	
	public void setEscala(float scale) {
		float M = this.mayor; this.setMayor(M*scale);
		float m = this.menor; this.setMenor(m*scale);
	}
	
}


package tp6_Herencia;

public class Cuadrado extends Rectangulo{
	int lado = 0;
	
	public Cuadrado(String n, String c, int x, int y,int l) {
		super(n,c,x,y,l,l);
		this.lado=l;
	}
	
	@Override
	public float getArea() {
		return (this.lado*this.lado);
	}
	
	public int getPerimetro(){
		return (this.lado*4);
	}
}

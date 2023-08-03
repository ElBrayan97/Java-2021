package tp6_Herencia;

public class Elipse extends Forma {
	float radioM = 0;
	float radiom = 0;

	public Elipse(String n, String c, int x, int y, float M, float m) 
	{
		super(n,c,x,y);
		this.radioM = M;
		this.radiom = m;
	}
	
	public double getArea() {
		return (Math.PI*(this.radioM*this.radiom));
	}
}
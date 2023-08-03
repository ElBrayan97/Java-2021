package tp6_Herencia;

public class Punto {
	int x = 0;
	int y = 0;
	
	public Punto (int x, int y){
		setX(x);
		setY(y);
	}
	public int getX() { // Devuelve la posicion X
		return x;
	}
	public void setX(int x) { //Asigna la posicion X
		this.x = x;
	}
	public int getY() { // Devuelve la posicion Y
		return y;
	}
	public void setY(int y) { //Asigna la posicion Y
		this.y = y;
	}

}

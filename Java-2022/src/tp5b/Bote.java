package tp5b;

public class Bote {
	private int X;
	private int Y;

	public Bote(int fila, int columna) {
		this.X = fila;
		this.Y = columna;
	}
	
	public int getColumna() {
		return this.X;
	}
	
	public int getFila() {
		return this.Y;
	}
}

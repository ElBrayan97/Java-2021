package tp5b;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Tablero
{
	private ArrayList<Bote> botes;

	private HashMap<String, Integer> equivalencia = new HashMap<String, Integer>(); 
	
	private void startEquivalencia() {
		equivalencia.put("A", 1);
		equivalencia.put("B", 2);
		equivalencia.put("C", 3);
		equivalencia.put("D", 4);
		equivalencia.put("E", 5);
		equivalencia.put("F", 6);
		equivalencia.put("G", 7);
		equivalencia.put("H", 8);
	}
	
	private int getPosInteger(String pos) {
		return equivalencia.get(pos);
	}
	
	public void Inicializar() {
		Random rand = new Random();
		for (int i=0; i<=5; i++) {
			int x = rand.nextInt(8);
			int y = rand.nextInt(8);
			Bote boat = new Bote(x,y);
			botes.add(boat);
			}
		this.startEquivalencia();
		}
	
	public Tablero() {
		this.botes = new ArrayList<Bote>();
		Inicializar();
		}
	
	public boolean searchBoat(int x, String y) // Verifica que las posiciones que se ingresaron, corresponden a un bote
		{ // hice 400 versiones y metodos antes de esto... espero funcione porque es "simple" :´D (kill me)
		for(int i=0; i<=botes.size()-1; i++)
			{
			Bote b = new Bote(-1,-1);
			b = botes.get(i);
			int aux = this.getPosInteger(y); //busca en el hash la equivalencia de la letra en numero
			if ((b.getColumna()==aux) && (b.getFila()==x))
				{
				botes.remove(i);
				return true; //si hay un bote en esa pos
				}
			}
		return false; // si no hay un bote en esa posiS
		}

	
	public boolean getQuedanBotes() { // Quedan botes True - No quedan botes False
		if (botes.isEmpty()) {return false;}
		
		else {return true;}
		}
}
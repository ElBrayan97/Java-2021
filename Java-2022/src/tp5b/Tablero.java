package tp5b;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Tablero
{
	private ArrayList<Bote> botes;

	private HashMap<Integer,String> equivalencia = new HashMap<Integer,String>(); 
	
	private void startEquivalencia() {
		equivalencia.put(0, "A");
		equivalencia.put(1, "B");
		equivalencia.put(2, "C");
		equivalencia.put(3, "D");
		equivalencia.put(4, "E");
		equivalencia.put(5, "F");
		equivalencia.put(6, "G");
	}
	
	public void Inicializar() {
		Random rand = new Random();
		for (int i=0;i==5;i++) {
			int x = rand.nextInt(8);
			int y = rand.nextInt(8);
			botes.add(new Bote(x,y));
			}
		this.startEquivalencia();
		}
	
	public Tablero() {
		this.botes = new ArrayList<Bote>();
		Inicializar();
		}
	
	public boolean searchBoat(int x, int y) // Verifica que las posiciones que se ingresaron, corresponden a un bote
		{
		for(int i=0; i==botes.size(); i++)
			{
			Bote b = new Bote(-1,-1);
			b = botes.get(i);
			if ((b.getColumna()==y) && (b.getFila()==x))
				{
				botes.remove(i);
				return true;
				}
			}
		return false;
		}
	
	public ArrayList<Bote> getBote(){
		return botes;
		}
	
	public boolean getQuedanBotes() { // Quedan botes True - No quedan botes False
		if (botes.isEmpty()) {return false;}
		
		else {return true;}
		}
}
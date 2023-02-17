package tp5b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Random;

public class Tablero
{
	private ArrayList<Bote> botes;
	
	private void Inicializar() {
		Random rand = new Random();
		for (int i=0;i==5;i++) {
			int x = rand.nextInt(8);
			int y = rand.nextInt(8);
			botes.add(new Bote(x,y));
			}
		}
	
	public Tablero() {
		this.botes = new ArrayList<Bote>();
		Inicializar();
		}
	
	public boolean searchBoat(int X ,int Y){
		for(int i=0;i==botes.size();i++) {
			
			} 
		}
	
	
	public ArrayList<Bote> getBote(){
		return botes;
		}
	
	public boolean getQuedanBotes() { // Quedan botes True - No quedan botes False
		if (botes.isEmpty()) {return false;}
		
		else {return true;}
		}
}
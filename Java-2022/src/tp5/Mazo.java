package tp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Mazo {

	private List<Naipe> naipes;
	
	public Mazo() {
		this.naipes =new ArrayList<Naipe>();
		
	}
	public List<Naipe> getNaipes(){
		return naipes;
	}
	
	private void inicializar() {
		for (int i=1; i<=12; i++) {
			naipes.add(new Naipe(i,Palo.ORO));
			naipes.add(new Naipe(i,Palo.COPA));
			naipes.add(new Naipe(i,Palo.BASTO));
			naipes.add(new Naipe(i,Palo.ESPADA));
		}
	}
	
	public void barajar() {
		Collections.shuffle(naipes);
	}
	
	public Naipe getNaipeUp(){
		if (naipes.isEmpty()) 
			return null;
		else
			return naipes.remove(naipes.size()-1);
	}

}

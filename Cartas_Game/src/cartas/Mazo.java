package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
	
	private List<Naipe> naipes;

	public Mazo() {
		this.naipes = new ArrayList<Naipe>();
		inicializar();
	}
	
	public List<Naipe> getNaipes() {
		return naipes;
	}

	private void inicializar() {		
		for(int i = 1; i <= 12; i++) {
			naipes.add(new Naipe(i, Palo.ORO));
			naipes.add(new Naipe(i, Palo.COPA));
			naipes.add(new Naipe(i, Palo.BASTO));
			naipes.add(new Naipe(i, Palo.ESPADA));
		}		
	}
	
	public void barajar() {
		Collections.shuffle(naipes);
	}
	
	public Naipe getNaipeArriba() {
		if(naipes.isEmpty())
			return null;
		else
			return naipes.remove(0);	
	}
	
	public Naipe getNaipeAbajo() {
		if(naipes.isEmpty())
			return null;
		else
			return naipes.remove(naipes.size()-1);		
	}

	@Override
	public String toString() {
		
		String resultado = "";
		
		for(Naipe n : this.naipes) {
			resultado += n + "\n";
		}
		
		return resultado;
	}
	
	public void cortar() {
		
	}
	
	

}

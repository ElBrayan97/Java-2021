package map;

import java.util.ArrayList;
import java.util.List;

public class continent {
	
	private String nombre;
	private List<Pais> paises;

	public continent(String nombre) { /* Constructor */
		super();
		this.nombre = nombre;
		this.paises = new ArrayList<Pais>();
	}

	public String getNombre() { /* Devuelve el nombre del continente */
		return nombre;
	}
	
	public void setNombre(String nombre){ /* asigna el nombre del objeto continente */
		this.nombre = nombre; /* this hace referencia al objeto en si (igual que en las clases en python)*/
	}
	
	public List<Pais> getPais(){ /* Devuelve un pais de la lista */
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
	
	
}
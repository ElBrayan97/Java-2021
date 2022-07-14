package tp4;

import java.util.ArrayList;
import java.util.List;

public class Continente {
	
	private String nombre;
	private List<Pais> paises;

	public Continente(String nombre) {
		this.nombre = nombre;
		this.paises = new ArrayList<Pais>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

	public void agregarPais(Pais pais) {
		this.paises.add(pais);
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}

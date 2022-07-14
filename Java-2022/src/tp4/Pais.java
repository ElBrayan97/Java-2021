package tp4;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	private String nombre;
	private String capital;
	private Continente continente;
	private List<Provincia> provincias;
	private List<Pais> limitrofes;

	public Pais(String nombre, String capital, Continente continente) {
		this.nombre = nombre;
		this.capital = capital;
		this.continente = continente;
		this.provincias = new ArrayList<Provincia>();
		this.limitrofes = new ArrayList<Pais>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	public List<Pais> getLimitrofes() {
		return limitrofes;
	}

	public void setLimitrofes(List<Pais> limitrofes) {
		this.limitrofes = limitrofes;
	}

	public void agregarLimitrofe(Pais pais) {
		this.limitrofes.add(pais);
	}

	public void agregarProvincia(Provincia provincia) {
		this.provincias.add(provincia);
	}

	@Override
	public String toString() {
		return "[" + this.nombre + " - " + this.capital + "]";
	}

}

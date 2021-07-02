package OBSERVER;

import java.util.Collection;
import java.util.List;

public class Publicacion {
	private String titulo;
	private List<String> autores;
	private List<String> filiacion;
	private String tipo;
	private String lugar;
	private List<String> palabrasClave;

	public Publicacion(String titulo, List<String> autores, List<String> filiacion, String tipo, String lugar, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.tipo = tipo;
		this.lugar = lugar;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public List<String> getAutores() {
		return this.autores;
	}

	public Collection<?> getFiliacion() {
		return this.filiacion;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getLugar() {
		return this.lugar;
	}

	public List<String> getPalabrasClave() {
		return this.palabrasClave;
	}
	
	public void addPalabraClave(String unapalabra) {
		this.getPalabrasClave().add(unapalabra);
		GestorDePublicaciones.notificar(this);
	}

}

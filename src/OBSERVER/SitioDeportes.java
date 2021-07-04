package OBSERVER;

import java.util.ArrayList;
import java.util.List;

public class SitioDeportes {
	private List<Partido> partidos;
	private List<ObservadorDeporte> observadores;
	
	
	
	public SitioDeportes() {
		this.partidos = new ArrayList<Partido>();
		this.observadores = new ArrayList<ObservadorDeporte>();
	}

	private List<Partido> getPartidos() {
		return partidos;
	}

	private List<ObservadorDeporte> getObservadores() {
		return observadores;
	}

	public void addPartido(Partido unPartido) {
		this.getPartidos().add(unPartido);
		this.getObservadores().forEach(observador -> observador.notificar(unPartido));
	}
	
	public void addObservador(ObservadorDeporte unObservador) {
		this.getObservadores().add(unObservador);
		
	}
	

}

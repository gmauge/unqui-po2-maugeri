package OBSERVER;

import java.util.Collections;
import java.util.List;

public class Autor implements Interesante{
	private List<String> valor;
	
	public Autor(List<String> valor) {
		this.valor = valor;
	}

	@Override
	public boolean coincideInteres(Publicacion unaPublicacion) {
		return ! Collections.disjoint(unaPublicacion.getAutores(), this.valor);
		
	}
	
	

}

package OBSERVER;

import java.util.Collections;
import java.util.List;

public class Filiacion implements Interesante{
private List<String> valor;
	
	public Filiacion(List<String> valor) {
		this.valor = valor;
	}

	@Override
	public boolean coincideInteres(Publicacion unaPublicacion) {
		return ! Collections.disjoint(unaPublicacion.getFiliacion(), this.valor);
		
	}

}

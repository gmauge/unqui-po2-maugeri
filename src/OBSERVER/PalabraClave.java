package OBSERVER;

import java.util.Collections;
import java.util.List;

public class PalabraClave implements Interesante{
	private List<String> valor;

	public PalabraClave(List<String> valor) {
		this.valor = valor;
	}

	@Override
	public boolean coincideInteres(Publicacion unaPublicacion) {
		return ! Collections.disjoint(unaPublicacion.getPalabrasClave(), this.valor );
	}
	
	

}

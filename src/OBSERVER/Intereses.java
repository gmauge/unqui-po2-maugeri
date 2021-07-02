package OBSERVER;

import java.util.List;
import java.util.stream.Collectors;

public class Intereses implements Interesante{
	private List<Interesante> interesantes;
	
	
	public Intereses(List<Interesante> interesantes) {
		this.interesantes = interesantes;
	}
	
	public void addInteresante(Interesante unIneresante) {
		this.getInteresantes().add(unIneresante);
	}

	public List<Interesante> getInteresantes() {
		return this.interesantes;
	}

	@Override
	public boolean coincideInteres(Publicacion unaPublicacion) {
		return this.getInteresantes().stream().filter(interesante -> interesante.coincideInteres(unaPublicacion)).collect(Collectors.toList()).size() > 0;
	}

}

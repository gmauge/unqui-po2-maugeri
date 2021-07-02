package OBSERVER;

public class Lugar implements Interesante{
	private String valor;

	public Lugar(String valor) {
		this.valor = valor;
	}

	@Override
	public boolean coincideInteres(Publicacion unaPublicacion) {
		return unaPublicacion.getLugar().equals(this.valor);
	}
	
	

}

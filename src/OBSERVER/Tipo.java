package OBSERVER;

public class Tipo implements Interesante{
	private String valor;

	public Tipo(String valor) {
		this.valor = valor;
	}

	@Override
	public boolean coincideInteres(Publicacion unaPublicacion) {
		return unaPublicacion.getTipo().equals(this.valor);
	}
	
	

}

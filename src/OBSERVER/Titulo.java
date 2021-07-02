package OBSERVER;

public class Titulo implements Interesante{
	private String valor;
	
	public Titulo(String valor) {
		this.valor = valor;
	}


	@Override
	public boolean coincideInteres(Publicacion unaPublicacion) {
		return unaPublicacion.getTitulo().contains(this.valor);
	}

}

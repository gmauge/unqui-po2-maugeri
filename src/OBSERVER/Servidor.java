package OBSERVER;

import java.util.List;

public class Servidor implements ObservadorDeporte{
	private List<String> deportes;
	private String url;
	
	
	public Servidor(List<String> deportes, String url) {
		this.deportes = deportes;
		this.url = url;
	}

	private List<String> getDeportes(){
		return this.deportes;
	}
	
	private String getUrl(){
		return this.url;
	}

	@Override
	public void notificar(Partido unPartido) {
		if (this.getDeportes().contains(unPartido.getDeporte())) {
			this.notificarCliente(unPartido);
		}
		
	}

	private void notificarCliente(Partido unPartido) {
		// TODO dispara la notificacion al servidor
		
	}
	
	

}

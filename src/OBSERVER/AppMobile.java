package OBSERVER;

import java.util.List;

public class AppMobile implements ObservadorDeporte {
	private List<String> deportes;
	private List<String> contrincantes;
	private String idMobile;
	
	public AppMobile(List<String> deportes, List<String> contrincantes, String idMobile) {
		this.deportes = deportes;
		this.contrincantes= contrincantes;
		this.idMobile = idMobile;
	}

	private List<String> getDeportes(){
		return this.deportes;
	}
	
	private List<String> getContrincantes(){
		return this.contrincantes;
	}
	
	private String getIdMobile(){
		return this.idMobile;
	}

	@Override
	public void notificar(Partido unPartido) {
		if (   this.getDeportes().contains(unPartido.getDeporte()) 
			|| this.getContrincantes().containsAll(unPartido.getContrincantes())
				) {
			this.notificarCliente(unPartido);
		}
		
	}

	private void notificarCliente(Partido unPartido) {
		// TODO dispara la notificacion al servidor
		
	}
	
	
}

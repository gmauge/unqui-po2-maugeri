package po2_tp6;

import java.util.List;


public class Banco {
	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudesDeCredito;
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addSolicitudCredito(SolicitudCredito solicitud) {
		solicitudesDeCredito.add(solicitud);
	}
	
	public void asignarCredito(SolicitudCredito solicitud) {
		// envia el deinero al cliente
	}
	
	private List<SolicitudCredito> solicitudesNoEvaluadas(){
		return (List<SolicitudCredito>) this.solicitudesDeCredito.stream().filter(solicitud -> !(solicitud.estaEvaluda()));
	}
	
	public void evaluarSolicitudes() {
		this.solicitudesNoEvaluadas().forEach(solicitud -> solicitud.evaluar(this));
	}

}

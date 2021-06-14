package po2_tp6;

public abstract class EstadoSolicitud {
	private String descripcion;
	
	public EstadoSolicitud(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void evaluar(SolicitudCredito solicitud, Banco banco) {
		// or defecto no hace nada solo lo hace el estado qye le compete
	};
	
	public abstract Boolean estaEvaluada();

}

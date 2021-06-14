package po2_tp6;

public class EstadoInicial extends EstadoSolicitud{
	private static EstadoInicial estado;
	
	private EstadoInicial(String descripcion) {
		super(descripcion);
	}
	
	public static EstadoInicial getInstance() {
		if (estado == null) {
			estado = new EstadoInicial("Inicial");
		}
		return estado;
	}

	@Override
	public void evaluar(SolicitudCredito solicitud, Banco banco) {
		if (solicitud.esAceptable()) {
			solicitud.setEstado( EstadoAprobado.getInstance());
			banco.asignarCredito(solicitud);
		}
		else {
			solicitud.setEstado( EstadoRechazado.getInstance());
		}
		
	}

	@Override
	public Boolean estaEvaluada() {
		return false;
	}

}

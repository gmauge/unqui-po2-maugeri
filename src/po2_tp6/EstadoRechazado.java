package po2_tp6;

public class EstadoRechazado extends EstadoSolicitud {
private static EstadoRechazado estado;
	
	private EstadoRechazado(String descripcion) {
		super(descripcion);
	}
	
	public static EstadoRechazado getInstance() {
		if (estado == null) {
			estado = new EstadoRechazado("Rechazado");
		}
		return estado;
	}

	@Override
	public Boolean estaEvaluada() {
		return true;
	}

}

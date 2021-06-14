package po2_tp6;

public class EstadoAprobado extends EstadoSolicitud {
    private static EstadoAprobado estado;
	
	private EstadoAprobado(String descripcion) {
		super(descripcion);
	}
	
	public static EstadoAprobado getInstance() {
		if (estado == null) {
			estado = new EstadoAprobado("Aprobado");
		}
		return estado;
	}
	
	@Override
	public Boolean estaEvaluada() {
		return true;
	}

}

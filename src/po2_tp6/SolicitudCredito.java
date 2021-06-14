package po2_tp6;

public abstract class SolicitudCredito {
	private EstadoSolicitud estado;
	private Cliente solicitante;
	private Double monto;
	private Integer cantidadCuotas;
	
	public SolicitudCredito(Cliente solicitante, Double monto, Integer cantidadCuotas) {
		// la solicitud nace en EstadoInicial
		this.estado = EstadoInicial.getInstance();
		this.solicitante = solicitante;
		this.monto = monto;
		this.cantidadCuotas = cantidadCuotas;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Integer getCantidadCuotas() {
		return cantidadCuotas;
	}

	public void setCantidadCuotas(Integer cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}

	public EstadoSolicitud getEstado() {
		return estado;
	}

	public Cliente getSolicitante() {
		return solicitante;
	}

	public void setEstado(EstadoSolicitud estado) {
		this.estado = estado;
	}
	
	public Double cuotaMensual() {
		return this.getMonto() / this.getCantidadCuotas();
	}
	
	public abstract Boolean esAceptable();
	
	public void evaluar(Banco banco) {
		this.getEstado().evaluar(this, banco);
	}
	
	public Boolean estaEvaluda() {
		return this.getEstado().estaEvaluada();
	}

}

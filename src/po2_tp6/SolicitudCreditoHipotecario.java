package po2_tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	private Inmueble propiedad;

	public SolicitudCreditoHipotecario(Cliente solicitante, Double monto, Integer cantidadCuotas, Inmueble propiedad) {
		super(solicitante, monto, cantidadCuotas);
		this.propiedad = propiedad;
	}
	
	public Inmueble getpropiedad() {
		return this.propiedad;
	}

	@Override
	public Boolean esAceptable() {
		return     this.getSolicitante().getSueldoNetoMensual() * 0.5 >= this.cuotaMensual()
				&& this.getMonto() <= this.getpropiedad().getValor() * 0.7
				&& (this.getSolicitante().edad() + (this.getCantidadCuotas() / 12)) <= 65;
	}

}

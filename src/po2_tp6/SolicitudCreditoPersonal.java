package po2_tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito{

	public SolicitudCreditoPersonal(Cliente solicitante, Double monto, Integer cantidadCuotas) {
		super(solicitante, monto, cantidadCuotas);
	}

	@Override
	public Boolean esAceptable() {
		return     this.getSolicitante().sueldoNetoAnual() > 15000 
				&& this.getSolicitante().getSueldoNetoMensual() * 0.7 >= this.cuotaMensual();
	}
	

}

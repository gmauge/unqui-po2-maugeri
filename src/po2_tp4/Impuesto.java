package po2_tp4;

public class Impuesto implements Facturable{
	private Double tasa;
	private Agencia agencia;
	
	public Impuesto(Double tasa, Agencia agencia) {
		this.tasa = tasa;
		this.agencia = agencia;
	}
	
	public Double valorACobrar() {
		return this.tasa;
	}
	public void procesarCobro() {
		this.agencia.registrarPago(this);
	}

}

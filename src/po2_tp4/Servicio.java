package po2_tp4;

public class Servicio implements Facturable {
	private Double consumo;
	private Double valorUnitario;
	private Agencia agencia;
	
	public Servicio(Double consumo, Double valorUnitario, Agencia agencia) {
		this.consumo = consumo;
		this.valorUnitario = valorUnitario;
		this.agencia = agencia;
	}
	
	public Double valorACobrar() {
		return this.consumo * this.valorUnitario;
	}
	
	public void procesarCobro() {
		this.agencia.registrarPago(this);
	}

}

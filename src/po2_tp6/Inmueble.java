package po2_tp6;

public class Inmueble {

	private String descripcion;
	private String direccion;
	private Double valor;
	
	public Inmueble (String descripcion, String direccion, Double valor) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDireccion() {
		return direccion;
	}
	
	
}

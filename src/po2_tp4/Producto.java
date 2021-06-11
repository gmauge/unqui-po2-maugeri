package po2_tp4;

public abstract class Producto {
	private Integer stock;
	private Double precioBase;
	private Double iva;
	
	public Producto(Double precioBase, Double iva) {
		this.setPrecioBase(precioBase);
		this.setIva(iva);
	}
	
	public void setPrecioBase(Double precio) {
		this.precioBase = precio;
	}
	
	public void setIva(Double iva) {
		this.iva = iva;
	}

	public void bajarStock() {
		this.stock -= 1;				
	}

	public Double precio() {
		return this.precioBase * (1 + this.iva /100);
	};

}

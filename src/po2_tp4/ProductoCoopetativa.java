package po2_tp4;

public class ProductoCoopetativa extends Producto{

	public ProductoCoopetativa(Double precioBase, Double iva) {
		super(precioBase, iva);
	}
	
	public Double precio() {
		return super.precio() * 0.9;
	}
	
	
	

}

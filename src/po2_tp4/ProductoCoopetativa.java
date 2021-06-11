package po2_tp4;

public class ProductoCoopetativa extends Producto{

	public ProductoCoopetativa(Double precioBase, Double iva, Integer stock) {
		super(precioBase, iva, stock);
	}
	
	public Double precio() {
		return super.precio() * 0.9;
	}
	
	public Double valorACobrar() {
		return this.precio();
	}
	
	

}

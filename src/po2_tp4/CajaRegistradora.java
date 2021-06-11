package po2_tp4;

import java.util.ArrayList;

public class CajaRegistradora {
	
	private Double importeTotal;
	
	public Double cobrar(ArrayList<Producto> productos) {
		this.importeTotal = 0.0;
		for (Producto producto:productos) {
			producto.bajarStock();
			this.importeTotal += producto.precio();
		}
		return importeTotal;
	}

}

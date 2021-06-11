package po2_tp4;

import java.util.ArrayList;

public class CajaRegistradora {
	
	public Double cobrar(ArrayList<Producto> productos) {
		Double importeTotal = 0.0;
		for (Producto producto:productos) {
			producto.bajarStock();
			importeTotal += producto.precio();
		}
		return importeTotal;
	}

}

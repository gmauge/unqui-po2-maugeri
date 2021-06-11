package po2_tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaRegistradoraTest {
	private CajaRegistradora caja;
	private ProductoCoopetativa prodC = new ProductoCoopetativa(100.0, 21.0, 10);
	private ProductoFabrica prodF = new ProductoFabrica(100.0, 21.0, 10);
	private ArrayList<Producto> productos;
	
	@BeforeEach
	void setUp() {
		productos = new ArrayList<Producto>();
		productos.add(prodC);
		productos.add(prodF);
		caja = new CajaRegistradora();
	}
	
	@Test
	void testCobrar() {
		assertEquals(caja.cobrar(productos), 121.0+108.9);
	}

}

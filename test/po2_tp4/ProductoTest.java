package po2_tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	private ProductoCoopetativa productoC;
	private ProductoFabrica productoF;

	@BeforeEach
	void setUp() {
		productoC = new ProductoCoopetativa(100.0, 21.0, 100);
		productoF = new ProductoFabrica(100.0, 21.0, 100);
	}
	
	@Test
	void testStock() {
		productoC.bajarStock();
		assertEquals(productoC.getStock(), 99);
		
		productoF.bajarStock();
		productoF.bajarStock();
		productoF.bajarStock();
		assertEquals(productoF.getStock(), 97);
	}
	
	@Test
	void testPrecioFabrieca() {
		assertEquals(productoF.precio(), 100*(1+0.21));
	}
	@Test
	void testPrecioCooperativa() {
		assertEquals(productoC.precio(), 100*(1+0.21)*0.9);
	}

}

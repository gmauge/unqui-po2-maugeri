package po2_tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTest {
	
	private Cuadrado cuadrado;

	@BeforeEach
	void setUp() {
		cuadrado = new Cuadrado(new Point(5,7), 6);
	}
	@Test
	void areaTest() {
		assertEquals(this.cuadrado.area(), 36);
	}
	@Test
	void perimetroTest() {
		assertEquals(this.cuadrado.perimetro(), 24);
	}
	@Test
	void verticalTest() {
		assertFalse(this.cuadrado.esVertical());
	}
	@Test
	void horozontalTest() {
		assertFalse(this.cuadrado.esHorizontal());
	}

}

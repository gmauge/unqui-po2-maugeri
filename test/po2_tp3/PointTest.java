package po2_tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	private Point punto;
	private Point punto2;
	
	@BeforeEach
	void setUp() {
		this.punto = new Point(10,20);
		this.punto2 = new Point(15,25);
	}
	
	@Test
	void getX() {
		assertEquals(punto.getX(), 10);;
	}
	@Test
	void getY() {
		assertEquals(punto.getY(), 20);;
	}
	
	@Test
	void mover() {
		punto.MoverA(5, 2);
		assertEquals(this.punto.getX(), 5);
		assertEquals(this.punto.getY(), 2);
	}
	
	@Test
	void sumarPuto() {
		Point punto3 = this.punto.SumarseA(punto2);
		assertEquals(punto3.getX(),25);
		assertEquals(punto3.getY(),45);
	}

}

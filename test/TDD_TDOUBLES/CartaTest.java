package TDD_TDOUBLES;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	Carta miCarta; //SUT
	
	//MOCK
	Carta otraCarta = mock(Carta.class);

	@BeforeEach
	void setUP() {
		// set up
		miCarta = new Carta("K", "C");
	}
	@Test
	void testCarta() {
		//validacion
		assertEquals(miCarta.getClass(), Carta.class);
	}

	@Test
	void testGetValorNumerico() {
		//validacion
		assertEquals(miCarta.getValorNumerico(), 13);
	}

	@Test
	void testGetPalo() {
		//validacion
		assertEquals(miCarta.getPalo(), "C");
	}

	@Test
	void testGetValor() {
		//validacion
		assertEquals(miCarta.getValor(), "K");
	}

	@Test
	void testEsMayorQueUn8() {
		when(otraCarta.getValorNumerico()).thenReturn(8);
		//validacion
		assertTrue(miCarta.esMayorQue(otraCarta));
	}
	
	@Test
	void testEsMayorQueUnAs() {
		when(otraCarta.getValorNumerico()).thenReturn(14);
		//validacion
		assertFalse(miCarta.esMayorQue(otraCarta));;

	}

	@Test
	void testEsMismoPaloQueCorazon() {
		when(otraCarta.getPalo()).thenReturn("C");
		//validacion
		assertTrue(miCarta.esMismoPaloQue(otraCarta));
	}

	@Test
	void testEsMismoPaloQueTrebol() {
		when(otraCarta.getPalo()).thenReturn("T");
		//validacion
		assertFalse(miCarta.esMismoPaloQue(otraCarta));
	}
	
	@Test
	void tearDown() {
		// tear down
		miCarta = null;
		otraCarta = null;
		
		assertNull(miCarta);
		assertNull(otraCarta);
	}
	
}

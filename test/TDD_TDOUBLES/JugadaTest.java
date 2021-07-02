package TDD_TDOUBLES;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {
	Jugada jugada1; //SUT
	
	Jugada jugadaMock = mock(Jugada.class);
	Carta carta1 = mock(Carta.class);
	Carta carta2 = mock(Carta.class);
	Carta carta3 = mock(Carta.class);
	Carta carta4 = mock(Carta.class);
	Carta carta5 = mock(Carta.class);
	Carta card1;
	Carta card2;
	Carta card3;
	Carta card4;
	Carta card5;
	
	@BeforeEach
	void setUP() {
		card1= new Carta("1", "P");
		card2= new Carta("1", "C");
		card3= new Carta("1", "D");
		card4= new Carta("1", "T");
		card5= new Carta("K", "P");
		jugada1 = new Jugada(card1, card2, card3, card4, card5);
	}
	

	@Test
	void testJugada() {
		assertEquals(jugada1.getClass(), Jugada.class);
	}

	@Test
	void testGetCarta1() {
		Carta cartaX = jugada1.getCarta1();
		assertEquals(cartaX.getPalo(), "P");
		assertEquals(cartaX.getValor(), "1");
		assertEquals(cartaX.getValorNumerico(), 14);
	}

	@Test
	void testVerificarManoConPoker() {
		// verificacion
		assertEquals(jugada1.verificar(), "Poker");
	}

	@Test
	void testVerificarManoSinPoker() {
		Carta card1= new Carta("1", "P");
		Carta card2= new Carta("5", "C");
		Carta card3= new Carta("10", "D");
		Carta card4= new Carta("J", "T");
		Carta card5= new Carta("K", "P");
		jugada1.setMano(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(jugada1.verificar(), "Nada");
	}
	
	@Test
	void testVerificarManoColor() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "C");
		Carta card3= new Carta("10", "C");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("K", "C");
		jugada1.setMano(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(jugada1.verificar(), "Color");
	}

	@Test
	void testVerificarManoSinColor() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "D");
		Carta card3= new Carta("10", "P");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("K", "T");
		jugada1.setMano(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(jugada1.verificar(), "Nada");
	}
	
	@Test
	void testVerificarManoTrio() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "P");
		Carta card3= new Carta("1", "D");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("1", "T");
		jugada1.setMano(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(jugada1.verificar(), "Trio");
	}

	@Test
	void testVerificarManoSinTrio() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "P");
		Carta card3= new Carta("10", "T");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("K", "D");
		jugada1.setMano(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(jugada1.verificar(), "Nada");
	}

	@Test
	void testLaMejorJugadaEntre() {
		/*
		when(jugadaMock.getCarta1()).thenReturn(carta1);
		when(jugadaMock.getCarta2()).thenReturn(carta2);
		when(jugadaMock.getCarta3()).thenReturn(carta3);
		when(jugadaMock.getCarta4()).thenReturn(carta4);
		when(jugadaMock.getCarta5()).thenReturn(carta5);
		
		when(carta1.getPalo()).thenReturn("P");
		when(carta1.getValorNumerico()).thenReturn(2);
		when(carta2.getPalo()).thenReturn("P");
		when(carta2.getValorNumerico()).thenReturn(3);
		when(carta3.getPalo()).thenReturn("D");
		when(carta3.getValorNumerico()).thenReturn(5);
		when(carta4.getPalo()).thenReturn("P");
		when(carta4.getValorNumerico()).thenReturn(8);
		when(carta5.getPalo()).thenReturn("C");
		when(carta5.getValorNumerico()).thenReturn(2);
		*/
		carta1 = new Carta("2", "P");
		carta2 = new Carta("3", "T");
		carta3 = new Carta("2", "D");
		carta4 = new Carta("5", "P");
		carta5 = new Carta("8", "C");
		jugadaMock = new Jugada(carta1, carta2, carta3, carta4, carta5);
		assertEquals(jugada1.laMejorJugadaEntre(jugadaMock), jugada1);
		

	}

}

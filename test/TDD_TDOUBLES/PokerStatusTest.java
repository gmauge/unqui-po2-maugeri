package TDD_TDOUBLES;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	private PokerStatus pokerStatus;  //SUT
	
	Jugada miJugada;
	Jugada jugadaMock = mock(Jugada.class);
	
	@BeforeEach
	void setUP() {
		// set UP
		pokerStatus = new PokerStatus(); // SUT
	
	}
	
	@Test
	void testVerificaInvocacionDeJuagadaValidar() {
		pokerStatus.verificar(jugadaMock);
		verify(jugadaMock).verificar();
	}
	
	@Test
	void testVerificarManoConPoker() {
		Carta card1= new Carta("1", "P");
		Carta card2= new Carta("1", "C");
		Carta card3= new Carta("1", "D");
		Carta card4= new Carta("1", "T");
		Carta card5= new Carta("K", "P");
		miJugada = new Jugada(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(pokerStatus.verificar(miJugada), "Poker");
	}

	@Test
	void testVerificarManoSinPoker() {
		Carta card1= new Carta("1", "P");
		Carta card2= new Carta("5", "C");
		Carta card3= new Carta("10", "D");
		Carta card4= new Carta("J", "T");
		Carta card5= new Carta("K", "P");
		miJugada = new Jugada(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(pokerStatus.verificar(miJugada), "Nada");
	}
	
	@Test
	void testVerificarManoColor() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "C");
		Carta card3= new Carta("10", "C");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("K", "C");
		miJugada = new Jugada(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(pokerStatus.verificar(miJugada), "Color");
	}

	@Test
	void testVerificarManoSinColor() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "D");
		Carta card3= new Carta("10", "P");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("K", "T");
		miJugada = new Jugada(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(pokerStatus.verificar(miJugada), "Nada");
	}
	
	@Test
	void testVerificarManoTrio() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "P");
		Carta card3= new Carta("1", "D");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("1", "T");
		miJugada = new Jugada(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(pokerStatus.verificar(miJugada), "Trio");
	}

	@Test
	void testVerificarManoSinTrio() {
		Carta card1= new Carta("1", "C");
		Carta card2= new Carta("2", "P");
		Carta card3= new Carta("10", "T");
		Carta card4= new Carta("5", "C");
		Carta card5= new Carta("K", "D");
		miJugada = new Jugada(card1, card2, card3, card4, card5);
		// verificacion
		assertEquals(pokerStatus.verificar(miJugada), "Nada");
	}
	
	@Test
	void tearDowd() {
		// tear down
		pokerStatus = null;
		miJugada = null;
		assertNull(pokerStatus);
		assertNull(miJugada);
	}
}

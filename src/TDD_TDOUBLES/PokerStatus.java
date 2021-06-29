package TDD_TDOUBLES;

public class PokerStatus {

	public String verificar(Jugada jugada) {
		return jugada.verificar();
	}
	
	public Jugada jugadaGanadoraEntre(Jugada jugada1, Jugada jugada2) {
		return jugada1.laMejorJugadaEntre(jugada2);
	}
	
}

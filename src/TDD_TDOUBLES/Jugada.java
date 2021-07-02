package TDD_TDOUBLES;

import java.util.ArrayList;
import java.util.List;

public class Jugada {
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	
	
	
	public Jugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.setCarta1(carta1);
		this.setCarta2(carta2);
		this.setCarta3(carta3);
		this.setCarta4(carta4);
		this.setCarta5(carta5);
	}
	
	public void setMano(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.setCarta1(carta1);
		this.setCarta2(carta2);
		this.setCarta3(carta3);
		this.setCarta4(carta4);
		this.setCarta5(carta5);
	}
	
	public Carta getCarta1() {
		return carta1;
	}
	public Carta getCarta2() {
		return carta2;
	}
	public Carta getCarta3() {
		return carta3;
	}
	public Carta getCarta4() {
		return carta4;
	}
	public Carta getCarta5() {
		return carta5;
	}
	private void setCarta1(Carta carta1) {
		this.carta1 = carta1;
	}
	private void setCarta2(Carta carta2) {
		this.carta2 = carta2;
	}
	private void setCarta3(Carta carta3) {
		this.carta3 = carta3;
	}
	private void setCarta4(Carta carta4) {
		this.carta4 = carta4;
	}
	private void setCarta5(Carta carta5) {
		this.carta5 = carta5;
	}
	
	public String verificar() {
		String retorno = "Nada";
		
		if (this.hayPoker()) {
			retorno = "Poker";
		} else {
			if (this.hayColor()) {
				retorno = "Color";
			} else {
				if (this.hayTrio()) {
					retorno = "Trio";
				}
			}
		}
		
		return retorno;
	}
	private boolean hayTrio() {
		List<String> muestra = new ArrayList<>();
		muestra.add(this.getCarta1().getValor()); 
		muestra.add(this.getCarta2().getValor());
		muestra.add(this.getCarta3().getValor());
		muestra.add(this.getCarta4().getValor());
		muestra.add(this.getCarta5().getValor());
		
		return     muestra.stream().filter(carta -> carta.equals(this.getCarta1().getValor())).count() == 3
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta2().getValor())).count() == 3
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta3().getValor())).count() == 3
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta4().getValor())).count() == 3
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta5().getValor())).count() == 3;
	}
	
	private Boolean hayColor() {
		String muestra = "";
		muestra = this.getCarta1().getPalo();
		muestra += this.getCarta2().getPalo();
		muestra += this.getCarta3().getPalo();
		muestra += this.getCarta4().getPalo();
		muestra += this.getCarta5().getPalo();
		
		return     muestra.equals("CCCCC") 
				|| muestra.equals("DDDDD")
				|| muestra.equals("PPPPP")
				|| muestra.equals("TTTTT");
	}
	
	private Boolean hayPoker() {
		List<String> muestra = new ArrayList<>();
		muestra.add(this.getCarta1().getValor()); 
		muestra.add(this.getCarta2().getValor());
		muestra.add(this.getCarta3().getValor());
		muestra.add(this.getCarta4().getValor());
		muestra.add(this.getCarta5().getValor());
		
		return     muestra.stream().filter(carta -> carta.equals(this.getCarta1().getValor())).count() == 4
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta2().getValor())).count() == 4
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta3().getValor())).count() == 4
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta4().getValor())).count() == 4
				|| muestra.stream().filter(carta -> carta.equals(this.getCarta5().getValor())).count() == 4;
	}
	
	public Jugada laMejorJugadaEntre(Jugada jugada2) {
		Jugada jugadaGabadora = this;
		if (this.pesoDelaJugada() < jugada2.pesoDelaJugada()) {
			jugadaGabadora = jugada2;
		}
		
		return jugadaGabadora;
	}
	
	
	private int pesoDelaJugada() {
		int retorno = 0;
		if (this.hayPoker()) {
			retorno = 300 + this.pesoPoker();
		} else {
			if (this.hayTrio()) {
				retorno = 200 + this.pesoTrio();
			} else {
				if (this.hayColor()) {
					retorno = 100 + this.pesoColor();
				} else {
					retorno = this.pesoNada();
				}
			}
		}
		return retorno;
	}
	
	
	private int pesoNada() {
		return    this.getCarta1().getValorNumerico()
				+ this.getCarta2().getValorNumerico()
				+ this.getCarta3().getValorNumerico()
				+ this.getCarta4().getValorNumerico()
				+ this.getCarta5().getValorNumerico();

	}
	private int pesoColor() {
		return this.pesoNada();
	}
	
	private int pesoTrio() {
		// TODO: pendiente de devolver elvalor correcto
		return this.pesoNada();
	}
	private int pesoPoker() {
		// TODO: pendiente de devolver elvalor correcto
		return this.pesoNada();
	}

}

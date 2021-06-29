package TDD_TDOUBLES;

public class Carta {
	private int valorNumerico;
	private String palo;
	
	
	
	public Carta(String valor, String palo) {
		this.setValorNumerico(valor);
		this.setPalo(palo);
	}
	
	public int getValorNumerico() {
		return valorNumerico;
	}
	private void setValorNumerico(String valorNumerico) {
		if (valorNumerico.equals("J")) {
			this.valorNumerico = 11;
		} else {
			if (valorNumerico.equals("Q")) {
				this.valorNumerico = 12;
			} else {
				if (valorNumerico.equals("K")) {
					this.valorNumerico = 13;
				} else {
					if (valorNumerico.equals("1")) {
						this.valorNumerico = 14;
					} else {
						this.valorNumerico = Integer.parseInt(valorNumerico);
					}
				}
			}
		}
		
	}
	public String getPalo() {
		return palo;
	}
	
	public String getValor() {
		String retorno = "";
		if (this.getValorNumerico() == 11) {
			retorno = "J";
		} else {
			if (this.getValorNumerico() == 12) {
				retorno = "Q";
			} else {
				if (this.getValorNumerico() == 13) {
					retorno = "K";
				} else {
					if (this.getValorNumerico() == 14) {
						retorno = "1";
					} else {
						retorno = Integer.toString(this.getValorNumerico());
					}
				}
			}
		}
		return retorno;
	}
	private void setPalo(String palo) {
		this.palo = palo;
	}
	
	public Boolean esMayorQue(Carta otraCarta) {
		return this.getValorNumerico() > otraCarta.getValorNumerico();
	}
	
	public Boolean esMismoPaloQue(Carta otraCarta) {
		return this.getPalo().equals(otraCarta.getPalo());
	}
	
	
}

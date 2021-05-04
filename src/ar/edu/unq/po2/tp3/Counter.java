package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

	public void addNumber(int numero) {
		this.listaNumeros.add(numero);
	}
	
	public int contarPares() {
		int cuenta = 0;
		for (int elemento:this.listaNumeros) {
			System.out.println("Elemento " + elemento);
			if (elemento % 2 == 0) {cuenta++;}
		}
		return cuenta;
	}
	
	public int cuantaImpares() {
		return this.listaNumeros.size() - this.contarPares();
	}
	
	public int cantidadDeMultiplosDe(int numero) {
		int cuenta = 0;
		for (int elemento:this.listaNumeros) {
			if (elemento % numero == 0) {cuenta++;}
		}
		return cuenta;
	}

}

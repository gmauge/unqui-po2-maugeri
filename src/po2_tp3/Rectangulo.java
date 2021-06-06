package po2_tp3;

public class Rectangulo {

	private int base;
	private int altura;
	private Point origen;
	
	//Precondicion: base y altura son mayores a cero
	public Rectangulo(Point origen, int base, int altura) {
		this.origen = origen;
		this.base = base;
		this.altura = altura;
	}
	
	public int area() {
		return this.base * this.altura;
	}
	
	public int perimetro() {
		return this.base * 2 + this.altura * 2;
	}
	
	public boolean esVertical() {
		return this.altura > this.base;
	}
	
	public boolean esHorizontal() {
		return this.base > this.altura;
	}
	
	
}

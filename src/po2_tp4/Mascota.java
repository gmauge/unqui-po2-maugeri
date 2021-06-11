package po2_tp4;

public class Mascota implements Nombrable{
	private String nombre;
	private String raza;
	
	public Mascota (String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getRaza() {
		return this.raza;
	}
	

}

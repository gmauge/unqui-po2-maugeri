package po2_tp4;

import java.time.LocalDate;

public class Persona implements Nombrable{
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int edad() {
		return LocalDate.now().getYear() -  this.getFechaNacimiento().getYear();
	}
	
	public boolean menorQue(Persona unaPersona) {
		return this.edad() < unaPersona.edad();
	}

}

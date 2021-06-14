package po2_tp6;

import java.time.LocalDate;

import po2_tp4.Persona;

public class Cliente extends Persona{
	private String apellido;
	private String direccion;
	private Double sueldoNetoMensual;
	
	public Cliente (String nombre, String apellido, LocalDate fechaNacimiento, String direccion, Double sueldoNetoMensual) {
		super(nombre, fechaNacimiento);
		this.apellido = apellido;
		this.direccion = direccion;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public String getApellido() {
		return apellido;
	}

	public Double sueldoNetoAnual() {
		return getSueldoNetoMensual() * 12;
	}

}

package po2_tp3;


import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarIntegrante(Persona miembro) {
		this.integrantes.add(miembro);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Integer promedioEdad() {
		Integer edades = 0;
		
		for (Persona persona:this.integrantes) {
			edades += persona.edad();
		}
		return edades / integrantes.size();
		
	}

	public ArrayList<Persona> getIntegrantes() {
		return this.integrantes;
	}
}

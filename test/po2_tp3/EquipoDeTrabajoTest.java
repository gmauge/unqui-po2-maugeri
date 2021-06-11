package po2_tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	Persona persona1 = new Persona("Juan", LocalDate.of(2000, 3, 20));
	Persona persona2 = new Persona("Maria", LocalDate.of(2005, 3, 20));
	Persona persona3 = new Persona("Luis", LocalDate.of(2010, 1, 20));
	Persona persona4 = new Persona("Celeste", LocalDate.of(1975, 11, 20));
	Persona persona5 = new Persona("Hugo", LocalDate.of(1980, 9, 20));
	
	EquipoDeTrabajo equipo;
	
	@BeforeEach
	void setUp() {
		equipo = new EquipoDeTrabajo("Los Mejores");
		equipo.agregarIntegrante(persona1);
		equipo.agregarIntegrante(persona2);
		equipo.agregarIntegrante(persona3);
		equipo.agregarIntegrante(persona4);
		equipo.agregarIntegrante(persona5);
	}
	
	@Test
	void testNombre() {
		assertEquals(equipo.getNombre(), "Los Mejores");
	}
	
	@Test
	void testIntegrantes() {
		assertEquals(equipo.getIntegrantes().size(), 5);
	}
	
	@Test
	void testPromedio() {
		assertEquals(equipo.promedioEdad(), (persona1.edad() + persona2.edad() + persona3.edad() + persona4.edad() + persona5.edad())/5);
	}

}

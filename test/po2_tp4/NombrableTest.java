package po2_tp4;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class NombrableTest {
	private Persona persona = new Persona("Junan", LocalDate.of(2000,1,1));
	private Mascota mascota = new Mascota("Fido", "perro");
	private ArrayList<Nombrable> col;

	@Test
	void test() {
		this.col = new ArrayList<Nombrable>();
		this.col.add(persona);
		this.col.add(mascota);
		for (Nombrable cosa:col) {
			System.out.println("Nombre:" + cosa.getNombre());
		}
	}

}

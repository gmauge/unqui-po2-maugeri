package OBSERVER;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SitioDeportesTest {
	private SitioDeportes sitio; //SUT
	
	private Partido partido1 = mock(Partido.class);
	private Servidor servidor = mock(Servidor.class);
	private AppMobile app = mock(AppMobile.class);
	
	@BeforeEach
	void setUp() {
		sitio = new SitioDeportes();
		sitio.addObservador(servidor);
		sitio.addObservador(app);
	}

	@Test
	void testNotificar() {
		sitio.addPartido(partido1);
		verify(servidor, times(1)).notificar(partido1);
		verify(servidor, times(1)).notificar(partido1);
		
	}
	
	@Test
	void tearDown() {
		sitio = null;
		assertNull(sitio);
	}

}

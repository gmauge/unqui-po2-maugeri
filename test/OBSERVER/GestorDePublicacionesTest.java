package OBSERVER;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GestorDePublicacionesTest {
	private GestorDePublicaciones gestor; //SUT
	
	private Usuario usuario1 = mock(Usuario.class);
	private Usuario usuario2 = mock(Usuario.class);
	private Publicacion publicacion = mock(Publicacion.class);


	@BeforeEach
	public void setUP() {
		gestor = GestorDePublicaciones.getInstance();
		gestor.suscribirANotificacion(usuario1);
		gestor.suscribirANotificacion(usuario2);
	}
	
	@Test
	void testAddPubicacion() {		
		gestor.addPubicacion(publicacion);
		verify(usuario1, times(1)).actualizar(publicacion);
		verify(usuario1, times(1)).actualizar(publicacion);
	}

}

package OBSERVER;

import java.util.ArrayList;
import java.util.List;

public class GestorDePublicaciones {
	static GestorDePublicaciones gestor;
	private List<Publicacion> publicaciones;
	private static List<Usuario> observadores;
	
	private GestorDePublicaciones () {
		this.publicaciones = new ArrayList<Publicacion>();
		observadores = new ArrayList<Usuario>();
	}
	
	public static GestorDePublicaciones getInstance() {
		if (gestor == null) {
			gestor = new GestorDePublicaciones();
		}
		return gestor;
	}
	
	public void addPubicacion(Publicacion unaPublicacion) {
		this.publicaciones.add(unaPublicacion);
		notificar(unaPublicacion);
	}
	
	public void suscribirANotificacion(Usuario unUsuario) {
		observadores.add(unUsuario);
	}
	
	public void notificar(Publicacion unaPublicacion) {
		observadores.forEach(usuario -> usuario.actualizar(unaPublicacion));
	}
	
}

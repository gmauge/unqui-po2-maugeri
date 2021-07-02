package OBSERVER;

public class Usuario {
	private String eMail;
	private Intereses intereses; 
	
	public Usuario(String eMail, Intereses intereses) {
		super();
		this.eMail = eMail;
		this.intereses = intereses;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Intereses getIntereses() {
		return intereses;
	}

	public void setIntereses(Intereses intereses) {
		this.intereses = intereses;
	}


	public void actualizar(Publicacion unaPublicacion) {
		if (this.getIntereses().coincideInteres(unaPublicacion)) {
			this.mandarMail();
		};
	}

	private void mandarMail() {
		// AMnda el mail
		this.geteMail();
		
	}

}

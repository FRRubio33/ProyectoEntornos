package mensajeria;

public class Mensaje {
	private int destinatario;
	private int remitente;

	// Constructor
	public Mensaje(int d, int r) {
		this.destinatario = d;
		this.remitente = r;
	}

	// Getter y setter
	public int getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(int destinatario) {
		this.destinatario = destinatario;
	}

	public int getRemitente() {
		return remitente;
	}

	public void setRemitente(int remitente) {
		this.remitente = remitente;

	}
}

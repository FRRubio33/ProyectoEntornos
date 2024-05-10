package mensajeria;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int telefono;
	private ArrayList<Mensaje> mensajesRecibidos = new ArrayList<>();
	private ArrayList<Mensaje> mensajesEnviados = new ArrayList<>();
	private ArrayList<Usuario> contactos = new ArrayList<>();

	// Constructor
	public Usuario(String n, int t) {
		this.nombre = n;
		this.telefono = t;
	}

	// Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// Methods
	public void enviarMensaje() {

	}

	public void verMensajesRecibidos() {

	}

	public void verMensajesEnviados() {
		
	}

	public void verMensajesRecibidosPor() {

	}

	public void añadirContacto() {

	}

	public void verListaContactos() {

	}

	public void guardarMensajeFichero(Mensaje m) {
		
	}
	
	public void guardarContactoFichero(Usuario u) {
		
	}

	public void buscarMensajesFichero() {
		
	}
	
	public void buscarContactosFichero() {
		
	}
}

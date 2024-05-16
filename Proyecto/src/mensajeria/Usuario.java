package mensajeria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


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
	public void crearFichero() {
		String rutaContacto = "src/Contactos.txt";
		String rutaMensaje = "src/Mensajes.txt";
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(new File(rutaContacto)));
			pw = new PrintWriter(new FileWriter(new File(rutaMensaje)));
			// Cierre del fichero
			pw.close();
		} catch (IOException e) {

			System.out.println("Error: en el metodo crear Fichero");
		}
	}

	public void enviarMensaje() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Es un mensaje de texto o una imagen?");
		String respuesta = sc.nextLine();
		if (respuesta.equalsIgnoreCase("texto")) {
			System.out.println("Dime el destinatario(numero)");
			int numDesti = sc.nextInt();
			System.out.println("Dime el contenido");
			String contenido = sc.nextLine();
			Texto m = new Texto(numDesti, this.telefono, contenido);
		} else if (respuesta.equalsIgnoreCase("imagen")) {
			System.out.println("Dime el destinatario(numero)");
			int numDesti = sc.nextInt();
			System.out.println("Dime el tamaño de la imagen");
			int tamaño = sc.nextInt();
			System.out.println("Dime el nombre del fichero");
			String nf = sc.nextLine();
			Multimedia m = new Multimedia(numDesti, this.telefono, nf, tamaño);
		}
	}

	public void verMensajesRecibidos() {

	}

	public void verMensajesEnviados() {

	}

	public void verMensajesRecibidosPor() {

	}

	public void añadirContacto(Usuario contacto) {
		contactos.add(contacto);
		this.guardarContactoFichero(contacto);
	}

	public void verListaContactos() {

	}

	public void guardarMensajeFichero(Mensaje m) {

	}

	public void guardarContactoFichero(Usuario contacto) {
		String ruta = "src/Contactos.txt";
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(new File(ruta), true));
			pw.print(contacto);

			pw.println();

			pw.close();
		} catch (IOException e) {
			System.out.println("Error: en el metodo guardarContactoFichero");
		}
	}

	public void buscarMensajesFichero() {

	}

	public void buscarContactosFichero() {

	}
}

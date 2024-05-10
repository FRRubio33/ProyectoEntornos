package mensajeria;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int telefono;
	private ArrayList <Mensaje> mensajesRecibidos= new ArrayList <>();
	private ArrayList <Mensaje> mensajesEnviados = new ArrayList <>();
	private ArrayList <Usuario> contactos = new ArrayList <>();
}

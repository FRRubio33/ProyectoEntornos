package mensajeria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Marta y Fabio
 * 
 * Clase principal de la aplicación de mensajería.
 */
public class Test {
	private static ArrayList<Usuario> usuarios = new ArrayList<>();

	/**
	 * Método principal que inicia la aplicación de mensajería.
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Añadir usuario");
			System.out.println("2. Entrar");
			System.out.println("3. Salir");
			int opcion = sc.nextInt();
			sc.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:
				añadirUsuario(sc);
				break;
			case 2:
				entrar(sc);
				break;
			case 3:
				System.out.println("Saliendo...");
				return;
			default:
				System.out.println("Opción no válida.");
			}
		}
	}

	/**
	 * Añade un nuevo usuario a la lista de usuarios.
	 *
	 */
	public static void añadirUsuario(Scanner sc) {
		System.out.println("Ingrese el número de teléfono:");
		int telefono = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		System.out.println("¿Quiere añadir un nombre? (si/no):");
		String respuesta = sc.nextLine();

		String nombre = "";
		if (respuesta.equalsIgnoreCase("si")) {
			System.out.println("Ingrese el nombre:");
			nombre = sc.nextLine();
		}

		Usuario nuevoUsuario = new Usuario(nombre, telefono);
		usuarios.add(nuevoUsuario);
		System.out.println("Usuario añadido con éxito.");
	}

	/**
	 * Permite a un usuario existente entrar en el sistema.
	 *
	 */
	public static void entrar(Scanner sc) {
		System.out.println("Ingrese el número de teléfono:");
		int telefono = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		Usuario usuario = buscarUsuario(telefono);

		if (usuario == null) {
			System.out.println("Usuario no encontrado.");
			return;
		}

		while (true) {
			System.out.println("Menú de usuario:");
			System.out.println("1. Ver contactos");
			System.out.println("2. Añadir contacto");
			System.out.println("3. Ver mensajes recibidos");
			System.out.println("4. Ver mensajes enviados");
			if (usuario instanceof Administrador) {
				System.out.println("5. Ver mensajes de otros usuarios");
			}
			System.out.println("6. Enviar mensaje");
			System.out.println("7. Salir");

			int opcion = sc.nextInt();
			sc.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:
				usuario.verListaContactos();
				break;
			case 2:
				System.out.println("Ingrese el número de teléfono del contacto:");
				int telefonoContacto = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese el nombre del contacto:");
				String nombreContacto = sc.nextLine();
				Usuario contacto = new Usuario(nombreContacto, telefonoContacto);
				usuario.añadirContacto(contacto);
				break;
			case 3:
				usuario.verMensajesRecibidos();
				break;
			case 4:
				usuario.verMensajesEnviados();
				break;
			case 5:
				if (usuario instanceof Administrador) {
					System.out.println("Ingrese el número de teléfono del usuario a ver mensajes:");
					int telefonoOtroUsuario = sc.nextInt();
					sc.nextLine();
					Usuario otroUsuario = buscarUsuario(telefonoOtroUsuario);
					if (otroUsuario != null) {
						((Administrador) usuario).verMensajesRecibidosPor(otroUsuario);
					} else {
						System.out.println("Usuario no encontrado.");
					}
				} else {
					System.out.println("Opción no válida.");
				}
				break;
			case 6:
				usuario.enviarMensaje();
				break;
			case 7:
				System.out.println("Saliendo...");
				return;
			default:
				System.out.println("Opción no válida.");
			}
		}
	}

	/**
	 * Busca un usuario en la lista de usuarios por su número de teléfono.
	 *
	 * @param telefono El número de teléfono del usuario a buscar.
	 * @return El usuario encontrado o null si no se encuentra.
	 */
	public static Usuario buscarUsuario(int telefono) {
		for (Usuario usuario : usuarios) {
			if (usuario.getTelefono() == telefono) {
				return usuario;
			}
		}
		return null;
	}
}

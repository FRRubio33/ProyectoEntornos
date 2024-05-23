package mensajeria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Marta y Fabio
 * 
 * Representa un usuario en la aplicación de mensajería.
 */
public class Usuario {
    private String nombre;
    private int telefono;
    private ArrayList<Mensaje> mensajesRecibidos = new ArrayList<>();
    private ArrayList<Mensaje> mensajesEnviados = new ArrayList<>();
    private ArrayList<Usuario> contactos = new ArrayList<>();

    /**
     * Constructor para crear un nuevo usuario.
     *
     * @param n El nombre del usuario.
     * @param t El número de teléfono del usuario.
     */
    public Usuario(String n, int t) {
        this.nombre = n;
        this.telefono = t;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de teléfono del usuario.
     *
     * @return El número de teléfono del usuario.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del usuario.
     *
     * @param telefono El número de teléfono del usuario.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Crea los ficheros necesarios para almacenar contactos y mensajes.
     */
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

    /**
     * Permite al usuario enviar un mensaje.
     * El tipo de mensaje puede ser de texto o multimedia.
     */
    public void enviarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Es un mensaje de texto o una imagen?");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("texto")) {
            System.out.println("Dime el destinatario(numero)");
            int numDesti = sc.nextInt();
            sc.nextLine();
            System.out.println("Dime el contenido");
            String contenido = sc.nextLine();
            Texto m = new Texto(numDesti, this.telefono, contenido);
            System.out.println(m.toString());
            System.out.println();
            System.out.println();
        } else if (respuesta.equalsIgnoreCase("imagen")) {
            System.out.println("Dime el destinatario(numero)");
            int numDesti = sc.nextInt();
            System.out.println("Dime el tamaño de la imagen");
            int tamaño = sc.nextInt();
            System.out.println("Dime el nombre del fichero");
            String nf = sc.nextLine();
            Multimedia m = new Multimedia(numDesti, this.telefono, nf, tamaño);
            System.out.println(m.toString());
            System.out.println();
            System.out.println();
        }
    }

    /**
     * Muestra los mensajes recibidos por el usuario.
     */
    public void verMensajesRecibidos() {
        // Implementación pendiente
    }

    /**
     * Muestra los mensajes enviados por el usuario.
     */
    public void verMensajesEnviados() {
        // Implementación pendiente
    }

    /**
     * Muestra los mensajes recibidos por otro usuario.
     *
     * @param u El usuario cuyos mensajes se desean ver.
     */
    public void verMensajesRecibidosPor(Usuario u) {
        // Implementación pendiente
    }

    /**
     * Añade un contacto a la lista de contactos del usuario.
     *
     * @param contacto El contacto a añadir.
     */
    public void añadirContacto(Usuario contacto) {
        contactos.add(contacto);
        this.guardarContactoFichero(contacto);
    }

    /**
     * Muestra la lista de contactos del usuario.
     */
    public void verListaContactos() {
        // Implementación pendiente
    }

    /**
     * Guarda un mensaje en el fichero correspondiente.
     *
     * @param m El mensaje a guardar.
     */
    public void guardarMensajeFichero(Mensaje m) {
        // Implementación pendiente
    }

    /**
     * Guarda un contacto en el fichero correspondiente.
     *
     * @param contacto El contacto a guardar.
     */
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

    /**
     * Busca mensajes en el fichero correspondiente.
     */
    public void buscarMensajesFichero() {
        // Implementación pendiente
    }

    /**
     * Busca contactos en el fichero correspondiente.
     */
    public void buscarContactosFichero() {
        // Implementación pendiente
    }
}

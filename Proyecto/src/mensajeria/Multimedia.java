package mensajeria;

public class Multimedia extends Mensaje{
	private String nombreFichero;
	private int tamaño;
	
	
	public Multimedia(int d, int r, String nf, int t) {
		super(d, r);
		this.nombreFichero=nf;
		this.tamaño=t;
	}
	
	//Getter y setter
	public String getNombreFichero() {
		return nombreFichero;
	}
	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
}

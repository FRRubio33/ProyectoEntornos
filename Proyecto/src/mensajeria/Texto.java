package mensajeria;

public class Texto extends Mensaje{
	private String contenido;

	//Constructor
	public Texto(int d, int r, String c) {
		super(d, r);
		this.contenido=c;
	}
	
	
	
	//Getter y setter
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}



	@Override
	public String toString() {
		return super.toString() + "\nContenido: "+contenido;
	}
	
	
	//Methods
	
}

package jUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import mensajeria.Usuario;

public class PruebaNombreUsuario {

	@Test
	public void testNombreUsuarioValido() {
		Usuario u = new Usuario ("Juan", 123456789);
		boolean soloLetras = true;
		
		 for (char c : u.getNombre().toCharArray()) {
	            if (!Character.isLetter(c)) {
	                soloLetras = false;
	                break;
	            }
	        }

		assertTrue(soloLetras);
	}
}

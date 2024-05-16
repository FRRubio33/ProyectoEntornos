package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import mensajeria.Usuario;

public class PruebaTelefono {

	@Test
	public void testCantidadDigitosTelefono() {
		Usuario u = new Usuario("Juan", 123456789);
		int numDigiTele = String.valueOf(u.getTelefono()).length();

		assertEquals(numDigiTele, 9);
	}

	@Test
	public void testNumerosNoNegativos() {
		Usuario u = new Usuario("Juan", 123456789);
		boolean numPos = false;

		if(u.getTelefono() > 0) {
			numPos = true;
		}
		assertTrue(numPos);
	}

	
}

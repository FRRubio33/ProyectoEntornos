package jUnit;

import static org.junit.Assert.*;
import mensajeria.Texto;

import org.junit.Test;

public class PruebaMensajeTexto {

	@Test
	public void testContenidoMensajeTextoEsString() {
        Texto mensajeTexto = new Texto(123456789, 987654321, "Hola, ¿cómo estás?");
        boolean esString = false;
        if (mensajeTexto.getContenido() instanceof String) {
        	esString = true;
        }
        
        assertTrue(esString);
    }

}

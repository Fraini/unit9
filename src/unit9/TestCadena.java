package unit9;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class TestCadena {

	@Test
	public void testSonIguales() {
		
		/*
 			 a) cadena1: entornos, cadena2: ento. Para conocer el resultado emplearemos el método
			equals de la clase String del API de Java
		 */
		
		String a = "entornos";
		String b = "nos";
		assertEquals(false,new CadenaAlumnos().sonIguales(a, b));	
		
		/*
		 *  b) cadena1: ento, cadena2: entornos. Para conocer el resultado emplearemos el método
			equals de la clase String del API de Java
		 */
		
		 a = "nos";
		 b = "entornos";
		assertEquals(false,new CadenaAlumnos().sonIguales(a, b));	
		
		/*
		 * c) cadena1: entornos, cadena2: sonrotne. Para conocer el resultado emplearemos el método
			equals de la clase String del API de Java
		 */
		
		 a = "entornos";
		 b = "sonrotne";
		assertEquals(false,new CadenaAlumnos().sonIguales(a, b));	
		
	}

}

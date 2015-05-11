package unit9;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class TestCadena {

	
	/**
	 * 	@parama a) cadena1: entornos, cadena2: ento. Para conocer el resultado emplearemos el método
		equals de la clase String del API de Java
		@return false
	 * */
	@Test
	public void testSonIgualesA() {
		
		String a = "entornos";
		String b = "nos";
		assertEquals(false,new CadenaAlumnos().sonIguales(a, b));	
			
	}
	
	/**
	 * 
   		b) cadena1: ento, cadena2: entornos. Para conocer el resultado emplearemos el método
		equals de la clase String del API de Java 
	 * */
	@Test
	public void testSonIgualesB(){
		 String a = "nos";
		 String b = "entornos";
		 assertEquals(false,new CadenaAlumnos().sonIguales(a, b));
	}
	
	/**
	 * c) cadena1: entornos, cadena2: sonrotne. Para conocer el resultado emplearemos el método
		equals de la clase String del API de Java
	 * */
	@Test
	public void testSonIngualesC(){
		 String a = "entornos";
		 String b = "sonrotne";
		assertEquals(false,new CadenaAlumnos().sonIguales(a, b));	
	}
	
	/**
	 * d)
		cadena1: entornos, cadena2: entornos. Para conocer el resultado emplearemos el método 
		equals de la clase String del API de Java
	 */
	@Test
	public void testSonIgualesD() {
		String a = "entornos";
		String b = "entornos";
		assertEquals(true,new CadenaAlumnos().sonIguales(a, b));
	}
}

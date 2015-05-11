package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEsMayor {

	/**@param Método que devuelve true si la cadena1 es mayor que la cadena2*/
	@Test
	public void testEsMayorA() {
		String a = "manolo";
		String b = "mano";
		
		assertEquals(true,new CadenaAlumnos().esMayor(a, b));
	}
	
	/**@param Método que devuelve true si la cadena1 es menor que la cadena2*/
	@Test
	public void testEsMayorB() {
		String a = "mano";
		String b = "manolo";
		
		assertEquals(false,new CadenaAlumnos().esMayor(a, b));
	}
	
	/**@param Método que devuelve false si las dos cadenas son iguales*/
	@Test
	public void testEsMayorC() {
		String a = "manolo";
		String b = "manolo";
		
		assertEquals(false,new CadenaAlumnos().esMayor(a, b));
	}

}

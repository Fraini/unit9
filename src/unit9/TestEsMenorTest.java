package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEsMenorTest {

	/** Si la primera cadena es mayor que la segunda devuelve false*/
	@Test
	public void testEsMenorA() {
		String a = "manolo";
		String b = "mano";
		assertEquals(false,new CadenaAlumnos().esMenor(a, b));
	}
	
	/** Si la cadena 2 es mayor que la cadena 1 devuelve true*/
	@Test
	public void testEsMenorB() {
		String a = "mano";
		String b = "manolo";
		assertEquals(true,new CadenaAlumnos().esMenor(a, b));
	}
	
	/** Si son iguales devuelve false*/
	@Test
	public void testEsMenorC() {
		String a = "manolo";
		String b = "manolo";
		assertEquals(false,new CadenaAlumnos().esMenor(a, b));
	}

}

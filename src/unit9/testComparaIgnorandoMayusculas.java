package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class testComparaIgnorandoMayusculas {

	//Método que prueba si las dos cadenas son iguales ignorando mayúsculas
	@Test
	public void test() {
		String a = "mAnOlo";
		String b = "manolo";
		
		assertEquals(true,new CadenaAlumnos().comparaIgnorandoMayusculas(a, b));
	}
	
	//Método que prueba si las dos cadenas son iguales ignorando mayúsculas
	@Test
	public void testB() {
		String a = "mAnOlo";
		String b = "MANOLO";
		
		assertEquals(true,new CadenaAlumnos().comparaIgnorandoMayusculas(a, b));
	}

}

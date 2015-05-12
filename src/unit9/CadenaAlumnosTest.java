package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaAlumnosTest {

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

	@Test
	public void testReemplazaTodos() {
		String a = "pera";
		String cambio = "ez";
		String regla = "a";
		assertEquals("perez",new CadenaAlumnos().reemplazaTodos(a, regla, cambio));
	}

	@Test
	public void testReemplazaPrimero() {
		String a = "beso";
		String regla = "b";
		String cambio = "p";
		assertEquals("peso",new CadenaAlumnos().reemplazaPrimero(a, regla, cambio));
	}

	@Test
	public void testQuitaEspacios() {
		String a = "                 beso                ";
		assertEquals("beso",new CadenaAlumnos().quitaEspacios(a));
	}

	@Test
	public void testConvertirMayusculas() {
		String a = "fraini";
		assertEquals("FRAINI",new CadenaAlumnos().convertirMayusculas(a));
	}

	@Test
	public void testConvertirMinusculas() {
		String a = "FRAINI";
		assertEquals("fraini",new CadenaAlumnos().convertirMinusculas(a));
	}

	@Test
	public void testLongitudCadena() {
		String a = "FRAINI";
		assertEquals(6,new CadenaAlumnos().longitudCadena(a));
	}

	@Test
	public void testEmpiezaCon() {
		String a = "FRAINI";
		String prefijo = "F";
		assertEquals(true,new CadenaAlumnos().empiezaCon(a, prefijo));
	}

	@Test
	public void testAcabaEn() {
		String a = "FRAINI";
		String sufijo = "I";
		assertEquals(true,new CadenaAlumnos().acabaEn(a, sufijo));
	}

	@Test
	public void testPosicionPrimeraCadena() {
		String a = "FRAINI";
		String letra = "F";
		assertEquals(0,new CadenaAlumnos().posicionPrimeraCadena(a, letra));
	}

	@Test
	public void testExtraerSubstringStringInt() {
		String cadena = "FRAINI";
		int pos = 1;
		assertEquals("RAINI",new CadenaAlumnos().extraerSubstring(cadena, pos));
	}

	@Test
	public void testExtraerSubstringStringIntInt() {
		String cadena = "Hola";
		int posInicial = 2;
		int posFinal = 4;
		assertEquals("la",new CadenaAlumnos().extraerSubstring(cadena, posInicial, posFinal));
	}

	@Test
	public void testConcatenaCadenas() {
		String cadena1 = "Hola";
		String cadena2 = " Mundo";
		assertEquals("Hola Mundo",new CadenaAlumnos().concatenaCadenas(cadena1, cadena2));
	}

	//Método que prueba si las dos cadenas son iguales ignorando mayúsculas
		@Test
		public void testIgnorandoMayusculas() {
			String a = "mAnOlo";
			String b = "manolo";
			
			assertEquals(true,new CadenaAlumnos().comparaIgnorandoMayusculas(a, b));
		}
		
		//Método que prueba si las dos cadenas son iguales ignorando mayúsculas
		@Test
		public void testBIgnorandoMayusculas() {
			String a = "mAnOlo";
			String b = "MANOLO";
			
			assertEquals(true,new CadenaAlumnos().comparaIgnorandoMayusculas(a, b));
		}


}

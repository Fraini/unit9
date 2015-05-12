package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaAlumnosTestFraini {

	@Test
	public void testSonIguales() {
		String cadena1 = "entornos";
		String cadena2 = "nos";
		
		boolean result_esperado = cadena1.equals(cadena2);
		boolean result_devuelto = CadenaAlumnos.sonIguales(cadena1, cadena2);
		assertEquals(result_esperado,result_devuelto );
		
		cadena1 = "nos";
		cadena2 = "entornos";
		
		 result_esperado = cadena1.equals(cadena2);
		 result_devuelto = CadenaAlumnos.sonIguales(cadena1, cadena2);
		 assertEquals(result_esperado,result_devuelto );
		 
		 cadena1 = "entornos";
		 cadena2 = "sonrotne";
		 
		 result_esperado = cadena1.equals(cadena2);
		 result_devuelto = CadenaAlumnos.sonIguales(cadena1, cadena2);
		 assertEquals(result_esperado,result_devuelto );
		 
		 cadena1 = "entornos";
		 cadena2 = "entornos";
		 
		 result_esperado = cadena1.equals(cadena2);
		 result_devuelto = CadenaAlumnos.sonIguales(cadena1, cadena2);
		 assertEquals(result_esperado,result_devuelto );
		
		}

	@Test
	public void testEsMayor() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsMenor() {
		fail("Not yet implemented");
	}

	@Test
	public void testComparaIgnorandoMayusculas() {
		fail("Not yet implemented");
	}

	@Test
	public void testReemplazaTodos() {
		fail("Not yet implemented");
	}

	@Test
	public void testReemplazaPrimero() {
		fail("Not yet implemented");
	}

	@Test
	public void testMuestraSplitLimite() {
		fail("Not yet implemented");
	}

	@Test
	public void testMuestraSplit() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuitaEspacios() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertirMayusculas() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertirMinusculas() {
		fail("Not yet implemented");
	}

	@Test
	public void testLongitudCadena() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmpiezaCon() {
		fail("Not yet implemented");
	}

	@Test
	public void testAcabaEn() {
		fail("Not yet implemented");
	}

	@Test
	public void testPosicionPrimeraCadena() {
		fail("Not yet implemented");
	}

	@Test
	public void testApareceEn() {
		fail("Not yet implemented");
	}

	@Test
	public void testExtraerSubstringStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testExtraerSubstringStringIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testConcatenaCadenas() {
		fail("Not yet implemented");
	}

	@Test
	public void testSonLetras() {
		fail("Not yet implemented");
	}

	@Test
	public void testSonLetras2() {
		fail("Not yet implemented");
	}

}

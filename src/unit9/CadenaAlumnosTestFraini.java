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
		String cadena1 = "Hola gente!";
		String cadena2 = "Gente fesss!";
		long resultado = cadena1.compareTo(cadena2);
		boolean result_esperado;
		
		if(resultado > 0)
			result_esperado = true;
		else
			result_esperado = false;
		
		boolean result_devuelto = CadenaAlumnos.esMayor(cadena1, cadena2);
		assertEquals(result_esperado,result_devuelto );
		
		cadena1 = "adios";
		cadena2 = "bye";
		resultado = cadena1.compareTo(cadena2);
		
		if(resultado > 0)
			result_esperado = true;
		else
			result_esperado = false;
		
		result_esperado = CadenaAlumnos.esMayor(cadena1, cadena2);
		assertEquals(result_esperado,result_devuelto );
		
		cadena1 = "adios";
		cadena2 = "adios";
		resultado = cadena1.compareTo(cadena2);
		
	}

	@Test
	public void testEsMenor() {
		String cadena1 = "Fraini";
		String cadena2 = "Hola java, te molaaaaaaaa!";
		long resultado = cadena1.compareTo(cadena2);
		boolean result_esperado;
		
		if(resultado < 0)
			result_esperado = true;
		else
			result_esperado = false;
		
		boolean result_devuelto = CadenaAlumnos.esMenor(cadena1, cadena2);
		assertEquals(result_esperado,result_devuelto );
		
		cadena1 = "Mundo cruel mundo malo";
		cadena2 = "Mundo cruel";
		resultado = cadena1.compareTo(cadena2);
		
		if(resultado < 0)
			result_esperado = true;
		else
			result_esperado = false;
		
		result_devuelto = CadenaAlumnos.esMenor(cadena1, cadena2);
		assertEquals(result_esperado,result_devuelto );
		
		cadena1 = "Mundo";
		cadena2 = "Mundo";
		resultado = cadena1.compareTo(cadena2);
		
		if(resultado < 0)
			result_esperado = true;
		else
			result_esperado = false;
		
		result_devuelto = CadenaAlumnos.esMenor(cadena1, cadena2);
		assertEquals(result_esperado,result_devuelto );
		
		cadena1 = "Mundo";
		cadena2 = "Mund";
		resultado = cadena1.compareTo(cadena2);
		
		if(resultado < 0)
			result_esperado = true;
		else
			result_esperado = false;
		
		result_devuelto = CadenaAlumnos.esMenor(cadena1, cadena2);
		assertEquals(result_esperado,result_devuelto );
		
		
	}

	@Test
	public void testComparaIgnorandoMayusculas() {
		String cadena1 = "Fraini";
		String cadena2 = "paco";
		
		boolean res_esperado = cadena1.equalsIgnoreCase(cadena2);
		boolean res_devuelto = CadenaAlumnos.comparaIgnorandoMayusculas(cadena1, cadena2);
		assertEquals(res_esperado,res_devuelto );
		
		cadena1 = "fraini";
		cadena2 = "frainI";
		
		res_esperado = cadena1.equalsIgnoreCase(cadena2);
		res_devuelto = CadenaAlumnos.comparaIgnorandoMayusculas(cadena1, cadena2);
		assertEquals(res_esperado,res_devuelto );
			
	}

	@Test
	public void testReemplazaTodos() {
		String cadena = "paco";
		String cambio = "a";
		String regla = "o";
		
		String res_esperado = cadena.replaceAll(regla,cambio);
		String res_devuelto = CadenaAlumnos.reemplazaTodos(cadena, regla, cambio);
		
		assertEquals(res_esperado,res_devuelto );
	}

	@Test
	public void testReemplazaPrimero() {
		String cadena = "paco";
		String cambio = "t";
		String regla = "p";
		
		String res_esperado = cadena.replaceFirst(regla, cambio);
		String res_devuelto = CadenaAlumnos.reemplazaPrimero(cadena, regla, cambio);
		
		assertEquals(res_esperado,res_devuelto );
		
	}

	@Test
	public void testQuitaEspacios() {
		String cadena = "paco";
		
		
		String res_esperado = cadena.trim();
		String res_devuelto = CadenaAlumnos.quitaEspacios(cadena);
		assertEquals(res_esperado,res_devuelto );
		
	}

	@Test
	public void testConvertirMayusculas() {
		String cadena = "fraini";
		String res_esperado = cadena.toUpperCase();
		String res_devuelto = CadenaAlumnos.convertirMayusculas(cadena);
		assertEquals(res_esperado,res_devuelto );
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

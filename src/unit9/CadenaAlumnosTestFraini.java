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
		String cadena = "FRAINI";
		String res_esperado = cadena.toLowerCase();
		String res_devuelto = CadenaAlumnos.convertirMinusculas(cadena);
		assertEquals(res_esperado,res_devuelto );
	}

	@Test
	public void testLongitudCadena() {
		String cadena = "Fraini";
		long res_esperado = cadena.length();
		
		long res_devuelto = CadenaAlumnos.longitudCadena(cadena);
		assertEquals(res_esperado,res_devuelto );
	}

	@Test
	public void testEmpiezaCon() {
		String cadena = "Fraini";
		String prefijo = "F";
		boolean res_esperado = cadena.startsWith(prefijo);
		boolean res_devuelto =  CadenaAlumnos.empiezaCon(cadena, prefijo);
		assertEquals(res_esperado,res_devuelto );
	}

	@Test
	public void testAcabaEn() {
		String cadena = "Fraini";
		String prefijo = "F";
		boolean res_esperado = cadena.endsWith(prefijo);
		boolean res_devuelto =  CadenaAlumnos.acabaEn(cadena, prefijo);
		assertEquals(res_esperado,res_devuelto );
	}

	@Test
	public void testPosicionPrimeraCadena() {
		String cadena = "Fraini";
		String buscar = "F";
		long res_esperado = cadena.indexOf(buscar);
		long res_devuelto =  CadenaAlumnos.posicionPrimeraCadena(cadena, buscar);
		assertEquals(res_esperado,res_devuelto );
	}


	@Test
	public void testExtraerSubstringStringInt() {
		String cadena = "Fraini";
		int posicionInicio = 2;
		String res_esperado = cadena.substring(posicionInicio);
		String res_devuelto =  CadenaAlumnos.extraerSubstring(cadena, posicionInicio);
		assertEquals(res_esperado,res_devuelto );
	}

	/*@Test
	public void testExtraerSubstringStringIntInt() {
		String cadena = "fraini sanchez";
		int posicionInicio = 3;
		int posicionFinal = 8;
		
		String res_esperado = cadena.substring(posicionInicio, posicionFinal);
		String res_devuelto =  CadenaAlumnos.extraerSubstring(cadena, posicionInicio, posicionFinal);
		assertEquals(res_esperado,res_devuelto );
	}*/

	@Test
	public void testConcatenaCadenas() {
		String cadena1 = "hola";
		String cadena2 = "mundo";
		String res_esperado = cadena1.concat(cadena2);
		String res_devuelto = CadenaAlumnos.concatenaCadenas(cadena1, cadena2);
		assertEquals(res_esperado,res_devuelto );
	}

}

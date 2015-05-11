package unit9;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class TestCadena {

	@Test
	public void testSonIguales() {
		String a = "entornos";
		String b = "nos";
		assertEquals(false,new CadenaAlumnos().sonIguales(a, b));	
	}

}

package unit9;

public class CadenaAlumnos {

	/**
	 * @author Fraini Sánchez
	 *
	 */
	CadenaAlumnos(){
		
	}
	//MÉTODO QUE MIRA SI DOS CADENAS SON IGUALES.
	public boolean sonIguales(String cadena1, String cadena2)
	{
		if(cadena1.equals(cadena2))
		{
			return true;
		}
		else
			return false;
	}
	
	//Método que devuelve si la primera cadena es mayor o no
	public boolean esMayor (String cadena1, String cadena2)
	{
		if(cadena1.length() > cadena2.length())
			return true;
		else
			return false;
	}
	
	//Método que devuelve si la primera cadena es menor o no
	public boolean esMenor (String cadena1, String cadena2)
	{
		if(cadena1.length() < cadena2.length())
			return true;
		else
			return false;
	}
	
	 //método que reemplaza de la cadena: cadena todos los regla/expresión que
	//hay por cambio
	public String reemplazaTodos (String cadena, String regla, String cambio)
	{
		/*char[] Caracteres = cadena.toCharArray();
		char[] Regla = regla.toCharArray();
		char[] Cambio = cambio.toCharArray();
		String aux ="";
		int i= 0;	
		for(int x= 0; x < Caracteres.length; x++)
		{
			if(Caracteres[x] == Regla[i] )
			{
				aux += Cambio[i];	
			}
		}
		System.out.println("[" + x + "] " + Caracteres[x]);
		 */
		return "";
	}
			
	public String reemplazaPrimero(String cadena, String regla, String cambio)
	{
		char[] Caracteres = cadena.toCharArray();
		char[] Regla = regla.toCharArray();
		char[] Cambio = cambio.toCharArray();
		String aux = "";
		for(int i= 0; i < Caracteres.length; i++)
		{
			if(Caracteres[i] == Regla[0])
				aux += Cambio[i];
			else
				aux +=Caracteres[i];
		}
		
		return aux;
	}
	
	public String quitaEspacios(String cadena)
	{
		char[] caracteres = cadena.toCharArray();
		String aux = "";
		
		for(int i= 0; i < caracteres.length; i++)
		{
			if(caracteres[i] != ' ')
			{
				aux += caracteres[i];
			}
		}
		return aux;
	}
	
	public String convertirMayusculas(String cadena)
	{
		char[] caracteres = cadena.toCharArray();
		String aux = "";
		
		for(int i=0; i < caracteres.length; i++)
		{
			int letraM = 'A' + (caracteres[i] - 'a');
			aux += (char) letraM;
		}
		return aux;
	}

	public String convertirMinusculas(String cadena)
	{
		char[] caracteres = cadena.toCharArray();
		String aux = "";
		
		for(int i=0; i < caracteres.length; i++)
		{
			int letraM = 'a' + (caracteres[i] - 'A');
			aux += (char) letraM;
		}
		return aux;
	}
	
	public long longitudCadena(String cadena)
	{
		char[] caracteres = cadena.toCharArray();
		
		long contador = 0;
		
		for(int i= 0; i < caracteres.length; i++)
		{
			contador++;
		}
		return contador;
	}
	
	public boolean empiezaCon(String cadena, String prefijo)
	{
		char[] cCadena = cadena.toCharArray();
		char[] cPrefijo = prefijo.toCharArray();
		if(cCadena[0] == cPrefijo[0])
			return true;
		else
			return false;
	}

	public boolean acabaEn(String cadena, String sufijo)
	{
		char[] cCadena = cadena.toCharArray();
		char[] cPrefijo = sufijo.toCharArray();
		if(cCadena[cadena.length() -1] == cPrefijo[0])
			return true;
		else
			return false;
	}
	
	
	public long posicionPrimeraCadena(String cadena, String letra)
	{
		long posicion = 0;
		char[] cCadena = cadena.toCharArray();
		char[] cLetra = letra.toCharArray();
		boolean found = false;
		int i=0;
		while( i < cCadena.length && !found)
		{
			if(cCadena[i] == cLetra[0])
			{
				found = true;
			}
			posicion++;
			i++;
		}
		
		if(found)
			return posicion;
		else
			return -1;
	}
	
	public String extraerSubstring(String cadena, int posicionInicio)
	{
		char[] cCadena = cadena.toCharArray();
		String aux = "";
		for(int i=0; i < cCadena.length; i++)
		{
			if(i > posicionInicio)
				aux += cCadena[i];
		}
		
		return aux;
	}
	
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal)
	{
		char[] cCadena = cadena.toCharArray();
		String aux = "";
		for(int i=0; i < cCadena.length; i++)
		{
			if(i > posicionInicio && i <  posicionFinal)
				aux += cCadena[i];
		}
		
		return aux;
	}
	
	public String concatenaCadenas(String cadena1, String cadena2)
	{
		String aux = cadena1 + " " +cadena2;
		return aux;
	}
	
	//Método compara ignorando mayuscula
		public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
		{
			//creo un objeto de la clase cadena para hacer uso
			//del metodo {"convertirMayusculas"}.
			CadenaAlumnos i = new CadenaAlumnos();		
			String auxCadena1 = i.convertirMayusculas(cadena1);
			String auxCadena2 = i.convertirMayusculas(cadena2);
			
			if(auxCadena1.length() > auxCadena2.length())
				return true;
			else
				return false;
		}
}
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
		if(cadena1.compareTo(cadena2)>0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Método que devuelve si la primera cadena es menor o no
	public boolean esMenor (String cadena1, String cadena2)
	{
		if(cadena1.compareTo(cadena2)< 0)
			return true;
		else
			return false;
	}
	
	 //método que reemplaza de la cadena: cadena todos los regla/expresión que
	//hay por cambio
	public String reemplazaTodos (String cadena, String regla, String cambio)
	{
		String aux = "";
		aux = cadena.replaceAll(regla, cambio);
		return aux;
	}
			
	public String reemplazaPrimero(String cadena, String regla, String cambio)
	{
		String aux = "";
		aux = cadena.replaceFirst(regla, cambio);
		
		return aux;
	}
	
	public String quitaEspacios(String cadena)
	{
		String aux = cadena.trim();
		return aux;
	}
	
	public String convertirMayusculas(String cadena)
	{
		String aux = cadena.toUpperCase();
		return aux;
	}

	public String convertirMinusculas(String cadena)
	{
		String aux = cadena.toLowerCase();
		return aux;
	}
	
	public long longitudCadena(String cadena)
	{
		long contador = cadena.length();
		return contador;
	}
	
	public boolean empiezaCon(String cadena, String prefijo)
	{
		if(cadena.startsWith(prefijo))
			return true;
		else
			return false;
	}

	public boolean acabaEn(String cadena, String sufijo)
	{
		if(cadena.endsWith(sufijo))
			return true;
		else
			return false;
	}
	
	
	public long posicionPrimeraCadena(String cadena, String letra)
	{
		
		if(cadena.indexOf(letra)> -1)
			return cadena.indexOf(letra);
		else
			return -1;
	}
	
	public String extraerSubstring(String cadena, int posicionInicio)
	{
		String aux = cadena.substring(posicionInicio);
		return aux;
	}
	
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal)
	{
		String aux = cadena.substring(posicionInicio, posicionFinal);
		
		return aux;
	}
	
	public String concatenaCadenas(String cadena1, String cadena2)
	{
		String aux = cadena1.concat(cadena2);
		return aux;
	}
	
	//Método compara ignorando mayuscula
		public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
		{
			if(cadena1.equalsIgnoreCase(cadena2))
				return true;
			else
				return false;
		}
}
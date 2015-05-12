package unit9;

import static java.lang.System.out;

/**
 *
 * @author Fraini S�nchez [bajado de rosa medina ]
 */
public class CadenaAlumnos {
    /**
     * Metodo que compara si dos cadenas son iguales
     * @param cadena1: primera cadena a comparar
     * @param cadena2: segunda cadena a comparar
     * @return devuelve true si son iguales false en caso contrario
     */
    public static boolean sonIguales(String cadena1, String cadena2){
        int l1 = cadena1.length(), l2 = cadena2.length();
        boolean iguales = true;
        
        if(l1!=l2) iguales = false; // Si ya vemos que son de diferentes tama�o no comprobamos nada m�s
        
        char [] vector1 = cadena1.toCharArray(); // Convierto el String a vector de caracteres
        char [] vector2 = cadena2.toCharArray();
        
        for(int i = 0; i < l1 && iguales; i++){
            if(vector1[i] != vector2[i])
                iguales = false;
        }
        return iguales;
    }
    /**
     * Metodo que compara si la primera cadena es mayor a la segunda
     * @param cadena1: primera cadena a comparar
     * @param cadena2: segunda cadena a comparar
     * @return devuelve true si la primera cadena es mayor a la segunda
     */
    public static boolean esMayor(String cadena1, String cadena2){
        int l1 = cadena1.length(), l2 = cadena2.length();
        boolean mayor = false;        
        char [] vector1 = cadena1.toCharArray(); // Convierto el String a vector de caracteres
        char [] vector2 = cadena2.toCharArray();
        int i = 0;
        for(; i < l1 && !mayor && i < l2; i++){
            if(vector1[i] > vector2[i])
                mayor = true;
        }
        if(i < l1 && i == l2) mayor = true;
        return mayor;
    }
    /**
     * Metodo que compara si la primera cadena es menor a la segunda
     * @param cadena1: primera cadena a comparar
     * @param cadena2: segunda cadena a comparar
     * @return devuelve true si la primera cadena es menor a la segunda
     */
    public static boolean esMenor(String cadena1, String cadena2){
        int l1 = cadena1.length(), l2 = cadena2.length();
        boolean menor = false;        
        char [] vector1 = cadena1.toCharArray(); // Convierto el String a vector de caracteres
        char [] vector2 = cadena2.toCharArray();
        int i = 0;
        for(; i < l1 && !menor && i < l2; i++){
            if(vector1[i] < vector2[i])
                menor = true;
        }
        if(i == l1 && i < l2) menor = true;
        return menor;
    }
    /**
     * Metodo que compara si son iguales ignorando may�sculas/min�sculas
     * @param cadena1: primera cadena a comparar
     * @param cadena2: segunda cadena a comparar
     * @return devuelve true si las cadenas son iguales aunque hayan may�sculas o min�sculas
     */
    public static boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
        int l1 = cadena1.length(), l2 = cadena2.length();
        boolean iguales = true;
        
        if(l1!=l2) iguales = false; // Si ya vemos que son de diferentes tama�o no comprobamos nada m�s
        
        char [] vector1 = convertirMayusculas(cadena1).toCharArray(); // Convierto el String a vector de caracteres
        char [] vector2 = convertirMayusculas(cadena2).toCharArray();
        
        for(int i = 0; i < l1 && iguales; i++){
            if(vector1[i] != vector2[i])
                iguales = false;
        }
        return iguales;
    }
    /**
     * Metodo que reemplaza todas las ocurrencias de regla en cadena por la cadena a reemplazar
     * @param cadena: primera cadena a comparar
     * @param regla: patr�n a buscar en la cadena para sustituir
     * @param cambio: cadena a sustituir en cadena si se ha encontrado la regla
     * @return devuelve la cadena reemplazada
     */
    public static String reemplazaTodos(String cadena, String regla, String cambio){
        String reemplazada = "";
        char [] cad = cadena.toCharArray();
        char [] patron = regla.toCharArray();
        char [] replacement = cambio.toCharArray();
        int [] posicion = apareceEn(cadena, regla);
        
        if(posicion[0] != - 1){ // Existe esa regla en la cadena
            int j = 0;
            for(int i = 0; i < posicion.length && j < cad.length && posicion[i] != -1; i++){
                for(; j < posicion[i]; j++){
                    reemplazada += cad[j];
                }
                j = posicion[i] + patron.length;
                
                for(int z = 0; z < replacement.length; z++){
                    reemplazada += replacement[z];
                }
            }
            for(; j < cad.length; j++){
                reemplazada += cad[j];
            }
        }
        return reemplazada;
    }
    /**
     * Metodo que reemplaza s�lo la primera ocurrencia de regla en cadena por 
     * la cadena a reemplazar
     * @param cadena: primera cadena a comparar
     * @param regla: patr�n a buscar en la cadena para sustituir
     * @param cambio: cadena a sustituir en cadena si se ha encontrado la regla
     * @return devuelve la cadena reemplazada
     */
    public static String reemplazaPrimero(String cadena, String regla, String cambio){
        String reemplazada = "";
        char [] cad = cadena.toCharArray();
        char [] replacement = cambio.toCharArray();
        int [] posicion = apareceEn(cadena, regla);
        
        if(posicion[0] != - 1){ // Existe esa regla en la cadena
            for(int i = 0; i < posicion[0]; i++){
                reemplazada += cad[i];
            }
            for(int i = 0; i < replacement.length; i++){
                reemplazada += replacement[i];
            }
            for(int i = posicion[0] + regla.length(); i < cad.length; i++){
                reemplazada += cad[i];
            }
        }        
        return reemplazada;
    }
    /**
     * M�todo que nos permite nos permite dividir una cadena en base a las 
     * ocurrencias de una expresi�n regular definida dentro. 
     * @param cadena: a buscar la expresi�n regular
     * @param regla: expresi�n a buscar
     * @param limite: tope m�ximo de subcadenas a mostrar
     */
    public static void muestraSplitLimite(String cadena, String regla, int limite){
        int posiciones [] = new int [cadena.length() - regla.length()];
        char [] cad = cadena.toCharArray();
        int j = 0;
        
        posiciones = apareceEn(cadena, regla);
        for(int i = 0; limite > 0 && i < posiciones.length && posiciones[i] != -1 ; i++){
            limite--;
            for(; j < posiciones[i] || (j < cad.length && limite == 0); j++){
                out.print(cad[j]);
            }            
            j = posiciones[i] + regla.length();
            out.println();
        }
        if(limite > 0){
            for(; j < cad.length; j++){
                out.print(cad[j]);
            }
            out.println("");
        }
            
    }
    /**
     * M�todo que nos permite nos permite dividir una cadena en base a las 
     * ocurrencias de una expresi�n regular definida dentro. 
     * @param cadena: a buscar la expresi�n regular
     * @param: regla: expresi�n a buscar
     */    
    public static void muestraSplit(String cadena, String regla){
        int posiciones [] = new int [cadena.length() - regla.length()];
        char [] cad = cadena.toCharArray();
        int j = 0;
        
        posiciones = apareceEn(cadena, regla);
        for(int i = 0; i < posiciones.length && posiciones[i] != -1; i++){
            for(; j < posiciones[i]; j++){
                out.print(cad[j]);
            }
            j = posiciones[i] + regla.length();
            out.println("");
        }
        if(j != cad.length){
            for(; j < cad.length; j++){
                out.print(cad[j]);
            }
            out.println("");
        }
    }
    /**
     * M�todo que elimina los espacios que se encuentran en una cadena
     * @param cadena:cadena a eliminar sus espacios
     * @return: cadena sin espacios
     */
    public static String quitaEspacios(String cadena){
        String sinEspacios="";
        char [] cad = cadena.toCharArray();
        
        for(int i = 0; i< cad.length; i++){
            if(cad[i] != ' ' || cad[i] != 32){
                sinEspacios += cad[i];
            }
        }
        return sinEspacios;
    }
    /**
     * M�todo que convierte todos los caracteres de una cadena a may�sculas
     * @param cadena:cadena a convertir
     * @return: cadena convertida a may�sculas
     */
    public static String convertirMayusculas(String cadena){
        String mayus = "";
        char [] cad = cadena.toCharArray();
        
        for(int i = 0; i < cad.length; i++){
            if(cad[i]>= 'a' && cad[i]<= 'z'){
                mayus += (char)(cad[i] - ('a' - 'A'));
            }
            else {
                if(cad[i] == '�'){
                    mayus += '�';
                }
                else {
                    mayus += cad[i];
                }
            }
        }
        return mayus;
    }
    /**
     * M�todo que convierte todos los caracteres de una cadena a min�sculas
     * @param cadena:cadena a convertir
     * @return: cadena convertida a min�sculas
     */    
    public static String convertirMinusculas(String cadena){
        String minus = "";
        char [] cad = cadena.toCharArray();

        for(int i = 0; i < cad.length; i++){
            if(cad[i]>= 'A' && cad[i]<= 'Z'){
                minus += (char)(cad[i] + ('a' - 'A'));
            }
            else {
                if(cad[i] == '�'){
                    minus += '�';
                }
                else {
                    minus += cad[i];
                }
            }
        }
        return minus;
    }
    /**
     * M�todo que te indica la longitud de una cadena
     * @param cadena: cadena a devolver su longitud
     * @return: longitud de la cadena
     */        
    public static long longitudCadena(String cadena) {
        int contador  = 0;
        char [] cad = cadena.toCharArray();
        for(int i = 0; i < cad.length; i++){
            contador++;
        }
        // Otra opci�n ser�a devolver directamente--> return cad.length; 
        return contador;
    }
    /**
     * M�todo que comprueba si una cadena comienza con un determinado prefijo
     * @param cadena:cadena comparar
     * @param prefijo:sufijo a buscar
     * @return: true si comienza por el prefijo false en caso contrario
     */        
    public static boolean empiezaCon(String cadena, String prefijo){
        boolean coincide = true;
        char cad[] = cadena.toCharArray();
        char buscar [] = prefijo.toCharArray();
        int i = 0;
        for(; i < cad.length && i < buscar.length && coincide; i++){
            if(cad[i] != buscar[i]){
                coincide = false;
            }
        }
        if(i < buscar.length) coincide = false;
        return coincide;
    }
    /**
     * M�todo que comprueba si una cadena acaba con un determinado sufijo
     * @param cadena: cadena comparar
     * @param sufijo: sufijo a buscar
     * @return: true si acaba por el sufijo false en caso contrario
     */            
    public static boolean acabaEn(String cadena, String sufijo){
        boolean coincide = true;
        char cad[] = cadena.toCharArray();
        char buscar [] = sufijo.toCharArray();
        int i = cad.length - buscar.length;
        if(i > 0){
            for(int j = 0; i < cad.length && coincide; i++, j++){
                if(cad[i] != buscar[j]){
                    coincide = false;
                }
            }
        }else coincide = false;
        return coincide;
    }
    /**
     * M�todo que devuelve la primera posicion donde se encuentra una 
     * determinada cadena
     * @param cadena: cadena a buscar la regla
     * @param buscar: subcadena a buscar
     * @return: devuelve la posici�n donde se encuentra la subcadena en la 
     * cadena, en el caso de no encontrarse devuelve -1
     */    
    public static long posicionPrimeraCadena(String cadena, String buscar){
        long posicion = -1;
        boolean encontrado = false;
        char [] cad = cadena.toCharArray();
        char [] search = buscar.toCharArray();
        
        for(int i = 0; !encontrado && i < cad.length; i++){
            if(cad[i] == search[0]){
                encontrado = true;
                posicion = i;
                for(int j = 1, z = i+1; j < search.length; j++, z++){
                    if(cad[z] != search[j]){
                        encontrado = false;
                    }
                }
            }
        }
        return posicion;
    }
    /**
     * M�todo extra que te devuelve un vector de enteros con todas las 
     * posiciones donde se encuentra el substring a encontrar dentro de la 
     * cadena. 
     * @param cadena: cadena a buscar el substring
     * @param buscar: substring a buscar dentro de la cadena
     * @return: vector con las posiciones, suponemos que no hay m�s ocurrencias
     * con un -1
     */
    public static int[] apareceEn(String cadena, String buscar){
        int posicion[] = new int [cadena.length()-buscar.length()];
        for(int i = 0; i < posicion.length; i++) posicion[i] = -1;
        
        boolean encontrado = false;
        char [] cad = cadena.toCharArray();
        char [] search = buscar.toCharArray();
        
        for(int i = 0, indice= 0; i < cad.length; i++){
            if(cad[i] == search[0]){
                encontrado = true;
                posicion[indice]= i;
                for(int j = 1, z = i+1; j < search.length; j++, z++){
                    if(cad[z] != search[j]){
                        encontrado = false;
                    }
                }
                if(!encontrado){
                    posicion[indice] = -1; // Si no estaba completo lo pongo a -1
                }
                else{
                    indice++;
                }
            }
        }
        return posicion;
    }
    /**
     * M�todo que extrae una cadena desde una determinada posici�n 
     * hasta el final de la cadena.
     * @param cadena: cadena a substraer
     * @param posicionInicio posicion inicial desde donde se substraer�
     * @return cadena substraida
     */
    public static String extraerSubstring(String cadena, int posicionInicio){
        String subString = "";
        char [] cad = cadena.toCharArray();
        
        for(int i = posicionInicio; i < cad.length && i < cad.length; i++){
            subString += cad[i];
        }
        return subString;
    }
    /**
     * M�todo que extrae una cadena desde una determinada posici�n 
     * hasta la posici�n final marcada.
     * @param cadena: cadena a substraer
     * @param posicionInicio posicion inicial desde donde se substraer�
     * @param posicionFinal posici�n final hasta donde se substraer�
     * @return cadena substraida
     */    
    public static String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
        String subString = "";
        char [] cad = cadena.toCharArray();
        
        for(int i = posicionInicio; i <= posicionFinal && i < cad.length; i++){
            subString += cad[i];
        }
        return subString;
    }
    /**
     * M�todo que devuevle dos cadenas unidas
     * @param cadena1: primera cadena a unir
     * @param cadena2 segunda cadena a unir
     * @return cadena unida
     */    
    public static String concatenaCadenas(String cadena1, String cadena2){
        String total = "";
        char [] cad1 = cadena1.toCharArray();
        char [] cad2 = cadena2.toCharArray();
        
        for(int i = 0; i < cad1.length; i++){
            total += cad1[i];
        }
        
        for(int i = 0; i < cad2.length; i++){
            total += cad2[i];
        }
        return total;
    }  
    /**
     * M�todo que comprueba si son letras todo lo que contiene cadena
     * Este m�todo convierte el String a cadena de caracteres e 
     * ir� recorriendo car�cter a car�cter del vector comprob�ndolo
     * @param cadena: String a comprobar si contiene s�lo letras
     * @return true si son solo letras, false si hay otro car�cter que no sea una letra
     */    
    public static boolean sonLetras(String cadena){
        char []texto = cadena.toCharArray();
        boolean esTexto = true;
        for(int i = 0; i < texto.length && esTexto; i++){
            if(!((texto[i] >= 'a' && texto[i] <= 'z') || 
                    (texto[i] >= 'A' && texto[i] <= 'Z'))){
                esTexto = false;
            }                
        }
        return esTexto;
    }
    /**
     * M�todo que comprueba si son letras todo lo que contiene cadena
     * Este m�todo ir� recorriendo car�cter a car�cter del string comprob�ndolo
     * @param cadena: String a comprobar si contiene s�lo letras
     * @return true si son solo letras, false si hay otro car�cter que no sea una letra
     */
    public static boolean sonLetras2(String cadena){
        boolean esTexto = true;
        for(int i = 0; i < cadena.length(); i++){
            if(!((cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') || 
                    (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z'))){
                esTexto = false;
            }               
        }
        return esTexto;
    }
}
   
package Logic;


/*
 * Devolver solamente las consonantes de una cadena de caracteres. Ej. Datos = dts
 */
public class devolverConsonantesCadena {

	public static void main(String[] args) {
		
		String cadena = "daniela";
		String d= consonantes(cadena);
		System.out.println(d);

	}

	
	public static String consonantes(String palabra) {
		
		String cadena = "";
		for(int i=0; i<palabra.length();i++) {
			
			if( palabra.charAt(i) != 'a' && palabra.charAt(i) != 'A' &&
				palabra.charAt(i) != 'e' && palabra.charAt(i) != 'E' &&
				palabra.charAt(i) != 'i' && palabra.charAt(i) != 'I' &&
				palabra.charAt(i) != 'o' && palabra.charAt(i) != 'O' &&
				palabra.charAt(i) != 'u' && palabra.charAt(i) != 'U')
			{
				cadena +=palabra.charAt(i);	
			}
 		}
		return cadena;
	}
	
}

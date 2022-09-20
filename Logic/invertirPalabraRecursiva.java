package Logic;

public class invertirPalabraRecursiva {

	public static void main(String[] args) {
		
		
		String palabra = "daniela";
//		String cadena= "";
//		String palabraInvertida = invertirPalabraNormal(palabra);
		String palabra2 = invertirPalabra(palabra, palabra.length()-1);
		System.out.println(palabra2);
		
		
	}

	private static String invertirPalabra(String palabra,int posicion) {
		
		if(posicion == 0) {
			return palabra.charAt(posicion) + "";
		}
		else {
			return palabra.charAt(posicion)+ invertirPalabra(palabra,posicion= posicion-1);
		}
	}
	
	public static String invertirPalabraNormal(String palabra) {
		
		String cadena = "";
		for(int i = palabra.length()-1; i>= 0; i--) {
			cadena += palabra.charAt(i);
		}
		return cadena;
	}
	
	
	

}

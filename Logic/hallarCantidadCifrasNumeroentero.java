package Logic;

public class hallarCantidadCifrasNumeroentero {

	public static void main(String[] args) {
		int cantidad = hallarNumeroCifras(1234);
		System.out.println("Cantidad de cifras es: "+cantidad);
		System.out.println(contarCifras(1234));
	}
	
	public static int hallarNumeroCifras(int numero) {	
		if(numero == 0) {
			return 0;
		}
		else {
			return hallarNumeroCifras(numero/10) + 1;
		}
	}
	
	public static int contarCifras(int numero) {
		
		if(numero<10) {
			return 1;
		}
		else {
			numero = numero/10;
			return contarCifras(numero) + 1;
		}
	}
	
}

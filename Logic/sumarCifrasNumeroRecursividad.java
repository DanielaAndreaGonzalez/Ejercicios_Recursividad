package Logic;



public class sumarCifrasNumeroRecursividad {

	public static void main(String[] args) {

		int numero = 346;
		int suma = sumarCifras(numero);
		System.out.println(suma);
		
	}

	private static int sumarCifras(int numero) {
		
		if(numero == 0) {
			return 0;
		}else {
			//System.out.println(numero);
			//numero= numero/10;	
			
			return sumarCifras(numero/10) + numero%10;
		}
	}

}

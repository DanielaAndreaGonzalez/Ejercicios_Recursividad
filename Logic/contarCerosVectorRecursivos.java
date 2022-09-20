package Logic;

public class contarCerosVectorRecursivos {

	public static void main(String[] args) {
		
		
		int vec[] = {0,0,0,0,0,0,0};
		int contarCeros = contarCeros(vec, vec.length-1);
		System.out.println(contarCeros);

	}

	private static int contarCeros(int vec[], int i) {
		
		if (i == 0) {
			if(vec[i] == 0) {
				return 1;
			}else {

				return 0;
			}
		} 
		else if(vec[i] == 0) {
			return contarCeros(vec, i-1) + 1;
		}
		else {
			return contarCeros(vec, i-1);
		}
	
	}
	
	public int cantidadCeros(int arreglo[] , int n) {
		if(n==0) {
			return 0;
		}else {
			if(arreglo[n-1] == 0) {
				return 1 + cantidadCeros(arreglo, n-1);
			}
			else {
				return cantidadCeros(arreglo, n-1);
			}
		}
	}
	
	
	
	

}

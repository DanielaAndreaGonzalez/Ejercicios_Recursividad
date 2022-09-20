package Logic;

public class sacarCantidadVecesRepetidasElemento_VectorRecursividad {

	public static void main(String[] args) {
		
		
		int vec[] = {1,3,5,3,2,2,2,2};
		int inicio=0;
		int fin=vec.length-1;
		
		int cantidad= sacarCantidadRepetida(vec,inicio,fin,5);
		System.out.println(cantidad);
		
		System.out.println(ocurrencias(vec, inicio, fin, 5));

	}

	private static int sacarCantidadRepetida(int[] vec, int inicio, int fin, int elemento) {
		
		
		if(inicio ==fin) {
			if(vec[inicio] == elemento) {
				return 1;
			}else {
				return 0;
			}	
		}else {
			if(vec[inicio] == elemento) {
				return sacarCantidadRepetida(vec, inicio +1, fin, elemento) +1 ;
			}else {
				return sacarCantidadRepetida(vec, inicio +1, fin, elemento);
			}
		}
		
	}
	
	public static int ocurrencias(int []arreglo,int inicio, int fin, int elem) {
		if(inicio == fin) {
			if(arreglo[inicio]==elem) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			if(arreglo[fin]!=elem) {
				return ocurrencias(arreglo, inicio, fin-1, elem);
			}
			else {
				return 1 + ocurrencias(arreglo, inicio, fin-1, elem);
			}
		}
	}

}

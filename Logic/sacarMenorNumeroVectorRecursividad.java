package Logic;

public class sacarMenorNumeroVectorRecursividad {

	public static void main(String[] args) {
	
	
		int vec[] = {5,2,8,10,7,8};
		int inicio =0;
		int fin = vec.length-1;
		int aux = 9999;
		int menor = sacarMenorVector(vec,inicio,fin,aux);
		
		int menor2 = sacarMenorArreglo(vec, inicio, fin);
		System.out.println(menor);
		System.out.println(menor2);
	
	}

	private static int sacarMenorVector(int[] vec, int inicio, int fin, int aux) {
		
		
		if (inicio == fin) {
			return aux;
		} else {
			if (aux > vec[inicio]) {
				aux = vec[inicio];
				return sacarMenorVector(vec, inicio + 1, fin, aux);
			} else {
				return sacarMenorVector(vec, inicio + 1, fin, aux);
			}

		}

	}
	
	
	public static int sacarMenorArreglo(int [] vec, int inicio, int fin) {
		
		if(inicio==fin) {
			return vec[inicio];
		}else {
			int menor = sacarMenorArreglo(vec,inicio+1,fin);
				if(menor<vec[inicio] ) {
					return menor;
				}else {
					return vec[inicio];
				}
			}
		}
	
	public static int numeroMenor(int [] vector, int inicio, int fin) {
		if(inicio == fin) {
			return vector[inicio];
		}else {
			int menor = numeroMenor(vector, inicio+1, fin);
			if(menor < vector[inicio]) {
				return menor;
			}else {
				return vector[inicio];
			}
		}
	}

}

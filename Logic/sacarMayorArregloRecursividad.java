package Logic;

public class sacarMayorArregloRecursividad {

	public static void main(String[] args) {
		
		
		int vec [] = {2,1,3,4,5,7,1,9,10,3};
		int indice = vec.length-1;
		int mayor = 0;
		int numeroMayor = sacarMayor(vec, indice, mayor);
		System.out.println(numeroMayor);
		
	}

	public static int sacarMayor(int vec[], int indice, int mayor) {

		if (indice == 0) 
		{
			if (vec[indice] > mayor) {
				mayor = vec[indice];
			}
			return mayor;
		} 
		else {
			if (vec[indice] > mayor) {
				mayor = vec[indice];
				return sacarMayor(vec, indice - 1, mayor);
			}

			return mayor;
		}
	}
	
	
	public int mayor(int[] arreglo, int inicio, int fin, int mayor) {
		if (inicio == fin) {
			if (arreglo[inicio] > mayor) {
				mayor = arreglo[inicio];
			}
			return mayor;
		} else {
			if (arreglo[inicio] > mayor) {
				mayor = arreglo[inicio];
			}
			return mayor(arreglo, inicio + 1, fin, mayor);
		}

	}
	
}

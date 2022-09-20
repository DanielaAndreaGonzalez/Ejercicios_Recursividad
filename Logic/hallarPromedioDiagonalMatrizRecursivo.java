package Logic;

public class hallarPromedioDiagonalMatrizRecursivo {
/*
 * Hallar recursivamente el promedio de los elementos 
 * de la diagonal de una matriz cuadrada.
 */
	public static void main(String[] args) {
			
		int matriz[][] = {
						{8,3},
						{6,5}};
		
		double contador = 0;
		double promedio = calcularPromedio(matriz, 0, 0,contador);
		System.out.println("Promedio diagonal: "+promedio);

	}
	
	
	
	public static double calcularPromedio (int [][]matriz, int i, int j,double suma) {
		
		if (i == j) {
			suma = suma + matriz[i][j];
			return  calcularPromedio(matriz, i, j+1,suma);
		}
		else if (i != matriz.length - 1 || j < matriz.length - 1) {

			if (j == matriz[i].length - 1) {
				i++;
				j = 0;
				
			} else {
				j++;
			}
			return calcularPromedio(matriz, i, j,suma) ;
		}else {
			double promedio = suma/matriz[i].length;
			return promedio;
		}
	}
	
	
	
	
	

}

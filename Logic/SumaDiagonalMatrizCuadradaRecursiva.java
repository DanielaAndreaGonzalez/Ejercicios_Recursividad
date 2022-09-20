package Logic;

public class SumaDiagonalMatrizCuadradaRecursiva {

	public static void main(String[] args) {
		
		int matriz[][] = {
						{8,3},
						{2,5}};
		
		//int suma = sumarMatrizDiagonalInvertida2(matriz, matriz.length-1, 0);
		//System.out.println("suma diagonal "+suma);
		recorrerMatriz(matriz, 0, 0);

		recorrerMatrizInversa(matriz, matriz.length-1, 0);
		
	}

	public static int sumarMatrizDiagonalInvertida2(int[][] matriz, int i, int j) {

		if (i == j) {
			return sumarMatrizDiagonal(matriz, i, j+1) + matriz[i][j];
		} 
		else if (i == - 1 || j != matriz.length - 1) {	
			
			if(j<= matriz.length-1)
			{
				j=0;
				i--;
			}
			else
			{
				j++;
				//i=matriz.length-1;
			}
			return sumarMatrizDiagonal(matriz, i, j);
		} else {
			return 0;
		}
	}
	
	
	
	
	public static int sumarMatrizDiagonal(int[][] matriz, int i, int j) {

		if (i == j) {
			return sumarMatrizDiagonal(matriz, i, j + 1) + matriz[i][j];
		} else if (i != matriz.length - 1 || j < matriz.length - 1) {

			if (j == matriz[i].length - 1) {
				i++;
				j = 0;

			} else {
				j++;
			}
			return sumarMatrizDiagonal(matriz, i, j);
		} else {
			return 0;
		}

	}
	
	public static int sumarMatrizDiagonalInvertida(int[][] matriz, int i, int j) {

		if (i == j) {
			return sumarMatrizDiagonal(matriz, i+1, j) + matriz[i][j];
		} else if (i != matriz.length - 1 || j == matriz.length - 1) {

			if (j >=0) {
				j--;
			} else {
				i++;
				j=matriz[i].length-1;
			}
			return sumarMatrizDiagonal(matriz, i, j);
		} else {
			return 0;
		}
	}
	
	
	
	
	public static void recorrerMatriz(int[][] matriz, int i, int j)
	{
		if(i==matriz.length || j==matriz.length)
		{
			System.out.println("Fin del recorrido");
		}
		else
		{
			System.out.print(" "+matriz[i][j]);
			if(j== matriz[i].length-1)
			{
				i++;
				j=0;
				System.out.println();
			}
			else
			{
				j++;
			}
			recorrerMatriz(matriz, i, j);
		}
	}
	
	public static void recorrerMatrizInversa(int[][] matriz, int i, int j)
	{
		
		if(i== -1 || j== -1)
		{
			System.out.println("Fin del recorrido");
		}
		else
		{
			System.out.print(" "+matriz[i][j]);
			if(j== matriz[i].length-1)
			{
				i--;
				j=0;
				System.out.println();
			}
			else
			{
				
				j++;
			}
			recorrerMatriz(matriz, i, j);
		}
	}
	
	
	
}
	
	
		
		
	

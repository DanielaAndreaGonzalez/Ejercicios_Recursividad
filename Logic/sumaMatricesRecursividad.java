package Logic;

public class sumaMatricesRecursividad {

	public static void main(String[] args) {
		
		double matriz[][] = {
				 {8,2,6},
				 {4,2,8},
				 {5,3,3}};
		
		double matriz2[][] = {
				 {8,2,6},
				 {4,2,8},
				 {5,3,3}};
		
		double suma = suma(matriz, matriz2, 0, 0);
		System.out.println(suma);
	}
	
	
	public static double suma(double[][] matriz,double [][] matriz2, int i, int j)
	{
		if(i == matriz.length-1 && j ==matriz.length-1)
		{
			return matriz[i][j] + matriz2[i][j];
		}
		else if(j<matriz.length-1)
		{
			return suma (matriz,matriz2,i ,j+1) + matriz[i][j] + matriz2[i][j];
		}
		else
		{
			return suma(matriz,matriz2, i+1, 0) + matriz[i][j] + matriz2[i][j];
		}
	}

}

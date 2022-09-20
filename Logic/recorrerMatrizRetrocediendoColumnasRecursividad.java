package Logic;

public class recorrerMatrizRetrocediendoColumnasRecursividad {

	public static void main(String[] args) {
		
		
		int [][] matriz = {
						  {3,2,1},
						  {2,1,7},
						  {1,8,4}};
		
		//recorrerMatriz2(matriz, 0, 0);
		
		recorrerMatrizColumnaInversa(matriz, 0, matriz[0].length-1);
	}
	
	
	
	
	public static void recorrerMatriz(int [][] matriz, int i, int j)
	{
		if(i == matriz.length || j ==0)
		{
			System.out.println("Fin del recorrido");
		}
		else
		{
			System.out.print(" "+ matriz[i][j]);
			if(j>=0)
			{
				i++;
				j = matriz.length-1;
				System.out.println();
			}
			else
			{
				j--;
			}
			recorrerMatriz(matriz, i, j);
		}
	}
	
	
	public static void recorrerMatriz2(int [][] matriz, int i, int j)
	{
		if(i == matriz.length || j==matriz.length)
		{
			System.out.println("Fin del recorrido");
		}
		else
		{
			System.out.print(" "+ matriz[i][j]);
			if(j==matriz[i].length-1)
			{
				i++;
				j = 0;
				System.out.println();
			}
			else
			{
				j++;
			}
			recorrerMatriz2(matriz, i, j);
		}
	}
	
	
	
	public static void recorrerMatrizColumnaInversa(int matriz[][],int i,int j){
		System.out.print(matriz[i][j]+" ");
		
		if(i!=matriz.length-1 || j < matriz.length-1) {
			
				if(j > 0) {
					j--;
				}else {
					i++;
					j=matriz.length-1;
					System.out.println(" ");
				}
			
			recorrerMatriz(matriz, i, j);
		}
	
	}

}

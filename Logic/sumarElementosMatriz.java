package Logic;

/*
 * Programar un algoritmo recursivo que permita sumar los elementos
e una matriz. El recorrido tiene que ser retrocediendo en columnas y 
 * avanzando en las filas. Parámetros( matriz, i, j).
 */

public class sumarElementosMatriz {

	public static void main(String[] args) {
		
		int matriz[][] = {
						 {8,2,6},
						 {4,2,8},
						 {5,3,3}};
		//sumarElementosMatriz(matriz, 0, matriz.length-1);
		//recorrerMatriz(matriz, 0, 0);
		//recorrerMatrizColumnaInversa(matriz, 0, matriz.length-1);
		System.out.println(sumarElementosMatriz(matriz, 0, matriz[0].length-1));
		
		//System.out.println(sumarMatrizNormal(matriz));
		
	//System.out.println(suma(matriz, 0, 0));
		
	}
	public static void recorrerMatriz(int matriz[][],int i,int j){
		System.out.print(matriz[i][j]+" ");
		
		if(i!=matriz.length-1 || j != matriz.length-1) {
			
				if(j == matriz[i].length-1) {
					i++;
					j=0;
					System.out.println(" ");
				}else {
					j++;
				}
			
			recorrerMatriz(matriz, i, j);
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
	
	
	public static int sumarElementosMatriz(int matriz[][] ,int i,int j) {
		//System.out.println(matriz[i][j]+" ");
		if(i !=matriz.length-1 || j > 0 ) {
			if (j > 0 ) {
				j--;
			} else {
				i++;
				j = matriz.length - 1;
				// System.out.println(" ");
			}
			return sumarElementosMatriz(matriz, i, j) + matriz[i][j];
		}
		else {
			return matriz[i][j];
		}	
	}
	
	public static double suma(double[][] matriz, int i, int j)
	{
		if(i == matriz.length-1 && j ==matriz.length-1)
		{
			return matriz[i][j];
		}
		else if(j<matriz.length-1)
		{
			return suma (matriz,i ,j+1) + matriz[i][j];
		}
		else
		{
			return suma(matriz, i+1, 0) + matriz[i][j];
		}
	}
	
	public static double suma2(double [][] arreglo, int i, int j)
	{
		if(i == arreglo.length-1 && j ==0)
		{
			return arreglo[i][j];
		}
		else if(j>=0)
		{
			return suma (arreglo,i ,j--) + arreglo[i][j];
		}
		else
		{
			return suma(arreglo, i+1, 0) + arreglo[i][j];
		}
	}
	
	
	public static int sumarMatrizNormal(int matriz[][]) {
		int suma = 0;	
		for(int i=0; i<=matriz.length-1 ; i++) {	
			for (int j =0; j<=matriz.length-1 ; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}
	

}

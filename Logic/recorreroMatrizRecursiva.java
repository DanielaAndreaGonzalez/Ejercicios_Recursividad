package Logic;

public class recorreroMatrizRecursiva {

	public static void main(String[] args) {
	
		
	int [][] matriz = {{1,3,5,7},
					   {2,4,6,8},
					           };
	
	int [][] matriz2 = new int[matriz[0].length][matriz.length];
	
	transponerMatriz(matriz, matriz2, 0, 0);
	
	

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
	
private static void transponerMatriz(int[][] matriz,int [][]matriz2, int i, int j) {
	
		if(i == matriz.length || j == matriz[i].length){
			System.out.println("Fin del recorrido");
			
		}else{
			matriz2[j][i]=matriz[i][j];
			System.out.print(""+ matriz2[j][i]);
			if(j == matriz[i].length-1){
				i++;
				j = 0;
				System.out.println("");
			}else{
				j++;
			}
			
			transponerMatriz(matriz,matriz2, i, j);
		}
	}

}

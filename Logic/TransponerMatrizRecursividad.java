package Logic;

public class TransponerMatrizRecursividad {

	public static void main(String[] args) {
		
		
		int [][]matriz = {
						{1,3,5,7},
						{2,4,6,8}};
		
		int [][]matrizT = transpuesta(matriz);
		//imprimir(matriz);
		//System.out.println("-------------------");
		//imprimir(matrizT);
		transponer(matriz, 0, 0);
		
	}
	
	public static void imprimir(int [][]matriz) {
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++)
			{
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	
	public static int[][] transpuesta(int[][] matriz)
	{
		int [][] matrizT = new int[matriz[0].length][matriz.length];
		for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
            	matrizT[j][i] = matriz[i][j];
            }
        }
		return matrizT;
	}
	
	
	public static void transponer(int matriz[][],int i,int j){
		System.out.print(matriz[j][i]+" ");
		
		if(i!=matriz.length || j != matriz.length) {
			
				if(j == matriz[i].length-1) {
					i++;
					j=0;
					System.out.println(" ");
				}else {
					System.out.println(matriz[j][i]+ " ");
					j++;
				}
			
				transponer(matriz, i, j);
		}
	
	}
	

}

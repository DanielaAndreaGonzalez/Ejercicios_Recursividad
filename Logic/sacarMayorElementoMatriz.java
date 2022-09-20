package Logic;

public class sacarMayorElementoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] matriz = {
				{1,2,3},
				{4,8,3},
				{5,3,9}};
	
		int mayor = buscarMayor(matriz, matriz.length-1, matriz[0].length-1, 0);
		System.out.println(mayor);
		
		
	}
			
	
	
	public static int buscarMayor(int [][] matriz, int i, int j,int mayor)
	{
		if(mayor<matriz[i][j])
		{
			mayor=matriz[i][j];
		}
		if(i==0 && j==0)
		{
			return mayor;
		}
		if(j>=0)
		{
			j--;
		}
		if(j<0)
		{
			j=matriz.length-1;
			i--;
		}
		return buscarMayor(matriz, i,j,mayor);
	}
	
	

}

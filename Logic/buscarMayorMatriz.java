package Logic;

public class buscarMayorMatriz {

	public static void main(String[] args) {
		
		int [][] matriz = {
						  {5,7,2},
						  {1,6,8},
						  {5,9,4}
		};
		int i = matriz.length-1;
		int j = matriz.length-1;
		int mayor = 0;
		int num = buscarMayor(matriz, i, j, mayor);
		System.out.println(num);
		
	}
	
	
	public static int buscarMayor(int [][] matriz, int i, int j, int mayor)
	{
		if(mayor<matriz[i][j])
		{
			mayor = matriz[i][j];
		}
		if(i == 0 && j ==0)
		{
			return mayor;
		}
		if(j>=0)
		{
			j--;
		}
		if(j<0)
		{
			j = matriz.length-1;
			i--;
		}
		return buscarMayor(matriz, i, j, mayor);
	}

}

package Logic;

/*
 * Matriz simétrica
 */
public class esSimetrica {

	public static void main(String[] args) {

		
		int [][] matriz = {
						   {3,5,1},
						   {2,6,1},
						   {1,5,5}};
		
		//boolean esSimetrica = simetricaNormal(matriz);
		//System.out.println(esSimetrica);
		int i= 0;
		int j=0;
		
		System.out.println(matrizSimetrica(matriz, i, j));

	}
	
	
	
	public static boolean matrizSimetrica(int [][] matriz, int i, int j)
	{
		if(i==matriz.length-1 && j== matriz.length-1)
		{
			return (matriz[i][j]==matriz[j][i]);
		}
		if(matriz[i][j] == matriz[j][i])
		{
			if(matriz.length-1==j)
			{
				return matrizSimetrica(matriz, i+1, 0);
			}
			else
			{
				return matrizSimetrica(matriz, i, j+1);
			}
		}
		else
		{
			return false;
		}
	}
	
	public static boolean simetrica(double [][] matriz,int i, int j)
	{
		if(i==matriz.length-1 && j == matriz.length-1)
		{
			return true;
		}
		else if(matriz[i][j] != matriz[j][i])
		{
			return false;
		}
		else if(j<matriz.length-1)
		{
			return simetrica(matriz, i, j+1);
		}
		else
		{
			return simetrica(matriz,i+1,0);
		}
	}
	
	
	
	
	public static boolean simetricaNormal( double [][]arreglo)
	{
		boolean aux= true;
		for(int i=0; i< arreglo.length && aux ==true;i++)
		{
			for(int j =0; j<arreglo[0].length && aux==true; j++)
			{
				if(arreglo[i][j] != arreglo[j][i] && i!=j)
				{
					aux=false;
				}
			}
		}
		return aux;
	}

}

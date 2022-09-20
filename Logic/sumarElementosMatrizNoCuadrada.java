package Logic;

public class sumarElementosMatrizNoCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double matriz[][] = {
							{3,2,1},
							{1,10}};
		
		double suma = suma(matriz, 0, 0);
		System.out.println(suma);
		
	}
	
	
	public static double suma(double[][] matriz, int i, int j)
	{
		if(i == matriz.length-1 || j ==matriz[i].length-1)
		{
			System.out.println(matriz[j+1].length-1);
			System.out.println(matriz[i].length-1);
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

}

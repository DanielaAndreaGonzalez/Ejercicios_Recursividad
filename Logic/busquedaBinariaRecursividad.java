package Logic;

/*
 * La b�squeda binaria implica que un array est� ordenado, y el algoritmo consiste en
dividir el array por su elemento medio en dos subarrays m�s peque�os, y
comparar el elemento con el del centro. Si coinciden, la b�squeda se termina. Si el
elemento es menor, debe estar (si est�) en el primer subarray, y
 */
public class busquedaBinariaRecursividad {

	public static void main(String[] args) {
		
		int []arreglo = {2,4,7,8,9,10};
		int dato = 2;
		int limInf =0;
		int limSup = arreglo.length-1;
		boolean var = busquedaBinaria(arreglo, dato, limInf, limSup);
		System.out.println(var);
		
		
	}
	
	
	public static boolean busquedaBinaria(int arreglo[] , int dato, int limInf, int limSup)
	{
		int centro = (int) ((limSup + limInf) /2);
		if(limInf > limSup)
		{
			return false;
		}
		else 
		{
			if(arreglo[centro] >dato)
			{
				return busquedaBinaria(arreglo, dato, limInf, centro-1);
			}
			else
			{
				if(arreglo[centro] <dato)
				{
					return busquedaBinaria(arreglo, dato,centro+1, limSup);
				}
				else
				{
					return true;
				}
			}
		}
			
		
		
	}

}

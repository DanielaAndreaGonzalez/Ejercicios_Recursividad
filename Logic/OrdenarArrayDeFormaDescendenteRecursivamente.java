package Logic;

public class OrdenarArrayDeFormaDescendenteRecursivamente {

	public static void main(String[] args) {
		
		int [] array = {3,2,1,4};
		int [] res = ordenarArregloAscendente(array);
		int [] res2 = ordenarArregloDescendente(array);
		int[] recur = ordenarArregloDescendenteRecursivo(array, 0,1);
		
		int [] ascedente = ordenarArregloAscendenteRecursivo(recur, 0,1);
		
		for(int i=0; i<recur.length;i++) {
			System.out.println(recur[i]);
		}
	}
	
	
	//Recursividad
	
	public static int[] ordenarArregloDescendente(int [] vec, int pos)
	{
		if(pos ==1)
		{
			return vec;
		}
		else
		{
			for (int i=0; i<pos; i++)
			{
				if(vec[pos] > vec[pos-1])
				{
					int aux = vec[pos];
					vec[pos] = vec[pos-1];
					vec[pos-1] = aux;
				}
			}
		return ordenarArregloDescendente(vec,pos-1);
		}
		
	}
	
	public static int[] ordenarArregloAscendenteRecursivo(int [] vec, int pos ,int i)
	{
		if(i<= vec.length-1)
		{
			if( pos<= vec.length-i-1)
			{
				if(vec[pos] > vec[pos+1])
				{
					int aux = vec[pos];
					vec[pos] = vec[pos+1];
					vec[pos+1] = aux;
				}
				return ordenarArregloAscendenteRecursivo(vec, pos+1, i);
			}
			else
			{
				pos=0;
				return ordenarArregloAscendenteRecursivo(vec,pos,i+1);
			}
		}
		else
		{
			return vec;
		}
		
	}
	
	public static int[] ordenarArregloDescendenteRecursivo(int [] vec, int pos ,int i)
	{
		if(i<= vec.length-1)
		{
			if( pos<= vec.length-i-1)
			{
				if(vec[pos] < vec[pos+1])
				{
					int aux = vec[pos];
					vec[pos] = vec[pos+1];
					vec[pos+1] = aux;
				}
				return ordenarArregloAscendenteRecursivo(vec, pos+1, i);
			}
			else
			{
				pos=0;
				return ordenarArregloAscendenteRecursivo(vec,pos,i+1);
			}
		}
		else
		{
			return vec;
		}
		
	}
	
	public static int[] ordenarArregloAscendente(int[] array) {	
		int aux=0;
		int aux2=0;
		
		for(int x=0; x<array.length; x++) {
			for(int i=0; i <array.length-1; i++) {
				
				aux = array[i];  //actual
				aux2 = array[i+1];   //siguiente
				
				if(aux > aux2) {
					
					array[i] = aux2;
					array[i+1] = aux;
				}
			}
		}
		return array;
	}
	
	public static int[] ordenarArregloDescendente(int[] array) {	
		int aux=0;
		int aux2=0;
		
		for(int x=0; x<array.length; x++) {
			
			for(int i=0; i <array.length-1; i++) {
				
				aux = array[i];  //actual
				aux2 = array[i+1];   //siguiente
				
				if(aux < aux2) {
					
					array[i] = aux2;
					array[i+1] = aux;
				}
			}
		}
		return array;
	}
	
	
	
	

}

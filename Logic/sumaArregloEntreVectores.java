package Logic;

public class sumaArregloEntreVectores {

	public static void main(String[] args) {
		
		
		int[] vec = {3,2,1,9};
		int [] vec2 = {4,10,8,7};
		//int suma = sumarEntreVectores(vec, vec2, 0, 0);
		//System.out.println(suma);
		
		int res[] = new int[vec.length-1];
		int vec3[] = vectores(vec, vec2, 0, res);
		for(int i=0;i <=vec3.length-1;i++)
		{
			System.out.println(vec3[i]);
		}
	}
	
	
	
	public static int sumarEntreVectores(int [] vec1, int []vec2, int pos,int suma)
	{
		
		if(pos == vec1.length-1)
		{
			return suma+vec1[pos]+vec2[pos];
		}
		else
		{
			suma += vec1[pos] + vec2[pos];
			return sumarEntreVectores(vec1, vec2, pos+1, suma);
		}	
	}
	
	public static int[] vectores(int [] vec1, int [] vec2, int pos, int res[])
	{
		
		if(pos == vec1.length-1)
		{
			return res;
		}
		else
		{
			int suma =vec1[pos] + vec2[pos];
			res[pos] = suma;
			return vectores(vec1, vec2, pos+1, res);
		}		
	}
	
	

}

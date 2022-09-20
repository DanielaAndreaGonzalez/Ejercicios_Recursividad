package Logic;

public class esPalabraPalindromaRecursividad {

	public static void main(String[] args) {
		
		String palabra = "daniela";
		int i=0;
		int j= palabra.length()-1;
		System.out.println(palindroma(palabra,i,j)==true?" es palindroma": "no es palindroma");

	}
	
	
	public static boolean palindroma(String palabra, int i, int j)
	{
		if(palabra.charAt(i) != palabra.charAt(j)) {
			return false;
		}
		if(i==j)
		{
			return true;
		}
		if(j==i+1 && palabra.charAt(i)==palabra.charAt(j))
		{
			return true;
		}
		else
		{
			return palindroma(palabra, i+1, j-1);
		}
	}

}

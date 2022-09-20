package Logic;

public class sacarMCDrecursividad {

	public static void main(String[] args) {
		
		int mcd = MCD(26, 6);
		System.out.println(mcd);
		
		

	}
	
	
	public static int MCD(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		else
		{
			return MCD(b,a %b);
		}
	}

}

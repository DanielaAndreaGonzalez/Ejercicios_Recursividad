package Logic;

public class sacarModuloRecursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int modulo = modulo(58, 12);
		System.out.println(modulo);
		
	}

	
	public static int modulo(int a, int b)
	{
		
		if (a == 0 && b == 0) {
			return 0;
		} else {
			if (a < b) {
				return a;
			} else {
				return modulo(a - b, b);
			}
		}

	}
}

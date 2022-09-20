package Logic;

public class multiplicacionRecursiva {

	public static void main(String[] args) {
		
		int multiplicacion = multiplicacion(3, 5);
		System.out.println(multiplicacion);

	}
	
	
	public static int multiplicacion(int m, int n) {
		if (n == 0) {
			return 0;
		} else {
			if (n == 1) {
				return m;
			} else {
				if (n % 2 == 0) {
					return multiplicacion(m + m, n / 2);
				} else {
					return multiplicacion(m + m, n / 2) + m;
				}
			}
		}
	}

}

package Logic;


/*
 * Sacar Factorial
 */
public class factorialRecursivo {

	public static void main(String[] args) {
		
		int factorial = factorial(5);
		System.out.println(factorial);

	}
	
	
	public static int factorial (int numero) {
		
		if(numero == 1 || numero == 0) {
			return 1;
		}
		else 
		{
		return numero * factorial(numero-1);
		}
	}

}

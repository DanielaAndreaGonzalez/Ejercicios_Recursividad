/**
 * 
 */
package Logic;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Fibonacci_Recursivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int fibonacciNumber =obtenerFibonacci(2);
		System.out.println(fibonacciNumber);
		

	}
	
	
	
	public static int obtenerFibonacci(int numero) {
		
		if(numero ==0) {
			
			return 0;
			
		}else if(numero == 1) {
			
			return 1;
			
		}else {
			
			return obtenerFibonacci(numero-1) +obtenerFibonacci(numero-2);
		}	
	}
	
	public static int fibonacci(int numero) {
		if(numero == 0) {
			return 0;
		}else {
			if(numero == 1 || numero == 2) {
				return 1;
			}else {
				return fibonacci(numero-2) + fibonacci(numero-1);
			}
		}
	}
	
	

}

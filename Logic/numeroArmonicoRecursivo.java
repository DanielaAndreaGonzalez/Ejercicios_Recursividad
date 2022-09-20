package Logic;

public class numeroArmonicoRecursivo {

	public static void main(String[] args) {
		
		double numero = numerosArmonicos(4);
		System.out.println(numero);

	}
	
	
	public static double numerosArmonicos(double n)
	{
		if (n == 0.0) {
			return 0.0;
		} else {
			if (n == 1.0) {
				return 1.0;
			} else {
				return (1.0 / n) + numerosArmonicos(n - 1.0);
			}
		}
	}

}

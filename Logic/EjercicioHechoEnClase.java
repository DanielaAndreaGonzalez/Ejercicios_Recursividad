package Logic;

public class EjercicioHechoEnClase {

	public static void main(String[] args) {
		
		int operar = funcionA()+funcionB();
		System.out.println(operar);
		
	}
	
	
	public static int funcionA() {
		
		int valor= 5;
		System.out.println(valor);
		return valor;
	}
	
	public static int funcionB() {
		int valor = 10;
		System.out.println(valor);
		return valor;
	}

}

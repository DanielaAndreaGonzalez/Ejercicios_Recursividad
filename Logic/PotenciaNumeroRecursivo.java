package Logic;

public class PotenciaNumeroRecursivo {

	public static void main(String[] args) {
		
		int base = 4;
		int potencia = 2;
		//int calculo = calcularPotenciaNormal(base,potencia);
		int calculo = calcularPotenciaRecursividad(base, potencia);
		System.out.println(calculo);
	}
	private static int calcularPotenciaRecursividad(int base, int potencia) {
		
		if (potencia ==0) {
			return 1;
		}if(base == 0) {
			return 1;
		}
		else {
			//potencia=potencia-1;
			return base * calcularPotenciaNormal(base, potencia-1);
		}
		
	}

	private static int calcularPotenciaNormal(int base, int potencia) {
		int resultado =1;
		for(int i=0;i<potencia;i++) {
			resultado *=base; 
		}
		return resultado;
	}

}

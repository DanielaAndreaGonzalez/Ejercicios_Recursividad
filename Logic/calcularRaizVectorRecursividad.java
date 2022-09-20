package Logic;

public class calcularRaizVectorRecursividad {

	public static void main(String[] args) {
		
		
		int vector[] = {3,2,1,4};
		double cuadrados = 0;
		System.out.println(sacarRaiz(vector, 0, vector.length-1,cuadrados));
		
		
	}
	
	public static double sacarRaiz(int [] vector,int inicio, int fin,double cuadrados) {
		
		
		if (inicio == fin) {
			cuadrados += Math.pow(vector[inicio], 2);
			double raiz = Math.sqrt(cuadrados);
			return raiz;
			
		} else {
			cuadrados += Math.pow(vector[inicio], 2);
			return sacarRaiz(vector, inicio+1, fin,cuadrados) ;
			
		}
	}

}

package Logic;

public class buscarElementoArray {

	public static void main(String[] args) {

	int vec[] = {2,3,4,5,2};
	int elemento = buscarElemento(vec,0,vec.length-1,6);
	System.out.println(elemento);
	
	}

	private static int buscarElemento(int[] vec, int inicio, int fin, int elemento) {
		
		if(inicio ==fin) {
			return 0;
		}else {
			if(vec[inicio] == elemento) {
				return elemento;
			}
			else {
				return buscarElemento(vec, inicio+1, fin, elemento);
			}
		}
		
	}

}

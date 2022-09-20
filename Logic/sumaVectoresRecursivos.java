package Logic;

public class sumaVectoresRecursivos {

	public static void main(String[] args) {
		
		int vec[] = {1,6,9,8};
		System.out.println(sumaVectorRecursivo(vec,vec.length-1));
		
		System.out.println(sumaArreglo(vec, vec.length-1));
	}
	
	
	public static int sumaVectorRecursivo(int vec[] , int tamanio) {
		
		if(tamanio == 0) {
			return vec[0];
		}else {
		return vec[tamanio] + sumaVectorRecursivo(vec, tamanio-1);
		}
	}
	
	public static int sumaArreglo(int []vec, int n) {
		
		if(n==1) {
			return vec[0];
		}else {
			return vec[n-1] + sumaArreglo(vec, n-1);
		}
	}
	
	
	

}

/**
 * 
 */
package Logic;

/**
 * @author GonzalezHDanielaA
 *
 */
public class recorrerVectorRecursivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int vec[] = {4,3,6,5,1};
		
		int recorrer [] = recorrerArra(vec,0,vec.length-1);
		
		for(int i=0; i<recorrer.length;i++) {
			System.out.println(recorrer[i]);
		}
		

	}

	private static int[] recorrerArra(int[] vec, int i, int j) {
		
		if(i==j) {
			return vec;
		}else {
			return recorrerArra(vec, i+1, j);
		}
		
	}
	
	
	
	
	
	
	

}

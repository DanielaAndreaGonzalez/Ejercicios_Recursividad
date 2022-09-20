/**
 * 
 */
package Logic;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		devolverNumeros(8);
	       
	      

	}
	
	public static int [] devolverNumeros(int num){
        int vect[] = new int[num];
        int suma=1;
        int num1 = 0;
        int num2 = 1;
         
        System.out.println(num1);
         
         for(int i=1; i<vect.length;i++){
             System.out.println(suma);
             vect[i] = suma; 
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
           
         }
        return vect;
    }
	

}

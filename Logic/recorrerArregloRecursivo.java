/**
 * 
 */
package Logic;

import java.util.Scanner;

/**
 * @author GonzalezHDanielaA
 *
 */
public class recorrerArregloRecursivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el tama�o del vector");
		int cantidad = dato.nextInt();
		System.out.println("Hola");
		int [] vec = new int[cantidad];
		
		for(int i=0; i <vec.length;i++) {
			
			System.out.println("Digite un n�mero");
			vec[i] = dato.nextInt();
			recorreroArregloRecursivo(vec, i);
		}
	}
	
	public static void recorreroArregloRecursivo(int vec[] , int posicion)
	{
		if(posicion != vec.length) {
			System.out.println(vec[posicion]);
			recorreroArregloRecursivo(vec, posicion + 1);
			
		}
	}
	
	

}

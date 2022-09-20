package Logic;

import java.util.Scanner;

/*
 * Escribir una función que reciba 2 enteros n y b y devuelva true si n es potencia de
b. Ej. 16 es potencia de 2, 64 es potencia de 4, 50 no es potencia de 10.
 */

public class EsPotenciaRecursividad {

	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la potencia");
		int numero =dato .nextInt();
		System.out.println("Ingrese la base");
		int base = dato.nextInt();
		
		boolean var = esPotencia(numero, base);
		if(var) {
			System.out.println(numero + " es potencia de "+ base);
		}else {
			System.out.println(numero + " no es potencia de"+base);
		}

		
	}
	
	public static boolean esPotencia(int n, int b) {
		
		boolean bandera = false;
		if(n  == 1) {
			return true;
		}else if(n == 0) {
			return false;
		}
		else {
			n = n /b;
			return esPotencia(n, b);	
		}
	}
	

}

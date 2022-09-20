package Logic;

import java.util.Scanner;

/**
 * 19. Determinar si un n�mero es primo.
 * @author GonzalezHDanielaA
 *
 */
public class determinarNumeroPrimoRecursividad {

	public static void main(String[] args) {
		
		boolean es = determinarNumeroPrimoNormal(4);
		//System.out.println(es);
		Scanner dato = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int numero = dato.nextInt();
		System.out.printf("%n El n�mero %d",numero);
		System.out.println(esPrimoRecursivo(numero, 2)?" Es un n�mero primo":" No es un n�mero primo");
	}
	
	public static boolean esPrimoRecursivo(int numero,int divisor) {
		
		if(numero/2 <divisor) {
			return true;
		}else {
			if(numero%divisor==0) {
				return false;
			}else {
				return esPrimoRecursivo(numero,divisor+1);
			}
		}
		
	}
	public static boolean determinarNumeroPrimoNormal(int numero) {
		
		boolean esPrimo = true;
		for(int i = 1; i <numero/2; i++) {	
			if(numero %i == 0) {
				return false;
			}	
		}
		return esPrimo;
	}

}

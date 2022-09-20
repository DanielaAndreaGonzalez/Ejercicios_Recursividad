package Logic;


/*
 * Retornar el número de la fila de la matriz cuya suma de todos sus elementos sea
mayor.
 */
public class retornarNumeroFilaSumaelementosMatriz {

	public static void main(String[] args) {
		
		
		int [][] matriz = {
						  {1,3,2},
						  {2,6,9}};
		int suma = 0;
		//retornarNumeroFilaMatriz(matriz, 0, 0, suma);
		int rest = retornarNumeroFilaMatriz(matriz, 0, 0, suma, 0, 0);		
		System.out.println( "La coumna cuya suma con mayor valor es: " + rest);
		
		
	}
	
	
	/* El parametro sumaFilaActual guarda la suma de cada una de las filas
	 * El parametro sumaFilaAnt guarda la suma de la anterior interacion o sumaFilaActual -1
	 * Resultado es la columna en la que se culpla la condicion
	 * */	
	public static int retornarNumeroFilaMatriz(int [][] matriz, int i, int j,int sumaFilaActual, int sumaFilaAnt,int resultado) {
		
		sumaFilaActual = sumaFilaActual+matriz[i][j];
				
		if (i != matriz.length - 1 || j < matriz[i].length - 1) {
			if (j == matriz[i].length - 1) {
				
				System.out.println(" Suma anterior: " +  sumaFilaAnt );
				System.out.println(" Suma actual: " +  sumaFilaActual );
				System.out.println(" Columna: " + i);
				System.out.println("----------------------------------");
				if (sumaFilaActual > sumaFilaAnt) {
					resultado = i;
					sumaFilaAnt = sumaFilaActual;
				}								
				sumaFilaActual = 0;
				
				i++;
				j = 0;								
			} else {				
				j++;			
			}
			return retornarNumeroFilaMatriz(matriz, i, j, sumaFilaActual, sumaFilaAnt, resultado);
		} else {
			System.out.println(" Suma anterior: " +  sumaFilaAnt );
			System.out.println(" Suma actual: " +  sumaFilaActual );
			System.out.println(" Columna: " + i);
			System.out.println("----------------------------------");
			if (sumaFilaActual > sumaFilaAnt) {
				resultado = i;
			}
			return resultado;
		}			
	}
	
	
	public static int retornarNumeroFilaMatriz(int [][] matriz, int i, int j,int suma) {
		
		
		if (i != matriz.length - 1 || j < matriz[i].length - 1) {
			if (j == matriz[i].length - 1) {
				i++;
				j = 0;
				System.out.println(matriz[i][j] + " -i"+i);
			} else {
				j++;
				System.out.println(matriz[i][j]+ " -j"+j);
			}
			return retornarNumeroFilaMatriz(matriz, i, j, suma);
		} else {
			return suma;
		}
	}
	
	

}

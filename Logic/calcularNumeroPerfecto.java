package Logic;


/*
 * Haga un programa que diga si un número es o no perfecto. Un número N es
perfecto si la suma de sus divisores (excluido el propio N) es N. por ejemplo 28 es
perfecto, pues sus divisores (excluido el 28) son 1,2,4,7 y 14 su suma da 28.
 */
public class calcularNumeroPerfecto {

	public static void main(String[] args) {
		
		boolean perfecto = esNumeroPerfecto(496);
		System.out.println(perfecto);
		
		int num = 28;
		int pos = num-1;
		System.out.println(numeroPerfecto(num,pos));
		System.out.println(numeroPerfecto2(num, pos,0)==true?" es perfecto":" No  es perfecto");
	}
	
	public static int numeroPerfecto(int numero,int pos)
	{
		if(pos <=1)
		{
			return 1;
		}
		else
		{
			int suma = 0;
			if(numero%pos == 0) {
				suma +=pos;
			}
			return numeroPerfecto(numero,pos-1) + suma;
		}
		
	}
	
	public static boolean numeroPerfecto2(int numero,int pos,int suma)
	{
		if (suma == numero) {
			return true;
		}
		else if(pos == 0)
		{
			return false;
		}
		else 
		{ 
			if (numero % pos == 0) 
			{
				suma += pos;
				return numeroPerfecto2(numero, pos-1,suma);
			} 
			if(pos < numero)
			{
				return numeroPerfecto2(numero, pos-1, suma);
			}
			else
			{
				return false;
			}
			
		}
		
	}
	
	public static boolean esNumeroPerfecto(double numero)
	{
		boolean var = false;
		int acumulado = 0;
		for(int i=1; i<numero; i++) {
			if(numero%i==0)
			{
				acumulado += i;
			}
			if(acumulado ==numero)
			{
				var = true;	
			}
		}
		return var;
	}

	
	
	
}

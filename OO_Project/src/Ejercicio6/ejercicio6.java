package Ejercicio6;

import java.util.Scanner;

public class ejercicio6 
	{
		static Scanner num = new Scanner(System.in);
		public static void main(String[] args) 
			{
				
				int numero = Integer.parseInt(num.nextLine());
				
				while (numero != 0);
				{ 			
					System.out.println("ingrese el numero");
					Entero e = new Entero(numero);
					System.out.println("El numero ingresado es: "+e.getNumero());
					System.out.println("El cuadrado de " + e.getNumero() + " es: " +e.cuadrado());
					System.out.println("El numero ingresado es impar? " + e.esPar() );
					System.out.println("El numero de manera factorial da: " + e.factorial() );
					System.out.println("El numero ingresado es primo?  " + e.isPrimo() );
					numero = Integer.parseInt(num.nextLine());
				}
				num.close();
			}
	}


public class Entero {
	private int numero;
	//constructor de la clase Enteros
	public Entero(int numero)
		{
			super();
			this.numero = numero;
		}
		public int getNumero() {
			return numero;
		}
	public void setNumero(int numero) 
		{
			this.numero = numero;
		}
	//calcula el cuadrado de n
	public long cuadrado()
		{
			return (numero*numero);
		}
	public boolean esPar()
		{
			if ((numero%2) == 0)
			{
				return (true);
			}
			else
			{
				return(false);
			}
		}
	public int factorial()
		{
			int i = 0;
			int total = 0;
				while(i <= numero)
				{
					total = (i+total);
					i++;
				}
			return (total);
		}
	public boolean isPrimo()
		{
			if ((numero%2) == 0 && ((numero%3)==0) && ((numero%5)==0) && ((numero%numero)==0) && ((numero%1)==0))
			{
				return (true);
			}
			else
			{
				return (false);
			}
		}
}
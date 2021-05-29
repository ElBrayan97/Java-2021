package Ejercicio6;

public class entero {
	private int numero;
	
	public entero(int numero) //constructor de la clase Enteros
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
					total = (i*total);
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
package tp2;

 class Entero 
{
	private int numero;

	public Entero(int numero)
	{
		super();
		this.numero = numero;
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}


	public long cuadrado() {
		return numero * numero;
	}
	
	public boolean ParImpar(int num) {
		
		if (num % 2 == 0){
			return true;	
		}
		else{
			return false;
		}
		
	}
	public int Factorial(int num)
	{
		if (num==0) { 
			return (1);
		}else { 
			return (numero*Factorial(num-1));
		}
	}
	
}

	public class Ej6 {
		public static void main(String[] args) {
			int a = 5; 
			Entero e = new Entero(a);
			System.out.println("El numero ingresado es: " + e.getNumero());
			System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());
			
			if (e.ParImpar(e.getNumero()) == true) 
			{
				System.out.println("El numero "+e+" es par");
			}
			else
				{	
					System.out.println("El numero "+e+" es impar");
				}
			System.out.println("El Factorial de "+a+" es "+e.Factorial(a));
			
		}
		
}
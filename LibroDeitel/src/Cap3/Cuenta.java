package Cap3;

public class Cuenta {
	
	private double saldo;

	public Cuenta(double saldoInicial) //Funcion Constructor (permite la creacion de un objeto con valores de variables personalizados)
	{
		if (saldoInicial>0.0);
			saldo = saldoInicial;	
	}
	
	public void abonar(double monto) //Funcion (suma monto a la existencia de la cuenta)
	{
		saldo = saldo + monto;
	}
	
	public double getSaldo() // Getter del saldo (devuelve el contenido de "saldo")
	{
		return saldo;
	}
	
}

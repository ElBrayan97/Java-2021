package Cap3;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(50.00);
		Cuenta cuenta2 = new Cuenta(-7.53);
		
		
		System.out.printf("Saldo de Cuenta 1: $%.2f\n",cuenta1.getSaldo());
		
		System.out.printf("Saldo de Cuenta 2: $%.2f\n\n",cuenta2.getSaldo());

	}

}

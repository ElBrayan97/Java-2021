package tp5b;

import java.util.Scanner;

public class Test {	
	public static void main(String[] args) 
	{
		Tablero mapa = new Tablero(); 		// creacion de la matriz/mapa
		int intentos = 24;
		for (int i=0;i<=intentos;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese una posicion 0-7");
			int x = sc.nextInt();
			System.out.println("Ingrese una posicion A-H");
			String y = sc.next();
			boolean encontrado = mapa.searchBoat(x, y);
			if (encontrado){
				System.out.println("LE DISTE A UN BOTE Y SE HA HUNDIDO");
			}else {
				System.out.println("DISPARO FALLIDO... TE QUEDAN "+ (intentos-i) +" INTENTOS");
			}
		}
	}
}
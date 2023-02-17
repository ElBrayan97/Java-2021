package tp5b;

import java.util.Scanner;

public class Test {	
	public static void main(String[] args) 
	{
		Tablero mapa = new Tablero(); 		// creacion d ela matriz/mapa
		mapa.Inicializar();					//carga de laas posiciones que tienen barcos
		for (int i=0;i>=24;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese una posicion 0-7");
			int x = sc.nextInt();
			System.out.println("Ingrese una posicion A-H");
			String y = sc.next();
			sc.close();
			
			mapa.searchBoat(aux, y)
			
			
		}
	}
}
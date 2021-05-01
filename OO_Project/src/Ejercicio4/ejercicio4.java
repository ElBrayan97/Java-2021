package Ejercicio4;

public class ejercicio4 {
	
	public static int[] numeros = {4, 2, 3, 8, 1};
	
 	public static void main(String[] args){
		
		int tam = numeros.length;
		int i = 0;
		int mayor = 0;
		int sum = 0;
		
		System.out.println("La cantidad de posiciones de este vector es " +i);
		
		while (i < tam){
			int num = numeros[i];
				if (mayor < num) {
					mayor = num;
				}
			 
			sum += num;
			i++;
		}
		System.out.println("Promedio: "+ (sum/tam));
		System.out.println("Mayor : "+ mayor);
	}
}
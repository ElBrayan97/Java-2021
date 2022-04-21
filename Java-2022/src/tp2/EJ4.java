package tp2;

import java.util.Arrays;

public class EJ4 {
	
 	public static void main(String[] args){
		int[] numeros = {4, 2, 3, 8, 1};
		
		Arrays.sort(numeros);
		
		int tam = numeros.length;
		int i = 0;
		int mayor = 0;
		int sum = 0;
		
		System.out.println("La cantidad de posiciones de este vector es " +tam);
		
		System.out.println("Array Ordenado creciente: ");
		
		while (i < tam){
			int num = numeros[i];
				if (mayor < num) 
					mayor = num;
			System.out.println(num);
			sum += num;
			i++;
		}
		System.out.println("Promedio: "+ (sum/tam));
		System.out.println("Mayor : "+ mayor);
		
		System.out.println("Array Ordenado Decreciente: ");

		for (int j = numeros.length-1; j>=0; j--){
			System.out.println(numeros[j]);
			
		}
	}
}

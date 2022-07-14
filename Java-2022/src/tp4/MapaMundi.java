package tp4;

import java.util.Scanner;
import java.util.List;

public class MapaMundi {

	public static void main(String[] args) {
		
		MapaMundial mapaMundial = new MapaMundial();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre de un continente para conocer sus paises: ");
		String continente = in.nextLine();
		System.out.println("Paises de " +continente+" : ");
		mostrarPaises(mapaMundial.getPaises(continente));
		
		System.out.print("Ingrese el nombre de un pais para conocer sus provincias: ");
		String pais = in.nextLine();
		System.out.println("Provincias " + pais + " : ");
		mostrarProvincias(mapaMundial.getProvincias(pais));
		
		System.out.print("Ingrese el nombre de un pais para conocer sus paises limitrofes: ");
		String obtenerLimitrofes = in.nextLine();
		System.out.println("Paises limitrofes de " + obtenerLimitrofes + " : ");
		mostrarPaises(mapaMundial.getLimitrofes(obtenerLimitrofes));
		
		in.close();
		
	}
	
	public static void mostrarPaises(List<Pais> paises) {
		if(paises != null) {
			for (Pais pais : paises) {
				System.out.println(pais.toString());
			}
		}else {
			System.out.println("No hay datos para mostrar");
		}
	}
	
	public static void mostrarProvincias(List<Provincia> provincias) {
		if(provincias != null) {
			for (Provincia provincia : provincias) {
				System.out.println(provincia.toString());
			}
		}else {
			System.out.println("No hay datos para mostrar");
		}
	}
}

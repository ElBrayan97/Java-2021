package cartas;

public class PruebaMazo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mazo mazo = new Mazo();
		
		System.out.println(mazo);
		
		mazo.barajar();
		System.out.println("Mazo mezclado");
		System.out.println(mazo);
		System.out.println("Naipe de abajo");
		System.out.println(mazo.getNaipeAbajo());
		System.out.println("Naipe de Arriba");
		System.out.println(mazo.getNaipeArriba());
		System.out.println("Mazo final");
		System.out.println(mazo);

	}

}

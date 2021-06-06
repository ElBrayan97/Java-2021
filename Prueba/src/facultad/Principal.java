package facultad;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Catedra catedra1 = new Catedra();  // ClassName ObjectName = new ClassName();
		Catedra catedra2 = new Catedra("POO","Adrian", 40, 5);
		
		System.out.println(catedra1.getNombre());
		System.out.println(catedra2.getNombre());
		
		System.out.println("------------------------------");
		
		catedra1.setNombre("FdP");
		System.out.println(catedra1.getNombre());
		System.out.println(catedra2.getNombre());
	}
}

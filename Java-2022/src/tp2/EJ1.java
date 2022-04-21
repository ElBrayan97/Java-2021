package tp2;

import java.util.ArrayList;
import java.util.Scanner;


public class EJ1 {
	public static void main(String[] args ) {

		ArrayList<Empleado> empleados = new ArrayList<>(); //instancia de un arraylist
		Scanner in = new Scanner(System.in); //instancia de scanner
		Empleado Emp = new Empleado(); //instancia de un empleado
		String str = "";
		int sueldo = 0;
		
		for (int n=0; n<=4; n++){
			System.out.println("Ingrese el nombre del empleado "+ n +": ");
			str = in.nextLine();
			Emp.setName(str);
			
			System.out.println("Ingrese el Sueldo de "+ str +": " );
			str = in.nextLine();
			sueldo = Integer.parseInt(str);
			Emp.setSueldo(sueldo);
			
			empleados.add(Emp);
			in.close();
			
		} //End For

		int pos = 0;
		for (pos = 0; pos<=4; pos++);{
			Empleado empleado = empleados.get(pos);
			sueldo = (sueldo + empleado.getSueldo());
		}
		System.out.println("sueldo suma: " + sueldo);
		
	} //End Main

}
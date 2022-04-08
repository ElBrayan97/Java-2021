package tp2;

import java.util.ArrayList;
import java.util.Scanner;


public class EJ5 {
	
	public static void main(String[] args ) 
	{

		ArrayList<Empleado> empleados = new ArrayList<>();
		
		String str = "";
		int sueldo = 0;
		
		for (int n=0; n<=4; n++)
		{
			Scanner in = new Scanner(System.in);
			Empleado Emp = new Empleado();
			System.out.println("Ingrese el nombre del empleado "+ (n+1) +": ");
			str = in.nextLine();
			Emp.setName(str);
			
			System.out.println("Ingrese el Sueldo de "+ str +": " );
			str = in.nextLine();
			sueldo = Integer.parseInt(str);
			Emp.setSueldo(sueldo);
			
			empleados.add(Emp);

		} //End For
		
		int pos = 0;
		int max_sueldo = 0;
		int promedio = 0;
		String name = "";
		for (pos = 0; pos<4; pos++);
		{
			Empleado Emp = empleados.get(pos);
			sueldo = Emp.getSueldo();
			promedio = (promedio+sueldo);
			
			if (sueldo >= max_sueldo)
			{
				max_sueldo = sueldo;
				name = Emp.getName();
			}
		}
		
		System.out.println("sueldo promedio: " + (promedio/pos));
		System.out.println("Sueldo mas alto: " + name+" $" + max_sueldo);
	} //End Main

}
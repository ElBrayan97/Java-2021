package tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ5 {
	
	public static void main(String[] args ) 
	{

		ArrayList<Empleado> empleados = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		Empleado Emp = new Empleado();
		
		String str = "";
		int sueldo = 0;
		
		for (int n=0; n<=2; n++)
		{
			System.out.println("Ingrese el nombre del empleado "+ (n+1) +": ");
			str = in.nextLine();

			System.out.println("Ingrese el Sueldo de "+ str +": " );
			Emp.setName(str);
			str = in.nextLine();
			sueldo = Integer.parseInt(str);
			Emp.setSueldo(sueldo);
			
			empleados.add(Emp);

		} //End For
		
		int size = empleados.size();
		int max_sueldo = 0;
		int promedio = 0;
		String name = "";
		
		while (empleados.isEmpty() != true)
		{
			Emp = empleados.remove(empleados.size()-1);
			sueldo = Emp.getSueldo();
			promedio = (promedio+sueldo);
			
			if (sueldo > max_sueldo)
			{
				max_sueldo = sueldo;
				name = Emp.getName();
			}
		}
		
		System.out.println("sueldo promedio: " + (promedio/size));
		System.out.println("Sueldo mas alto: " + name+" $ " + max_sueldo);
		in.close();
	} //End Main

}
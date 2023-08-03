package tp6_Herencia;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		/*
		Rectangulo F1 = new Rectangulo("Rectangulo_1","Rojo",1,2,5,7);
		Forma F2 = new Forma("formajaja","tu vieja",2,2);
		F1.printForma();
		F2.printForma();
		System.out.print(F1.getArea()+"\r"+F1.getPerimtero()+"\r");
		F1.setEscala(2);
		System.out.print(F1.getArea()+"\r"+F1.getPerimtero()+"\r");
		*/
		LinkedList<Forma> formas_1 = new LinkedList<Forma>();
		
		for (int i = 0; i < 5; i++)	{ //Generacion de las Formas
			Forma forma = new Forma("Forma_"+i,"negro",i+2,i+i);
			formas_1.add(forma);
		}
		
		for (Forma forma : formas_1) {
			forma.printForma();
		}
		System.out.println("Primer Barrido terminado...");
		
		for (int i=0;i<5;i++) {
			Forma f = formas_1.getFirst();
			formas_1.removeFirst();
			f.setColor("Verde");
			formas_1.addLast(f);
		}
		
		for (Forma forma : formas_1) {
			forma.printForma();
		}
	}
}



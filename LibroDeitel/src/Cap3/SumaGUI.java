package Cap3;

import javax.swing.JOptionPane;

public class SumaGUI {

	public static void main(String[] args) {
		String  var1 = JOptionPane.showInputDialog(null,"Ingrese un número");
		int num1 = Integer.parseInt(var1);
		
		var1 = JOptionPane.showInputDialog(null,"Ingrese un número");
		int num2 = Integer.parseInt(var1);
		
		JOptionPane.showMessageDialog(null, (num1+num2));
	}

}
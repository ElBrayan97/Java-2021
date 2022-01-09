package Cap3;

import javax.swing.JOptionPane;

public class DialogoNombre {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Ingrese su nombre");
		String mensaje = String.format("Bienvenido, %s, a la programacion en Java!",name);
		JOptionPane.showMessageDialog(null, mensaje);
	}
}

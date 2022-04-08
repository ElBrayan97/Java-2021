package tp2;

public class Empleado {
	int sueldo;
	String name;
	
		public Empleado(){
			sueldo = -1;
			name = ""; 
		}

		public int getSueldo() {
			return sueldo;
		}

		public void setSueldo(int sueldo) {
			this.sueldo = sueldo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
}
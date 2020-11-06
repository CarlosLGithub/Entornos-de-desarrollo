package persona;

public class persona {
		private String nombre;
		private String apellidos;
		private int edad;
		private boolean haPagado;
		
		/*constructor por defecto*/
		public persona() {
			nombre="";
			apellidos="";
			edad=0;
			haPagado=false;
		}
		
		/*constructor con parametros*/
		public persona(String n, String a, int e, boolean h) {
			nombre="";
			apellidos="";
			edad=e;
			haPagado=h;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public boolean isHaPagado() {
			return haPagado;
		}

		public void setHaPagado(boolean haPagado) {
			this.haPagado = haPagado;
		}

		


}

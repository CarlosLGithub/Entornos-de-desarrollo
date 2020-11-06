package persona;

public class Test2 {

	public static void main(String[] args) {
		persona p1 = new persona();
		p1.setNombre("MJ");
		p1.setApellidos("Martinez Navas");
		p1.setEdad(14);
		p1.setHaPagado(false);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellidos());
		System.out.println(p1.getEdad());
		System.out.println(p1.isHaPagado());
		
		persona p2 =new persona("María", "Romero", 23, true);
		System.out.println(p2.getNombre());
		System.out.println(p2.getApellidos());
		System.out.println(p2.getEdad());
		System.out.println(p2.isHaPagado());
		
		System.out.println( p2.getNombre() + " " + p2.getApellidos() + " " + p2.getEdad() + " " + p2.isHaPagado() );


	}

}

		
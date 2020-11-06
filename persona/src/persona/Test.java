package persona;

public class Test {
	
	public static void main(String[] args) 
	{
		persona persona1=new persona("Javier", "Guerra", 35, false);
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellidos());
		System.out.println (persona1.getEdad());
		System.out.println (persona1.isHaPagado());

}
	
}
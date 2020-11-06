package es.studium.perro;

public class Test {

	public static void main(String[] args) 
	{
		Perro Perro1= new Perro ("Bulldog", 30, 5, "Canela");
		System.out.println(Perro1.getRaza());
		System.out.println(Perro1.getTamaño());
		System.out.println (Perro1.getEdad());
		System.out.println (Perro1.getColor());
	}

}

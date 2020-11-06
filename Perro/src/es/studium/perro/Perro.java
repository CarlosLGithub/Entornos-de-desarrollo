package es.studium.perro;

public class Perro {
	private String raza;
	private int tamaño;
	private int edad;
	private String color;
	
	public Perro () {
	raza="";
	tamaño=0;
	edad=0;
	color="";
	}
	
	public Perro(String a , int b , int c , String d ) 
	{
		raza= a;
		tamaño= b;
		edad= c;
		color= d;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	


	

}

	




package es.studium.perro;

public class Perro {
	private String raza;
	private int tama�o;
	private int edad;
	private String color;
	
	public Perro () {
	raza="";
	tama�o=0;
	edad=0;
	color="";
	}
	
	public Perro(String a , int b , int c , String d ) 
	{
		raza= a;
		tama�o= b;
		edad= c;
		color= d;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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

	




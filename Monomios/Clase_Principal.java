package es.Studium.Monomios;

public class Clase_Principal 
{
	public static void main (String[]args)
	{
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		new Controlador(vista, modelo); 
		
	}
}

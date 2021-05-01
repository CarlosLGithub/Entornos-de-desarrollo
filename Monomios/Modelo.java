package es.Studium.Monomios;

public class Modelo 
{
	//ATRIBUTOS DE CLASE
	int valor;
	int orden;
	
	// METODOS DE CLASE
	// CONSTRUCTORES
	public Modelo()
	{
		this.valor=0;
		this.orden=0;
	}
	public Modelo(int val, int ord)
	{
		this.valor=val;
		this.orden=ord;
	}
	
	//FUNCIONES DE LAS OPERACIONES, QUE LAS LLAMAREMOS PARA EL CONTROLADOR
	public String mostrarMonomio(Modelo m)
	{
		String cadena = null;
		cadena = m.valor+"x elevado a "+m.orden;
		return (cadena);
	}
	public Modelo cambiaSignoMonomio()
	{
		return (new Modelo((-this.valor), this.orden));
	}
	public Modelo sumaMonomio(Modelo m)
	{
		if(this.orden==m.orden)
		{
			return (new Modelo (this.valor+m.valor, this.orden));
		}
		else
		{
			return (null);
		}
	}
	public Modelo restaMonomio(Modelo m)
	{
		if(this.orden==m.orden)
		{
			return (new Modelo (this.valor-m.valor, this.orden));
		}
		else
		{
			return (null);
		}
	}
	public Modelo multiplicarMonomio(Modelo m)
	{
		return (new Modelo (this.valor*m.valor, this.orden+m.orden));
	}
	public Modelo derivarMonomio()
	{
		return (new Modelo (this.valor*this.orden, this.orden-1));
	}
}

package es.Studium.Monomios;


import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador extends Frame implements WindowListener, ActionListener 
{
	private static final long serialVersionUID = 1L;
	Vista objvista = null;
	Modelo objmodelo = null;

	public Controlador(Vista objVista, Modelo objModelo) 
	{
		this.objvista = objVista;
		this.objmodelo = objModelo;

		//AÑADIMOS LOS LISTENER DE LOS MENUITEM, LLAMANDO POR SUPUESTO A LA VISTA
		objVista.mniCambiarSigno.addActionListener(this);
		objVista.mniDerivar.addActionListener(this);
		objVista.mniMultiplicar.addActionListener(this);
		objVista.mniRestar.addActionListener(this);
		objVista.mniSalir.addActionListener(this);
		objVista.mniSumar.addActionListener(this);	
		objVista.btnOperar1.addActionListener(this);
		objVista.btnOperar2.addActionListener(this);
		objVista.addWindowListener(this); 
	}

	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		//FUNCION DEL MENU ITEM SALIR
		if(objvista.mniSalir.equals(evento.getSource()))
		{
			System.exit(0);
		}

		//FUNCION DEL MENU ITEM CAMBIAR SIGNO
		if(objvista.mniCambiarSigno.equals(evento.getSource()))
		{
			objvista.btnOperar1.setLabel("Cambiar de signo");
			objvista.dlgDatos.setSize(270,100);
			objvista.dlgDatos.add(objvista.pnlUnMonomio);
			objvista.dlgDatos.setVisible(true);
			Limpiar();
		}
		
		//FUNCION DEL MENU ITEM SUMAR
		if(objvista.mniSumar.equals(evento.getSource()))
		{
			objvista.btnOperar2.setLabel("Sumar");
			objvista.dlgDatos.setSize(270,140);
			objvista.dlgDatos.add(objvista.pnlDosMonomios);
			objvista.dlgDatos.setVisible(true);
			Limpiar2();
		}
		
		//FUNCION DEL MENU ITEM RESTAR
		if(objvista.mniRestar.equals(evento.getSource()))
		{
			objvista.btnOperar2.setLabel("Restar");
			objvista.dlgDatos.setSize(270,140);
			objvista.dlgDatos.add(objvista.pnlDosMonomios);
			objvista.dlgDatos.setVisible(true);
			Limpiar2();
		}

		//FUNCION  DEL MENU ITEM MULTIPLICAR
		if(objvista.mniMultiplicar.equals(evento.getSource()))
		{
			objvista.btnOperar2.setLabel("Multiplicar");
			objvista.dlgDatos.setSize(270,140);
			objvista.dlgDatos.add(objvista.pnlDosMonomios);
			objvista.dlgDatos.setVisible(true);
			Limpiar2();

		}
		
		//FUNCION DEL MENU ITEM DERIVAR
		if(objvista.mniDerivar.equals(evento.getSource()))
		{
			objvista.btnOperar1.setLabel("Derivar");
			objvista.dlgDatos.setSize(250,100);
			objvista.dlgDatos.add(objvista.pnlUnMonomio);
			objvista.dlgDatos.setVisible(true);
			Limpiar();
		}
		
		//FUNCION DEL BOTON OPERAR1, RELACIONADO CON LAS FUNCIONES DE CAMBIAR SIGNO Y DERIVAR
		//LLAMAMOS AL MODELO, DONDE TENEMOS ADJUNTADO TODAS LAS FORMULAS A REALIZAR
		if(objvista.btnOperar1.equals(evento.getSource()))
		{
			objmodelo = new Modelo(Integer.parseInt(objvista.txtValorMonomio.getText()),Integer.parseInt(objvista.txtOrdenMonomio.getText()));

			if(evento.getActionCommand()=="Cambiar de signo")
			{

				objmodelo=objmodelo.cambiaSignoMonomio();
			}
			else if(evento.getActionCommand()=="Derivar")
			{
				objmodelo=objmodelo.derivarMonomio();

			}
			objvista.txtResultado.setText(objmodelo.mostrarMonomio(objmodelo));

		}

		//FUNCION DEL BOTON OPERAR2, RELACIONADO CON LAS FUNCIONES DE SUMAR, RESTAR, MULTIPLICAR
		//LLAMAMOS AL MODELO, DONDE TENEMOS ADJUNTADO TODAS LAS FORMULAS A REALIZAR
		if(objvista.btnOperar2.equals(evento.getSource()))
		{
			objmodelo = new Modelo(Integer.parseInt(objvista.txtValorMonomio1.getText()),Integer.parseInt(objvista.txtOrdenMonomio1.getText()));
			objmodelo = new Modelo(Integer.parseInt(objvista.txtValorMonomio2.getText()),Integer.parseInt(objvista.txtOrdenMonomio2.getText()));


			if(evento.getActionCommand()=="Sumar")
			{
				objmodelo=objmodelo.sumaMonomio(objmodelo);
			}

			else if(evento.getActionCommand()=="Restar")
			{
				objmodelo=objmodelo.restaMonomio(objmodelo);

			}

			else if(evento.getActionCommand()=="Multiplicar")
			{
				objmodelo=objmodelo.multiplicarMonomio(objmodelo);

			}
			objvista.txtResultado2.setText(objmodelo.mostrarMonomio(objmodelo.sumaMonomio(objmodelo)));
		}	

	}

	private void Limpiar() //LIMPIAR TEXTFIELD DE SUMAR Y DERIVAR
	{
		objvista.txtValorMonomio.setText("");
		objvista.txtResultado.setText("");
		objvista.txtOrdenMonomio.setText("");
	}

	private void Limpiar2()
	{
		objvista.txtValorMonomio1.setText("");
		objvista.txtValorMonomio2.setText("");
		objvista.txtOrdenMonomio1.setText("");
		objvista.txtOrdenMonomio2.setText("");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent evento) 
	{
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}

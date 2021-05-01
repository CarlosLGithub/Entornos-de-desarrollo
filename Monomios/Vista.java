package es.Studium.Monomios;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Vista extends Frame implements WindowListener,  ActionListener
{

	//DENTRO DE LA CLASE VISTA ESTABLECEMOS TODO EL ASPECTO VISTUAL DE NUESTRO PROGRAMA
	private static final long serialVersionUID = 1L;
	MenuBar mb = new MenuBar();
	Menu mnArchivo = new Menu("Archivo");
	Menu mnOperar = new Menu("Operar");
	MenuItem mniSalir = new MenuItem("Salir");
	MenuItem mniCambiarSigno = new MenuItem("Cambiar signo");
	MenuItem mniSumar = new MenuItem("Sumar");
	MenuItem mniRestar = new MenuItem("Restar");
	MenuItem mniMultiplicar = new MenuItem("Multiplicar");
	MenuItem mniDerivar = new MenuItem("Derivar");
	
	Dialog dlgDatos = new Dialog(this);
	Panel pnlUnMonomio = new Panel();
	Panel pnlDosMonomios = new Panel();
	Label lblEtiqueta1 = new Label("Monomio");
	Label lblEtiqueta2 = new Label("x");
	Label lblEtiqueta3 = new Label("Primer Monomio");
	Label lblEtiqueta4 = new Label("x");
	Label lblEtiqueta5 = new Label("Segundo Monomio");
	Label lblEtiqueta6 = new Label("x");
	TextField txtValorMonomio = new TextField(3);
	TextField txtOrdenMonomio = new TextField(3);
	TextField txtValorMonomio1 = new TextField(3);
	TextField txtOrdenMonomio1 = new TextField(3);
	TextField txtValorMonomio2 = new TextField(3);
	TextField txtOrdenMonomio2 = new TextField(3);
	Button btnOperar1 = new Button("");
	TextField txtResultado = new TextField(10);
	Button btnOperar2 = new Button("");
	TextField txtResultado2 = new TextField(10);
	
	public Vista()
	{
		setLayout(new FlowLayout());
		setTitle("Monomios");
		setBackground(Color.blue);

		mnArchivo.add(mniSalir);
		mb.add(mnArchivo);
		mnOperar.add(mniCambiarSigno);
		mnOperar.add(mniSumar);
		mnOperar.add(mniRestar);
		mnOperar.add(mniMultiplicar);
		mnOperar.add(mniDerivar);
		mb.add(mnOperar);

		setMenuBar(mb);
		pnlUnMonomio.add(lblEtiqueta1);
		pnlUnMonomio.add(txtValorMonomio);
		pnlUnMonomio.add(lblEtiqueta2);
		pnlUnMonomio.add(txtOrdenMonomio);
		pnlUnMonomio.add(btnOperar1);
		pnlUnMonomio.add(txtResultado);
		pnlDosMonomios.add(lblEtiqueta3);
		pnlDosMonomios.add(txtValorMonomio1);
		pnlDosMonomios.add(lblEtiqueta4);
		pnlDosMonomios.add(txtOrdenMonomio1);
		pnlDosMonomios.add(lblEtiqueta5);
		pnlDosMonomios.add(txtValorMonomio2);
		pnlDosMonomios.add(lblEtiqueta6);
		pnlDosMonomios.add(txtOrdenMonomio2);
		pnlDosMonomios.add(btnOperar2);
		pnlDosMonomios.add(txtResultado2);
		this.addWindowListener(this);
		dlgDatos.setTitle("Operaciones");
		dlgDatos.addWindowListener(this);
		dlgDatos.setLocationRelativeTo(null);
		dlgDatos.setSize(250,100);
		setSize(350, 300);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		System.exit(0);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
	}
}

package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaIniciarSesion;
import co.edu.unbosque.view.VentanaInicio;
//import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaRegistrarse;

public class Controlador implements ActionListener {
	
	//creacion ventanas
	private VentanaInicio vi;
	private VentanaIniciarSesion vis;
	private VentanaRegistrarse vr;
	
	public Controlador() {
		vi = new VentanaInicio(this);
		vis = new VentanaIniciarSesion();
		vr = new VentanaRegistrarse();
		
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void runGUI() { // Run de la ventana
		vi.setVisible(true);
	}
	

}

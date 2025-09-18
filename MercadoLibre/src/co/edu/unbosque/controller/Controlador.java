package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaIniciarSesion;
import co.edu.unbosque.view.VentanaInicio;
//import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaRegistrarse;

public class Controlador implements ActionListener {

	// creacion ventanas
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
		// oyentes ventana inicial
		vi.getBotonInicioSesion().addActionListener(this);
		vi.getBotonInicioSesion().setActionCommand("boton_iniciar_sesion");
		vi.getBotonRegistrarse().addActionListener(this);
		vi.getBotonRegistrarse().setActionCommand("boton_registrarse");
		vi.getBotonSalir().addActionListener(this);
		vi.getBotonSalir().setActionCommand("boton_salir");
		vis.getBotonSalir().addActionListener(this);
		vis.getBotonSalir().setActionCommand("boton_iniciar_sesion_salir");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		System.out.println(e);
		switch (alias) {
		case "boton_iniciar_sesion": {
			vis.setVisible(true);
			vi.setVisible(false);
			break;
		}
		case "boton_registrarse": {
			vi.dispose();
			vr.setVisible(true);
		}
		case "boton_salir": {
			vi.dispose();
			break;
			}
		case "boton_iniciar_sesion_salir": {
			vis.dispose();
			vi.setVisible(true);
		}
		}
	}

	public void runGUI() { // Run de la ventana
		vi.setVisible(true);
	}

	public VentanaInicio getVi() {
		return vi;
	}

	public void setVi(VentanaInicio vi) {
		this.vi = vi;
	}

	public VentanaIniciarSesion getVis() {
		return vis;
	}

	public void setVis(VentanaIniciarSesion vis) {
		this.vis = vis;
	}

	public VentanaRegistrarse getVr() {
		return vr;
	}

	public void setVr(VentanaRegistrarse vr) {
		this.vr = vr;
	}
	

}

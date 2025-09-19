package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaCategoria;
import co.edu.unbosque.view.VentanaIniciarSesion;
import co.edu.unbosque.view.VentanaInicio;
//import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaRegistrarse;

public class Controlador implements ActionListener {

	// creacion ventanas
	private VentanaInicio vi;
	private VentanaIniciarSesion vis;
	private VentanaRegistrarse vr;
	private VentanaCategoria vc;

	public Controlador() {
		vi = new VentanaInicio(this);
		vis = new VentanaIniciarSesion();
		vr = new VentanaRegistrarse();
		vc = new VentanaCategoria();
		
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
		// oyentes ventana iniciar sesion
		vis.getBotonVolver().addActionListener(this);
		vis.getBotonVolver().setActionCommand("boton_iniciar_sesion_volver");
		vis.getBotonEntrar().addActionListener(this);
		vis.getBotonEntrar().setActionCommand("boton_entrar");
		// oyentes ventana registrar
		vr.getBotonRegistrar().addActionListener(this);
		vr.getBotonRegistrar().setActionCommand("boton_crear_cuenta");
		vr.getBotonVolver().addActionListener(this);
		vr.getBotonVolver().setActionCommand("boton_registrarse_volver");
		//oyentes ventana categoria
		

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
		case "boton_iniciar_sesion_volver": {
			vis.dispose();
			vi.setVisible(true);
		}
		case "boton_crear_cuenta":{
			vr.dispose();
			vi.setVisible(true);//este por ahora, toca crear una ventana emergente para un mensaje de "cuenta creada"
		}
		case "boton_registrarse_volver":{
			vr.dispose();
			vi.setVisible(true);
		}
		case "boton_entrar":{
			vis.dispose();
			vc.setVisible(true);
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

package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.util.exception.CorreoException;
import co.edu.unbosque.util.exception.LanzadorException;
import co.edu.unbosque.util.exception.NombreUsuarioException;
import co.edu.unbosque.util.exception.TelefonoException;
import co.edu.unbosque.view.VentanaCategoria;
import co.edu.unbosque.view.VentanaCuentaCreada;
import co.edu.unbosque.view.VentanaIniciarSesion;
import co.edu.unbosque.view.VentanaInicio;
import co.edu.unbosque.view.VentanaRegistrarse;

public class Controlador implements ActionListener {

	// creacion ventanas
	private VentanaInicio vi;
	private VentanaIniciarSesion vis;
	private VentanaRegistrarse vr;
	private VentanaCategoria vc;
	private VentanaCuentaCreada vcc;

	public Controlador() {
		vi = new VentanaInicio(this);
		vis = new VentanaIniciarSesion();
		vr = new VentanaRegistrarse();
		vc = new VentanaCategoria();
		vcc = new VentanaCuentaCreada();

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
		// oyentes ventana categoria
		vc.getBotonSalir().addActionListener(this);
		vc.getBotonSalir().setActionCommand("boton_categoria_volver");
		// oyentes ventana cuenta creada

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
			break;
		}
		case "boton_salir": {
			System.exit(0);
			break;
		}
		case "boton_iniciar_sesion_volver": {
			vis.dispose();
			vi.setVisible(true);
			break;
		}
		case "boton_crear_cuenta": {

			String nombreUsuario;
			try {
				String entrada = vr.getTextoIdUsuario().getText().trim();
				LanzadorException.verificarNombreUsuario(entrada);
				nombreUsuario = entrada;
			} catch (NombreUsuarioException ex) {
				System.err.println(ex.getMessage());
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			String correo;
			try {
				String entrada = vr.getTextoEmail().getText().trim();
				LanzadorException.verificarCorreoValido(entrada);
				nombreUsuario = entrada;
			} catch (CorreoException ex) {
				System.err.println(ex.getMessage());
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			long telefono;
			try {
				String entrada = vr.getTextoTelefono().getText().trim();
				LanzadorException.verificarNumeroCelular(entrada);
				telefono = Long.parseLong(entrada);
			} catch (TelefonoException ex) {
				System.err.println(ex.getMessage());
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			String direccion = vr.getTextoDireccion().getText().trim();
			String contrasenia = vr.getTextoContrasenia().getText().trim();

			vr.setVisible(false);
			vcc.inicializarVentanaCuentaCreada();
			vi.setVisible(true);
			break;
		}

		case "boton_registrarse_volver": {
			vr.dispose();
			vi.setVisible(true);
			break;
		}
		case "boton_entrar": {
			vis.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_continuar": {
			vcc.dispose();
			vi.setVisible(true);
			break;
		}
		case "boton_categoria_volver": {
			vc.dispose();
			vi.setVisible(true);
			break;
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

	public VentanaCategoria getVc() {
		return vc;
	}

	public void setVc(VentanaCategoria vc) {
		this.vc = vc;
	}

	public VentanaCuentaCreada getVcc() {
		return vcc;
	}

	public void setVcc(VentanaCuentaCreada vcc) {
		this.vcc = vcc;
	}

}

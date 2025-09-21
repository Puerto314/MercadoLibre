package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.util.exception.ContraseniaException;
import co.edu.unbosque.util.exception.CorreoException;
import co.edu.unbosque.util.exception.DireccionException;
import co.edu.unbosque.util.exception.LanzadorException;
import co.edu.unbosque.util.exception.NombreUsuarioException;
import co.edu.unbosque.util.exception.TelefonoException;
import co.edu.unbosque.view.VentanaCategoria;
import co.edu.unbosque.view.VentanaCuentaCreada;
import co.edu.unbosque.view.VentanaIniciarSesion;
import co.edu.unbosque.view.VentanaInicio;
import co.edu.unbosque.view.VentanaRegistrarse;

public class Controlador implements ActionListener {

	private VentanaInicio vi;
	private VentanaIniciarSesion vis;
	private VentanaRegistrarse vr;
	private VentanaCategoria vc;
	private VentanaCuentaCreada vcc;
	private List<Usuario> usuariosRegistrados;

	public Controlador() {
		vi = new VentanaInicio(this);
		vis = new VentanaIniciarSesion();
		vr = new VentanaRegistrarse();
		vc = new VentanaCategoria();
		vcc = new VentanaCuentaCreada();

		usuariosRegistrados = new ArrayList<>();

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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		case "boton_iniciar_sesion": {
			vi.setVisible(false);
			vis.setVisible(true);
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
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR NOMBRE DE USUARIO",
						JOptionPane.ERROR_MESSAGE, null);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			String correo;
			try {
				String entrada = vr.getTextoEmail().getText().trim();
				LanzadorException.verificarCorreoValido(entrada);
				correo = entrada;
			} catch (CorreoException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CORREO", JOptionPane.ERROR_MESSAGE, null);
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
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR TELEFONO", JOptionPane.ERROR_MESSAGE, null);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			String direccion;
			try {
				String entrada = vr.getTextoDireccion().getText().trim();
				LanzadorException.verificarDireccionValida(entrada);
				direccion = entrada;
			} catch (DireccionException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR DIRECCION", JOptionPane.ERROR_MESSAGE,
						null);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			String contrasenia;
			try {
				String entrada = vr.getTextoContrasenia().getText().trim();
				LanzadorException.verificarContraseñaValida(entrada);
				contrasenia = entrada;
			} catch (ContraseniaException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CONTRASEÑA", JOptionPane.ERROR_MESSAGE,
						null);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			Usuario nuevo = new Usuario(nombreUsuario, contrasenia, direccion, correo, telefono);
			usuariosRegistrados.add(nuevo);

			vr.setVisible(false);

			vcc.inicializarVentanaCuentaCreada();
			JOptionPane.showMessageDialog(null, "Cuenta creada con éxito");

			vcc.setVisible(false);
			vi.setVisible(true);
			break;
		}

		case "boton_registrarse_volver": {
			vr.dispose();
			vi.setVisible(true);
			break;
		}
		case "boton_entrar": {
			String usuarioIngresado = vis.getUsuario().getText().trim();
			String contraseniaIngresada = vis.getContrasenia().getText().trim();

			boolean encontrado = false;

			for (Usuario u : usuariosRegistrados) {
				if (u.getIdUsuario().equals(usuarioIngresado) && u.getContrasenia().equals(contraseniaIngresada)) {
					encontrado = true;
					break;
				}
			}

			if (encontrado) {
				JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
				vis.setVisible(false);
				vc.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR INICIO DE SESIÓN",
						JOptionPane.ERROR_MESSAGE, null);
				vis.setVisible(true);
			}
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

	public List<Usuario> getUsuariosRegistrados() {
		return usuariosRegistrados;
	}

	public void setUsuariosRegistrados(List<Usuario> usuariosRegistrados) {
		this.usuariosRegistrados = usuariosRegistrados;
	}

}

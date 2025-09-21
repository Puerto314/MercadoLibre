package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.util.exception.ContraseniaException;
import co.edu.unbosque.util.exception.CorreoException;
import co.edu.unbosque.util.exception.DireccionException;
import co.edu.unbosque.util.exception.LanzadorException;
import co.edu.unbosque.util.exception.NombreUsuarioException;
import co.edu.unbosque.util.exception.TelefonoException;
import co.edu.unbosque.view.VentanaCategoria;
import co.edu.unbosque.view.VentanaIniciarSesion;
import co.edu.unbosque.view.VentanaInicio;
import co.edu.unbosque.view.VentanaRegistrarse;

public class Controlador implements ActionListener {

	private VentanaInicio vi;
	private VentanaIniciarSesion vis;
	private VentanaRegistrarse vr;
	private VentanaCategoria vc;
	private ModelFacade mf;
	private List<Usuario> usuariosRegistrados;

	public Controlador() {
		vi = new VentanaInicio(this);
		vis = new VentanaIniciarSesion();
		vr = new VentanaRegistrarse();
		vc = new VentanaCategoria();
		mf = new ModelFacade();
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

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		// SOLO ABRIR LA VENTANA DE INICIAR SESIÓN
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
			String nombreUsuario, correo, direccion, contrasenia;
			long telefono;

			try {
				nombreUsuario = vr.getTextoIdUsuario().getText().trim();
				LanzadorException.verificarNombreUsuario(nombreUsuario);
			} catch (NombreUsuarioException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR NOMBRE DE USUARIO",
						JOptionPane.ERROR_MESSAGE);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			try {
				correo = vr.getTextoEmail().getText().trim();
				LanzadorException.verificarCorreoValido(correo);
			} catch (CorreoException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CORREO", JOptionPane.ERROR_MESSAGE);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			try {
				String entrada = vr.getTextoTelefono().getText().trim();
				LanzadorException.verificarNumeroCelular(entrada);
				telefono = Long.parseLong(entrada);
			} catch (TelefonoException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR TELEFONO", JOptionPane.ERROR_MESSAGE);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			try {
				direccion = vr.getTextoDireccion().getText().trim();
				LanzadorException.verificarDireccionValida(direccion);
			} catch (DireccionException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR DIRECCION", JOptionPane.ERROR_MESSAGE);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			try {
				contrasenia = vr.getTextoContrasenia().getText().trim();
				LanzadorException.verificarContraseñaValida(contrasenia);
			} catch (ContraseniaException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CONTRASEÑA", JOptionPane.ERROR_MESSAGE);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			Usuario nuevo = new Usuario();
			nuevo.setIdUsuario(nombreUsuario);
			nuevo.setCorreo(correo);
			nuevo.setTelefono(telefono);
			nuevo.setDireccionCasa(direccion);
			nuevo.setContrasenia(contrasenia);

			mf.getUsuarioDAO().crear(nuevo);

			vr.setVisible(false);
			JOptionPane.showMessageDialog(null, "Cuenta creada con éxito");
			vi.setVisible(true);
			break;
		}

		case "boton_registrarse_volver": {
			vr.dispose();
			vi.setVisible(true);
			break;
		}

		case "boton_entrar": {
			try {
				String usuarioIngresado = vis.getUsuario().getText().trim();
				String identificadorIngresado = vis.getEmail().getText().trim();
				String contraseniaIngresada = vis.getContrasenia().getText().trim();

				boolean encontrado = false;

				for (Usuario u : mf.getUsuarioDAO().leerTodos()) {
					boolean idValido = u.getCorreo().equals(identificadorIngresado);

					try {
						long numeroIngresado = Long.parseLong(identificadorIngresado);
						if (u.getTelefono() == numeroIngresado) {
							idValido = true;
						}
					} catch (NumberFormatException ex) {
					}

					if (idValido && u.getContrasenia().equals(contraseniaIngresada)) {
						encontrado = true;
						break;
					}
				}

				if (encontrado) {
					vis.dispose();
					vc.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario, correo, teléfono o contraseña incorrectos",
							"Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
				}

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Ocurrió un error al iniciar sesión", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;
		}

		case "boton_continuar": {
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

	public ModelFacade getMf() {
		return mf;
	}

	public void setMf(ModelFacade mf) {
		this.mf = mf;
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

	public List<Usuario> getUsuariosRegistrados() {
		return usuariosRegistrados;
	}

	public void setUsuariosRegistrados(List<Usuario> usuariosRegistrados) {
		this.usuariosRegistrados = usuariosRegistrados;
	}

}

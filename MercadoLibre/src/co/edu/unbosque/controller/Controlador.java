package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.util.exception.CiudadException;
import co.edu.unbosque.util.exception.ContraseniaException;
import co.edu.unbosque.util.exception.CorreoException;
import co.edu.unbosque.util.exception.DireccionException;
import co.edu.unbosque.util.exception.LanzadorException;
import co.edu.unbosque.util.exception.NombreUsuarioException;
import co.edu.unbosque.util.exception.TelefonoException;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private String idiomaSeleccionado = null;
	private ModelFacade mf;
	private ViewFacade vf;

	public Controlador() {
		vf = new ViewFacade();
		mf = new ModelFacade();
		asignarOyentes();
	}

	public void asignarOyentes() {

		// OYENTES BOTONES DE IDIOMA
		vf.getVi().getSpanish().addActionListener(this);
		vf.getVi().getSpanish().setActionCommand("boton_spanish");
		vf.getVi().getIngles().addActionListener(this);
		vf.getVi().getIngles().setActionCommand("boton_ingles");
		vf.getVi().getPortugues().addActionListener(this);
		vf.getVi().getPortugues().setActionCommand("boton_portugues");
		vf.getVi().getLatin().addActionListener(this);
		vf.getVi().getLatin().setActionCommand("boton_latin");

		// OYENTES VENTANA INICIAL
		vf.getVi().getBotonInicioSesion().addActionListener(this);
		vf.getVi().getBotonInicioSesion().setActionCommand("boton_iniciar_sesion");
		vf.getVi().getBotonRegistrarse().addActionListener(this);
		vf.getVi().getBotonRegistrarse().setActionCommand("boton_registrarse");
		vf.getVi().getBotonSalir().addActionListener(this);
		vf.getVi().getBotonSalir().setActionCommand("boton_salir");

		// OYENTES VENTANA INICIAR SESION
		vf.getVis().getBotonVolver().addActionListener(this);
		vf.getVis().getBotonVolver().setActionCommand("boton_iniciar_sesion_volver");
		vf.getVis().getBotonEntrar().addActionListener(this);
		vf.getVis().getBotonEntrar().setActionCommand("boton_entrar");

		// OYENTES VENTANA REGISTRAR
		vf.getVr().getBotonRegistrar().addActionListener(this);
		vf.getVr().getBotonRegistrar().setActionCommand("boton_crear_cuenta");
		vf.getVr().getBotonVolver().addActionListener(this);
		vf.getVr().getBotonVolver().setActionCommand("boton_registrarse_volver");

		// OYENTES VENTANA CATEGORIA
		vf.getVc().getBotonVolver().addActionListener(this);
		vf.getVc().getBotonVolver().setActionCommand("boton_categoria_volver");

		vf.getVc().getModa().addActionListener(this);
		vf.getVc().getModa().setActionCommand("boton_categoria_moda");

		vf.getVc().getDeporte().addActionListener(this);
		vf.getVc().getDeporte().setActionCommand("boton_categoria_deporte");

		vf.getVc().getBelleza().addActionListener(this);
		vf.getVc().getBelleza().setActionCommand("boton_categoria_belleza");

		vf.getVc().getHogar().addActionListener(this);
		vf.getVc().getHogar().setActionCommand("boton_categoria_hogar");

		vf.getVc().getElectrodomestico().addActionListener(this);
		vf.getVc().getElectrodomestico().setActionCommand("boton_categoria_electrodomestico");

		vf.getVc().getHerramienta().addActionListener(this);
		vf.getVc().getHerramienta().setActionCommand("boton_categoria_herramienta");

		vf.getVc().getTecnologia().addActionListener(this);
		vf.getVc().getTecnologia().setActionCommand("boton_categoria_tecnologia");

		vf.getVc().getArte().addActionListener(this);
		vf.getVc().getArte().setActionCommand("boton_categoria_arte");

		vf.getVc().getVideojuego().addActionListener(this);
		vf.getVc().getVideojuego().setActionCommand("boton_categoria_videojuego");

		vf.getVc().getMascota().addActionListener(this);
		vf.getVc().getMascota().setActionCommand("boton_categoria_mascota");
		
		vf.getVc().getComprarTodo().addActionListener(this);
		vf.getVc().getComprarTodo().setActionCommand("boton_comprar_todo");

		// OYENTES VENTANA PAGO
		vf.getVp().getBotonComprar().addActionListener(this);
		vf.getVp().getBotonComprar().setActionCommand("boton_comprar");
		
		

		// BOTONES DE VOLVER DE LAS CATEGORIAS
		vf.getVmo().getbVolverM().addActionListener(this);
		vf.getVmo().getbVolverM().setActionCommand("boton_categoria_moda_volver");
		vf.getVa().getbVolverA().addActionListener(this);
		vf.getVa().getbVolverA().setActionCommand("boton_categoria_arte_volver");
		vf.getVb().getbVolverB().addActionListener(this);
		vf.getVb().getbVolverB().setActionCommand("boton_categoria_belleza_volver");
		vf.getVd().getbVolverD().addActionListener(this);
		vf.getVd().getbVolverD().setActionCommand("boton_categoria_deporte_volver");
		vf.getVe().getbVolverE().addActionListener(this);
		vf.getVe().getbVolverE().setActionCommand("boton_categoria_electrodomestico_volver");
		vf.getVhe().getbVolverHE().addActionListener(this);
		vf.getVhe().getbVolverHE().setActionCommand("boton_categoria_herramienta_volver");
		vf.getVho().getbVolverHO().addActionListener(this);
		vf.getVho().getbVolverHO().setActionCommand("boton_categoria_hogar_volver");
		vf.getVt().getbVolverT().addActionListener(this);
		vf.getVt().getbVolverT().setActionCommand("boton_categoria_tecnologia_volver");
		vf.getVv().getbVolverV().addActionListener(this);
		vf.getVv().getbVolverV().setActionCommand("boton_categoria_videojuego_volver");
		vf.getVma().getbVolverMa().addActionListener(this);
		vf.getVma().getbVolverMa().setActionCommand("boton_categoria_mascota_volver");
		vf.getVp().getBotonVolver().addActionListener(this);
		vf.getVp().getBotonVolver().setActionCommand("boton_pagar_volver");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {

		case "boton_spanish": {
			idiomaSeleccionado = "message_spa.properties";
			JOptionPane.showMessageDialog(vf.getVi(), "Idioma español seleccionado");
			break;
		}
		case "boton_ingles": {
			idiomaSeleccionado = "message_eng.properties";
			JOptionPane.showMessageDialog(vf.getVi(), "English language selected");
			break;
		}
		case "boton_portugues": {
			idiomaSeleccionado = "message_pt.properties";
			JOptionPane.showMessageDialog(vf.getVi(), "Idioma português selecionado");
			break;
		}
		case "boton_latin": {
			idiomaSeleccionado = "message_la.properties";
			JOptionPane.showMessageDialog(vf.getVi(), "electus lingua latina");
			break;
		}

		case "boton_iniciar_sesion": {
			vf.getVi().setVisible(false);
			vf.getVis().setVisible(true);
			break;
		}

		case "boton_registrarse": {
			vf.getVi().dispose();
			vf.getVr().setVisible(true);
			break;
		}
		case "boton_salir": {
			System.exit(0);
			break;
		}
		case "boton_iniciar_sesion_volver": {
			vf.getVis().dispose();
			vf.getVi().setVisible(true);
			break;
		}

		case "boton_crear_cuenta": {
			String nombreUsuario, correo, direccionCasa, contrasenia, ciudad;
			long telefono;
			try {
				nombreUsuario = vf.getVr().getTextoIdUsuario().getText().trim();
				LanzadorException.verificarNombreUsuario(nombreUsuario);
			} catch (NombreUsuarioException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR NOMBRE DE USUARIO",
						JOptionPane.ERROR_MESSAGE);
				vf.getVr().setVisible(true);
				vf.getVi().setVisible(false);
				break;
			}

			try {
				correo = vf.getVr().getTextoEmail().getText().trim();
				LanzadorException.verificarCorreoValido(correo);
			} catch (CorreoException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CORREO", JOptionPane.ERROR_MESSAGE);
				vf.getVr().setVisible(true);
				vf.getVi().setVisible(false);
				break;
			}

			try {
				String entrada = vf.getVr().getTextoTelefono().getText().trim();
				LanzadorException.verificarNumeroCelular(entrada);
				telefono = Long.parseLong(entrada);
			} catch (TelefonoException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR TELEFONO", JOptionPane.ERROR_MESSAGE);
				vf.getVr().setVisible(true);
				vf.getVi().setVisible(false);
				break;
			}

			try {
				direccionCasa = vf.getVr().getTextoDireccion().getText().trim();
				LanzadorException.verificarDireccionValida(direccionCasa);
			} catch (DireccionException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR DIRECCION", JOptionPane.ERROR_MESSAGE);
				vf.getVr().setVisible(true);
				vf.getVi().setVisible(false);
				break;
			}

			try {
				contrasenia = vf.getVr().getTextoContrasenia().getText().trim();
				LanzadorException.verificarContraseñaValida(contrasenia);
			} catch (ContraseniaException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CONTRASEÑA", JOptionPane.ERROR_MESSAGE);
				vf.getVr().setVisible(true);
				vf.getVi().setVisible(false);
				break;
			}
			try {
				ciudad = vf.getVr().getTextoCiudad().getText().trim();
				LanzadorException.verificarCiudadValida(ciudad);
			} catch (CiudadException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CIUDAD", JOptionPane.ERROR_MESSAGE);
				vf.getVr().setVisible(true);
				vf.getVi().setVisible(false);
				break;
			}

			mf.getUsuarioDAO().crear(new Usuario(nombreUsuario, contrasenia, direccionCasa, correo, telefono, ciudad,
					"", (short) 0, (short) 0));

			vf.getVr().setVisible(false);
			JOptionPane.showMessageDialog(null, "Cuenta creada con éxito");
			vf.getVi().setVisible(true);
			break;
		}

		case "boton_registrarse_volver": {
			vf.getVr().dispose();
			vf.getVi().setVisible(true);
			break;
		}

		case "boton_entrar": {
			try {
				String usuarioIngresado = vf.getVis().getUsuario().getText().trim();
				String identificadorIngresado = vf.getVis().getEmail().getText().trim();
				String contraseniaIngresada = vf.getVis().getContrasenia().getText().trim();

				boolean encontrado = false;

				for (Usuario u : mf.getUsuarioDAO().leerTodos()) {
					boolean idValido = u.getCorreo().equals(identificadorIngresado);

					try {
						long numeroIngresado = Long.parseLong(identificadorIngresado);
						if (u.getTelefono() == numeroIngresado) {
							idValido = true;
						}
					} catch (NumberFormatException ex) {
						// ignorar si no es número
					}

					// 🔹 Aquí agregamos la validación del nombre de usuario
					if (idValido && u.getNombreUsuario().equals(usuarioIngresado)
							&& u.getContrasenia().equals(contraseniaIngresada)) {

						encontrado = true;
						break;
					}
				}

				if (encontrado) {
					vf.getVis().dispose();
					vf.getVc().setVisible(true);
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
			vf.getVi().setVisible(true);
			break;
		}
		case "boton_categoria_volver": {
			vf.getVc().dispose();
			vf.getVi().setVisible(true);
			break;
		}
		case "boton_categoria_arte": {
			vf.getVc().dispose();
			vf.getVa().setVisible(true);
			break;
		}
		case "boton_categoria_belleza": {
			vf.getVc().dispose();
			vf.getVb().setVisible(true);
			break;
		}
		case "boton_categoria_deporte": {
			vf.getVc().dispose();
			vf.getVd().setVisible(true);
			break;
		}
		case "boton_categoria_electrodomestico": {
			vf.getVc().dispose();
			vf.getVe().setVisible(true);
			break;
		}
		case "boton_categoria_herramienta": {
			vf.getVc().dispose();
			vf.getVhe().setVisible(true);
			break;
		}
		case "boton_categoria_hogar": {
			vf.getVc().dispose();
			vf.getVho().setVisible(true);
			break;
		}
		case "boton_categoria_moda": {
			vf.getVc().dispose();
			vf.getVmo().setVisible(true);
			break;
		}
		case "boton_categoria_tecnologia": {
			vf.getVc().dispose();
			vf.getVt().setVisible(true);
			break;
		}
		case "boton_categoria_videojuego": {
			vf.getVc().dispose();
			vf.getVv().setVisible(true);
			break;
		}
		case "boton_categoria_mascota": {
			vf.getVc().dispose();
			vf.getVma().setVisible(true);
			break;
		}

		// BOTONES CATEGORIA VOLVER
		case "boton_categoria_arte_volver": {
			vf.getVa().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_belleza_volver": {
			vf.getVb().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_deporte_volver": {
			vf.getVd().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_electrodomestico_volver": {
			vf.getVe().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_herramienta_volver": {
			vf.getVhe().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_hogar_volver": {
			vf.getVho().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_moda_volver": {
			vf.getVmo().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_videojuego_volver": {
			vf.getVv().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_tecnologia_volver": {
			vf.getVt().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_categoria_mascota_volver": {
			vf.getVma().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_pagar_volver": {
			vf.getVp().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_comprar_todo": {
			vf.getVc().dispose();
			vf.getVp().setVisible(true);
			break;
		}
		}
	}

	// RUN DE LA VENTANA
	public void runGUI() {
		vf.getVi().setVisible(true);
	}

}

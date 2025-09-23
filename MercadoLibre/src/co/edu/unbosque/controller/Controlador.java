package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JOptionPane;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.util.exception.CiudadException;
import co.edu.unbosque.util.exception.ContraseniaException;
import co.edu.unbosque.util.exception.CorreoException;
import co.edu.unbosque.util.exception.DireccionException;
import co.edu.unbosque.util.exception.LanzadorException;
import co.edu.unbosque.util.exception.NombreUsuarioException;
import co.edu.unbosque.util.exception.TelefonoException;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private String idiomaSeleccionado = "message_eng.properties";
	private ModelFacade mf;
	private ViewFacade vf;


	public Controlador() {
		mf = new ModelFacade();
		vf = new ViewFacade();
		asignarOyentes();
		cargarIdioma(idiomaSeleccionado);
		actualizarTextos();
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

		vf.getVc().getModoVendador().addActionListener(this);
		vf.getVc().getModoVendador().setActionCommand("boton_modo_vendedor");

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

	}
	
	public void cargarIdioma(String nombreArchivo) {
		Properties p = FileHandler.cargarArchivosDePropiedad(nombreArchivo);
		if (p != null) {
			mf.setProp(p);
			idiomaSeleccionado = nombreArchivo;
		} else {
			JOptionPane.showMessageDialog(null, "Error al cargar el archivo de idioma:" + nombreArchivo, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void actualizarTextos() {
		Properties prop = mf.getProp();
		if(prop == null) return;
		
		//VentanaInicio
				vf.getVi().setTitle(prop.getProperty("ventana_inicio_titulo"));
				vf.getVi().getLabelOpcion().setText(prop.getProperty("label_opcion"));
				vf.getVi().getBotonInicioSesion().setText(prop.getProperty("boton_iniciar_sesion"));
				vf.getVi().getBotonRegistrarse().setText(prop.getProperty("boton_registrarse"));
				vf.getVi().getBotonSalir().setText(prop.getProperty("boton_salir"));
				vf.getVi().getIdioma().setText(prop.getProperty("idioma"));
				
				//ventanaIniciarSesion
				vf.getVis().setTitle(prop.getProperty("ventana_iniciar_sesion_titulo"));
				vf.getVis().getLabelIniciarSesion().setText(prop.getProperty("label_iniciar_sesion"));
				vf.getVis().getLabelUsuario().setText(prop.getProperty("label_usuario"));
				vf.getVis().getLabelEmail().setText(prop.getProperty("label_email"));
				vf.getVis().getLabelContrasenia().setText(prop.getProperty("label_contrasenia"));
				vf.getVis().getBotonEntrar().setText(prop.getProperty("boton_entrar"));
				vf.getVis().getBotonVolver().setText(prop.getProperty("boton_volver"));
				
				//VentanaRegistrarse
				vf.getVr().setTitle(prop.getProperty("ventaba_registrarse_titulo"));
				vf.getVr().getRegistrar().setText(prop.getProperty("label_registrarse"));
				vf.getVr().getLabelIdUsuario().setText(prop.getProperty("label_id_usuario"));
				vf.getVr().getLabelTelefono().setText(prop.getProperty("label_telefono"));
				vf.getVr().getLabelContrasenia().setText(prop.getProperty("label_contrasenia"));
				vf.getVr().getLabelEmail().setText(prop.getProperty("label_email"));
				vf.getVr().getLabelDireccion().setText(prop.getProperty("label_direccion"));
				vf.getVr().getLabelCiudad().setText(prop.getProperty("label_ciudad"));
				vf.getVr().getBotonRegistrar().setText(prop.getProperty("boton_registrar"));
				vf.getVr().getBotonVolver().setText(prop.getProperty("boton_volver"));
				
				//VentanaCategoria
				vf.getVc().setTitle(prop.getProperty("ventana_categoria_titulo"));
				vf.getVc().getBotonVolver().setText(prop.getProperty("boton_volver"));
				vf.getVc().getModoVendador().setText(prop.getProperty("boton_modo_vendedor"));
				vf.getVc().getlModa().setText(prop.getProperty("categoria_moda"));
				vf.getVc().getlDeporte().setText(prop.getProperty("categoria_deportes"));
				vf.getVc().getlBelleza().setText(prop.getProperty("categoria_belleza"));
				vf.getVc().getlMascota().setText(prop.getProperty("categoria_mascotas"));
				vf.getVc().getlHogar().setText(prop.getProperty("categoria_hogar"));
				vf.getVc().getlElectrodomestico().setText(prop.getProperty("categoria_electrodomesticos"));
				vf.getVc().getlHerramienta().setText(prop.getProperty("categoria_herramientas"));
				vf.getVc().getlTecnologia().setText(prop.getProperty("categoria_tecnologia"));
				vf.getVc().getlArte().setText(prop.getProperty("categoria_arte"));
				vf.getVc().getlVideojuego().setText(prop.getProperty("categoria_videojuegos"));
				
				//VentanasDeCategoriasEspecificas
				vf.getVmo().setTitle(prop.getProperty("ventana_moda_titulo"));
				vf.getVmo().getbVolverM().setText(prop.getProperty("boton_volver"));
				vf.getVmo().getbModoVendedorM().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVa().setTitle(prop.getProperty("ventana_arte_titulo"));
				vf.getVa().getbVolverA().setText(prop.getProperty("boton_volver"));
				vf.getVa().getbModoVendedorA().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVb().setTitle(prop.getProperty("ventana_belleza_titulo"));
				vf.getVb().getbVolverB().setText(prop.getProperty("boton_volver"));
				vf.getVb().getbModoVendedorB().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVd().setTitle(prop.getProperty("ventana_deporte_titulo"));
				vf.getVd().getbVolverD().setText(prop.getProperty("boton_volver"));
				vf.getVd().getbModoVendedorD().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVe().setTitle(prop.getProperty("ventana_electrodomesticos_titulo"));
				vf.getVe().getbVolverE().setText(prop.getProperty("boton_volver"));
				vf.getVe().getbModoVendedorE().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVhe().setTitle(prop.getProperty("ventana_herramientas_titulo"));
				vf.getVhe().getbVolverHE().setText(prop.getProperty("boton_volver"));
				vf.getVhe().getbModoVendedorHE().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVho().setTitle(prop.getProperty("ventana_hogar_titulo"));
				vf.getVho().getbVolverHO().setText(prop.getProperty("boton_volver"));
				vf.getVho().getbModoVendedorHO().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVt().setTitle(prop.getProperty("ventana_tecnologia_titulo"));
				vf.getVt().getbVolverT().setText(prop.getProperty("boton_volver"));
				vf.getVt().getbModoVendedorT().setText(prop.getProperty("boton_modo_vendedor"));
				
				vf.getVv().setTitle(prop.getProperty("ventana_videojuego_titulo"));
				vf.getVv().getbVolverV().setText(prop.getProperty("boton_volver"));
				vf.getVv().getbModoVendedorV().setText(prop.getProperty("boton_modo_vendedor"));
				
				
			}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		Properties prop = mf.getProp();
		switch (alias) {
		// SOLO ABRIR LA VENTANA DE INICIAR SESIÓN

		case "boton_spanish": {
			cargarIdioma("message_spa.properties");
			actualizarTextos();
			JOptionPane.showMessageDialog(vf.getVi(), prop.getProperty("idioma_seleccionado_spanish"));
			break;
		}
		case "boton_ingles": {
			cargarIdioma("message_eng.properties");
			actualizarTextos();
			JOptionPane.showMessageDialog(vf.getVi(), prop.getProperty("idioma_seleccionado_english"));
			break;
		}
		case "boton_portugues": {
			cargarIdioma("message_pt.properties");
			actualizarTextos();
			JOptionPane.showMessageDialog(vf.getVi(), prop.getProperty("idioma_seleccionado_portugues"));
			break;
		}
		case "boton_latin": {
			cargarIdioma("message_la.properties");
			actualizarTextos();
			JOptionPane.showMessageDialog(vf.getVi(), prop.getProperty("idioma_seleccionado_latin"));
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
		}
	}

	public void runGUI() { // RUN DE LA VENTANA
		vf.getVi().setVisible(true);
	}

	public String getIdiomaSeleccionado() {
		return idiomaSeleccionado;
	}

	public void setIdiomaSeleccionado(String idiomaSeleccionado) {
		this.idiomaSeleccionado = idiomaSeleccionado;
	}

}
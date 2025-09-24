package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Producto;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.persistence.ProductoDAO;
import co.edu.unbosque.util.exception.CiudadException;
import co.edu.unbosque.util.exception.ClaveTarjetaException;
import co.edu.unbosque.util.exception.ContraseniaException;
import co.edu.unbosque.util.exception.CorreoException;
import co.edu.unbosque.util.exception.DireccionException;
import co.edu.unbosque.util.exception.LanzadorException;
import co.edu.unbosque.util.exception.NombreUsuarioException;
import co.edu.unbosque.util.exception.NumeroTarjetaException;
import co.edu.unbosque.util.exception.TelefonoException;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private String idiomaSeleccionado = null;
	private ModelFacade mf;
	private ViewFacade vf;
	private String rutaImagenProducto = "";

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
		vf.getVc().getComprarTodo().setActionCommand("boton_comprar_carrito");

		vf.getVp().getBotonComprar().addActionListener(this);
		vf.getVp().getBotonComprar().setActionCommand("boton_pagar");

		// OYENTES CARRITOS
		vf.getVmo().getAnadirCarrito1().addActionListener(this);
		vf.getVmo().getAnadirCarrito1().setActionCommand("boton_carrito_moda1");

		vf.getVmo().getAnadirCarrito2().addActionListener(this);
		vf.getVmo().getAnadirCarrito2().setActionCommand("boton_carrito_moda2");

		vf.getVmo().getAnadirCarrito3().addActionListener(this);
		vf.getVmo().getAnadirCarrito3().setActionCommand("boton_carrito_moda3");

		vf.getVmo().getAnadirCarrito4().addActionListener(this);
		vf.getVmo().getAnadirCarrito4().setActionCommand("boton_carrito_moda4");

		vf.getVmo().getAnadirCarrito5().addActionListener(this);
		vf.getVmo().getAnadirCarrito5().setActionCommand("boton_carrito_moda5");
		//
		vf.getVa().getAnadirCarrito1().addActionListener(this);
		vf.getVa().getAnadirCarrito1().setActionCommand("boton_carrito_arte1");

		vf.getVa().getAnadirCarrito2().addActionListener(this);
		vf.getVa().getAnadirCarrito2().setActionCommand("boton_carrito_arte2");

		vf.getVa().getAnadirCarrito3().addActionListener(this);
		vf.getVa().getAnadirCarrito3().setActionCommand("boton_carrito_arte3");

		vf.getVa().getAnadirCarrito4().addActionListener(this);
		vf.getVa().getAnadirCarrito4().setActionCommand("boton_carrito_arte4");

		vf.getVa().getAnadirCarrito5().addActionListener(this);
		vf.getVa().getAnadirCarrito5().setActionCommand("boton_carrito_arte5");
		//
		vf.getVb().getAnadirCarrito1().addActionListener(this);
		vf.getVb().getAnadirCarrito1().setActionCommand("boton_carrito_belleza1");

		vf.getVb().getAnadirCarrito2().addActionListener(this);
		vf.getVb().getAnadirCarrito2().setActionCommand("boton_carrito_belleza2");

		vf.getVb().getAnadirCarrito3().addActionListener(this);
		vf.getVb().getAnadirCarrito3().setActionCommand("boton_carrito_belleza3");

		vf.getVb().getAnadirCarrito4().addActionListener(this);
		vf.getVb().getAnadirCarrito4().setActionCommand("boton_carrito_belleza4");

		vf.getVb().getAnadirCarrito5().addActionListener(this);
		vf.getVb().getAnadirCarrito5().setActionCommand("boton_carrito_belleza5");
		//
		vf.getVd().getAnadirCarrito1().addActionListener(this);
		vf.getVd().getAnadirCarrito1().setActionCommand("boton_carrito_deporte1");

		vf.getVd().getAnadirCarrito2().addActionListener(this);
		vf.getVd().getAnadirCarrito2().setActionCommand("boton_carrito_deporte2");

		vf.getVd().getAnadirCarrito3().addActionListener(this);
		vf.getVd().getAnadirCarrito3().setActionCommand("boton_carrito_deporte3");

		vf.getVd().getAnadirCarrito4().addActionListener(this);
		vf.getVd().getAnadirCarrito4().setActionCommand("boton_carrito_deporte4");

		vf.getVd().getAnadirCarrito5().addActionListener(this);
		vf.getVd().getAnadirCarrito5().setActionCommand("boton_carrito_deporte5");
		//
		vf.getVe().getAnadirCarrito1().addActionListener(this);
		vf.getVe().getAnadirCarrito1().setActionCommand("boton_carrito_electrodomestico1");

		vf.getVe().getAnadirCarrito2().addActionListener(this);
		vf.getVe().getAnadirCarrito2().setActionCommand("boton_carrito_electrodomestico2");

		vf.getVe().getAnadirCarrito3().addActionListener(this);
		vf.getVe().getAnadirCarrito3().setActionCommand("boton_carrito_electrodomestico3");

		vf.getVe().getAnadirCarrito4().addActionListener(this);
		vf.getVe().getAnadirCarrito4().setActionCommand("boton_carrito_electrodomestico4");

		vf.getVe().getAnadirCarrito5().addActionListener(this);
		vf.getVe().getAnadirCarrito5().setActionCommand("boton_carrito_electrodomestico5");
		//
		vf.getVhe().getAnadirCarrito1().addActionListener(this);
		vf.getVhe().getAnadirCarrito1().setActionCommand("boton_carrito_herramienta1");

		vf.getVhe().getAnadirCarrito2().addActionListener(this);
		vf.getVhe().getAnadirCarrito2().setActionCommand("boton_carrito_herramienta2");

		vf.getVhe().getAnadirCarrito3().addActionListener(this);
		vf.getVhe().getAnadirCarrito3().setActionCommand("boton_carrito_herramienta3");

		vf.getVhe().getAnadirCarrito4().addActionListener(this);
		vf.getVhe().getAnadirCarrito4().setActionCommand("boton_carrito_herramienta4");

		vf.getVhe().getAnadirCarrito5().addActionListener(this);
		vf.getVhe().getAnadirCarrito5().setActionCommand("boton_carrito_herramienta5");
		//
		vf.getVho().getAnadirCarrito1().addActionListener(this);
		vf.getVho().getAnadirCarrito1().setActionCommand("boton_carrito_hogar1");

		vf.getVho().getAnadirCarrito2().addActionListener(this);
		vf.getVho().getAnadirCarrito2().setActionCommand("boton_carrito_hogar2");

		vf.getVho().getAnadirCarrito3().addActionListener(this);
		vf.getVho().getAnadirCarrito3().setActionCommand("boton_carrito_hogar3");

		vf.getVho().getAnadirCarrito4().addActionListener(this);
		vf.getVho().getAnadirCarrito4().setActionCommand("boton_carrito_hogar4");

		vf.getVho().getAnadirCarrito5().addActionListener(this);
		vf.getVho().getAnadirCarrito5().setActionCommand("boton_carrito_hogar5");
		//
		vf.getVma().getAnadirCarrito1().addActionListener(this);
		vf.getVma().getAnadirCarrito1().setActionCommand("boton_carrito_mascota1");

		vf.getVma().getAnadirCarrito2().addActionListener(this);
		vf.getVma().getAnadirCarrito2().setActionCommand("boton_carrito_mascota2");

		vf.getVma().getAnadirCarrito3().addActionListener(this);
		vf.getVma().getAnadirCarrito3().setActionCommand("boton_carrito_mascota3");

		vf.getVma().getAnadirCarrito4().addActionListener(this);
		vf.getVma().getAnadirCarrito4().setActionCommand("boton_carrito_mascota4");

		vf.getVma().getAnadirCarrito5().addActionListener(this);
		vf.getVma().getAnadirCarrito5().setActionCommand("boton_carrito_mascota5");
		//
		vf.getVt().getAnadirCarrito1().addActionListener(this);
		vf.getVt().getAnadirCarrito1().setActionCommand("boton_carrito_tecnologia1");

		vf.getVt().getAnadirCarrito2().addActionListener(this);
		vf.getVt().getAnadirCarrito2().setActionCommand("boton_carrito_tecnologia2");

		vf.getVt().getAnadirCarrito3().addActionListener(this);
		vf.getVt().getAnadirCarrito3().setActionCommand("boton_carrito_tecnologia3");

		vf.getVt().getAnadirCarrito4().addActionListener(this);
		vf.getVt().getAnadirCarrito4().setActionCommand("boton_carrito_tecnologia4");

		vf.getVt().getAnadirCarrito5().addActionListener(this);
		vf.getVt().getAnadirCarrito5().setActionCommand("boton_carrito_tecnologia5");
		//
		vf.getVv().getAnadirCarrito1().addActionListener(this);
		vf.getVv().getAnadirCarrito1().setActionCommand("boton_carrito_videojuego1");

		vf.getVv().getAnadirCarrito2().addActionListener(this);
		vf.getVv().getAnadirCarrito2().setActionCommand("boton_carrito_videojuego2");

		vf.getVv().getAnadirCarrito3().addActionListener(this);
		vf.getVv().getAnadirCarrito3().setActionCommand("boton_carrito_videojuego3");

		vf.getVv().getAnadirCarrito4().addActionListener(this);
		vf.getVv().getAnadirCarrito4().setActionCommand("boton_carrito_videojuego4");

		vf.getVv().getAnadirCarrito5().addActionListener(this);
		vf.getVv().getAnadirCarrito5().setActionCommand("boton_carrito_videojuego5");

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

		// BOTONES MODO VENDEDOR
		vf.getVa().getbModoVendedorA().addActionListener(this);
		vf.getVa().getbModoVendedorA().setActionCommand("boton_arte_modoVendedor");
		vf.getVb().getbModoVendedorB().addActionListener(this);
		vf.getVb().getbModoVendedorB().setActionCommand("boton_belleza_modoVendedor");
		vf.getVd().getbModoVendedorD().addActionListener(this);
		vf.getVd().getbModoVendedorD().setActionCommand("boton_deporte_modoVendedor");
		vf.getVe().getbModoVendedorE().addActionListener(this);
		vf.getVe().getbModoVendedorE().setActionCommand("boton_electrodomestico_modoVendedor");
		vf.getVhe().getbModoVendedorHE().addActionListener(this);
		vf.getVhe().getbModoVendedorHE().setActionCommand("boton_herramienta_modoVendedor");
		vf.getVho().getbModoVendedorHO().addActionListener(this);
		vf.getVho().getbModoVendedorHO().setActionCommand("boton_herramienta_modoVendedor");
		vf.getVma().getbModoVendedorMa().addActionListener(this);
		vf.getVma().getbModoVendedorMa().setActionCommand("boton_mascota_modoVendedor");
		vf.getVmo().getbModoVendedorM().addActionListener(this);
		vf.getVmo().getbModoVendedorM().setActionCommand("boton_moda_modoVendedor");
		vf.getVt().getbModoVendedorT().addActionListener(this);
		vf.getVt().getbModoVendedorT().setActionCommand("boton_tecnologia_modoVendedor");
		vf.getVv().getbModoVendedorV().addActionListener(this);
		vf.getVv().getbModoVendedorV().setActionCommand("boton_videojuego_modoVendedor");
		vf.getVmv().getBotonVolver().addActionListener(this);
		vf.getVmv().getBotonVolver().setActionCommand("boton_modoVendedor_volver");
		vf.getVmv().getBotonSeleccionarImagen().addActionListener(this);
		vf.getVmv().getBotonSeleccionarImagen().setActionCommand("boton_seleccionar_imagen");
		vf.getVmv().getBotonAgregarProducto().addActionListener(this);
		vf.getVmv().getBotonAgregarProducto().setActionCommand("boton_agregar_producto");

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
		case "boton_comprar_carrito": {
			vf.getVc().dispose();
			vf.getVp().setVisible(true);
			break;
		}
		case "boton_pagar": {
			vf.getVc().dispose();
			vf.getVp().setVisible(true);

			String numeroTarjeta = vf.getVp().getNumeroTarjeta().getText();
			String fechaVencimiento = vf.getVp().getFechaTarjeta().getText();
			String pin = vf.getVp().getPinTarjeta().getText();

			try {
				LanzadorException.verificarNumeroTarjeta(numeroTarjeta);
			} catch (NumeroTarjetaException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR TARJETA", JOptionPane.ERROR_MESSAGE);
				break;
			}

			try {
				LanzadorException.verificarPinValido(pin);
			} catch (ClaveTarjetaException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR PIN", JOptionPane.ERROR_MESSAGE);
				break;
			}

			JOptionPane.showMessageDialog(vf.getVp(), "Pago realizado correctamente");

			vf.getVp().dispose();
			vf.getVi().setVisible(true);

			break;
		}
		case "boton_carrito_moda1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_moda2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_moda3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_moda4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_moda5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_arte1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_arte2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_arte3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_arte4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_arte5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_belleza1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_belleza2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_belleza3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_belleza4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_belleza5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_deporte1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_deporte2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_deporte3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_deporte4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_deporte5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_electrodomestico1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_electrodomestico2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_electrodomestico3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_electrodomestico4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_electrodomestico5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_herramienta1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_herramienta2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_herramienta3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_herramienta4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_herramienta5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_hogar1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_hogar2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_hogar3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_hogar4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_hogar5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_mascota1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_mascota2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_mascota3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_mascota4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_mascota5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_tecnologia1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_tecnologia2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_tecnologia3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_tecnologia4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_tecnologia5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_videojuego1": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_videojuego2": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_videojuego3": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_videojuego4": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		case "boton_carrito_videojuego5": {
			JOptionPane.showMessageDialog(null, "Agregado al carrito");
			break;
		}
		//MODO VENDEDOR
		case "boton_modoVendedor_volver": {
			vf.getVmv().dispose();
			vf.getVc().setVisible(true);
			break;
		}
		case "boton_arte_modoVendedor": {

			vf.getVa().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_belleza_modoVendedor": {

			vf.getVb().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_deporte_modoVendedor": {

			vf.getVd().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_electrodomestico_modoVendedor": {
			vf.getVe().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_herramienta_modoVendedor": {
			vf.getVhe().dispose();
			vf.getVmv().setVisible(true);
			break;
		}
		case "boton_hogar_modoVendedor": {

			vf.getVho().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_mascota_modoVendedor": {
			vf.getVma().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_moda_modoVendedor": {
			vf.getVmo().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_tecnologia_modoVendedor": {
			vf.getVt().dispose();
			vf.getVmv().setVisible(true);
			break;

		}
		case "boton_videojuego_modoVendedor": {
			vf.getVv().dispose();
			vf.getVmv().setVisible(true);
			break;
		}
		
		case "boton_seleccionar_imagen": {
		    JFileChooser fileChooser = new JFileChooser();
		    fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir"))); // Directorio actual del proyecto
		    int result = fileChooser.showOpenDialog(vf.getVmv());
		    if (result == JFileChooser.APPROVE_OPTION) {
		        File selectedFile = fileChooser.getSelectedFile();
		        String fileName = selectedFile.getName();
		        
		        // Ruta relativa para guardar la imagen en la carpeta 'view'
		        File destinationFolder = new File("MercadoLibre/MercadoLibre/MercadoLibre/src/co/edu/unbosque/view/");
		        if (!destinationFolder.exists()) {
		            destinationFolder.mkdirs(); // Crear la carpeta si no existe
		        }
		        File destinationFile = new File(destinationFolder, fileName);
		        
		        try {
		            File.copy(selectedFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		            rutaImagenProducto = "co/edu/unbosque/view/" + fileName; // Guardar la ruta relativa para el modelo
		            vf.getVmv().getLabelImagenSeleccionada().setText("Imagen seleccionada: " + fileName);
		            JOptionPane.showMessageDialog(vf.getVmv(), "Imagen cargada con éxito: " + fileName);
		        } catch ( e) {
		            
		            rutaImagenProducto = "";
		        }
		    }
		    break;
		}

		case "boton_agregar_producto": {
		    String nombreProducto, categoria;
		    float precio;
		    int cantidad;
		    double puntuacion;

		    try {
		        nombreProducto = vf.getVmv().getTextoNombreProducto().getText().trim();
		        LanzadorException.verificarProductoValido(nombreProducto);
		    } catch ( e) {
		       
		        break;
		    }

		    try {
		        precio = Float.parseFloat(vf.getVmv().getTextoPrecio().getText().trim());
		        LanzadorException.verificarPrecioProducto(String.valueOf(precio));
		    } catch ( e) {
		        
		        break;
		    }

		    categoria = (String) vf.getVmv().getComboBoxCategoria().getSelectedItem();
		    if (categoria == null || categoria.equals("Seleccione una categoría")) {
		        JOptionPane.showMessageDialog(null, "Debe seleccionar una categoría.", "ERROR CATEGORÍA", JOptionPane.ERROR_MESSAGE);
		        break;
		    }

		    try {
		        cantidad = Integer.parseInt(vf.getVmv().getTextoCantidad().getText().trim());
		        LanzadorException.verificarCantidadProductoValida(String.valueOf(cantidad));
		    } catch ( e) {
		        
		        break;
		    }
		    
		    try {
		        puntuacion = Double.parseDouble(vf.getVmv().getTextoPuntuacion().getText().trim());
		        if (puntuacion < 0 || puntuacion > 5) {
		            JOptionPane.showMessageDialog(null, "La puntuación debe ser un número entre 0 y 5.", "ERROR PUNTUACIÓN", JOptionPane.ERROR_MESSAGE);
		            break;
		        }
		    } catch (e) {
		       
		        break;
		    }

		    if (rutaImagenProducto.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "Debe seleccionar una imagen para el producto.", "ERROR IMAGEN", JOptionPane.ERROR_MESSAGE);
		        break;
		    }
		    
		   

		    ProductoDAO objeto = new ProductoDAO(nombreProducto, precio, categoria, cantidad, puntuacion, rutaImagenProducto);
		    mf.getProductoDAO().crear(objeto);
		    JOptionPane.showMessageDialog(null, "Producto agregado con éxito a la categoría: " + categoria);
		    
		    // Limpiar campos después de agregar
		    vf.getVmv().getTextoNombreProducto().setText("");
		    vf.getVmv().getTextoPrecio().setText("");
		    vf.getVmv().getComboBoxCategoria().setSelectedIndex(0);
		    vf.getVmv().getTextoCantidad().setText("");
		    vf.getVmv().getTextoPuntuacion().setText("");
		    vf.getVmv().getLabelImagenSeleccionada().setText("Ninguna imagen seleccionada");
		    rutaImagenProducto = "";
		    
		    vf.getVmv().dispose();
		    vf.getVc().setVisible(true);
		    break;
		}

		}
	}

	// RUN DE LA VENTANA
	public void runGUI() {
		vf.getVi().setVisible(true);
	}

}

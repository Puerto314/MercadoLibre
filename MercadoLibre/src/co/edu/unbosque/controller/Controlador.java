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
import co.edu.unbosque.view.VentanaArte;
import co.edu.unbosque.view.VentanaBelleza;
import co.edu.unbosque.view.VentanaCategoria;
import co.edu.unbosque.view.VentanaDeporte;
import co.edu.unbosque.view.VentanaElectrodomestico;
import co.edu.unbosque.view.VentanaHerramienta;
import co.edu.unbosque.view.VentanaHogar;
import co.edu.unbosque.view.VentanaIniciarSesion;
import co.edu.unbosque.view.VentanaInicio;
import co.edu.unbosque.view.VentanaMascota;
import co.edu.unbosque.view.VentanaModa;
import co.edu.unbosque.view.VentanaPago;
import co.edu.unbosque.view.VentanaRegistrarse;
import co.edu.unbosque.view.VentanaTecnologia;
import co.edu.unbosque.view.VentanaVideojuego;

public class Controlador implements ActionListener {

	private String idiomaSeleccionado = null;
	private VentanaInicio vi;
	private VentanaIniciarSesion vis;
	private VentanaRegistrarse vr;
	private VentanaCategoria vc;
	private VentanaModa vm;
	private VentanaHogar vho;
	private VentanaArte va;
	private VentanaBelleza vb;
	private VentanaDeporte vd;
	private VentanaElectrodomestico ve;
	private VentanaHerramienta vhe;
	private VentanaVideojuego vv;
	private VentanaTecnologia vt;
	private VentanaPago vp;
	private ModelFacade mf;
	private VentanaMascota vmas;

	public Controlador() {
		vi = new VentanaInicio(this);
		vis = new VentanaIniciarSesion();
		vr = new VentanaRegistrarse();
		vc = new VentanaCategoria();
		vho = new VentanaHogar();
		va = new VentanaArte();
		vb = new VentanaBelleza();
		vd = new VentanaDeporte();
		ve = new VentanaElectrodomestico();
		vhe = new VentanaHerramienta();
		vv = new VentanaVideojuego();
		vt = new VentanaTecnologia();
		vt = new VentanaTecnologia();
		vp = new VentanaPago();
		mf = new ModelFacade();
		vm = new VentanaModa();
		vmas = new VentanaMascota();
		asignarOyentes();
	}

	public void asignarOyentes() {

		// OYENTES BOTONES DE IDIOMA
		vi.getSpanish().addActionListener(this);
		vi.getSpanish().setActionCommand("boton_spanish");
		vi.getIngles().addActionListener(this);
		vi.getIngles().setActionCommand("boton_ingles");
		vi.getPortugues().addActionListener(this);
		vi.getPortugues().setActionCommand("boton_portugues");
		vi.getLatin().addActionListener(this);
		vi.getLatin().setActionCommand("boton_latin");

		// OYENTES VENTANA INICIAL
		vi.getBotonInicioSesion().addActionListener(this);
		vi.getBotonInicioSesion().setActionCommand("boton_iniciar_sesion");
		vi.getBotonRegistrarse().addActionListener(this);
		vi.getBotonRegistrarse().setActionCommand("boton_registrarse");
		vi.getBotonSalir().addActionListener(this);
		vi.getBotonSalir().setActionCommand("boton_salir");

		// OYENTES VENTANA INICIAR SESION
		vis.getBotonVolver().addActionListener(this);
		vis.getBotonVolver().setActionCommand("boton_iniciar_sesion_volver");
		vis.getBotonEntrar().addActionListener(this);
		vis.getBotonEntrar().setActionCommand("boton_entrar");

		// OYENTES VENTANA REGISTRAR
		vr.getBotonRegistrar().addActionListener(this);
		vr.getBotonRegistrar().setActionCommand("boton_crear_cuenta");
		vr.getBotonVolver().addActionListener(this);
		vr.getBotonVolver().setActionCommand("boton_registrarse_volver");

		// OYENTES VENTANA CATEGORIA
		vc.getBotonVolver().addActionListener(this);
		vc.getBotonVolver().setActionCommand("boton_categoria_volver");

		vc.getModoVendador().addActionListener(this);
		vc.getModoVendador().setActionCommand("boton_modo_vendedor");

		vc.getModa().addActionListener(this);
		vc.getModa().setActionCommand("boton_categoria_moda");

		vc.getDeporte().addActionListener(this);
		vc.getDeporte().setActionCommand("boton_categoria_deporte");

		vc.getBelleza().addActionListener(this);
		vc.getBelleza().setActionCommand("boton_categoria_belleza");

		vc.getHogar().addActionListener(this);
		vc.getHogar().setActionCommand("boton_categoria_hogar");

		vc.getElectrodomestico().addActionListener(this);
		vc.getElectrodomestico().setActionCommand("boton_categoria_electrodomestico");

		vc.getHerramienta().addActionListener(this);
		vc.getHerramienta().setActionCommand("boton_categoria_herramienta");

		vc.getTecnologia().addActionListener(this);
		vc.getTecnologia().setActionCommand("boton_categoria_tecnologia");

		vc.getArte().addActionListener(this);
		vc.getArte().setActionCommand("boton_categoria_arte");

		vc.getVideojuego().addActionListener(this);
		vc.getVideojuego().setActionCommand("boton_categoria_videojuego");

		vc.getMascota().addActionListener(this);
		vc.getMascota().setActionCommand("boton_categoria_mascota");

		// OYENTES VENTANA PAGO
		vp.getBotonComprar().addActionListener(this);
		vp.getBotonComprar().setActionCommand("boton_comprar");

		// BOTONES DE VOLVER DE LAS CATEGORIAS
		vm.getbVolverM().addActionListener(this);
		vm.getbVolverM().setActionCommand("boton_categoria_moda_volver");
		va.getbVolverA().addActionListener(this);
		va.getbVolverA().setActionCommand("boton_categoria_arte_volver");
		vb.getbVolverB().addActionListener(this);
		vb.getbVolverB().setActionCommand("boton_categoria_belleza_volver");
		vd.getbVolverD().addActionListener(this);
		vd.getbVolverD().setActionCommand("boton_categoria_deporte_volver");
		ve.getbVolverE().addActionListener(this);
		ve.getbVolverE().setActionCommand("boton_categoria_electrodomestico_volver");
		vhe.getbVolverHE().addActionListener(this);
		vhe.getbVolverHE().setActionCommand("boton_categoria_herramienta_volver");
		vho.getbVolverHO().addActionListener(this);
		vho.getbVolverHO().setActionCommand("boton_categoria_hogar_volver");
		vt.getbVolverT().addActionListener(this);
		vt.getbVolverT().setActionCommand("boton_categoria_tecnologia_volver");
		vv.getbVolverV().addActionListener(this);
		vv.getbVolverV().setActionCommand("boton_categoria_videojuego_volver");
		vmas.getbVolverMa().addActionListener(this);
		vmas.getbVolverMa().setActionCommand("boton_categoria_mascota_volver");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		// SOLO ABRIR LA VENTANA DE INICIAR SESIÓN
		case "boton_spanish": {
			idiomaSeleccionado = "message_spa.properties";
			JOptionPane.showMessageDialog(vi, "Idioma español seleccionado");
			break;
		}
		case "boton_ingles": {
			idiomaSeleccionado = "message_eng.properties";
			JOptionPane.showMessageDialog(vi, "English language selected");
			break;
		}
		case "boton_portugues": {
			idiomaSeleccionado = "message_pt.properties";
			JOptionPane.showMessageDialog(vi, "Idioma português selecionado");
			break;
		}
		case "boton_latin": {
			idiomaSeleccionado = "message_la.properties";
			JOptionPane.showMessageDialog(vi, "electus lingua latina");
			break;
		}

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
			String nombreUsuario, correo, direccionCasa, contrasenia, ciudad;
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
				direccionCasa = vr.getTextoDireccion().getText().trim();
				LanzadorException.verificarDireccionValida(direccionCasa);
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
			try {
				ciudad = vr.getTextoCiudad().getText().trim();
				LanzadorException.verificarCiudadValida(ciudad);
			} catch (CiudadException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CIUDAD", JOptionPane.ERROR_MESSAGE);
				vr.setVisible(true);
				vi.setVisible(false);
				break;
			}

			mf.getUsuarioDAO().crear(new Usuario(nombreUsuario, contrasenia, direccionCasa, correo, telefono, ciudad,
					"", (short) 0, (short) 0));

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
		case "boton_categoria_arte": {
			vc.dispose();
			va.setVisible(true);
			break;
		}
		case "boton_categoria_belleza": {
			vc.dispose();
			vb.setVisible(true);
			break;
		}
		case "boton_categoria_deporte": {
			vc.dispose();
			vd.setVisible(true);
			break;
		}
		case "boton_categoria_electrodomestico": {
			vc.dispose();
			ve.setVisible(true);
			break;
		}
		case "boton_categoria_herramienta": {
			vc.dispose();
			vhe.setVisible(true);
			break;
		}
		case "boton_categoria_hogar": {
			vc.dispose();
			vho.setVisible(true);
			break;
		}
		case "boton_categoria_moda": {
			vc.dispose();
			vm.setVisible(true);
			break;
		}
		case "boton_categoria_tecnologia": {
			vc.dispose();
			vt.setVisible(true);
			break;
		}
		case "boton_categoria_videojuego": {
			vc.dispose();
			vv.setVisible(true);
			break;
		}
		case "boton_categoria_mascota": {
			vc.dispose();
			vmas.setVisible(true);
			break;
		}

		// BOTONES CATEGORIA VOLVER
		case "boton_categoria_arte_volver": {
			va.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_belleza_volver": {
			vb.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_deporte_volver": {
			vd.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_electrodomestico_volver": {
			ve.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_herramienta_volver": {
			vhe.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_hogar_volver": {
			vho.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_moda_volver": {
			vm.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_videojuego_volver": {
			vv.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_tecnologia_volver": {
			vt.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_mascota_volver": {
			vmas.dispose();
			vc.setVisible(true);
			break;
		}
		}
	}

	public void runGUI() { // RUN DE LA VENTANA
		vi.setVisible(true);
	}

	public String getIdiomaSeleccionado() {
		return idiomaSeleccionado;
	}

	public void setIdiomaSeleccionado(String idiomaSeleccionado) {
		this.idiomaSeleccionado = idiomaSeleccionado;
	}

	public VentanaPago getVp() {
		return vp;
	}

	public void setVp(VentanaPago vp) {
		this.vp = vp;
	}

	public ModelFacade getMf() {
		return mf;
	}

	public void setMf(ModelFacade mf) {
		this.mf = mf;
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

	public VentanaModa getVm() {
		return vm;
	}

	public void setVm(VentanaModa vm) {
		this.vm = vm;
	}

	public VentanaHogar getVho() {
		return vho;
	}

	public void setVho(VentanaHogar vho) {
		this.vho = vho;
	}

	public VentanaArte getVa() {
		return va;
	}

	public void setVa(VentanaArte va) {
		this.va = va;
	}

	public VentanaBelleza getVb() {
		return vb;
	}

	public void setVb(VentanaBelleza vb) {
		this.vb = vb;
	}

	public VentanaDeporte getVd() {
		return vd;
	}

	public void setVd(VentanaDeporte vd) {
		this.vd = vd;
	}

	public VentanaElectrodomestico getVe() {
		return ve;
	}

	public void setVe(VentanaElectrodomestico ve) {
		this.ve = ve;
	}

	public VentanaHerramienta getVhe() {
		return vhe;
	}

	public void setVhe(VentanaHerramienta vhe) {
		this.vhe = vhe;
	}

	public VentanaVideojuego getVv() {
		return vv;
	}

	public void setVv(VentanaVideojuego vv) {
		this.vv = vv;
	}

	public VentanaTecnologia getVt() {
		return vt;
	}

	public void setVt(VentanaTecnologia vt) {
		this.vt = vt;
	}

	public VentanaMascota getVmas() {
		return vmas;
	}

	public void setVmas(VentanaMascota vmas) {
		this.vmas = vmas;
	}

}

package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
import co.edu.unbosque.view.VentanaModa;
import co.edu.unbosque.view.VentanaRegistrarse;
import co.edu.unbosque.view.VentanaTecnologia;
import co.edu.unbosque.view.VentanaVideojuego;

public class Controlador implements ActionListener {

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
	// falta la categoria de mascotas
	private ModelFacade mf;
	private List<Usuario> usuariosRegistrados;

	public Controlador() {
		vi = new VentanaInicio(this);
		vis = new VentanaIniciarSesion();
		vr = new VentanaRegistrarse();
		vc = new VentanaCategoria();
		vm = new VentanaModa();
		vho = new VentanaHogar();
		va = new VentanaArte();
		vb = new VentanaBelleza();
		vd = new VentanaDeporte();
		ve = new VentanaElectrodomestico();
		vhe = new VentanaHerramienta();
		vv = new VentanaVideojuego();
		vt = new VentanaTecnologia();
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

		va.getbVolverM().addActionListener(this);
		va.getbVolverM().setActionCommand("boton_categoria_arte_volver");

		vb.getbVolverM().addActionListener(this);
		vb.getbVolverM().setActionCommand("boton_categoria_belleza_volver");

		vd.getbVolverM().addActionListener(this);
		vd.getbVolverM().setActionCommand("boton_categoria_deportes_volver");

		ve.getbVolverM().addActionListener(this);
		ve.getbVolverM().setActionCommand("boton_categoria_electrodomesticos_volver");

		vhe.getbVolverM().addActionListener(this);
		vhe.getbVolverM().setActionCommand("boton_categoria_herramientas_volver");

		vho.getbVolverM().addActionListener(this);
		vho.getbVolverM().setActionCommand("boton_categoria_hogar_volver");

		vm.getbVolverM().addActionListener(this);
		vm.getbVolverM().setActionCommand("boton_categoria_moda_volver");

		vt.getbVolverM().addActionListener(this);
		vt.getbVolverM().setActionCommand("boton_categoria_tecnologia_volver");

		vv.getbVolverM().addActionListener(this);
		vv.getbVolverM().setActionCommand("boton_categoria_videojuegos");

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
			String nombreUsuario, correo, direccion, contrasenia, ciudad;
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
			try {
				ciudad = vr.getTextoCiudad().getText().trim();
				LanzadorException.verificarCiudadValida(ciudad);
			} catch (CiudadException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR CIUDAD", JOptionPane.ERROR_MESSAGE);
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
			vm.setVisible(true);
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

		// botones categoria volver
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
		case "boton_categoria_videojuegos_volver": {
			vv.dispose();
			vc.setVisible(true);
			break;
		}
		case "boton_categoria_tecnologia_volver": {
			vt.dispose();
			vc.setVisible(true);
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

	public List<Usuario> getUsuariosRegistrados() {
		return usuariosRegistrados;
	}

	public void setUsuariosRegistrados(List<Usuario> usuariosRegistrados) {
		this.usuariosRegistrados = usuariosRegistrados;
	}

}

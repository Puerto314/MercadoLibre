package co.edu.unbosque.model;

import java.io.Serializable;

public class Usuario extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 975084396426742501L;
	private String nombreUsuario;
	private String contrasenia;

	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String contrasenia) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
	}

	public Usuario(String direccionCasa, String correo, long telefono, String ciudad, String nombreUsuario,
			String contrasenia) {
		super(direccionCasa, correo, telefono, ciudad);
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
	}

	public Usuario(String direccionCasa, String correo, long telefono, String ciudad) {
		super(direccionCasa, correo, telefono, ciudad);
		// TODO Auto-generated constructor stub
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "\n=================================\n - Nombre De Usuario: " + nombreUsuario + "\n ================================= \n - ContraseÃ±a: " + contrasenia + "]";
	}
	

}

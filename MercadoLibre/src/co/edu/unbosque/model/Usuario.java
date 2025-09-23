package co.edu.unbosque.model;

import java.io.Serializable;

public class Usuario implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 975084396426742501L;
	private String nombreUsuario;
	private String contrasenia;
	private String direccionCasa;
	private String correo;
	private long telefono;
	private String ciudad;
//	 private String numeroTarjeta;
//	private short claveDeSeguridad;

	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String contrasenia, String direccionCasa, String correo, long telefono,
			String ciudad) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.direccionCasa = direccionCasa;
		this.correo = correo;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/*
	 * public String getNumeroTarjeta() { return numeroTarjeta; }
	 * 
	 * public void setNumeroTarjeta(String numeroTarjeta) { this.numeroTarjeta =
	 * numeroTarjeta; }
	 * 
	 * public short getClaveDeSeguridad() { return claveDeSeguridad; }
	 * 
	 * public void setClaveDeSeguridad(short claveDeSeguridad) {
	 * this.claveDeSeguridad = claveDeSeguridad; }
	 */
	public String getnombreUsuario() {
		return nombreUsuario;
	}

	public void setIdUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getDireccionCasa() {
		return direccionCasa;
	}

	public void setDireccionCasa(String direccionCasa) {
		this.direccionCasa = direccionCasa;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return " Usuario \n id: " + nombreUsuario + "\n Contraseña: " + contrasenia + "\n Dirección: " + direccionCasa
				+ "\n Correo: " + correo + "\n Teléfono: " + telefono;
	}

}

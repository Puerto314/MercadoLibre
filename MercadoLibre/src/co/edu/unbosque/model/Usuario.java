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
	private String numeroTarjeta;
	private short claveDeSeguridad;
	private short fechaTarjeta;

	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String contrasenia, String direccionCasa, String correo, long telefono,
			String ciudad, String numeroTarjeta, short claveDeSeguridad, short fechaTarjeta) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.direccionCasa = direccionCasa;
		this.correo = correo;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.numeroTarjeta = numeroTarjeta;
		this.claveDeSeguridad = claveDeSeguridad;
		this.fechaTarjeta = fechaTarjeta;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public short getClaveDeSeguridad() {
		return claveDeSeguridad;
	}

	public void setClaveDeSeguridad(short claveDeSeguridad) {
		this.claveDeSeguridad = claveDeSeguridad;
	}

	public short getFechaTarjeta() {
		return fechaTarjeta;
	}

	public void setFechaTarjeta(short fechaTarjeta) {
		this.fechaTarjeta = fechaTarjeta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return " Usuario: Nombre: " + nombreUsuario + " Contraseña: " + contrasenia + " Dirección " + direccionCasa
				+ " Correo: " + correo + " Teléfono: " + telefono + " Ciudad: " + ciudad + " Número de tarjeta: "
				+ numeroTarjeta + " Pin: " + claveDeSeguridad + " Fecha de expiración: " + fechaTarjeta;
	}

}

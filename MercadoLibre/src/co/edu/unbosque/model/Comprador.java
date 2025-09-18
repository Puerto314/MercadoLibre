package co.edu.unbosque.model;

public class Comprador extends Usuario {

	private String ciudad;
	private String numeroTarjeta;
	private short claveDeSeguridad;

	public Comprador() {
		super();
	}

	public Comprador(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		// TODO Auto-generated constructor stub
	}

	public Comprador(String ciudad, String numeroTarjeta, short claveDeSeguridad) {
		super();
		this.ciudad = ciudad;
		this.numeroTarjeta = numeroTarjeta;
		this.claveDeSeguridad = claveDeSeguridad;
	}

	public Comprador(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono,
			String ciudad, String numeroTarjeta, short claveDeSeguridad) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		this.ciudad = ciudad;
		this.numeroTarjeta = numeroTarjeta;
		this.claveDeSeguridad = claveDeSeguridad;
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

	@Override
	public String toString() {
		return super.toString() + "\n - Ciudad:" + ciudad + "\n - Numero de tarjeta: " + numeroTarjeta
				+ "\n - Clave de seguridad (CCV): " + claveDeSeguridad;
	}

}

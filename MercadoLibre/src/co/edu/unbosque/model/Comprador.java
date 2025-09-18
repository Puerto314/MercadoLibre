package co.edu.unbosque.model;

public class Comprador extends Usuario {

	private String ciudad;
	private String numeroTarjeta;
	private short claveDeSeguridad;
	private String pinTarjeta;

	public Comprador() {
		super();
	}

	public Comprador(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		// TODO Auto-generated constructor stub
	}

	public Comprador(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono,
			String ciudad, String numeroTarjeta, short claveDeSeguridad, String pinTarjeta) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		this.ciudad = ciudad;
		this.numeroTarjeta = numeroTarjeta;
		this.claveDeSeguridad = claveDeSeguridad;
		this.pinTarjeta = pinTarjeta;
	}

	public Comprador(String ciudad, String numeroTarjeta, short claveDeSeguridad, String pinTarjeta) {
		super();
		this.ciudad = ciudad;
		this.numeroTarjeta = numeroTarjeta;
		this.claveDeSeguridad = claveDeSeguridad;
		this.pinTarjeta = pinTarjeta;
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

	public String getContraseniaTarjeta() {
		return pinTarjeta;
	}

	public void setContraseniaTarjeta(String pinTarjeta) {
		this.pinTarjeta = pinTarjeta;
	}

	@Override
	public String toString() {
		return super.toString() + "\n - Ciudad:" + ciudad + "\n - Numero de tarjeta: " + numeroTarjeta
				+ "\n - Clave de seguridad (CCV): " + claveDeSeguridad + "\n - pin de la tarjeta: " + pinTarjeta;
	}

}

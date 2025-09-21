package co.edu.unbosque.model;

public class Comprador {

	private String ciudad;
	private String numeroTarjeta;
	private short claveDeSeguridad;

	public Comprador() {
		super();
	}

	public Comprador(String ciudad, String numeroTarjeta, short claveDeSeguridad) {
		super();
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
		return "\n - Ciudad:" + ciudad + "\n - Numero de tarjeta: " + numeroTarjeta + "\n - Clave de seguridad (CCV): "
				+ claveDeSeguridad;
	}

}

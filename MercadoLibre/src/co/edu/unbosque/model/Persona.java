package co.edu.unbosque.model;

public abstract class Persona {

	private String direccionCasa;
	private String correo;
	private long telefono;
	private String ciudad;

	public Persona() {
		super();
	}

	public Persona(String direccionCasa, String correo, long telefono, String ciudad) {
		super();
		this.direccionCasa = direccionCasa;
		this.correo = correo;
		this.telefono = telefono;
		this.ciudad = ciudad;
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

	@Override
	public String toString() {
		return "=================================\n - Direccion: " + direccionCasa
				+ "\n=================================\n - Correo: " + correo
				+ "\n=================================\n - TelÃ©fono: " + telefono
				+ "\n=================================\n - Ciudad: " + ciudad + "]";
	}
}

package co.edu.unbosque.model;

public class Usuario {

	private String idUsuario;
	private String contrasenia;
	private String direccionCasa;
	private String correo;
	private long telefono;

	public Usuario() {
		super();
	}

	public Usuario(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono) {
		super();
		this.idUsuario = idUsuario;
		this.contrasenia = contrasenia;
		this.direccionCasa = direccionCasa;
		this.correo = correo;
		this.telefono = telefono;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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
		return " Usuario \n id: " + idUsuario + "\n Contraseña: " + contrasenia + "\n Dirección: " + direccionCasa
				+ "\n Correo: " + correo + "\n Teléfono: " + telefono;
	}

}

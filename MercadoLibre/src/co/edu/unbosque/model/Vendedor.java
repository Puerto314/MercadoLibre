package co.edu.unbosque.model;

public class Vendedor extends Usuario {

	private int numeroVentas;

	public Vendedor() {
		super();
	}

	public Vendedor(int numeroVentas) {
		super();
		this.numeroVentas = numeroVentas;
	}

	public Vendedor(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono,
			int numeroVentas) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		this.numeroVentas = numeroVentas;
	}

	public Vendedor(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n - Número de ventas del vendedor: " + numeroVentas;
	}

}

package co.edu.unbosque.model;

public class Vendedor extends Usuario {

	private int numeroVenta;

	public Vendedor() {
		super();
	}

	public Vendedor(int numeroVentas) {
		super();
		this.numeroVenta = numeroVentas;
	}

	public Vendedor(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono,
			int numeroVentas) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		this.numeroVenta = numeroVentas;
	}

	public Vendedor(String idUsuario, String contrasenia, String direccionCasa, String correo, long telefono) {
		super(idUsuario, contrasenia, direccionCasa, correo, telefono);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	@Override
	public String toString() {
		return super.toString() + "\n - Número de ventas del vendedor: " + numeroVenta;
	}

}

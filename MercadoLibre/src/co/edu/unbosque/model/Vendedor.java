package co.edu.unbosque.model;

public class Vendedor {

	private int numeroVenta;

	public Vendedor() {
		super();
	}

	public Vendedor(int numeroVentas) {
		super();
		this.numeroVenta = numeroVentas;
	}

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	@Override
	public String toString() {
		return "\n - Número de ventas del vendedor: " + numeroVenta;
	}

}

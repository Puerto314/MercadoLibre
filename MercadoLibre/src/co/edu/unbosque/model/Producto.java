package co.edu.unbosque.model;

import java.io.Serializable;

public class Producto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1489327248235404241L;

	private String nombreProducto;
	private float precio;
	private String categoria;
	private int cantidad;
	private double puntuacion;
	private String rutaImagenProducto;

	public Producto() {

	}

	public Producto(String nombreProducto, float precio, String categoria, int cantidad, double puntuacion,
			String rutaImagenProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.categoria = categoria;
		this.cantidad = cantidad;
		this.puntuacion = puntuacion;
		this.rutaImagenProducto = rutaImagenProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getRutaImagenProducto() {
		return rutaImagenProducto;
	}

	public void setRutaImagenProducto(String rutaImagenProducto) {
		this.rutaImagenProducto = rutaImagenProducto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return " \n - Nombre del producto: " + nombreProducto + "\n - Precio: " + precio + " \n - Descripción: "
				+ "\n - Cantidad: " + cantidad + "\n - Puntuación: " + puntuacion;
	}

}
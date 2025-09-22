package co.edu.unbosque.model;

public class Producto {
	private String nombreProducto;
	private float precio;
	private String categoria;
	private String descripcionProducto;
	private int cantidad;
	private int descuento;
	private double puntuacion;
	private String url;
	
	public Producto() {

	}

	public Producto(String nombreProducto, float precio, String categoria, String descripcionProducto, int cantidad,
			int descuento, double puntuacion, String url) {
		super();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.categoria = categoria;
		this.descripcionProducto = descripcionProducto;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.puntuacion = puntuacion;
		this.url = url;
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

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return " \n - Nombre del producto: " + nombreProducto + "\n - Precio: " + precio + " \n - Descripción: "
				+ descripcionProducto + "\n - Cantidad: " + cantidad + "\n - Descuento: " + descuento
				+ "\n - Puntuación: " + puntuacion;
	}

}

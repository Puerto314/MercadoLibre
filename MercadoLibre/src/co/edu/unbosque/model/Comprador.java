package co.edu.unbosque.model;

import java.io.Serializable;

public class Comprador extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2637055100781911172L;
	private long numeroDeTarjeta;
	private short mesDeVencimiento;
	private short anioDeVencimiento;
	private short claveDeSeguridad;

	public Comprador() {
		super();
	}

	public Comprador(long numeroDeTarjeta, short mesDeVencimiento, short anioDeVencimiento, short claveDeSeguridad) {
		super();
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.mesDeVencimiento = mesDeVencimiento;
		this.anioDeVencimiento = anioDeVencimiento;
		this.claveDeSeguridad = claveDeSeguridad;
	}

	public Comprador(String direccionCasa, String correo, long telefono, String ciudad, long numeroDeTarjeta,
			short mesDeVencimiento, short anioDeVencimiento, short claveDeSeguridad) {
		super(direccionCasa, correo, telefono, ciudad);
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.mesDeVencimiento = mesDeVencimiento;
		this.anioDeVencimiento = anioDeVencimiento;
		this.claveDeSeguridad = claveDeSeguridad;
	}

	public Comprador(String direccionCasa, String correo, long telefono, String ciudad) {
		super(direccionCasa, correo, telefono, ciudad);
		// TODO Auto-generated constructor stub
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(long numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public short getMesDeVencimiento() {
		return mesDeVencimiento;
	}

	public void setMesDeVencimiento(short mesDeVencimiento) {
		this.mesDeVencimiento = mesDeVencimiento;
	}

	public short getAnioDeVencimiento() {
		return anioDeVencimiento;
	}

	public void setAnioDeVencimiento(short anioDeVencimiento) {
		this.anioDeVencimiento = anioDeVencimiento;
	}

	public short getClaveDeSeguridad() {
		return claveDeSeguridad;
	}

	public void setClaveDeSeguridad(short claveDeSeguridad) {
		this.claveDeSeguridad = claveDeSeguridad;
	}

	@Override
	public String toString() {
		return super.toString() + "\n=================================\n - Numero De Tarjeta" + numeroDeTarjeta
				+ "\n=================================\n Mes De Vencimiento: " + mesDeVencimiento
				+ "\n=================================\n - AÃ±o de Vencimiento: " + anioDeVencimiento
				+ "\n=================================\n - CCV: " + claveDeSeguridad + "]";
	}

}
package co.edu.unbosque.util.exception;

public class DescuentoException extends Exception {

	public DescuentoException() {
		super("El descuento debe ser un número entero entre 1 y 99");
	}

}

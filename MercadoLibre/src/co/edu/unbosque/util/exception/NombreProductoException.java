package co.edu.unbosque.util.exception;

public class NombreProductoException extends Exception {

	public NombreProductoException() {
		super("El nombre del producto debe tener mínimo una letra, y no puede contener caracteres");
	}

}

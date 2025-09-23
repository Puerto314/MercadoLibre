package co.edu.unbosque.util.exception;

public class LanzadorException {

	public static void verificarCantidadProductoValida(String entrada) throws CantidadProductoException {
		try {
			int cantidad = Integer.parseInt(entrada.trim());

			if (cantidad < 1 || cantidad > 99) {
				throw new CantidadProductoException();
			}

		} catch (NumberFormatException e) {
			throw new CantidadProductoException();
		} catch (NullPointerException e) {
			throw new CantidadProductoException();
		}
	}

	public static void verificarContraseñaValida(String entrada) throws ContraseniaException {

		if (entrada.length() < 4 || entrada.length() > 8) {
			throw new ContraseniaException();
		}

		boolean tieneMayuscula = false;
		boolean tieneMinuscula = false;
		boolean tieneNumero = false;

		for (char c : entrada.toCharArray()) {
			if (Character.isUpperCase(c)) {
				tieneMayuscula = true;
			} else if (Character.isLowerCase(c)) {
				tieneMinuscula = true;
			} else if (Character.isDigit(c)) {
				tieneNumero = true;
			}
		}

		if (!(tieneMayuscula && tieneMinuscula && tieneNumero)) {
			throw new ContraseniaException();
		}

	}

	public static void verificarDireccionValida(String entrada) throws DireccionException {

		if (entrada.length() < 5 || entrada.length() > 50) {
			throw new DireccionException();
		}

		boolean tieneLetra = false;
		boolean tieneNumero = false;

		for (char c : entrada.toCharArray()) {
			if (Character.isLetter(c)) {
				tieneLetra = true;
			} else if (Character.isDigit(c)) {
				tieneNumero = true;
			} else if (!(Character.isWhitespace(c) || c == '#' || c == '-')) {
				throw new DireccionException();
			}
		}

		if (!(tieneLetra && tieneNumero)) {
			throw new DireccionException();
		}

	}

	public static void verificarNombreUsuario(String entrada) throws NombreUsuarioException {
		if (entrada.length() < 4 || entrada.length() > 8) {
			throw new NombreUsuarioException();
		}

		boolean tieneLetra = false;

		for (char c : entrada.toCharArray()) {
			if (Character.isLetter(c)) {
				tieneLetra = true;
			}
		}

		if (!tieneLetra) {
			throw new NombreUsuarioException();
		}

	}

	public static void verificarNombrePersona(String entrada) throws NombreException {
		if (entrada.length() < 3 || entrada.length() > 12) {
			throw new NombreException();
		}

		for (char c : entrada.toCharArray()) {
			if (!Character.isLetter(c)) {
				throw new NombreException();
			}
		}

	}

	public static void verificarNumeroTarjeta(String entrada) throws NumeroTarjetaException {
		if (entrada.length() != 16) {
			throw new NumeroTarjetaException();
		}

		for (char c : entrada.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new NumeroTarjetaException();
			}
		}

	}

	public static void verificarPrecioProducto(String entrada) throws PrecioException {
		try {
			double valor = Double.parseDouble(entrada);

			if (valor <= 0) {
				throw new PrecioException();
			}

		} catch (NumberFormatException e) {
			throw new PrecioException();
		}
	}

	public static void verificarNumeroCelular(String entrada) throws TelefonoException {
		if (entrada.length() != 10) {
			throw new TelefonoException();
		}

		for (char c : entrada.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new TelefonoException();
			}
		}

	}

	public static void verificarDescuentoValido(String entrada) throws DescuentoException {
		try {
			int valor = Integer.parseInt(entrada);

			if (valor < 1 || valor > 99) {
				throw new DescuentoException();
			}

		} catch (NumberFormatException e) {
			throw new DescuentoException();
		}
	}

	public static void verificarPinValido(String entrada) throws DescuentoException {
		try {
			if (!entrada.matches("\\d{3}")) {
				throw new DescuentoException();
			}

		} catch (NumberFormatException e) {
			throw new DescuentoException();
		}
	}

	public static void verificarCiudadValida(String entrada) throws CiudadException {
		if (entrada == null || entrada.trim().isEmpty()) {
			throw new CiudadException();
		}
		if (!entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
			throw new CiudadException();
		}
	}

	public static void verificarProductoValido(String entrada) throws NombreProductoException {
		if (entrada == null || entrada.trim().isEmpty()) {
			throw new NombreProductoException();
		}
		if (!entrada.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ .,'()\\-]+")) {
			throw new NombreProductoException();
		}
	}

	public static void verificarCorreoValido(String entrada) throws CorreoException {
		if (entrada == null || entrada.trim().isEmpty()) {
			throw new CorreoException();
		}

		entrada = entrada.trim();

		String patronDelCorreo = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.(?:[A-Za-z]{2,})$";

		if (!entrada.matches(patronDelCorreo)) {
			throw new CorreoException();
		}

		if (!(entrada.endsWith("@unbosque.edu.co") || entrada.endsWith("@gmail.com")
				|| entrada.endsWith("@hotmail.com"))) {
			throw new CorreoException();
		}
	}

}

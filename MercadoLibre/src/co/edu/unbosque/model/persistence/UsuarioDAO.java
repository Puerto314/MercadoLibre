package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.Usuario;

public class UsuarioDAO implements DAO<Usuario> {

	private List<Usuario> listaUsuario = new ArrayList<>();
	private final String FILE_NAME = "Usuario.csv";
	private final String SERIAL_FILE_NAME = "Usuario.bin";

	public UsuarioDAO() {
		listaUsuario = new ArrayList<Usuario>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(Usuario objeto) {
		listaUsuario.add(objeto);
		escribirEnArchivoTexto();
		escribirArchivoSerializado();
	}

	@Override
	public List<Usuario> leerTodos() {
		return new ArrayList<>(listaUsuario);
	}

	@Override
	public boolean actualizar(Usuario objeto) {
		for (int i = 0; i < listaUsuario.size(); i++) {
			if (listaUsuario.get(i).getNombreUsuario().equalsIgnoreCase(objeto.getNombreUsuario())) {
				listaUsuario.set(i, objeto);
				escribirArchivoSerializado();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String producto) {
		boolean eliminado = listaUsuario.removeIf(p -> p.getNombreUsuario().equalsIgnoreCase(producto));
		if (eliminado) {
			escribirArchivoSerializado();
		}
		return eliminado;
	}

	@Override
	public void escribirEnArchivoTexto() {

		StringBuilder sb = new StringBuilder();
		for (Usuario Usuario : listaUsuario) {
			sb.append(Usuario.getNombreUsuario() + ";");
			sb.append(Usuario.getContrasenia() + ";");
			sb.append(Usuario.getDireccionCasa() + ";");
			sb.append(Usuario.getCorreo() + ";");
			sb.append(Usuario.getTelefono() + ";");
			sb.append(Usuario.getCiudad() + ";");
			sb.append(Usuario.getNumeroTarjeta() + ";");
			sb.append(Usuario.getClaveDeSeguridad() + ";");
			sb.append(Usuario.getFechaTarjeta() + ";");

		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto("Usuario.csv");
		if (contenido == "" || contenido.isBlank()) {
			return;
		} else {
			String[] filas = contenido.split("\n");
			for (int i = 0; i < filas.length; i++) {
				String[] columnas = filas[i].split(";");
				Usuario temp = new Usuario();
				temp.setNombreUsuario(contenido);
				temp.setContrasenia(columnas[1]);
				temp.setDireccionCasa(columnas[2]);
				temp.setCorreo(columnas[3]);
				temp.setTelefono(Long.parseLong(columnas[4]));
				temp.setCiudad(columnas[5]);
				temp.setNumeroTarjeta(columnas[6]);
				temp.setClaveDeSeguridad(Short.parseShort(columnas[7]));
				temp.setFechaTarjeta(Short.parseShort(columnas[8]));

				listaUsuario.add(temp);
			}

		}

	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaUsuario = (ArrayList<Usuario>) contenido;
		} else {
			listaUsuario = new ArrayList<>();
		}

	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaUsuario);

	}

	@Override
	public boolean existe(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}

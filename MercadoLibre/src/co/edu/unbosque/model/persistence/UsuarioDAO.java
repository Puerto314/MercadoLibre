package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.Usuario;

public class UsuarioDAO implements DAO<Usuario> {

	private List<Usuario> listaUsuario = new ArrayList<>();
	private final String FILE_NAME = "Usuario.csv";

	public UsuarioDAO() {
		listaUsuario = new ArrayList<>();
	}

	@Override
	public boolean crear(Usuario objeto) {
		for (Usuario Usuario : listaUsuario) {
			if (Usuario.getIdUsuario().equals(objeto.getIdUsuario())) {
				return false;
			}
		}
		return listaUsuario.add(objeto);
	}

	@Override
	public List<Usuario> leerTodos() {
		return new ArrayList<>(listaUsuario);
	}

	@Override
	public boolean actualizar(Usuario objeto) {
		for (int i = 0; i < listaUsuario.size(); i++) {
			if (listaUsuario.get(i).getIdUsuario().equalsIgnoreCase(objeto.getIdUsuario())) {
				listaUsuario.set(i, objeto);
				escribirEnArchivoTexto();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String producto) {
		return listaUsuario.removeIf(p -> p.getIdUsuario().equalsIgnoreCase(producto));
	}

	@Override
	public void escribirEnArchivoTexto() {

		StringBuilder sb = new StringBuilder();
		for (Usuario Usuario : listaUsuario) {
			sb.append(Usuario.getIdUsuario() + ";");
			sb.append(Usuario.getContrasenia() + ";");
			sb.append(Usuario.getDireccionCasa() + ";");
			sb.append(Usuario.getCorreo() + ";");
			sb.append(Usuario.getTelefono() + ";");
			sb.append(Usuario.getCiudad() + ";");
			sb.append(Usuario.getNumeroTarjeta() + ";");
			sb.append(Usuario.getClaveDeSeguridad() + ";");
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto("");
		if (contenido == "" || contenido.isBlank()) {
			return;
		} else {
			String[] filas = contenido.split("\n");
			for (int i = 0; i < filas.length; i++) {
				String[] columnas = filas[i].split(";");
				Usuario temp = new Usuario();
				temp.setIdUsuario(columnas[0]);
				temp.setContrasenia(columnas[1]);
				temp.setDireccionCasa(columnas[2]);
				temp.setCorreo(columnas[3]);
				temp.setTelefono(Long.parseLong(columnas[4]));
				temp.setCiudad(columnas[5]);
				temp.setNumeroTarjeta(columnas[6]);
				temp.setClaveDeSeguridad(Short.parseShort(columnas[7]));
				listaUsuario.add(temp);
			}

		}

	}

	@Override
	public List<Usuario> buscarPorAtributo(String atributo, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}

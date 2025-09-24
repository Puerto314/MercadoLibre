package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.Usuario;

public class UsuarioDAO implements DAO<Usuario> {

	private List<Usuario> listaUsuario = new ArrayList<>();
	private final String FILE_NAME = "Usuario.csv";
	private final String SERIAL_FILE_NAME = "Usuario.bin";

	public UsuarioDAO() {
	    listaUsuario = new ArrayList<>();
	    cargarDesdeArchivoSerializado();
	    if (listaUsuario.isEmpty()) {
	        leerDesdeArchivoDeTexto(FILE_NAME);
	    }
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
			sb.append(Usuario.getNombreUsuario()).append(";");
			sb.append(Usuario.getContrasenia()).append(";");
			sb.append(Usuario.getDireccionCasa()).append(";");
			sb.append(Usuario.getCorreo()).append(";");
			sb.append(Usuario.getTelefono()).append(";");
			sb.append(Usuario.getCiudad()).append(";\n");
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
	    String contenido = FileHandler.leerDesdeArchivoDeTexto("Usuario.csv");
	    if (contenido == null || contenido.isBlank()) {
	        return;
	    } else {
	        String[] filas = contenido.split("\n");
	        for (String fila : filas) {
	            if (fila.trim().isEmpty()) continue; // Saltar líneas vacías
	            
	            String[] columnas = fila.split(";");
	            if (columnas.length >= 6) { // Asegurar que tenemos todos los campos
	                Usuario temp = new Usuario();
	                temp.setNombreUsuario(columnas[0]); // ❌ ERROR ESTABA AQUÍ: tenías 'contenido' en lugar de 'columnas[0]'
	                temp.setContrasenia(columnas[1]);
	                temp.setDireccionCasa(columnas[2]);
	                temp.setCorreo(columnas[3]);
	                try {
	                    temp.setTelefono(Long.parseLong(columnas[4]));
	                } catch (NumberFormatException e) {
	                    System.err.println("Error parsing telefono: " + columnas[4]);
	                    continue; // Saltar este usuario si hay error
	                }
	                temp.setCiudad(columnas[5]);
	                listaUsuario.add(temp);
	            }
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

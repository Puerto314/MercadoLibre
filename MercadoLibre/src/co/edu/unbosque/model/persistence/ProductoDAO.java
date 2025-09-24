package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.Producto;

public class ProductoDAO implements DAO<Producto> {

	private List<Producto> listaProductos = new ArrayList<>();
	private final String FILE_NAME = "Producto.csv";
	private final String SERIAL_FILE_NAME = "Producto.bin";

	public ProductoDAO() {
		listaProductos = new ArrayList<Producto>();
		leerDesdeArchivoDeTexto(FILE_NAME);
//		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(Producto objeto) {
		listaProductos.add(objeto);
		escribirEnArchivoTexto();
//		escribirArchivoSerializado();
	}

	@Override
	public List<Producto> leerTodos() {
		return new ArrayList<>(listaProductos);
	}

	@Override
	public boolean actualizar(Producto objeto) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if (listaProductos.get(i).getNombreProducto().equalsIgnoreCase(objeto.getNombreProducto())) {
				listaProductos.set(i, objeto);
				escribirEnArchivoTexto();
//				escribirArchivoSerializado();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String producto) {
		return listaProductos.removeIf(p -> p.getNombreProducto().equalsIgnoreCase(producto));
	}

	@Override
	public void escribirEnArchivoTexto() {
		StringBuilder sb = new StringBuilder();
		for (Producto producto : listaProductos) {
			sb.append(producto.getNombreProducto() + ";");
			sb.append(producto.getPrecio() + ";");
			sb.append(producto.getCategoria() + ";");
			sb.append(producto.getCantidad() + ";");
			sb.append(producto.getPuntuacion() + ";");
			sb.append(producto.getRutaImagenProducto() + ";");

		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {

		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto("Producto.csv");
		if (contenido == "" || contenido.isBlank()) {
			return;
		} else {
			String[] filas = contenido.split("\n");
			for (int i = 0; i < filas.length; i++) {
				String[] columnas = filas[i].split(";");
				Producto temp = new Producto();
				temp.setNombreProducto(columnas[0]);
				temp.setPrecio(Float.parseFloat(columnas[1]));
				temp.setCategoria(columnas[2]);
				temp.setCantidad(Integer.parseInt(columnas[3]));
				temp.setPuntuacion(Double.parseDouble(columnas[4]));
				temp.setRutaImagenProducto(columnas[5]);

				listaProductos.add(temp);
			}

		}

	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaProductos = (ArrayList<Producto>) contenido;
		} else {
			listaProductos = new ArrayList<>();
		}

	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaProductos);

	}

	@Override
	public boolean existe(String id) {
		// FALTA POR AGREGAR
		return false;
	}

}

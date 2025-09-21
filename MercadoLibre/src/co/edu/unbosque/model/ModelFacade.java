package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CarritoDeCompraDAO;
import co.edu.unbosque.model.persistence.ProductoDAO;
import co.edu.unbosque.model.persistence.UsuarioDAO;

public class ModelFacade {

	private CarritoDeCompraDAO carritodecompraDAO;
	private ProductoDAO productoDAO;
	private UsuarioDAO usuarioDAO;

	public ModelFacade() {

		carritodecompraDAO = new CarritoDeCompraDAO();
		productoDAO = new ProductoDAO();
		usuarioDAO = new UsuarioDAO();

	}

	public CarritoDeCompraDAO getCarritodecompraDAO() {
		return carritodecompraDAO;
	}

	public void setCarritodecompraDAO(CarritoDeCompraDAO carritodecompraDAO) {
		this.carritodecompraDAO = carritodecompraDAO;
	}

	public ProductoDAO getProductoDAO() {
		return productoDAO;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}

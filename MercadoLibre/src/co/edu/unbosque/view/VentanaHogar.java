package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaHogar extends JFrame {
	private JLabel bannerHO;
	private JLabel imagenHO;
	private JLabel txtHO;
	private JButton bVolverHO;
	private JButton bModoVendedorHO;
	private JButton anadirCarrito;

	public VentanaHogar() {
		inicializarHogar();
		setVisible(false);
	}

	public void inicializarHogar() {
		// configuracion ventana
		setTitle("Ventana Categoría de Hogar y muebles");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerHO = new JLabel(imagen);
		bannerHO.setBounds(0, -30, 965, 180);
		add(bannerHO);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverHO = new JButton("VOLVER");
		bVolverHO.setBounds(795, 590, 100, 40);
		bVolverHO.setBackground(Color.decode("#042F6D"));
		bVolverHO.setForeground(Color.decode("#FFFFFF"));
		bVolverHO.setFocusPainted(false);
		bVolverHO.setBorderPainted(false);
		add(bVolverHO);

		// boton vendedor
		bModoVendedorHO = new JButton("MODO VENDEDOR");
		bModoVendedorHO.setBounds(610, 590, 180, 40);
		bModoVendedorHO.setBackground(Color.decode("#042F6D"));
		bModoVendedorHO.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorHO.setFocusPainted(false);
		bModoVendedorHO.setBorderPainted(false);
		add(bModoVendedorHO);

		// boton carrito
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		anadirCarrito = new JButton(imagen1);
		anadirCarrito.setBounds(565, 590, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		this.add(anadirCarrito);
	}

	public JLabel getBannerHO() {
		return bannerHO;
	}

	public void setBannerHO(JLabel bannerHO) {
		this.bannerHO = bannerHO;
	}

	public JLabel getImagenHO() {
		return imagenHO;
	}

	public void setImagenHO(JLabel imagenHO) {
		this.imagenHO = imagenHO;
	}

	public JLabel getTxtHO() {
		return txtHO;
	}

	public void setTxtHO(JLabel txtHO) {
		this.txtHO = txtHO;
	}

	public JButton getbVolverHO() {
		return bVolverHO;
	}

	public void setbVolverHO(JButton bVolverHO) {
		this.bVolverHO = bVolverHO;
	}

	public JButton getbModoVendedorHO() {
		return bModoVendedorHO;
	}

	public void setbModoVendedorHO(JButton bModoVendedorHO) {
		this.bModoVendedorHO = bModoVendedorHO;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

}

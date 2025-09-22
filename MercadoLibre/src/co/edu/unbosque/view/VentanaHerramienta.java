package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaHerramienta extends JFrame {

	private JLabel bannerHE;
	private JLabel imagenHE;
	private JLabel txtHE;
	private JButton bVolverHE;
	private JButton bModoVendedorHE;
	private JButton anadirCarrito;

	public VentanaHerramienta() {
		inicializarHerramienta();
		setVisible(false);
	}

	public void inicializarHerramienta() {
		// configuracion ventana
		setTitle("Ventana Categoría de Herramientas de Construccion");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerHE = new JLabel(imagen);
		bannerHE.setBounds(0, -30, 965, 180);
		add(bannerHE);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverHE = new JButton("VOLVER");
		bVolverHE.setBounds(795, 590, 100, 40);
		bVolverHE.setBackground(Color.decode("#042F6D"));
		bVolverHE.setForeground(Color.decode("#FFFFFF"));
		bVolverHE.setFocusPainted(false);
		bVolverHE.setBorderPainted(false);
		add(bVolverHE);

		// boton vendedor
		bModoVendedorHE = new JButton("MODO VENDEDOR");
		bModoVendedorHE.setBounds(610, 590, 180, 40);
		bModoVendedorHE.setBackground(Color.decode("#042F6D"));
		bModoVendedorHE.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorHE.setFocusPainted(false);
		bModoVendedorHE.setBorderPainted(false);
		add(bModoVendedorHE);

		// boton carrito
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		anadirCarrito = new JButton(imagen1);
		anadirCarrito.setBounds(565, 590, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		this.add(anadirCarrito);
	}

	public JLabel getBannerHE() {
		return bannerHE;
	}

	public void setBannerHE(JLabel bannerHE) {
		this.bannerHE = bannerHE;
	}

	public JLabel getImagenHE() {
		return imagenHE;
	}

	public void setImagenHE(JLabel imagenHE) {
		this.imagenHE = imagenHE;
	}

	public JLabel getTxtHE() {
		return txtHE;
	}

	public void setTxtHE(JLabel txtHE) {
		this.txtHE = txtHE;
	}

	public JButton getbVolverHE() {
		return bVolverHE;
	}

	public void setbVolverHE(JButton bVolverHE) {
		this.bVolverHE = bVolverHE;
	}

	public JButton getbModoVendedorHE() {
		return bModoVendedorHE;
	}

	public void setbModoVendedorHE(JButton bModoVendedorHE) {
		this.bModoVendedorHE = bModoVendedorHE;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

}

package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaArte extends JFrame {

	private JLabel bannerA;
	private JLabel imagenA;
	private JLabel txtA;
	private JButton bVolverA;
	private JButton bModoVendedorA;
	private JButton anadirCarrito;

	public VentanaArte() {
		inicializarArte();
		setVisible(false);
	}

	public void inicializarArte() {
		// configuracion ventana
		setTitle("Ventana Categoría de Arte");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerA = new JLabel(imagen);
		bannerA.setBounds(0, -30, 965, 180);
		add(bannerA);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverA = new JButton("VOLVER");
		bVolverA.setBounds(795, 590, 100, 40);
		bVolverA.setBackground(Color.decode("#042F6D"));
		bVolverA.setForeground(Color.decode("#FFFFFF"));
		bVolverA.setFocusPainted(false);
		bVolverA.setBorderPainted(false);
		add(bVolverA);

		// boton vendedor
		bModoVendedorA = new JButton("MODO VENDEDOR");
		bModoVendedorA.setBounds(610, 590, 180, 40);
		bModoVendedorA.setBackground(Color.decode("#042F6D"));
		bModoVendedorA.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorA.setFocusPainted(false);
		bModoVendedorA.setBorderPainted(false);
		add(bModoVendedorA);

		// boton carrito
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		anadirCarrito = new JButton(imagen1);
		anadirCarrito.setBounds(565, 590, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		this.add(anadirCarrito);
	}

	public JLabel getBannerA() {
		return bannerA;
	}

	public void setBannerA(JLabel bannerA) {
		this.bannerA = bannerA;
	}

	public JLabel getImagenA() {
		return imagenA;
	}

	public void setImagenA(JLabel imagenA) {
		this.imagenA = imagenA;
	}

	public JLabel getTxtA() {
		return txtA;
	}

	public void setTxtA(JLabel txtA) {
		this.txtA = txtA;
	}

	public JButton getbVolverA() {
		return bVolverA;
	}

	public void setbVolverA(JButton bVolverA) {
		this.bVolverA = bVolverA;
	}

	public JButton getbModoVendedorA() {
		return bModoVendedorA;
	}

	public void setbModoVendedorA(JButton bModoVendedorA) {
		this.bModoVendedorA = bModoVendedorA;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

}

package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaBelleza extends JFrame{
	private JLabel bannerB;
	private JLabel imagenB;
	private JLabel txtB;
	private JButton bVolverB;
	private JButton bModoVendedorB;
	private JButton anadirCarrito;

	public VentanaBelleza() {
		inicializarBelleza();
		setVisible(false);
	}

	public void inicializarBelleza() {
		// configuracion ventana
		setTitle("Ventana Categoría de Belleza");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerB = new JLabel(imagen);
		bannerB.setBounds(0, -30, 965, 180);
		add(bannerB);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverB = new JButton("VOLVER");
		bVolverB.setBounds(795, 590, 100, 40);
		bVolverB.setBackground(Color.decode("#042F6D"));
		bVolverB.setForeground(Color.decode("#FFFFFF"));
		bVolverB.setFocusPainted(false);
		bVolverB.setBorderPainted(false);
		add(bVolverB);

		// boton vendedor
		bModoVendedorB = new JButton("MODO VENDEDOR");
		bModoVendedorB.setBounds(610, 590, 180, 40);
		bModoVendedorB.setBackground(Color.decode("#042F6D"));
		bModoVendedorB.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorB.setFocusPainted(false);
		bModoVendedorB.setBorderPainted(false);
		add(bModoVendedorB);
	}

	public JLabel getBannerB() {
		return bannerB;
	}

	public void setBannerB(JLabel bannerB) {
		this.bannerB = bannerB;
	}

	public JLabel getImagenB() {
		return imagenB;
	}

	public void setImagenB(JLabel imagenB) {
		this.imagenB = imagenB;
	}

	public JLabel getTxtB() {
		return txtB;
	}

	public void setTxtB(JLabel txtB) {
		this.txtB = txtB;
	}

	public JButton getbVolverB() {
		return bVolverB;
	}

	public void setbVolverB(JButton bVolverB) {
		this.bVolverB = bVolverB;
	}

	public JButton getbModoVendedorB() {
		return bModoVendedorB;
	}

	public void setbModoVendedorB(JButton bModoVendedorB) {
		this.bModoVendedorB = bModoVendedorB;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

	

	
}

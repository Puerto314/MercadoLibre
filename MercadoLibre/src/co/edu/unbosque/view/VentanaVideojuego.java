package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaVideojuego extends JFrame{
	private JLabel bannerV;
	private JLabel imagenV;
	private JLabel txtV;
	private JButton bVolverV;
	private JButton bModoVendedorV;
	private JButton anadirCarrito;

	public VentanaVideojuego() {
		inicializarVideojuego();
		setVisible(false);
	}

	public void inicializarVideojuego() {
		// configuracion ventana
		setTitle("Ventana Categoría de Videojuegos");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerV = new JLabel(imagen);
		bannerV.setBounds(0, -30, 965, 180);
		add(bannerV);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverV = new JButton("VOLVER");
		bVolverV.setBounds(795, 590, 100, 40);
		bVolverV.setBackground(Color.decode("#042F6D"));
		bVolverV.setForeground(Color.decode("#FFFFFF"));
		bVolverV.setFocusPainted(false);
		bVolverV.setBorderPainted(false);
		add(bVolverV);

		// boton vendedor
		bModoVendedorV = new JButton("MODO VENDEDOR");
		bModoVendedorV.setBounds(610, 590, 180, 40);
		bModoVendedorV.setBackground(Color.decode("#042F6D"));
		bModoVendedorV.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorV.setFocusPainted(false);
		bModoVendedorV.setBorderPainted(false);
		add(bModoVendedorV);
	}

	public JLabel getBannerM() {
		return bannerV;
	}

	public void setBannerM(JLabel bannerM) {
		this.bannerV = bannerM;
	}

	public JLabel getImagenM() {
		return imagenV;
	}

	public void setImagenM(JLabel imagenM) {
		this.imagenV = imagenM;
	}

	public JLabel getTxtM() {
		return txtV;
	}

	public void setTxtM(JLabel txtM) {
		this.txtV = txtM;
	}

	public JButton getbVolverM() {
		return bVolverV;
	}

	public void setbVolverM(JButton bVolverM) {
		this.bVolverV = bVolverM;
	}

	public JButton getbModoVendedorM() {
		return bModoVendedorV;
	}

	public void setbModoVendedorM(JButton bModoVendedorM) {
		this.bModoVendedorV = bModoVendedorM;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}
	
	

}

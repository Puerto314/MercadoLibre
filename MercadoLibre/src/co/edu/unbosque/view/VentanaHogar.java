package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaHogar extends JFrame{
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
	}

	public JLabel getBannerM() {
		return bannerHO;
	}

	public void setBannerM(JLabel bannerM) {
		this.bannerHO = bannerM;
	}

	public JLabel getImagenM() {
		return imagenHO;
	}

	public void setImagenM(JLabel imagenM) {
		this.imagenHO = imagenM;
	}

	public JLabel getTxtM() {
		return txtHO;
	}

	public void setTxtM(JLabel txtM) {
		this.txtHO = txtM;
	}

	public JButton getbVolverM() {
		return bVolverHO;
	}

	public void setbVolverM(JButton bVolverM) {
		this.bVolverHO = bVolverM;
	}

	public JButton getbModoVendedorM() {
		return bModoVendedorHO;
	}

	public void setbModoVendedorM(JButton bModoVendedorM) {
		this.bModoVendedorHO = bModoVendedorM;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}
	
	

}

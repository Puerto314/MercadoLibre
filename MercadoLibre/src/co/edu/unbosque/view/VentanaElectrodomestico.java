package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaElectrodomestico extends JFrame{
	
	private JLabel bannerE;
	private JLabel imagenE;
	private JLabel txtE;
	private JButton bVolverE;
	private JButton bModoVendedorE;
	private JButton anadirCarrito;

	public VentanaElectrodomestico() {
		inicializarElectrodomestico();
		setVisible(false);
	}

	public void inicializarElectrodomestico() {
		// configuracion ventana
		setTitle("Ventana Categoría de Electrodomesticos");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerE = new JLabel(imagen);
		bannerE.setBounds(0, -30, 965, 180);
		add(bannerE);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverE = new JButton("VOLVER");
		bVolverE.setBounds(795, 590, 100, 40);
		bVolverE.setBackground(Color.decode("#042F6D"));
		bVolverE.setForeground(Color.decode("#FFFFFF"));
		bVolverE.setFocusPainted(false);
		bVolverE.setBorderPainted(false);
		add(bVolverE);

		// boton vendedor
		bModoVendedorE = new JButton("MODO VENDEDOR");
		bModoVendedorE.setBounds(610, 590, 180, 40);
		bModoVendedorE.setBackground(Color.decode("#042F6D"));
		bModoVendedorE.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorE.setFocusPainted(false);
		bModoVendedorE.setBorderPainted(false);
		add(bModoVendedorE);
	}

	public JLabel getBannerM() {
		return bannerE;
	}

	public void setBannerM(JLabel bannerM) {
		this.bannerE = bannerM;
	}

	public JLabel getImagenM() {
		return imagenE;
	}

	public void setImagenM(JLabel imagenM) {
		this.imagenE = imagenM;
	}

	public JLabel getTxtM() {
		return txtE;
	}

	public void setTxtM(JLabel txtM) {
		this.txtE = txtM;
	}

	public JButton getbVolverM() {
		return bVolverE;
	}

	public void setbVolverM(JButton bVolverM) {
		this.bVolverE = bVolverM;
	}

	public JButton getbModoVendedorM() {
		return bModoVendedorE;
	}

	public void setbModoVendedorM(JButton bModoVendedorM) {
		this.bModoVendedorE = bModoVendedorM;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}
	
	

}

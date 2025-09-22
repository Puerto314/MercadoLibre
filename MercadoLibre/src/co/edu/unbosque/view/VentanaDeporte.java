package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaDeporte extends JFrame{
	private JLabel bannerMD;
	private JLabel imagenD;
	private JLabel txtD;
	private JButton bVolverD;
	private JButton bModoVendedorD;
	private JButton anadirCarrito;

	public VentanaDeporte() {
		inicializarDeporte();
		setVisible(false);
	}

	public void inicializarDeporte() {
		// configuracion ventana
		setTitle("Ventana Categoría de Deportes");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerMD = new JLabel(imagen);
		bannerMD.setBounds(0, -30, 965, 180);
		add(bannerMD);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverD = new JButton("VOLVER");
		bVolverD.setBounds(795, 590, 100, 40);
		bVolverD.setBackground(Color.decode("#042F6D"));
		bVolverD.setForeground(Color.decode("#FFFFFF"));
		bVolverD.setFocusPainted(false);
		bVolverD.setBorderPainted(false);
		add(bVolverD);

		// boton vendedor
		bModoVendedorD = new JButton("MODO VENDEDOR");
		bModoVendedorD.setBounds(610, 590, 180, 40);
		bModoVendedorD.setBackground(Color.decode("#042F6D"));
		bModoVendedorD.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorD.setFocusPainted(false);
		bModoVendedorD.setBorderPainted(false);
		add(bModoVendedorD);
	}

	public JLabel getBannerM() {
		return bannerMD;
	}

	public void setBannerM(JLabel bannerM) {
		this.bannerMD = bannerM;
	}

	public JLabel getImagenM() {
		return imagenD;
	}

	public void setImagenM(JLabel imagenM) {
		this.imagenD = imagenM;
	}

	public JLabel getTxtM() {
		return txtD;
	}

	public void setTxtM(JLabel txtM) {
		this.txtD = txtM;
	}

	public JButton getbVolverM() {
		return bVolverD;
	}

	public void setbVolverM(JButton bVolverM) {
		this.bVolverD = bVolverM;
	}

	public JButton getbModoVendedorM() {
		return bModoVendedorD;
	}

	public void setbModoVendedorM(JButton bModoVendedorM) {
		this.bModoVendedorD = bModoVendedorM;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

	
}

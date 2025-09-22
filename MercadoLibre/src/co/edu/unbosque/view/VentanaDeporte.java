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

	public JLabel getBannerMD() {
		return bannerMD;
	}

	public void setBannerMD(JLabel bannerMD) {
		this.bannerMD = bannerMD;
	}

	public JLabel getImagenD() {
		return imagenD;
	}

	public void setImagenD(JLabel imagenD) {
		this.imagenD = imagenD;
	}

	public JLabel getTxtD() {
		return txtD;
	}

	public void setTxtD(JLabel txtD) {
		this.txtD = txtD;
	}

	public JButton getbVolverD() {
		return bVolverD;
	}

	public void setbVolverD(JButton bVolverD) {
		this.bVolverD = bVolverD;
	}

	public JButton getbModoVendedorD() {
		return bModoVendedorD;
	}

	public void setbModoVendedorD(JButton bModoVendedorD) {
		this.bModoVendedorD = bModoVendedorD;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

	
}

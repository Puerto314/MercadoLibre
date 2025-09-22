package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaArte extends JFrame {

	private JLabel bannerM;
	private JLabel imagenM;
	private JLabel txtM;
	private JButton bVolverM;
	private JButton bModoVendedorM;
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
		bannerM = new JLabel(imagen);
		bannerM.setBounds(0, -30, 965, 180);
		add(bannerM);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverM = new JButton("VOLVER");
		bVolverM.setBounds(795, 590, 100, 40);
		bVolverM.setBackground(Color.decode("#042F6D"));
		bVolverM.setForeground(Color.decode("#FFFFFF"));
		bVolverM.setFocusPainted(false);
		bVolverM.setBorderPainted(false);
		add(bVolverM);

		// boton vendedor
		bModoVendedorM = new JButton("MODO VENDEDOR");
		bModoVendedorM.setBounds(610, 590, 180, 40);
		bModoVendedorM.setBackground(Color.decode("#042F6D"));
		bModoVendedorM.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorM.setFocusPainted(false);
		bModoVendedorM.setBorderPainted(false);
		add(bModoVendedorM);
	}

	public JLabel getBannerM() {
		return bannerM;
	}

	public void setBannerM(JLabel bannerM) {
		this.bannerM = bannerM;
	}

	public JLabel getImagenM() {
		return imagenM;
	}

	public void setImagenM(JLabel imagenM) {
		this.imagenM = imagenM;
	}

	public JLabel getTxtM() {
		return txtM;
	}

	public void setTxtM(JLabel txtM) {
		this.txtM = txtM;
	}

	public JButton getbVolverM() {
		return bVolverM;
	}

	public void setbVolverM(JButton bVolverM) {
		this.bVolverM = bVolverM;
	}

	public JButton getbModoVendedorM() {
		return bModoVendedorM;
	}

	public void setbModoVendedorM(JButton bModoVendedorM) {
		this.bModoVendedorM = bModoVendedorM;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}
	
	

}

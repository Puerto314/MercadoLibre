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
	}

	public JLabel getBannerM() {
		return bannerA;
	}

	public void setBannerM(JLabel bannerM) {
		this.bannerA = bannerM;
	}

	public JLabel getImagenM() {
		return imagenA;
	}

	public void setImagenM(JLabel imagenM) {
		this.imagenA = imagenM;
	}

	public JLabel getTxtM() {
		return txtA;
	}

	public void setTxtM(JLabel txtM) {
		this.txtA = txtM;
	}

	public JButton getbVolverM() {
		return bVolverA;
	}

	public void setbVolverM(JButton bVolverM) {
		this.bVolverA = bVolverM;
	}

	public JButton getbModoVendedorM() {
		return bModoVendedorA;
	}

	public void setbModoVendedorM(JButton bModoVendedorM) {
		this.bModoVendedorA = bModoVendedorM;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}
	
	

}

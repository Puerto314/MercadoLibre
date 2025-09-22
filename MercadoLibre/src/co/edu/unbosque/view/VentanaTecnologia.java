package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaTecnologia extends JFrame {
	private JLabel bannerT;
	private JLabel imagenT;
	private JLabel txtT;
	private JButton bVolverT;
	private JButton bModoVendedorT;
	private JButton anadirCarrito;

	public VentanaTecnologia() {
		inicializarTecnologia();
		setVisible(false);
	}

	public void inicializarTecnologia() {
		// configuracion ventana
		setTitle("Ventana Categoría de Tecnologia");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerT = new JLabel(imagen);
		bannerT.setBounds(0, -30, 965, 180);
		add(bannerT);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverT = new JButton("VOLVER");
		bVolverT.setBounds(795, 590, 100, 40);
		bVolverT.setBackground(Color.decode("#042F6D"));
		bVolverT.setForeground(Color.decode("#FFFFFF"));
		bVolverT.setFocusPainted(false);
		bVolverT.setBorderPainted(false);
		add(bVolverT);

		// boton vendedor
		bModoVendedorT = new JButton("MODO VENDEDOR");
		bModoVendedorT.setBounds(610, 590, 180, 40);
		bModoVendedorT.setBackground(Color.decode("#042F6D"));
		bModoVendedorT.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorT.setFocusPainted(false);
		bModoVendedorT.setBorderPainted(false);
		add(bModoVendedorT);
	}

	public JLabel getBannerT() {
		return bannerT;
	}

	public void setBannerT(JLabel bannerT) {
		this.bannerT = bannerT;
	}

	public JLabel getImagenT() {
		return imagenT;
	}

	public void setImagenT(JLabel imagenT) {
		this.imagenT = imagenT;
	}

	public JLabel getTxtT() {
		return txtT;
	}

	public void setTxtT(JLabel txtT) {
		this.txtT = txtT;
	}

	public JButton getbVolverT() {
		return bVolverT;
	}

	public void setbVolverT(JButton bVolverT) {
		this.bVolverT = bVolverT;
	}

	public JButton getbModoVendedorT() {
		return bModoVendedorT;
	}

	public void setbModoVendedorT(JButton bModoVendedorT) {
		this.bModoVendedorT = bModoVendedorT;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

}

package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaElectrodomestico extends JFrame {

	private JLabel bannerE;
	private JLabel imagenE;
	private JLabel txtE;
	private JButton bVolverE;
	private JButton bModoVendedorE;

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

	public JLabel getBannerE() {
		return bannerE;
	}

	public void setBannerE(JLabel bannerE) {
		this.bannerE = bannerE;
	}

	public JLabel getImagenE() {
		return imagenE;
	}

	public void setImagenE(JLabel imagenE) {
		this.imagenE = imagenE;
	}

	public JLabel getTxtE() {
		return txtE;
	}

	public void setTxtE(JLabel txtE) {
		this.txtE = txtE;
	}

	public JButton getbVolverE() {
		return bVolverE;
	}

	public void setbVolverE(JButton bVolverE) {
		this.bVolverE = bVolverE;
	}

	public JButton getbModoVendedorE() {
		return bModoVendedorE;
	}

	public void setbModoVendedorE(JButton bModoVendedorE) {
		this.bModoVendedorE = bModoVendedorE;
	}

}

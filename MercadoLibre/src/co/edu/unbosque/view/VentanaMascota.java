package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaMascota extends JFrame {
	
	private JLabel bannerMa;
	private JLabel imagenMa;
	private JLabel txtMa;
	private JButton bVolverMa;
	private JButton bModoVendedorMa;
	private JButton anadirCarrito;

	public VentanaMascota() {
		inicializarMascota();
		setVisible(false);
	}

	public void inicializarMascota() {
		// configuracion ventana
		setTitle("Ventana Categoría de Productos para Mascotas");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerMa = new JLabel(imagen);
		bannerMa.setBounds(0, -30, 965, 180);
		add(bannerMa);

		// boton volver -> la idea es que vuelva a la ventana categoria
		bVolverMa = new JButton("VOLVER");
		bVolverMa.setBounds(795, 590, 100, 40);
		bVolverMa.setBackground(Color.decode("#042F6D"));
		bVolverMa.setForeground(Color.decode("#FFFFFF"));
		bVolverMa.setFocusPainted(false);
		bVolverMa.setBorderPainted(false);
		add(bVolverMa);

		// boton vendedor
		bModoVendedorMa = new JButton("MODO VENDEDOR");
		bModoVendedorMa.setBounds(610, 590, 180, 40);
		bModoVendedorMa.setBackground(Color.decode("#042F6D"));
		bModoVendedorMa.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorMa.setFocusPainted(false);
		bModoVendedorMa.setBorderPainted(false);
		add(bModoVendedorMa);

		// boton carrito
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("spanish.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		anadirCarrito = new JButton(imagen1);
		anadirCarrito.setBounds(380, 500, 35, 35);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		this.add(anadirCarrito);

	}

	public JLabel getBannerMa() {
		return bannerMa;
	}

	public void setBannerMa(JLabel bannerMa) {
		this.bannerMa = bannerMa;
	}

	public JLabel getImagenMa() {
		return imagenMa;
	}

	public void setImagenMa(JLabel imagenMa) {
		this.imagenMa = imagenMa;
	}

	public JLabel getTxtMa() {
		return txtMa;
	}

	public void setTxtMa(JLabel txtMa) {
		this.txtMa = txtMa;
	}

	public JButton getbVolverMa() {
		return bVolverMa;
	}

	public void setbVolverMa(JButton bVolverMa) {
		this.bVolverMa = bVolverMa;
	}

	public JButton getbModoVendedorMa() {
		return bModoVendedorMa;
	}

	public void setbModoVendedorMa(JButton bModoVendedorMa) {
		this.bModoVendedorMa = bModoVendedorMa;
	}

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}
	
	

}

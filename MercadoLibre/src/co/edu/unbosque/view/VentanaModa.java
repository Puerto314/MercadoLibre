package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class VentanaModa extends JFrame {

	private JLabel bannerM;
	private JLabel imagenM;
	private JLabel txtM;
	private JButton bVolverM;
	private JButton bModoVendedorM;
	private JButton anadirCarrito;
	private JLabel producto1;
	private JScrollPane scroll;

	public VentanaModa() {
		inicializarModa();
		setVisible(false);
	}

	public void inicializarModa() {
		// CONFIGURACION VENTANA
		setTitle("Ventana Categoría de Moda");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// IMAGEN
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		bannerM = new JLabel(imagen);
		bannerM.setBounds(0, -30, 965, 180);
		add(bannerM);

		// PANEL
		JPanel panelProductos = new JPanel();
		panelProductos.setLayout(null); // POSICIONES MANUALES
		panelProductos.setBackground(Color.WHITE);

		// PRODUCTO 1
		ImageIcon imgProducto = new ImageIcon(getClass().getResource("productomoda1.png"));
		Image img = imgProducto.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto1 = new JLabel(new ImageIcon(img));
		producto1.setBounds(30, 30, 200, 200);
		panelProductos.add(producto1);

		// ACÁ SE PUEDEN AÑADIR MÁS PRODUCTOS CON JLabel + setBounds

		// AJUSTE DEL TAMAÑO DEL PANEL
		panelProductos.setPreferredSize(new java.awt.Dimension(800, 600));

		// SCROLL CON EL PANEL DE PRODUCTOS
		scroll = new JScrollPane(panelProductos, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(50, 150, 870, 420); // POSICION Y TAMAÑO DEL RECUADRO
		scroll.setBorder(BorderFactory.createTitledBorder("Productos de moda"));
		add(scroll);

		// BOTON VOLVER
		bVolverM = new JButton("VOLVER");
		bVolverM.setBounds(795, 590, 100, 40);
		bVolverM.setBackground(Color.decode("#042F6D"));
		bVolverM.setForeground(Color.decode("#FFFFFF"));
		bVolverM.setFocusPainted(false);
		bVolverM.setBorderPainted(false);
		add(bVolverM);

		// BOTON VENDEDOR
		bModoVendedorM = new JButton("MODO VENDEDOR");
		bModoVendedorM.setBounds(610, 590, 180, 40);
		bModoVendedorM.setBackground(Color.decode("#042F6D"));
		bModoVendedorM.setForeground(Color.decode("#FFFFFF"));
		bModoVendedorM.setFocusPainted(false);
		bModoVendedorM.setBorderPainted(false);
		add(bModoVendedorM);

		// BOTON CARRITO
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("carrito.JPG"));
		anadirCarrito = new JButton(imagen1);
		anadirCarrito.setBounds(565, 590, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		this.add(anadirCarrito);
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

	public JLabel getProducto1() {
		return producto1;
	}

	public void setProducto1(JLabel producto1) {
		this.producto1 = producto1;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

}

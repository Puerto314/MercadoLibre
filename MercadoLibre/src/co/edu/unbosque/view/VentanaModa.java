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
	private JScrollPane scroll;
	private JLabel producto1;
	private JLabel producto2;
	private JLabel producto3;
	private JLabel producto4;
	private JLabel producto5;

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
		ImageIcon pro1 = new ImageIcon(getClass().getResource("productomoda1.png"));
		Image img1 = pro1.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto1 = new JLabel(new ImageIcon(img1));
		producto1.setBounds(30, 30, 200, 200);
		panelProductos.add(producto1);

		// PRODUCTO 2
		ImageIcon pro2 = new ImageIcon(getClass().getResource("productomoda2.png"));
		Image img2 = pro2.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto2 = new JLabel(new ImageIcon(img2));
		producto2.setBounds(30, 260, 200, 200);
		panelProductos.add(producto2);

		// PRODUCTO 3
		ImageIcon pro3 = new ImageIcon(getClass().getResource("productomoda3.png"));
		Image img3 = pro3.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto3 = new JLabel(new ImageIcon(img3));
		producto3.setBounds(30, 490, 200, 200);
		panelProductos.add(producto3);

		// PRODUCTO 4
		ImageIcon pro4 = new ImageIcon(getClass().getResource("productomoda4.png"));
		Image img4 = pro4.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto4 = new JLabel(new ImageIcon(img4));
		producto4.setBounds(30, 720, 200, 200);
		panelProductos.add(producto4);

		// PRODUCTO 5
		ImageIcon pro5 = new ImageIcon(getClass().getResource("productomoda5.png"));
		Image img5 = pro5.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto5 = new JLabel(new ImageIcon(img5));
		producto5.setBounds(30, 950, 200, 200);
		panelProductos.add(producto5);

		// AJUSTE DEL TAMAÑO DEL PANEL
		panelProductos.setPreferredSize(new java.awt.Dimension(800, 1200));

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

	public JLabel getProducto2() {
		return producto2;
	}

	public void setProducto2(JLabel producto2) {
		this.producto2 = producto2;
	}

	public JLabel getProducto3() {
		return producto3;
	}

	public void setProducto3(JLabel producto3) {
		this.producto3 = producto3;
	}

	public JLabel getProducto4() {
		return producto4;
	}

	public void setProducto4(JLabel producto4) {
		this.producto4 = producto4;
	}

	public JLabel getProducto5() {
		return producto5;
	}

	public void setProducto5(JLabel producto5) {
		this.producto5 = producto5;
	}

}

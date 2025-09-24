package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
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
	private JScrollPane scroll;
	private JLabel producto1;
	private JLabel producto2;
	private JLabel producto3;
	private JLabel producto4;
	private JLabel producto5;
	private JLabel textoProducto1;
	private JLabel textoProducto2;
	private JLabel textoProducto3;
	private JLabel textoProducto4;
	private JLabel textoProducto5;
	private JLabel precioProducto1;
	private JLabel precioProducto2;
	private JLabel precioProducto3;
	private JLabel precioProducto4;
	private JLabel precioProducto5;
	private JButton anadirCarrito1;
	private JButton anadirCarrito2;
	private JButton anadirCarrito3;
	private JButton anadirCarrito4;
	private JButton anadirCarrito5;

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

		textoProducto1 = new JLabel("Pantalon cargo");
		textoProducto1.setBounds(260, 110, 150, 25);
		textoProducto1.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto1);

		precioProducto1 = new JLabel("130.000$");
		precioProducto1.setBounds(450, 110, 70, 25);
		precioProducto1.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto1);

		// PRODUCTO 2
		ImageIcon pro2 = new ImageIcon(getClass().getResource("productomoda2.png"));
		Image img2 = pro2.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto2 = new JLabel(new ImageIcon(img2));
		producto2.setBounds(30, 260, 200, 200);
		panelProductos.add(producto2);

		textoProducto2 = new JLabel("Jean mujer");
		textoProducto2.setBounds(260, 340, 150, 25);
		textoProducto2.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto2);

		precioProducto2 = new JLabel("120.000$");
		precioProducto2.setBounds(450, 340, 70, 25);
		precioProducto2.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto2);

		// PRODUCTO 3
		ImageIcon pro3 = new ImageIcon(getClass().getResource("productomoda3.png"));
		Image img3 = pro3.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto3 = new JLabel(new ImageIcon(img3));
		producto3.setBounds(30, 490, 200, 200);
		panelProductos.add(producto3);

		textoProducto3 = new JLabel("Camiseta verde");
		textoProducto3.setBounds(260, 570, 150, 25);
		textoProducto3.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto3);

		precioProducto3 = new JLabel("80.000$");
		precioProducto3.setBounds(450, 570, 70, 25);
		precioProducto3.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto3);

		// PRODUCTO 4
		ImageIcon pro4 = new ImageIcon(getClass().getResource("productomoda4.png"));
		Image img4 = pro4.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto4 = new JLabel(new ImageIcon(img4));
		producto4.setBounds(30, 720, 200, 200);
		panelProductos.add(producto4);

		textoProducto4 = new JLabel("Camiseta azul");
		textoProducto4.setBounds(260, 800, 150, 25);
		textoProducto4.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto4);

		precioProducto4 = new JLabel("75.000$");
		precioProducto4.setBounds(450, 800, 70, 25);
		precioProducto4.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto4);

		// PRODUCTO 5
		ImageIcon pro5 = new ImageIcon(getClass().getResource("productomoda5.png"));
		Image img5 = pro5.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto5 = new JLabel(new ImageIcon(img5));
		producto5.setBounds(30, 950, 200, 200);
		panelProductos.add(producto5);

		textoProducto5 = new JLabel("Pantalon azul");
		textoProducto5.setBounds(260, 1030, 150, 25);
		textoProducto5.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto5);

		precioProducto5 = new JLabel("95.000$");
		precioProducto5.setBounds(450, 1030, 70, 25);
		precioProducto5.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto5);

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

		ImageIcon imagen1 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		anadirCarrito1 = new JButton(imagen1);
		anadirCarrito1.setBounds(700, 110, 40, 40);
		anadirCarrito1.setFocusPainted(false);
		anadirCarrito1.setBorderPainted(true);
		panelProductos.add(anadirCarrito1);

		ImageIcon imagen2 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen2 = new JLabel(imagen2);
		anadirCarrito2 = new JButton(imagen2);
		anadirCarrito2.setBounds(700, 340, 40, 40);
		anadirCarrito2.setFocusPainted(false);
		anadirCarrito2.setBorderPainted(true);
		panelProductos.add(anadirCarrito2);

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		anadirCarrito3 = new JButton(imagen3);
		anadirCarrito3.setBounds(700, 570, 40, 40);
		anadirCarrito3.setFocusPainted(false);
		anadirCarrito3.setBorderPainted(true);
		panelProductos.add(anadirCarrito3);

		ImageIcon imagen4 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		anadirCarrito4 = new JButton(imagen4);
		anadirCarrito4.setBounds(700, 800, 40, 40);
		anadirCarrito4.setFocusPainted(false);
		anadirCarrito4.setBorderPainted(true);
		panelProductos.add(anadirCarrito4);

		ImageIcon imagen5 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen5 = new JLabel(imagen5);
		anadirCarrito5 = new JButton(imagen5);
		anadirCarrito5.setBounds(700, 1030, 40, 40);
		anadirCarrito5.setFocusPainted(false);
		anadirCarrito5.setBorderPainted(true);
		panelProductos.add(anadirCarrito5);

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

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JLabel getProducto1() {
		return producto1;
	}

	public void setProducto1(JLabel producto1) {
		this.producto1 = producto1;
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

	public JLabel getTextoProducto1() {
		return textoProducto1;
	}

	public void setTextoProducto1(JLabel textoProducto1) {
		this.textoProducto1 = textoProducto1;
	}

	public JLabel getTextoProducto2() {
		return textoProducto2;
	}

	public void setTextoProducto2(JLabel textoProducto2) {
		this.textoProducto2 = textoProducto2;
	}

	public JLabel getTextoProducto3() {
		return textoProducto3;
	}

	public void setTextoProducto3(JLabel textoProducto3) {
		this.textoProducto3 = textoProducto3;
	}

	public JLabel getTextoProducto4() {
		return textoProducto4;
	}

	public void setTextoProducto4(JLabel textoProducto4) {
		this.textoProducto4 = textoProducto4;
	}

	public JLabel getTextoProducto5() {
		return textoProducto5;
	}

	public void setTextoProducto5(JLabel textoProducto5) {
		this.textoProducto5 = textoProducto5;
	}

	public JLabel getPrecioProducto1() {
		return precioProducto1;
	}

	public void setPrecioProducto1(JLabel precioProducto1) {
		this.precioProducto1 = precioProducto1;
	}

	public JLabel getPrecioProducto2() {
		return precioProducto2;
	}

	public void setPrecioProducto2(JLabel precioProducto2) {
		this.precioProducto2 = precioProducto2;
	}

	public JLabel getPrecioProducto3() {
		return precioProducto3;
	}

	public void setPrecioProducto3(JLabel precioProducto3) {
		this.precioProducto3 = precioProducto3;
	}

	public JLabel getPrecioProducto4() {
		return precioProducto4;
	}

	public void setPrecioProducto4(JLabel precioProducto4) {
		this.precioProducto4 = precioProducto4;
	}

	public JLabel getPrecioProducto5() {
		return precioProducto5;
	}

	public void setPrecioProducto5(JLabel precioProducto5) {
		this.precioProducto5 = precioProducto5;
	}

	public JButton getAnadirCarrito1() {
		return anadirCarrito1;
	}

	public void setAnadirCarrito1(JButton anadirCarrito1) {
		this.anadirCarrito1 = anadirCarrito1;
	}

	public JButton getAnadirCarrito2() {
		return anadirCarrito2;
	}

	public void setAnadirCarrito2(JButton anadirCarrito2) {
		this.anadirCarrito2 = anadirCarrito2;
	}

	public JButton getAnadirCarrito3() {
		return anadirCarrito3;
	}

	public void setAnadirCarrito3(JButton anadirCarrito3) {
		this.anadirCarrito3 = anadirCarrito3;
	}

	public JButton getAnadirCarrito4() {
		return anadirCarrito4;
	}

	public void setAnadirCarrito4(JButton anadirCarrito4) {
		this.anadirCarrito4 = anadirCarrito4;
	}

	public JButton getAnadirCarrito5() {
		return anadirCarrito5;
	}

	public void setAnadirCarrito5(JButton anadirCarrito5) {
		this.anadirCarrito5 = anadirCarrito5;
	}

}

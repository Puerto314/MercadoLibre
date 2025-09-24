package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VentanaTecnologia extends JFrame {
	private JLabel bannerT;
	private JLabel imagenT;
	private JLabel txtT;
	private JButton bVolverT;
	private JButton bModoVendedorT;
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

		// PANEL
		JPanel panelProductos = new JPanel();
		panelProductos.setLayout(null); // POSICIONES MANUALES
		panelProductos.setBackground(Color.WHITE);

		// PRODUCTO 1
		ImageIcon pro1 = new ImageIcon(getClass().getResource("productotecnologia1.JPG"));
		Image img1 = pro1.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto1 = new JLabel(new ImageIcon(img1));
		producto1.setBounds(30, 30, 200, 200);
		panelProductos.add(producto1);

		textoProducto1 = new JLabel("Audifonos blancos");
		textoProducto1.setBounds(260, 110, 150, 25);
		textoProducto1.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto1);

		precioProducto1 = new JLabel("131.000$");
		precioProducto1.setBounds(450, 110, 70, 25);
		precioProducto1.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto1);

		// PRODUCTO 2
		ImageIcon pro2 = new ImageIcon(getClass().getResource("productotecnologia2.JPG"));
		Image img2 = pro2.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto2 = new JLabel(new ImageIcon(img2));
		producto2.setBounds(30, 260, 200, 200);
		panelProductos.add(producto2);

		textoProducto2 = new JLabel("Monitor LG27");
		textoProducto2.setBounds(260, 340, 150, 25);
		textoProducto2.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto2);

		precioProducto2 = new JLabel("578.900$");
		precioProducto2.setBounds(450, 340, 70, 25);
		precioProducto2.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto2);

		// PRODUCTO 3
		ImageIcon pro3 = new ImageIcon(getClass().getResource("productotecnologia3.JPG"));
		Image img3 = pro3.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto3 = new JLabel(new ImageIcon(img3));
		producto3.setBounds(30, 490, 200, 200);
		panelProductos.add(producto3);

		textoProducto3 = new JLabel("Cargador huawei tipo c");
		textoProducto3.setBounds(260, 570, 150, 25);
		textoProducto3.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto3);

		precioProducto3 = new JLabel("89.900$");
		precioProducto3.setBounds(450, 570, 70, 25);
		precioProducto3.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto3);

		// PRODUCTO 4
		ImageIcon pro4 = new ImageIcon(getClass().getResource("productotecnologia4.JPG"));
		Image img4 = pro4.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto4 = new JLabel(new ImageIcon(img4));
		producto4.setBounds(30, 720, 200, 200);
		panelProductos.add(producto4);

		textoProducto4 = new JLabel("Audífonos Xiaomi redmi");
		textoProducto4.setBounds(260, 800, 150, 25);
		textoProducto4.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto4);

		precioProducto4 = new JLabel("104.300$");
		precioProducto4.setBounds(450, 800, 70, 25);
		precioProducto4.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto4);

		// PRODUCTO 5
		ImageIcon pro5 = new ImageIcon(getClass().getResource("productomoda5.png"));
		Image img5 = pro5.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
		producto5 = new JLabel(new ImageIcon(img5));
		producto5.setBounds(30, 950, 200, 200);
		panelProductos.add(producto5);

		textoProducto5 = new JLabel("Proyector mini Epson");
		textoProducto5.setBounds(260, 1030, 150, 25);
		textoProducto5.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(textoProducto5);

		precioProducto5 = new JLabel("987.700$");
		precioProducto5.setBounds(450, 1030, 70, 25);
		precioProducto5.setFont(new Font("Arial", Font.BOLD, 16));
		panelProductos.add(precioProducto5);

		// AJUSTE DEL TAMAÑO DEL PANEL
		panelProductos.setPreferredSize(new java.awt.Dimension(800, 1200));

		// SCROLL CON EL PANEL DE PRODUCTOS
		scroll = new JScrollPane(panelProductos, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(50, 150, 870, 420); // POSICION Y TAMAÑO DEL RECUADRO
		scroll.setBorder(BorderFactory.createTitledBorder("Productos tecnológicos"));
		add(scroll);

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
		
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		anadirCarrito = new JButton(imagen1);
		anadirCarrito.setBounds(700, 110, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		panelProductos.add(anadirCarrito);

		ImageIcon imagen2 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen2 = new JLabel(imagen2);
		anadirCarrito = new JButton(imagen2);
		anadirCarrito.setBounds(700, 340, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		panelProductos.add(anadirCarrito);

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		anadirCarrito = new JButton(imagen3);
		anadirCarrito.setBounds(700, 570, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		panelProductos.add(anadirCarrito);

		ImageIcon imagen4 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		anadirCarrito = new JButton(imagen4);
		anadirCarrito.setBounds(700, 800, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		panelProductos.add(anadirCarrito);

		ImageIcon imagen5 = new ImageIcon(getClass().getResource("carrito.JPG"));
		JLabel labelImagen5 = new JLabel(imagen5);
		anadirCarrito = new JButton(imagen5);
		anadirCarrito.setBounds(700, 1030, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		panelProductos.add(anadirCarrito);


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

	public JButton getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(JButton anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

	
}

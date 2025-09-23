package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;

public class VentanaModa extends JFrame {

	private JLabel bannerM;
	private JLabel imagenM;
	private JLabel txtM;
	private JButton bVolverM;
	private JButton bModoVendedorM;
	private JButton anadirCarrito;

	// NUEVOS componentes
	private JTextArea areaTexto;
	private JScrollPane scrollTexto;

	public VentanaModa() {
		inicializarModa();
		setVisible(false);
	}

	public void inicializarModa() {
		// configuracion ventana
		setTitle("Ventana Categoría de Moda");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		bannerM = new JLabel(imagen);
		bannerM.setBounds(0, -30, 965, 180);
		add(bannerM);

		// ===== RECUADRO CON SCROLL Y TEXTO =====
		areaTexto = new JTextArea();
		areaTexto.setText("Aquí va la descripción de la categoría Moda.\n\n"
				+ "Puedes escribir bastante texto para que aparezca el scroll.\n"
				+ "Por ejemplo:\n"
				+ "1. Vestidos\n"
				+ "2. Camisas\n"
				+ "3. Zapatos\n"
				+ "4. Accesorios\n"
				+ "...\n\n"
				+ "Este es un ejemplo de cómo se vería un cuadro con scroll."+ "Puedes escribir bastante texto para que aparezca el scroll.\n"
				+ "Por ejemplo:\n"
				+ "1. Vestidos\n"
				+ "2. Camisas\n"
				+ "3. Zapatos\n"
				+ "4. Accesorios\n"
				+ "...\n\n"
				+ "Este es un ejemplo de cómo se vería un cuadro con scroll."+ "Puedes escribir bastante texto para que aparezca el scroll.\n"
				+ "Por ejemplo:\n"
				+ "1. Vestidos\n"
				+ "2. Camisas\n"
				+ "3. Zapatos\n"
				+ "4. Accesorios\n"
				+ "...\n\n"
				+ "Este es un ejemplo de cómo se vería un cuadro con scroll."+ "Puedes escribir bastante texto para que aparezca el scroll.\n"
				+ "Por ejemplo:\n"
				+ "1. Vestidos\n"
				+ "2. Camisas\n"
				+ "3. Zapatos\n"
				+ "4. Accesorios\n"
				+ "...\n\n"
				+ "Este es un ejemplo de cómo se vería un cuadro con scroll."+ "Puedes escribir bastante texto para que aparezca el scroll.\n"
				+ "Por ejemplo:\n"
				+ "1. Vestidos\n"
				+ "2. Camisas\n"
				+ "3. Zapatos\n"
				+ "4. Accesorios\n"
				+ "...\n\n"
				+ "Este es un ejemplo de cómo se vería un cuadro con scroll."+ "Puedes escribir bastante texto para que aparezca el scroll.\n"
				+ "Por ejemplo:\n"
				+ "1. Vestidos\n"
				+ "2. Camisas\n"
				+ "3. Zapatos\n"
				+ "4. Accesorios\n"
				+ "...\n\n"
				+ "Este es un ejemplo de cómo se vería un cuadro con scroll.");
		areaTexto.setLineWrap(true); // Ajusta texto al ancho
		areaTexto.setWrapStyleWord(true);
		areaTexto.setEditable(false); // solo lectura

		scrollTexto = new JScrollPane(areaTexto, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTexto.setBounds(200, 200, 550, 300); // posición y tamaño del recuadro
		scrollTexto.setBorder(BorderFactory.createTitledBorder("Información de Moda"));

		add(scrollTexto);

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

		// boton carrito
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("carrito.JPG"));
		anadirCarrito = new JButton(imagen1);
		anadirCarrito.setBounds(565, 590, 40, 40);
		anadirCarrito.setFocusPainted(false);
		anadirCarrito.setBorderPainted(true);
		this.add(anadirCarrito);
	}

	// GETTERS Y SETTERS
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

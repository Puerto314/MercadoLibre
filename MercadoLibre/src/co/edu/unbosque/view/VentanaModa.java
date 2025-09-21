package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaModa extends JFrame {

	private JLabel bannerM;
	private JLabel imagenM;
	private JLabel txtM;
	private JButton bVolverM;
	private JButton anadirCarrito;

	public VentanaModa() {
		inicializarModa();
		setVisible(false);
	}

	public void inicializarModa() {

		// banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerProducto.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		bannerM = new JLabel(imagen);
		bannerM.setBounds(-10, -30, 980, 200);
		add(bannerM);

	}

}

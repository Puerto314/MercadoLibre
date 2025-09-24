package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaModoVendedor extends JFrame {

	private JLabel bannerVentana;
	private JLabel labelTitulo;

	private JLabel labelNombreProducto;
	private JTextField textoNombreProducto;

	private JLabel labelPrecio;
	private JTextField textoPrecio;

	private JLabel labelCategoria;
	private JComboBox<String> comboBoxCategoria;

	private JLabel labelCantidad;
	private JTextField textoCantidad;

	private JLabel labelPuntuacion;
	private JTextField textoPuntuacion;

	private JButton botonSeleccionarImagen;
	private JLabel labelImagenSeleccionada;

	private JButton botonAgregarProducto;
	private JButton botonVolver;

	public VentanaModoVendedor() {
		inicializarVentanaVendedor();
		setVisible(false);
	}

	public void inicializarVentanaVendedor() {
		setTitle("Ventana Modo Vendedor - Agregar Producto");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// Banner
		ImageIcon imagen = new ImageIcon(getClass().getResource("bannerVendedor.JPG"));
		bannerVentana = new JLabel(imagen);
		bannerVentana.setBounds(0, 0, 970, 190);
		add(bannerVentana);

		labelTitulo = new JLabel("Agregar Nuevo Producto");
		labelTitulo.setBounds(300, 150, 400, 40);
		labelTitulo.setFont(new Font("Georgia", Font.BOLD, 30));
		labelTitulo.setForeground(Color.decode("#042F6D"));
		add(labelTitulo);

		// Nombre del Producto
		labelNombreProducto = new JLabel("Nombre del Producto:");
		labelNombreProducto.setBounds(50, 220, 200, 25);
		labelNombreProducto.setFont(new Font("Arial", Font.BOLD, 16));
		add(labelNombreProducto);
		textoNombreProducto = new JTextField();
		textoNombreProducto.setBounds(250, 220, 250, 30);
		textoNombreProducto.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		add(textoNombreProducto);

		// Precio
		labelPrecio = new JLabel("Precio:");
		labelPrecio.setBounds(50, 270, 200, 25);
		labelPrecio.setFont(new Font("Arial", Font.BOLD, 16));
		add(labelPrecio);
		textoPrecio = new JTextField();
		textoPrecio.setBounds(250, 270, 250, 30);
		textoPrecio.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		add(textoPrecio);

		// Categoría
		labelCategoria = new JLabel("Categoría:");
		labelCategoria.setBounds(50, 320, 200, 25);
		labelCategoria.setFont(new Font("Arial", Font.BOLD, 16));
		add(labelCategoria);
		String[] categorias = { "Seleccione una categoría", "Arte", "Belleza", "Deporte", "Electrodomestico",
				"Herramienta", "Hogar", "Mascota", "Moda", "Tecnologia", "Videojuego" };
		comboBoxCategoria = new JComboBox<>(categorias);
		comboBoxCategoria.setBounds(250, 320, 250, 30);
		add(comboBoxCategoria);
		
		// Cantidad
		labelCantidad = new JLabel("Cantidad:");
		labelCantidad.setBounds(50, 470, 200, 25);
		labelCantidad.setFont(new Font("Arial", Font.BOLD, 16));
		add(labelCantidad);
		textoCantidad = new JTextField();
		textoCantidad.setBounds(250, 470, 250, 30);
		textoCantidad.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		add(textoCantidad);
		// Puntuación
		labelPuntuacion = new JLabel("Puntuación (0-5):");
		labelPuntuacion.setBounds(50, 570, 200, 25);
		labelPuntuacion.setFont(new Font("Arial", Font.BOLD, 16));
		add(labelPuntuacion);
		textoPuntuacion = new JTextField();
		textoPuntuacion.setBounds(250, 570, 250, 30);
		textoPuntuacion.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		add(textoPuntuacion);

		// Selección de Imagen
		botonSeleccionarImagen = new JButton("Seleccionar Imagen");
		botonSeleccionarImagen.setBounds(600, 220, 200, 40);
		botonSeleccionarImagen.setBackground(Color.decode("#042F6D"));
		botonSeleccionarImagen.setForeground(Color.decode("#FFFFFF"));
		botonSeleccionarImagen.setFocusPainted(false);
		botonSeleccionarImagen.setBorderPainted(false);
		add(botonSeleccionarImagen);

		labelImagenSeleccionada = new JLabel("Ninguna imagen seleccionada");
		labelImagenSeleccionada.setBounds(600, 270, 300, 25);
		labelImagenSeleccionada.setFont(new Font("Arial", Font.PLAIN, 14));
		add(labelImagenSeleccionada);

		// Botones de acción
		botonAgregarProducto = new JButton("Agregar Producto");
		botonAgregarProducto.setBounds(600, 500, 180, 40);
		botonAgregarProducto.setBackground(Color.decode("#FCE707"));
		botonAgregarProducto.setForeground(Color.decode("#03080D"));
		botonAgregarProducto.setFocusPainted(false);
		botonAgregarProducto.setBorderPainted(false);
		add(botonAgregarProducto);

		botonVolver = new JButton("VOLVER");
		botonVolver.setBounds(800, 500, 100, 40);
		botonVolver.setBackground(Color.decode("#042F6D"));
		botonVolver.setForeground(Color.decode("#FFFFFF"));
		botonVolver.setFocusPainted(false);
		botonVolver.setBorderPainted(false);
		add(botonVolver);
	}

	// Getters para los componentes
	public JTextField getTextoNombreProducto() {
		return textoNombreProducto;
	}

	public JTextField getTextoPrecio() {
		return textoPrecio;
	}

	public JComboBox<String> getComboBoxCategoria() {
		return comboBoxCategoria;
	}

	public JTextField getTextoCantidad() {
		return textoCantidad;
	}

	public JTextField getTextoPuntuacion() {
		return textoPuntuacion;
	}

	public JButton getBotonSeleccionarImagen() {
		return botonSeleccionarImagen;
	}

	public JLabel getLabelImagenSeleccionada() {
		return labelImagenSeleccionada;
	}

	public JButton getBotonAgregarProducto() {
		return botonAgregarProducto;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}
}
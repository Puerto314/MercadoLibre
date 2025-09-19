package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCategoria extends JFrame {

	// atributos
	private JLabel titulo;
	private JLabel logoMLc;
	private JButton botonVolver;
	private JButton catalog;
	private JButton moda;
	private JButton hogar;
	private JButton tecnologia;
	private JButton deporte;
	private JButton electronica;
	private JButton arte;
	private JButton belleza;
	private JButton herramienta;
	private JButton videojuego;
	private JButton mascota;

	public VentanaCategoria() {
		inicializarCategoria();
		setVisible(false);
	}

	public void inicializarCategoria() {
		setTitle("Ventana Categorías");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// titulo
		titulo = new JLabel("-> Categorías");
		titulo.setBounds(120, 130, 350, 45);
		titulo.setFont(new Font("Georgia", Font.BOLD, 40));
		add(titulo);

		// imagen logo
		ImageIcon imagen = new ImageIcon(getClass().getResource("logoMLc.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		logoMLc = new JLabel(imagen);
		logoMLc.setBounds(430, 0, 600, 130);
		add(logoMLc);

		// imagen catalogo
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("catalogo.JPG"));
		JLabel catalog = new JLabel(imagen2);
		logoMLc = new JLabel(imagen2);
		logoMLc.setBounds(-30, 60, 200, 200);
		add(logoMLc);

		// boton salir
		botonVolver = new JButton("VOLVER");
		botonVolver.setBounds(795, 580, 100, 40);
		botonVolver.setBackground(Color.decode("#042F6D"));
		botonVolver.setForeground(Color.decode("#FFFFFF"));
		botonVolver.setFocusPainted(false);
		botonVolver.setBorderPainted(false);
		add(botonVolver);

		// ---PANEL X CATEGORIA---
		//--columna 1
		// moda

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("moda.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		moda = new JButton(imagen3);
		moda.setBounds(30, 220, 100, 100);
		moda.setFocusPainted(false);
		moda.setBorderPainted(true);
		add(moda);

		// deportes
		ImageIcon imagen4 = new ImageIcon(getClass().getResource("deporte.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		deporte = new JButton(imagen4);
		deporte.setBounds(30, 360, 100, 100);
		deporte.setFocusPainted(false);
		deporte.setBorderPainted(true);
		add(deporte);

		// belleza y cuidado personal
		ImageIcon imagen5 = new ImageIcon(getClass().getResource("belleza.JPG"));
		JLabel labelImagen5 = new JLabel(imagen5);
		belleza = new JButton(imagen5);
		belleza.setBounds(30, 500, 100, 100);
		belleza.setFocusPainted(false);
		belleza.setBorderPainted(true);
		add(belleza);
		
		// mascotas
		ImageIcon imagen6 = new ImageIcon(getClass().getResource("belleza.JPG"));
		JLabel labelImagen6 = new JLabel(imagen6);
		belleza = new JButton(imagen6);
		belleza.setBounds(30, 620, 100, 100);
		belleza.setFocusPainted(false);
		belleza.setBorderPainted(true);
		add(belleza);
		
		
		

		//---columna 2
		// hogar y muebles
		ImageIcon imagen7 = new ImageIcon(getClass().getResource("hogar.JPG"));
		JLabel labelImagen7 = new JLabel(imagen7);
		hogar = new JButton(imagen7);
		hogar.setBounds(30, 360, 100, 100);
		hogar.setFocusPainted(false);
		hogar.setBorderPainted(true);
		add(hogar);

	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getLogoMLc() {
		return logoMLc;
	}

	public void setLogoMLc(JLabel logoMLc) {
		this.logoMLc = logoMLc;
	}

	public JButton getBotonSalir() {
		return botonVolver;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonVolver = botonSalir;
	}

}

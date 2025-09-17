package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import co.edu.unbosque.controller.Controlador;

public class VentanaInicio extends JFrame {
	private JLabel titulo1;
	private JLabel titulo2;
	private JButton botonInicioSesion;
	private JButton botonRegistrarse;
	private JLabel idioma;
	private JButton spanish;
	private JButton ingles;
	private JButton portugues;
	private JButton latin;
	private JButton botonSalir;
	private JLabel logoML;
	private JLabel opcion;

	public VentanaInicio(Controlador controlador) {
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {

		this.setTitle("Mercado Libre");
		this.setBounds(275, 20, 980, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);

		this.getContentPane().setBackground(Color.decode("#FFFF99")); // LE DA COLOR A TODA LA VENTANA

		/*
		 * // titulo titulo1 = new JLabel("Mercado", SwingConstants.CENTER);
		 * titulo1.setBounds(200, 100, 600, 400);
		 * titulo1.setForeground(Color.decode("#03080D")); titulo1.setFont(new
		 * Font("Georgia", Font.BOLD, 50)); this.add(titulo1);
		 * 
		 * titulo2 = new JLabel("Libre", SwingConstants.CENTER); titulo2.setBounds(200,
		 * 200, 600, 400); titulo2.setForeground(Color.decode("#03080D"));
		 * titulo2.setFont(new Font("Georgia", Font.BOLD, 50)); this.add(titulo2);
		 */

		// opción
		opcion = new JLabel("Por favor, cree una cuenta y posteriormente inicie sesión", SwingConstants.CENTER);
		opcion.setBounds(-20, -280, 1000, 1000);
		opcion.setForeground(Color.decode("#03080D"));
		opcion.setFont(new Font("Georgia", Font.BOLD, 20));
		this.add(opcion);

		// botones
		botonInicioSesion = new JButton("INICIAR SESION");
		botonInicioSesion.setBounds(200, 300, 200, 80);
		botonInicioSesion.setBackground(Color.decode("#FFCC00"));
		botonInicioSesion.setForeground(Color.decode("#03080D"));
		botonInicioSesion.setFocusPainted(false);
		botonInicioSesion.setBorderPainted(false);
		this.add(botonInicioSesion);

		botonRegistrarse = new JButton("REGISTRARSE");
		botonRegistrarse.setBounds(550, 300, 200, 80);
		botonRegistrarse.setBackground(Color.decode("#FFCC00"));
		botonRegistrarse.setForeground(Color.decode("#03080D"));
		botonRegistrarse.setFocusPainted(false);
		botonRegistrarse.setBorderPainted(false);// QUITA LOS BORDES DE LOS BOTONES
		this.add(botonRegistrarse);

		// salir
		botonSalir = new JButton("Salir");
		botonSalir.setBounds(430, 600, 90, 40);
		botonSalir.setBackground(Color.decode("#FF0000"));
		botonSalir.setForeground(Color.decode("#FFFFFF"));
		botonSalir.setFocusPainted(false);
		botonSalir.setBorderPainted(false);// QUITA LOS BORDES DE LOS BOTONES
		this.add(botonSalir);

		// languages
		idioma = new JLabel("- Idioma -");
		idioma.setBounds(430, 450, 90, 30);
		idioma.setForeground(Color.decode("#03080D"));
		idioma.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(idioma);

		// español
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("spanish.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		spanish = new JButton(imagen1);
		spanish.setBounds(380, 500, 35, 35);
		spanish.setFocusPainted(false);
		spanish.setBorderPainted(true);
		this.add(spanish);

		// ingles
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("ingles.JPG"));
		JLabel labelImagen2 = new JLabel(imagen2);
		ingles = new JButton(imagen2);
		ingles.setBounds(430, 500, 35, 35);
		ingles.setFocusPainted(false);
		ingles.setBorderPainted(true);
		this.add(ingles);

		// portugues
		ImageIcon imagen3 = new ImageIcon(getClass().getResource("portugues.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		portugues = new JButton(imagen3);
		portugues.setBounds(480, 500, 35, 35);
		portugues.setFocusPainted(false);
		portugues.setBorderPainted(true);
		this.add(portugues);

		// latin
		ImageIcon imagen4 = new ImageIcon(getClass().getResource("latin1.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		latin = new JButton(imagen4);
		latin.setBounds(530, 500, 35, 35);
		latin.setFocusPainted(false);
		latin.setBorderPainted(true);
		this.add(latin);

		// Logo
		ImageIcon logo = new ImageIcon(getClass().getResource("logoML.png"));
		JLabel l = new JLabel(logo);
		logoML = new JLabel(logo);
		logoML.setBounds(0, -50, 960, 300);
		this.add(logoML);

	}

	public JLabel getTitulo1() {
		return titulo1;
	}

	public void setTitulo1(JLabel titulo1) {
		this.titulo1 = titulo1;
	}

	public JLabel getTitulo2() {
		return titulo2;
	}

	public void setTitulo2(JLabel titulo2) {
		this.titulo2 = titulo2;
	}

	public JButton getBotonInicioSesion() {
		return botonInicioSesion;
	}

	public void setBotonInicioSesion(JButton botonInicioSesion) {
		this.botonInicioSesion = botonInicioSesion;
	}

	public JButton getBotonRegistrarse() {
		return botonRegistrarse;
	}

	public void setBotonRegistrarse(JButton botonRegistrarse) {
		this.botonRegistrarse = botonRegistrarse;
	}

	public JLabel getIdioma() {
		return idioma;
	}

	public void setIdioma(JLabel idioma) {
		this.idioma = idioma;
	}

	public JButton getSpanish() {
		return spanish;
	}

	public void setSpanish(JButton spanish) {
		this.spanish = spanish;
	}

	public JButton getIngles() {
		return ingles;
	}

	public void setIngles(JButton ingles) {
		this.ingles = ingles;
	}

	public JButton getPortugues() {
		return portugues;
	}

	public void setPortugues(JButton portugues) {
		this.portugues = portugues;
	}

	public JButton getLatin() {
		return latin;
	}

	public void setLatin(JButton latin) {
		this.latin = latin;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}

	public JLabel getLogoML() {
		return logoML;
	}

	public void setLogoML(JLabel logoML) {
		this.logoML = logoML;
	}

	public JLabel getOpcion() {
		return opcion;
	}

	public void setOpcion(JLabel opcion) {
		this.opcion = opcion;
	}

}

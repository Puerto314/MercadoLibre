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

	public VentanaInicio(Controlador controlador) {
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {

		this.setTitle("Mercado Libre");
		this.setBounds(210, 20, 520, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);

		this.getContentPane().setBackground(Color.white); // LE DA COLOR A TODA LA VENTANA

		// titulo
		titulo1 = new JLabel("Mercado", SwingConstants.CENTER);
		titulo1.setBounds(90, 70, 340, 50);
		titulo1.setForeground(Color.decode("#03080D"));
		titulo1.setFont(new Font("Georgia", Font.BOLD, 40));
		this.add(titulo1);

		titulo2 = new JLabel("Libre", SwingConstants.CENTER);
		titulo2.setBounds(90, 110, 340, 50);
		titulo2.setForeground(Color.decode("#03080D"));
		titulo2.setFont(new Font("Georgia", Font.BOLD, 40));
		this.add(titulo2);

		// botones
		botonInicioSesion = new JButton("INICIAR SESIÓN");
		botonInicioSesion.setBounds(95, 360, 150, 40);
		botonInicioSesion.setBackground(Color.decode("#FFF982"));
		botonInicioSesion.setForeground(Color.decode("#03080D"));
		botonInicioSesion.setFocusPainted(false);
		botonInicioSesion.setBorderPainted(false);
		this.add(botonInicioSesion);

		botonRegistrarse = new JButton("REGISTRARSE");
		botonRegistrarse.setBounds(250, 360, 150, 40);
		botonRegistrarse.setBackground(Color.decode("#FFF982"));
		botonRegistrarse.setForeground(Color.decode("#03080D"));
		botonRegistrarse.setFocusPainted(false);
		botonRegistrarse.setBorderPainted(false);// QUITA LOS BORDES DE LOS BOTONES
		this.add(botonRegistrarse);

		// salir
		botonSalir = new JButton("SALIR");
		botonSalir.setBounds(205, 620, 100, 40);
		botonSalir.setBackground(Color.decode("#FFF982"));
		botonSalir.setForeground(Color.decode("#03080D"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// este no estoy segura si va así
		botonSalir.setFocusPainted(false);
		botonSalir.setBorderPainted(false);// QUITA LOS BORDES DE LOS BOTONES
		this.add(botonSalir);

		// languages
		idioma = new JLabel("- Idioma -");
		idioma.setBounds(210, 490, 90, 30);
		idioma.setForeground(Color.decode("#03080D"));
		idioma.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(idioma);

		// español
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("spanish.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		spanish = new JButton(imagen1);
		spanish.setBounds(180, 520, 35, 35);
		spanish.setFocusPainted(false);
		spanish.setBorderPainted(true);
		this.add(spanish);

		// ingles
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("ingles.JPG"));
		JLabel labelImagen2 = new JLabel(imagen2);
		ingles = new JButton(imagen2);
		ingles.setBounds(220, 520, 35, 35);
		ingles.setFocusPainted(false);
		ingles.setBorderPainted(true);
		this.add(ingles);

		// portugues
		ImageIcon imagen3 = new ImageIcon(getClass().getResource("portugues.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		portugues = new JButton(imagen3);
		portugues.setBounds(260, 520, 35, 35);
		portugues.setFocusPainted(false);
		portugues.setBorderPainted(true);
		this.add(portugues);

		// latin
		ImageIcon imagen4 = new ImageIcon(getClass().getResource("latin1.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		latin = new JButton(imagen4);
		latin.setBounds(300, 520, 35, 35);
		latin.setFocusPainted(false);
		latin.setBorderPainted(true);
		this.add(latin);

		// logo
		ImageIcon imagen5 = new ImageIcon(getClass().getResource("logo.JPG"));
		JLabel labelImagen5 = new JLabel(imagen5);
		labelImagen5.setBounds(140, 170, 200, 200);
		this.add(labelImagen5);

		// aa
	}

	public JLabel getTitulo() {
		return titulo1;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo1 = titulo;
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

}

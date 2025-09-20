package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
	private JButton electrodomestico;
	private JButton arte;
	private JButton belleza;
	private JButton herramienta;
	private JButton videojuego;
	private JButton mascota;
	private JLabel lModa;
	private JLabel lHogar;
	private JLabel lTecnologia;
	private JLabel lDeporte;
	private JLabel lElectrodomestico;
	private JLabel lArte;
	private JLabel lBelleza;
	private JLabel lHerramienta;
	private JLabel lVideojuego;
	private JLabel lMascota;

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
		// --columna 1---
		// moda

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("moda.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		moda = new JButton(imagen3);
		moda.setBounds(30, 220, 100, 100);
		moda.setFocusPainted(false);
		moda.setBorderPainted(true);
		add(moda);

		lModa = new JLabel("Moda ");
		lModa.setBounds(140, 255, 180, 25);
		lModa.setFont(new Font("Arial", Font.BOLD, 20));
		add(lModa);

		// deportes
		ImageIcon imagen4 = new ImageIcon(getClass().getResource("deporte.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		deporte = new JButton(imagen4);
		deporte.setBounds(30, 330, 100, 100);
		deporte.setFocusPainted(false);
		deporte.setBorderPainted(true);
		add(deporte);

		lDeporte = new JLabel("Deportes ");
		lDeporte.setBounds(140, 365, 180, 25);
		lDeporte.setFont(new Font("Arial", Font.BOLD, 20));
		add(lDeporte);

		// belleza y cuidado personal
		ImageIcon imagen5 = new ImageIcon(getClass().getResource("belleza.JPG"));
		JLabel labelImagen5 = new JLabel(imagen5);
		belleza = new JButton(imagen5);
		belleza.setBounds(30, 440, 100, 100);
		belleza.setFocusPainted(false);
		belleza.setBorderPainted(true);
		add(belleza);

		lBelleza = new JLabel("Belleza");
		lBelleza.setBounds(140, 475, 180, 25);
		lBelleza.setFont(new Font("Arial", Font.BOLD, 20));
		add(lBelleza);

		// mascotas
		ImageIcon imagen6 = new ImageIcon(getClass().getResource("mascota.JPG"));
		JLabel labelImagen6 = new JLabel(imagen6);
		belleza = new JButton(imagen6);
		belleza.setBounds(30, 550, 100, 100);
		belleza.setFocusPainted(false);
		belleza.setBorderPainted(true);
		add(belleza);

		lMascota = new JLabel("Para Mascotas ");
		lMascota.setBounds(140, 585, 180, 25);
		lMascota.setFont(new Font("Arial", Font.BOLD, 20));
		add(lMascota);

		// ---columna 2---
		// hogar y muebles
		ImageIcon imagen7 = new ImageIcon(getClass().getResource("hogar.JPG"));
		JLabel labelImagen7 = new JLabel(imagen7);
		hogar = new JButton(imagen7);
		hogar.setBounds(320, 220, 100, 100);
		hogar.setFocusPainted(false);
		hogar.setBorderPainted(true);
		add(hogar);

		lHogar = new JLabel("Hogar y muebles ");
		lHogar.setBounds(430, 255, 180, 25);
		lHogar.setFont(new Font("Arial", Font.BOLD, 20));
		add(lHogar);

		// electrodomesticos
		ImageIcon imagen8 = new ImageIcon(getClass().getResource("electrodomestico.JPG"));
		JLabel labelImagen8 = new JLabel(imagen8);
		electrodomestico = new JButton(imagen8);
		electrodomestico.setBounds(320, 330, 100, 100);
		electrodomestico.setFocusPainted(false);
		electrodomestico.setBorderPainted(true);
		add(electrodomestico);

		lElectrodomestico = new JLabel("Electrodomésticos");
		lElectrodomestico.setBounds(430, 365, 180, 25);
		lElectrodomestico.setFont(new Font("Arial", Font.BOLD, 20));
		add(lElectrodomestico);

		// herramientas de construccion
		ImageIcon imagen9 = new ImageIcon(getClass().getResource("herramienta.JPG"));
		JLabel labelImagen9 = new JLabel(imagen9);
		herramienta = new JButton(imagen9);
		herramienta.setBounds(320, 440, 100, 100);
		herramienta.setFocusPainted(false);
		herramienta.setBorderPainted(true);
		add(herramienta);

		lHerramienta = new JLabel("Herramientas ");
		lHerramienta.setBounds(430, 475, 180, 25);
		lHerramienta.setFont(new Font("Arial", Font.BOLD, 20));
		add(lHerramienta);

		// ---columna 3---
		// tecnologia
		ImageIcon imagen10 = new ImageIcon(getClass().getResource("tecnologia.JPG"));
		JLabel labelImagen10 = new JLabel(imagen10);
		tecnologia = new JButton(imagen10);
		tecnologia.setBounds(630, 220, 100, 100);
		tecnologia.setFocusPainted(false);
		tecnologia.setBorderPainted(true);
		add(tecnologia);

		lTecnologia = new JLabel("Tecnología ");
		lTecnologia.setBounds(740, 255, 180, 25);
		lTecnologia.setFont(new Font("Arial", Font.BOLD, 20));
		add(lTecnologia);

		// arte
		ImageIcon imagen11 = new ImageIcon(getClass().getResource("arte.JPG"));
		JLabel labelImagen11 = new JLabel(imagen11);
		arte = new JButton(imagen11);
		arte.setBounds(630, 330, 100, 100);
		arte.setFocusPainted(false);
		arte.setBorderPainted(true);
		add(arte);

		lArte = new JLabel("Arte ");
		lArte.setBounds(740, 365, 180, 25);
		lArte.setFont(new Font("Arial", Font.BOLD, 20));
		add(lArte);

		// videojuegos
		ImageIcon imagen12 = new ImageIcon(getClass().getResource("videojuego.JPG"));
		JLabel labelImagen12 = new JLabel(imagen12);
		videojuego = new JButton(imagen12);
		videojuego.setBounds(630, 440, 100, 100);
		videojuego.setFocusPainted(false);
		videojuego.setBorderPainted(true);
		add(videojuego);

		lVideojuego = new JLabel("Videojuegos ");
		lVideojuego.setBounds(740, 475, 180, 25);
		lVideojuego.setFont(new Font("Arial", Font.BOLD, 20));
		add(lVideojuego);

		// campo busqueda

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

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

	public JButton getCatalog() {
		return catalog;
	}

	public void setCatalog(JButton catalog) {
		this.catalog = catalog;
	}

	public JButton getModa() {
		return moda;
	}

	public void setModa(JButton moda) {
		this.moda = moda;
	}

	public JButton getHogar() {
		return hogar;
	}

	public void setHogar(JButton hogar) {
		this.hogar = hogar;
	}

	public JButton getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(JButton tecnologia) {
		this.tecnologia = tecnologia;
	}

	public JButton getDeporte() {
		return deporte;
	}

	public void setDeporte(JButton deporte) {
		this.deporte = deporte;
	}

	public JButton getElectrodomestico() {
		return electrodomestico;
	}

	public void setElectrodomestico(JButton electrodomestico) {
		this.electrodomestico = electrodomestico;
	}

	public JButton getArte() {
		return arte;
	}

	public void setArte(JButton arte) {
		this.arte = arte;
	}

	public JButton getBelleza() {
		return belleza;
	}

	public void setBelleza(JButton belleza) {
		this.belleza = belleza;
	}

	public JButton getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(JButton herramienta) {
		this.herramienta = herramienta;
	}

	public JButton getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(JButton videojuego) {
		this.videojuego = videojuego;
	}

	public JButton getMascota() {
		return mascota;
	}

	public void setMascota(JButton mascota) {
		this.mascota = mascota;
	}

	public JLabel getlModa() {
		return lModa;
	}

	public void setlModa(JLabel lModa) {
		this.lModa = lModa;
	}

	public JLabel getlHogar() {
		return lHogar;
	}

	public void setlHogar(JLabel lHogar) {
		this.lHogar = lHogar;
	}

	public JLabel getlTecnologia() {
		return lTecnologia;
	}

	public void setlTecnologia(JLabel lTecnologia) {
		this.lTecnologia = lTecnologia;
	}

	public JLabel getlDeporte() {
		return lDeporte;
	}

	public void setlDeporte(JLabel lDeporte) {
		this.lDeporte = lDeporte;
	}

	public JLabel getlElectrodomestico() {
		return lElectrodomestico;
	}

	public void setlElectrodomestico(JLabel lElectrodomestico) {
		this.lElectrodomestico = lElectrodomestico;
	}

	public JLabel getlArte() {
		return lArte;
	}

	public void setlArte(JLabel lArte) {
		this.lArte = lArte;
	}

	public JLabel getlBelleza() {
		return lBelleza;
	}

	public void setlBelleza(JLabel lBelleza) {
		this.lBelleza = lBelleza;
	}

	public JLabel getlHerramienta() {
		return lHerramienta;
	}

	public void setlHerramienta(JLabel lHerramienta) {
		this.lHerramienta = lHerramienta;
	}

	public JLabel getlVideojuego() {
		return lVideojuego;
	}

	public void setlVideojuego(JLabel lVideojuego) {
		this.lVideojuego = lVideojuego;
	}

	public JLabel getlMascota() {
		return lMascota;
	}

	public void setlMascota(JLabel lMascota) {
		this.lMascota = lMascota;
	}

}

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCategoria extends JFrame {
	
	//atributos
	private JLabel titulo;
	private JLabel logoMLc;
	private JButton botonVolver;
	private JButton catalog;
	private JButton lModa;
	private JButton lHogar;
	private JButton lTec;
	private JButton lDep;
	private JButton lElec;
	private JButton lArte;
	private JButton lBell;
	private JButton lHer;
	private JButton lVid;
	private JButton lMasc;
	
	
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
		
		//titulo 
		titulo = new JLabel("-> Categorías");
		titulo.setBounds(120, 130, 350, 45);
		titulo.setFont(new Font("Georgia", Font.BOLD, 40));
		add(titulo);
		
		//imagen logo
		ImageIcon imagen = new ImageIcon(getClass().getResource("logoMLc.JPG"));
		JLabel labelimagen = new JLabel(imagen);
		logoMLc = new JLabel(imagen);
		logoMLc.setBounds(430, 0, 600, 130);
		add(logoMLc);
		
		//imagen catalogo
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("catalogo.JPG"));
		JLabel catalog = new JLabel(imagen2);
		logoMLc = new JLabel(imagen2);
		logoMLc.setBounds(-30, 60, 200, 200);
		add(logoMLc);
		
		
		//boton salir
		botonVolver = new JButton("VOLVER");
		botonVolver.setBounds(795, 580, 100, 40);
		botonVolver.setBackground(Color.decode("#042F6D"));
		botonVolver.setForeground(Color.decode("#FFFFFF"));
		botonVolver.setFocusPainted(false);
		botonVolver.setBorderPainted(false);
		add(botonVolver);
		
		//---PANEL X CATEGORIA---
		
		//moda
		
		

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

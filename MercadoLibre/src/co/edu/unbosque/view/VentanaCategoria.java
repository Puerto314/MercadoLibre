package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaCategoria extends JFrame {
	
	//atributos
	
	public VentanaCategoria() {
		inicializarCategoria();
	}
	
	public void inicializarCategoria() {
		setTitle("Ventana Categorías");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

	}

}

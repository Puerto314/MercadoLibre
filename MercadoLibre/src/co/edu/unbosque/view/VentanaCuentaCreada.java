package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaCuentaCreada extends JFrame {

	private JButton botonSeguir;

	public VentanaCuentaCreada() {
		inicializarVentanaCuentaCreada();
	}

	public void inicializarVentanaCuentaCreada() {
		setTitle("Ventana Creada");
		setBounds(600, 200, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		botonSeguir = new JButton("Continuar");
		botonSeguir.setBounds(0, 0, 100, 100);
		botonSeguir.setBackground(Color.decode("#FFFFFF"));
		botonSeguir.setForeground(Color.decode("#0"));
		botonSeguir.setFocusPainted(false);
		botonSeguir.setBorderPainted(true);
		this.add(botonSeguir);
	}

	public JButton getBotonSeguir() {
		return botonSeguir;
	}

	public void setBotonSeguir(JButton botonSeguir) {
		this.botonSeguir = botonSeguir;
	}

}

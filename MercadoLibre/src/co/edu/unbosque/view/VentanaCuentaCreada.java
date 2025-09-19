package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCuentaCreada extends JFrame {

	private JButton botonSeguir;
	private JLabel mensaje;

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

		mensaje = new JLabel("Cuenta creada");
		mensaje.setBounds(75, 0, 300, 70);
		mensaje.setForeground(Color.decode("#03080D"));
		mensaje.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(mensaje);

		botonSeguir = new JButton("Continuar");
		botonSeguir.setBounds(80, 90, 130, 50);
		botonSeguir.setBackground(Color.decode("#90EE90"));
		botonSeguir.setForeground(Color.decode("#0"));
		botonSeguir.setFocusPainted(false);
		botonSeguir.setBorderPainted(true);
		this.add(botonSeguir);
	}

	public JLabel getMensaje() {
		return mensaje;
	}

	public void setMensaje(JLabel mensaje) {
		this.mensaje = mensaje;
	}

	public JButton getBotonSeguir() {
		return botonSeguir;
	}

	public void setBotonSeguir(JButton botonSeguir) {
		this.botonSeguir = botonSeguir;
	}

}

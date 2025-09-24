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
import javax.swing.JTextField;

public class VentanaPago extends JFrame {

	private JLabel labelTarjeta;
	private JTextField numeroTarjeta;
	private JLabel labelPinTarjeta;
	private JTextField pinTarjeta;
	private JLabel labelFechaTarjeta;
	private JLabel labelDatosPago;
	private JTextField fechaTarjeta;
	private JButton botonComprar;
	private JButton botonVolver;
	private JLabel imagenPago;

	public VentanaPago() {
		inicializarVentanaPago();
		setVisible(false);
	}

	public void inicializarVentanaPago() {
		setTitle("Ventana de pago");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		labelDatosPago = new JLabel("Ingrese los datos");
		labelDatosPago.setBounds(510, 60, 500, 40);
		labelDatosPago.setFont(new Font("Georgia", Font.BOLD, 40));
		add(labelDatosPago);

		labelTarjeta = new JLabel("Numero de tarjeta: ");
		labelTarjeta.setBounds(520, 210, 180, 25);
		labelTarjeta.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelTarjeta);

		numeroTarjeta = new JTextField();
		numeroTarjeta.setBounds(520, 250, 400, 40);
		numeroTarjeta.setFont(new Font("Arial", Font.PLAIN, 14));
		numeroTarjeta.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		numeroTarjeta.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// buscarEnTiempoReal();
			}
		});
		this.add(numeroTarjeta);

		labelPinTarjeta = new JLabel("Pin de seguridad: ");
		labelPinTarjeta.setBounds(520, 430, 250, 25);
		labelPinTarjeta.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelPinTarjeta);

		// contraseña
		pinTarjeta = new JTextField();
		pinTarjeta.setBounds(520, 470, 400, 40);
		pinTarjeta.setFont(new Font("Arial", Font.PLAIN, 14));
		pinTarjeta.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		pinTarjeta.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// buscarEnTiempoReal();
			}
		});
		this.add(pinTarjeta);

		labelFechaTarjeta = new JLabel("Fecha de vencimiento (MM/AA): ");
		labelFechaTarjeta.setBounds(520, 320, 350, 25);
		labelFechaTarjeta.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelFechaTarjeta);

		// campo fecha vencimiento
		fechaTarjeta = new JTextField();
		fechaTarjeta.setBounds(520, 360, 400, 40);
		fechaTarjeta.setFont(new Font("Arial", Font.PLAIN, 14));
		fechaTarjeta.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		this.add(fechaTarjeta);


		// campo email
		fechaTarjeta = new JTextField();
		fechaTarjeta.setBounds(520, 360, 400, 40);
		fechaTarjeta.setFont(new Font("Arial", Font.PLAIN, 14));
		fechaTarjeta.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		fechaTarjeta.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// buscarEnTiempoReal();
			}
		});
		this.add(fechaTarjeta);

		botonComprar = new JButton("PAGAR");
		botonComprar.setBounds(600, 580, 100, 40);
		botonComprar.setBackground(Color.decode("#042F6D"));
		botonComprar.setForeground(Color.decode("#FFFFFF"));
		botonComprar.setFocusPainted(false);
		botonComprar.setBorderPainted(false);
		add(botonComprar);

		botonVolver = new JButton("VOLVER");
		botonVolver.setBounds(755, 580, 100, 40);
		botonVolver.setBackground(Color.decode("#042F6D"));
		botonVolver.setForeground(Color.decode("#FFFFFF"));
		botonVolver.setFocusPainted(false);
		botonVolver.setBorderPainted(false);
		add(botonVolver);

		ImageIcon imagenFactura = new ImageIcon(getClass().getResource("Factura.jpg"));
		JLabel imgFac = new JLabel(imagenFactura);
		imagenPago = new JLabel(imagenFactura);
		imagenPago.setBounds(0, 0, 570, 690);
		add(imagenPago);

	}

	public JLabel getLabelTarjeta() {
		return labelTarjeta;
	}

	public void setLabelTarjeta(JLabel labelTarjeta) {
		this.labelTarjeta = labelTarjeta;
	}

	public JTextField getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(JTextField numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public JLabel getLabelPinTarjeta() {
		return labelPinTarjeta;
	}

	public void setLabelPinTarjeta(JLabel labelPinTarjeta) {
		this.labelPinTarjeta = labelPinTarjeta;
	}

	public JTextField getPinTarjeta() {
		return pinTarjeta;
	}

	public void setPinTarjeta(JTextField pinTarjeta) {
		this.pinTarjeta = pinTarjeta;
	}

	public JLabel getLabelFechaTarjeta() {
		return labelFechaTarjeta;
	}

	public void setLabelFechaTarjeta(JLabel labelFechaTarjeta) {
		this.labelFechaTarjeta = labelFechaTarjeta;
	}

	public JLabel getLabelDatosPago() {
		return labelDatosPago;
	}

	public void setLabelDatosPago(JLabel labelDatosPago) {
		this.labelDatosPago = labelDatosPago;
	}

	public JTextField getFechaTarjeta() {
		return fechaTarjeta;
	}

	public void setFechaTarjeta(JTextField fechaTarjeta) {
		this.fechaTarjeta = fechaTarjeta;
	}

	public JButton getBotonComprar() {
		return botonComprar;
	}

	public void setBotonComprar(JButton botonComprar) {
		this.botonComprar = botonComprar;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

	public JLabel getImagenPago() {
		return imagenPago;
	}

	public void setImagenPago(JLabel imagenPago) {
		this.imagenPago = imagenPago;
	}

}

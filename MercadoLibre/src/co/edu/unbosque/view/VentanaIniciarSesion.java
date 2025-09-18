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

public class VentanaIniciarSesion extends JFrame {

	private JButton botonEntrar;
	private JButton botonVolver;
	private JLabel labelUsuario;
	private JTextField usuario;
	private JLabel labelEmail;
	private JTextField email;
	private JLabel labelContrasenia;
	private JTextField contrasenia;
	private JLabel labelIniciarSesion;
	private JLabel is;

	public VentanaIniciarSesion() {
		inicializarVentanaInSesion();
	}

	public void inicializarVentanaInSesion() {
		// Configuración ventana
		setTitle("Ventana Iniciar Sesión");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// i.s.
		labelIniciarSesion = new JLabel("Iniciar Sesión <-");
		labelIniciarSesion.setBounds(610, 60, 350, 40);
		labelIniciarSesion.setFont(new Font("Georgia", Font.BOLD, 40));
		add(labelIniciarSesion);

		// usuario
		labelUsuario = new JLabel("Usuario: ");
		labelUsuario.setBounds(520, 210, 180, 25);
		labelUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelUsuario);

		// campo usuario
		usuario = new JTextField();
		usuario.setBounds(520, 250, 400, 40);
		usuario.setFont(new Font("Arial", Font.PLAIN, 14));
		usuario.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 2));
		usuario.addKeyListener(new KeyListener() {
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

		this.add(usuario);
		// email
		labelEmail = new JLabel("Email/ Número de teléfono: ");
		labelEmail.setBounds(520, 320, 350, 25);
		labelEmail.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelEmail);

		// campo email
		email = new JTextField();
		email.setBounds(520, 360, 400, 40);
		email.setFont(new Font("Arial", Font.PLAIN, 14));
		email.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 2));
		email.addKeyListener(new KeyListener() {
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
		this.add(email);

		// contraseña
		labelContrasenia = new JLabel("Contraseña: ");
		labelContrasenia.setBounds(520, 430, 250, 25);
		labelContrasenia.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelContrasenia);

		// contraseña
		contrasenia = new JTextField();
		contrasenia.setBounds(520, 470, 400, 40);
		contrasenia.setFont(new Font("Arial", Font.PLAIN, 14));
		contrasenia.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 2));
		contrasenia.addKeyListener(new KeyListener() {
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
		this.add(contrasenia);

		// botones
		botonEntrar = new JButton("ENTRAR");
		botonEntrar.setBounds(600, 580, 100, 40);
		botonEntrar.setBackground(Color.decode("#042F6D"));
		botonEntrar.setForeground(Color.decode("#FFFFFF"));
		botonEntrar.setFocusPainted(false);
		botonEntrar.setBorderPainted(false);
		add(botonEntrar);

		botonVolver = new JButton("VOLVER");
		botonVolver.setBounds(755, 580, 100, 40);
		botonVolver.setBackground(Color.decode("#042F6D"));
		botonVolver.setForeground(Color.decode("#FFFFFF"));
		botonVolver.setFocusPainted(false);
		botonVolver.setBorderPainted(false);
		add(botonVolver);

		// imagen
		ImageIcon banner1 = new ImageIcon(getClass().getResource("is.JPG"));
		JLabel b1 = new JLabel(banner1);
		is = new JLabel(banner1);
		is.setBounds(0, 0, 570, 690);
		add(is);
		
	}

	public JButton getBotonEntrar() {
		return botonEntrar;
	}

	public void setBotonEntrar(JButton botonEntrar) {
		this.botonEntrar = botonEntrar;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

	public JLabel getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(JLabel labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public JTextField getUsuario() {
		return usuario;
	}

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}

	public JLabel getLabelEmail() {
		return labelEmail;
	}

	public void setLabelEmail(JLabel labelEmail) {
		this.labelEmail = labelEmail;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JLabel getLabelContrasenia() {
		return labelContrasenia;
	}

	public void setLabelContrasenia(JLabel labelContrasenia) {
		this.labelContrasenia = labelContrasenia;
	}

	public JTextField getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(JTextField contrasenia) {
		this.contrasenia = contrasenia;
	}

	public JLabel getLabelIniciarSesion() {
		return labelIniciarSesion;
	}

	public void setLabelIniciarSesion(JLabel labelIniciarSesion) {
		this.labelIniciarSesion = labelIniciarSesion;
	}

	public JLabel getIs() {
		return is;
	}

	public void setIs(JLabel is) {
		this.is = is;
	}

	// getters y setters
		
}

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaIniciarSesion extends JFrame{
	
	private JButton botonEntrar;
	private JButton botonSalir;
	private JLabel labelUsuario;
	private JTextField usuario;
	private JLabel labelEmail;
	private JTextField email;
	private JLabel labelContrasenia;
	private JTextField contrasenia;
	private JLabel labelIniciarSesion;
	
	public VentanaIniciarSesion() {
		inicializarVentanaInSesion();
	}
	
	public void inicializarVentanaInSesion() {
		//Configuración ventana
		setTitle("Ventana Iniciar Sesión");
		setBounds(40, 40, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));
		
		//i.s.
		labelIniciarSesion = new JLabel("Iniciar Sesión <-");
		labelIniciarSesion.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		labelIniciarSesion.setFont(new Font("Georgia", Font.BOLD, 30));
		add(labelIniciarSesion);
		
		//usuario
		labelUsuario = new JLabel("Usuario: ");
		labelUsuario.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		labelUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		add(labelUsuario);

		//email
		labelEmail = new JLabel("Email: ");
		labelEmail.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		labelEmail.setFont(new Font("Arial", Font.BOLD, 15));
		add(labelEmail);
		
		//contraseña
		labelContrasenia = new JLabel("Contraseña: ");
		labelContrasenia.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		labelContrasenia.setFont(new Font("Arial", Font.BOLD, 15));
		add(labelContrasenia);
		
		//campo usuario
		usuario = new JTextField();
		usuario.setBounds(750, 150, 265, 35);
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

		//campo email
		email = new JTextField();
		email.setBounds(750, 150, 265, 35);
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

		//contraseña
		contrasenia = new JTextField();
		contrasenia.setBounds(750, 150, 265, 35);
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
	}

	public JButton getBotonEntrar() {
		return botonEntrar;
	}

	public void setBotonEntrar(JButton botonEntrar) {
		this.botonEntrar = botonEntrar;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
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
	
	

}

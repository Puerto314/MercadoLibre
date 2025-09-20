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

public class VentanaRegistrarse extends JFrame {

	private JLabel labelIdUsuario;
	private JLabel labelContrasenia;
	private JLabel labelDireccion;
	private JLabel labelEmail;
	private JLabel labelTelefono;
	private JTextField textoIdUsuario;
	private JTextField textoContrasenia;
	private JTextField textoDireccion;
	private JTextField textoEmail;
	private JTextField textoTelefono;
	private JButton botonRegistrar;
	private JButton botonVolver;
	private JLabel registrar;
	private JLabel ir;

	public VentanaRegistrarse() {
		inicializarVentanaReg();
		setVisible(false);
	}

	public void inicializarVentanaReg() {
		// configuracion ventana
		setTitle("Ventana Registrarse");
		setBounds(275, 20, 980, 720);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		// registrar
		registrar = new JLabel("Registrarse <-");
		registrar.setBounds(610, 60, 350, 50);
		registrar.setFont(new Font("Georgia", Font.BOLD, 40));
		add(registrar);
		
		// ---LADO IZQUIERDO---
		// usuario
		labelIdUsuario = new JLabel("Usuario: ");
		labelIdUsuario.setBounds(460, 210, 180, 25);
		labelIdUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelIdUsuario);

		// campo usuario
		textoIdUsuario = new JTextField();
		textoIdUsuario.setBounds(460, 250, 220, 40);
		textoIdUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		textoIdUsuario.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		textoIdUsuario.addKeyListener(new KeyListener() {
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

		this.add(textoIdUsuario);

		// telefono
		labelTelefono = new JLabel("Número de teléfono: ");
		labelTelefono.setBounds(460, 320, 450, 25);
		labelTelefono.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelTelefono);
		// campo telefono
		textoTelefono = new JTextField();
		textoTelefono.setBounds(460, 360, 220, 40);
		textoTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		textoTelefono.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		textoTelefono.addKeyListener(new KeyListener() {
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
		this.add(textoTelefono);

		// contraseña
		labelContrasenia = new JLabel("Contraseña: ");
		labelContrasenia.setBounds(460, 430, 250, 25);
		labelContrasenia.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelContrasenia);

		// contraseña
		textoContrasenia = new JTextField();
		textoContrasenia.setBounds(460, 470, 220, 40);
		textoContrasenia.setFont(new Font("Arial", Font.PLAIN, 14));
		textoContrasenia.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		textoContrasenia.addKeyListener(new KeyListener() {
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
		this.add(textoContrasenia);


		// ---LADO DERECHO---
		// email
		labelEmail = new JLabel("Email: ");
		labelEmail.setBounds(725, 210, 350, 25);
		labelEmail.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelEmail);
		// campo email
		textoEmail = new JTextField();
		textoEmail.setBounds(725, 250, 220, 40);
		textoEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		textoEmail.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		textoEmail.addKeyListener(new KeyListener() {
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
		this.add(textoEmail);

		// direccion
		labelDireccion = new JLabel("Dirección: ");
		labelDireccion.setBounds(725, 320, 250, 25);
		labelDireccion.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelDireccion);

		// campo direccion
		textoDireccion = new JTextField();
		textoDireccion.setBounds(725, 360, 220, 40);
		textoDireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		textoDireccion.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
		textoDireccion.addKeyListener(new KeyListener() {
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
		this.add(textoDireccion);

		//ir
		ImageIcon banner2 = new ImageIcon(getClass().getResource("ir.JPG"));
		JLabel b2 = new JLabel(banner2);
		ir = new JLabel(banner2);
		ir.setBounds(0, 0, 470, 680);
		add(ir);
		
		// botones
				botonRegistrar = new JButton("CREAR CUENTA");
				botonRegistrar.setBounds(570, 580, 140, 40);
				botonRegistrar.setBackground(Color.decode("#042F6D"));
				botonRegistrar.setForeground(Color.decode("#FFFFFF"));
				botonRegistrar.setFocusPainted(false);
				botonRegistrar.setBorderPainted(false);
				add(botonRegistrar);

				botonVolver = new JButton("VOLVER");
				botonVolver.setBounds(755, 580, 100, 40);
				botonVolver.setBackground(Color.decode("#042F6D"));
				botonVolver.setForeground(Color.decode("#FFFFFF"));
				botonVolver.setFocusPainted(false);
				botonVolver.setBorderPainted(false);
				add(botonVolver);
				
	}
	//getters y setters
	public JLabel getLabelIdUsuario() {
		return labelIdUsuario;
	}

	public void setLabelIdUsuario(JLabel labelIdUsuario) {
		this.labelIdUsuario = labelIdUsuario;
	}

	public JLabel getLabelContrasenia() {
		return labelContrasenia;
	}

	public void setLabelContrasenia(JLabel labelContrasenia) {
		this.labelContrasenia = labelContrasenia;
	}

	public JLabel getLabelDireccion() {
		return labelDireccion;
	}

	public void setLabelDireccion(JLabel labelDireccion) {
		this.labelDireccion = labelDireccion;
	}

	public JLabel getLabelEmail() {
		return labelEmail;
	}

	public void setLabelEmail(JLabel labelEmail) {
		this.labelEmail = labelEmail;
	}

	public JLabel getLabelTelefono() {
		return labelTelefono;
	}

	public void setLabelTelefono(JLabel labelTelefono) {
		this.labelTelefono = labelTelefono;
	}

	public JTextField getTextoIdUsuario() {
		return textoIdUsuario;
	}

	public void setTextoIdUsuario(JTextField textoIdUsuario) {
		this.textoIdUsuario = textoIdUsuario;
	}

	public JTextField getTextoContrasenia() {
		return textoContrasenia;
	}

	public void setTextoContrasenia(JTextField textoContrasenia) {
		this.textoContrasenia = textoContrasenia;
	}

	public JTextField getTextoDireccion() {
		return textoDireccion;
	}

	public void setTextoDireccion(JTextField textoDireccion) {
		this.textoDireccion = textoDireccion;
	}

	public JTextField getTextoEmail() {
		return textoEmail;
	}

	public void setTextoEmail(JTextField textoEmail) {
		this.textoEmail = textoEmail;
	}

	public JTextField getTextoTelefono() {
		return textoTelefono;
	}

	public void setTextoTelefono(JTextField textoTelefono) {
		this.textoTelefono = textoTelefono;
	}

	public JButton getBotonRegistrar() {
		return botonRegistrar;
	}

	public void setBotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

	public JLabel getRegistrar() {
		return registrar;
	}

	public void setRegistrar(JLabel registrar) {
		this.registrar = registrar;
	}

	public JLabel getIr() {
		return ir;
	}

	public void setIr(JLabel ir) {
		this.ir = ir;
	}

		

}

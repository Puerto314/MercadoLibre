package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaMasOpciones extends JFrame{
	
	private JButton btnActualizarC;
	private JButton btnActualizarP;
	private JButton btnBorrarC;
	private JButton btnBorrarP;
	private JButton btnMostrarC;
	private JButton btnMostrarP;
	private JLabel bannerVentanaO;
	
	public VentanaMasOpciones() {
		inicializarMasOpciones();
		setVisible(false);
	}
	
	public void inicializarMasOpciones() {
		setTitle("Ventana Categorías");
		setBounds(275, 20, 980, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#FFFFFF"));

		
		
	}

}

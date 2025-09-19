package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaCuentaCreada extends JFrame {

	private JOptionPane mensaje;

	public VentanaCuentaCreada() {
	}

	public void inicializarVentanaCuentaCreada() {
		JOptionPane.showMessageDialog(mensaje, "La cuenta ha sido creada con éxito ", "Mensaje",
				JOptionPane.PLAIN_MESSAGE);
	}

	public JOptionPane getMensaje() {
		return mensaje;
	}

	public void setMensaje(JOptionPane mensaje) {
		this.mensaje = mensaje;
	}

}

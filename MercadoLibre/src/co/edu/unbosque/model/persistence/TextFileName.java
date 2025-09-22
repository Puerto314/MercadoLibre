package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Usuario;

public class TextFileName {

	public static void main(String[] args) {
		Object contenido = FileHandler.leerDesdeArchivoSerializado("Usuario.bin");
		ArrayList<Usuario> listaUsuario;
		
		if(contenido != null) {
			listaUsuario = (ArrayList<Usuario>) contenido;
		}else {
			listaUsuario = new ArrayList<Usuario>();
		}
		for (Usuario usuario : listaUsuario) {
			System.out.println(usuario.toString());
		}

	}

}

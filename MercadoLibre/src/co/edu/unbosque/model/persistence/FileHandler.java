package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

public class FileHandler {

	public static File archivo;
	public static PrintWriter escritor;
	public static Scanner lector;
	public static Properties prop;
	public static ObjectInputStream ois;
	public static ObjectOutputStream oos;
	public static FileInputStream fis;
	public static FileOutputStream fos;

	public static void escribirEnArchivoTexto(String url, String contenido) {

		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			escritor = new PrintWriter(archivo);
			escritor.println(contenido);
			escritor.close();
		} catch (IOException e) {
			System.out.println("Error al crear y escribir el archivo de texto");
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}

	public static String leerDesdeArchivoDeTexto(String url) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			lector = new Scanner(archivo);
			String contenido = "";
			while (lector.hasNext()) {
				contenido += lector.nextLine() + "\n";
			}
			lector.close();
			return contenido;

		} catch (IOException e) {
			System.out.println("Error al leer el archivo de texto");
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		return null;
	}
	public static void escribirEnArchivoSerializado(String url, Object contenido) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fos = new FileOutputStream(archivo);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(contenido);
			// primero cerrar object y despues file
			oos.close();
			fos.close();

		} catch (IOException e) {
			System.err.println("Error al escribir el archivo serializado.");
			e.printStackTrace();

			// Se indica a las clases padres e hijas que tienen la capacidad de
			// serializacion, y todo se hace en el modelo
		}
	}
	
	public static Object leerDesdeArchivoSerializado(String url) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);
			Object contenido = ois.readObject();
			
			ois.close();
			fis.close();
			return contenido;
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo serializado.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Error al deserializar los datos del usuario.");
			e.printStackTrace();
		}
		return null;
	}
	
	public static Properties cargarArchivosDePropiedad(String url) {
        try {
            File archivo = new File(url);
            if (!archivo.exists()) {
                System.out.println("El archivo no existe: " + url);
                return null;
            }
            Properties prop = new Properties();
            prop.load(new FileInputStream(archivo));
            return prop;
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo de propiedad");
            e.printStackTrace();
        }
        return null;
    }
	

}

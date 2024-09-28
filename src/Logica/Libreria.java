package Logica;
import java.util.*;


public class Libreria {
	
	private ArrayList<Libro>Libros;

	public Libreria(ArrayList<Libro> libros) {
		this.Libros = new ArrayList<Libro>();
	}

	public ArrayList<Libro> getLibros() {
		return Libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		Libros = libros;
	}
	public void añadirLibros(Libro libro1) {
		Libros.add(libro1);
	}
	
	public void mostrarInventario() {
		for (int i = 0; i < Libros.size(); i++) {
			System.out.println(Libros.toString());
		}
	}

}

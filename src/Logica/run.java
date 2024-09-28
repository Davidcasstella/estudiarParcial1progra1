package Logica;
import java.util.*;
public class run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		int cant;
		
		Libreria libreria  = new Libreria(null);
		 
		do {
		System.out.println("bienvenido a la libreria");
		System.out.println("1. Añadir libro");
		System.out.println("2. Actualizar informacion");
		System.out.println("3. Eliminar libro");
		System.out.println("4. mostrar inf");
		System.out.println("6. salir ");
		
		menu= scanner.nextInt();
		
		switch (menu) {
		case 1:
			
			System.out.println("cuantos libros deseas añadir: ");
			cant = scanner.nextInt();
			
			for (int i = 0; i < cant ; i++) {
				
				System.out.println("ingrese el titulo del libro: "+(1+i));
				String tituloLibro =scanner.next();
				System.out.println("ingrese el autor del libro: "+(1+i));
				String autorLibro=scanner.next();
				System.out.println("ingrese el nombre del isbn: "+ (1+i));
				String isbnLibro= scanner.next();
				System.out.println("ingrese el precio del libro: "+(i+1));
				double precioLibro=scanner.nextDouble();
				libreria.añadirLibros(new Libro(tituloLibro,autorLibro,isbnLibro,precioLibro));
			
				
				
			}
			
			break;
		case 2:
			
			break;		
		case 3:
	
			break;
		case 4:
			
			
	
			break;
		case 5:
	
			break;

		default:
			System.out.println("Estas saliendo de la libreria");
			break;
		}
		
		}while(menu!=5 );
		
		
		
		
		
	}

}

package ej2;

import java.util.Scanner;
import java.util.ArrayList;

public class ProductoMain {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion = mostrarMenu();
		ArrayList<Producto> listaProductos = new ArrayList<Producto>(); 
		do{
			switch(opcion) {
				case(1):{//mostrar productos e iva
					System.out.println(listaProductos);
					Producto p1 = new Producto("prueba");
					System.out.println(p1.getIVA());
					break;
				}
				case(2):{
					//hashet?
					//añadir error si intenta añadir algo con el mismo codigo
					System.out.println("Introduce el nombre del producto: ");
					String nombre = teclado.nextLine();
					Producto p1 = new Producto(nombre);
					listaProductos.add(p1);
					break;
				}
				case(3):{
					//elegir producto de la lista
					System.out.println("¿De qué producto quieres modificar el precio?: ");
					//preguntar el precio nuevo
					System.out.println("¿Cuál es el nuevo precio?: ");
					double nuevoPrecio = Double.parseDouble(teclado.nextLine());
					//modificar su precio
					p1.setPrecio(nuevoPrecio);
					break;
				}
				case(4):{
					//elegir producto de la lista
					System.out.println("¿De qué producto quieres modificar la descripción?: ");
					//preguntar nueva descripcion
					System.out.println("¿Cuál es la nueva descripción?: ");
					String nuevaDescripcion = teclado.nextLine();
					//modificar su descripcion
					p1.setPrecio(nuevaDescripcion);
					break;
				}
			}
			opcion = mostrarMenu();
			
		}while (opcion!=5);
		
	}
	public static int mostrarMenu() {
		System.out.println("¿Qué quieres hacer?:\n1. Ver información\n2. Añadir producto\n3. Modificar precio\n"
				+ "4. Modificar descripción\n5. Salir\n");
		int opcion = Integer.parseInt(teclado.nextLine());
		return opcion;
	}
}

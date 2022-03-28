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
				case(1):{
					break;
				}
				case(2):{
					System.out.println("Introduce el nombre del producto: ");
					String nombre = teclado.nextLine();
					Producto p1 = new Producto(nombre);
					
					break;
				}
				case(3):{
					break;
				}
				case(4):{
					break;
				}
			}
			opcion = mostrarMenu();
			
		}while (opcion!=5);
		
	}
	public static int mostrarMenu() {
		System.out.println("¿Qué quieres hacer?:\n1. Ver productos\n2. Añadir producto\n3. Modificar precio\n"
				+ "4. Modificar descripción\n5. Salir\n");
		int opcion = Integer.parseInt(teclado.nextLine());
		return opcion;
	}
}

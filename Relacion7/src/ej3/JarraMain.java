package ej3;

import java.util.Scanner;

public class JarraMain {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// crear dos jarras con datos de teclado
		System.out.println("Introduce la capacidad de la primera jarra: ");
		double capacidad = Double.parseDouble(teclado.nextLine());
		Jarra j1 = new Jarra (capacidad);
		System.out.println("Introduce la capacidad de la segunda jarra: ");
		capacidad = Double.parseDouble(teclado.nextLine());
		Jarra j2 = new Jarra (capacidad);
		
		//menú para usuarios
		System.out.println("Selecciona la opcion que desees realizar:\n1. Llenar jarra\n2. Vaciar jarra\n"
				+ "3.Volcar jarra A en jarra B\n 4. Volcar jarra B en jarra A\n5. Ver estado de las jarras\n 6. Salir");
		int opcion = Integer.parseInt(teclado.nextLine());
		//bucle para realizar las opciones del menú siempre que no se quiera salir
		do {
			switch(opcion) {
				case(1):{
					System.out.println("¿Qué jarra desea rellenar? (A/B): ");
					char eleccion = teclado.nextLine().charAt(0);
					if (eleccion == 'A') {
						j1.llenarJarra();
					}else {
						j2.llenarJarra();
					}
					break;
				}
				case(2):{
					System.out.println("¿Qué jarra desea vaciar? (A/B): ");
					char eleccion = teclado.nextLine().charAt(0);
					if (eleccion == 'A') {
						j1.vaciarJarra();
					}else {
						j2.vaciarJarra();
					}
					break;
				}
				case(3):{
					break;
				}
				case(4):{
					break;
				}
				case(5):{
					break;
				}
			}
			System.out.println("Selecciona la opcion que desees realizar:\n1. Llenar jarra\n2. Vaciar jarra\n"
					+ "3.Volcar jarra A en jarra B\n 4. Volcar jarra B en jarra A\n5. Ver estado de las jarras\n 6. Salir");
			opcion = Integer.parseInt(teclado.nextLine());
		}while (opcion != 6);

	}

}

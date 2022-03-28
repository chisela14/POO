//Realizar un programa que permita gestionar el saldo de una cuenta corriente. Una
//vez introducido el saldo inicial, se mostrará un menú que permitirá efectuar las
//siguientes operaciones:
//1. Hacer un reintegro, se pedirá la cantidad a retirar.
//2. Hacer un ingreso, se pedirá la cantidad a ingresar.
//3. Consultar el saldo y el número de reintegros e ingresos realizados.
//4. Finalizar las operaciones. Debe confirmar si realmente desea salir e
//informar del saldo al final de todas las operaciones.

import java.util.Scanner;

public class CuentaMain {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Crear cuenta con el saldo que nos den
		System.out.println("Introduce tu saldo: ");
		int saldo = Integer.parseInt(teclado.nextLine());
		Cuenta c1 = new Cuenta (saldo);
		
		//inicializacion del booleano que marca cuando se sale del bucle, al principio no queremos salir
		boolean salir = false;
		//iniciliazion del contador para la opcion de consulta
		int totalReintegros = 0, totalIngresos = 0;
		
		//Bucle para que muestre el menu al usuario siempre que no elija la opcion para finalizar
		do {
			//mostrar menu al usuario y guardar su eleccion
			System.out.println("¿Qué opción quieres realizar con tu cuenta?: \nHacer un reintegro (R)\nHacer un ingreso (I)"
					+ "\nConsultar el saldo y el número de ingresos y reintegros realizados (C)\nSalir (S)\n");
			char opcion = teclado.nextLine().charAt(0);
		
			//crear switch con diferentes case segun las opciones
			switch (opcion) {
				case ('R'):{
					System.out.println("Introduce la cantidad a retirar: ");
					int reintegro = Integer.parseInt(teclado.nextLine());
					c1.hacerReintegro (reintegro);
					totalReintegros++;
					break;
				}
				case ('I'): {
					System.out.println("Introduce la cantidad a ingresar: ");
					int ingreso = Integer.parseInt(teclado.nextLine());
					c1.hacerIngreso (ingreso);
					totalIngresos++;
					break;
				}
				case ('C'):{
					System.out.println("Tu saldo es: " + c1.getSaldo() + ". Has realizado " + totalIngresos + " ingresos y " + totalReintegros + " reintegros.");
					break;
				}
				case ('S'): {
					System.out.println("¿Realmente desea salir?(S/N): ");
					char confirmacion = teclado.nextLine().charAt(0);
					if (confirmacion == 'S') {
						System.out.println("Tu saldo es: " + c1.getSaldo());
						salir = true;
					}
					break;
				}
			}
		}while (salir == false);
	}
}
		
	



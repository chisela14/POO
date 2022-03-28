import java.util.Scanner;

public class Main {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Mostrar las opciones al usuario
		System.out.println("Bienvenid@ al restaurante, indica qué quieres hacer: \n"
				+ "1. Dar de alta un plato\n"
				+ "2. Modificar el precio de un plato\n"
				+ "3. Asignar un vino a un plato \n"
				+ "4. Mostrar información de un plato\n"
				+ "5. Monstrar información de todos los platos\n"
				+ "6. Salir\n");
		int opcion = teclado.nextLine().charAt(0);
	
		//Menu 
		Plato listaPlatos[];
		switch (opcion) {
			case (1):{ //Dar de alta un plato
				System.out.println("Introduce el nombre del plato: ");
				String nombre = teclado.nextLine();
				//Exception para comprobar el nombre de los paltos
				try { //si es igual a algun nombre de un plato de la lista
					nombre.equals(listaPlatos.getNombre());
				}catch (Exception e) {
					System.out.println("El plato que intentas introducir ya existe");
				}
				
				System.out.println("Introduce el precio: ");
				double precio = Double.parseDouble(teclado.nextLine());
				Plato p1 = new Plato (nombre, precio);
				listaPlatos = listaPlatos + p1;// se añadiria al array (corregir)
				
				break;
			}
			case (2):{ //Modificar el precio de un plato
				System.out.println("Introduce el nombre del plato: ");
				String nombre = teclado.nextLine();
				//Exception para comprobar el nombre de los paltos
				try { //si es igual a algun nombre de un plato de la lista
					nombre.equals(listaPlatos.getNombre());
				}catch (Exception e) {
					System.out.println("El plato que intentas introducir ya existe");
				}
				System.out.println("Introduce el precio: ");
				double precio = Double.parseDouble(teclado.nextLine());
				setprecio //modificar precio
				
				break;
			}
			case(3):{ //Asignar un vino a un plato
				break;
			}
			case(4):{ //Mostrar informacion de un plato
				System.out.println("Introduce el nombre del plato: ");
				String nombre = teclado.nextLine();
				//
				break;
			}
			case(5):{ //Mostrar informacion de todos los platos
				System.out.println("La información de todos los platos es la siguiente: " + listaPlatos);
				break;
			}
			case(6):{ //Salir
				System.out.println("Ha salido con éxito");
				break;
			}
		}

	}

}

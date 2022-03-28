import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Plato> listaPlatos = new ArrayList<Plato> ();
		char opcion;
		
		do {
			mostrarMenu();
			opcion = teclado.nextLine().charAt(0);
			try {
				//cambiar a swtich
				if (opcion == '1') {
					darAlta (listaPlatos);
				}else if (opcion == '2'){
					modificarPrecio (listaPlatos);
				}else if (opcion == '5') {
					mostrarPlatos (listaPlatos);
				}else if (opcion=='3') {
					asignarVino (listaPlatos);
				}
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
		}while (opcion != '6');
		
	}
	
	public static void mostrarMenu () {
		System.out.println("Bienvenid@ al restaurante, indica que quieres hacer: \n"
				+ "1. Dar de alta un plato\n"
				+ "2. Modificar el precio de un plato\n"
				+ "3. Asignar un vino a un plato \n"
				+ "4. Mostrar informacion de un plato\n"
				+ "5. Monstrar informacion de todos los platos\n"
				+ "6. Salir\n");
		
	}
	
	public static void darAlta (ArrayList<Plato> listaPlatos) throws Exception {
		System.out.println("Introduce el nombre del plato: ");
		String nombre = teclado.nextLine();
		validarPlato (listaPlatos, nombre);
		System.out.println("Introduce el precio: ");
		double precio = Double.parseDouble(teclado.nextLine());
		if (precio <= 0) {
			throw new Exception ("El precio no es valido");
		}
		Plato p1 = new Plato (nombre, precio);
		listaPlatos.add (p1);
		System.out.println(listaPlatos);
		
	}
	public static void validarPlato (ArrayList<Plato> listaPlatos, String nombre) throws Exception {
		for (int i=0; i<listaPlatos.size(); i++) {
			Plato plato = listaPlatos.get(i);
			if (plato.getNombre().equals(nombre)) {
				throw new Exception ("No se puede añadir el plato porque ya existe"); 
			}
		}
	}
	public static void modificarPrecio (ArrayList<Plato> listaPlatos)throws Exception{
		System.out.println("Introduce el nombre del plato: ");
		String nombre = teclado.nextLine();
		Plato plato =  obtenerPlato (listaPlatos, nombre);
		System.out.println("Introduce el precio: ");
		double precio = Double.parseDouble(teclado.nextLine());
		plato.setPrecio (precio);
		
	}
	public static Plato obtenerPlato (ArrayList<Plato> listaPlatos, String nombre) throws Exception {
		for (int i=0; i<listaPlatos.size(); i++) {
			Plato plato = listaPlatos.get(i);
			if (plato.getNombre().equals(nombre)) {
				return plato;
			}
		}
		throw new Exception ("No existe ningún plato con ese nombre");
	}
	public static void asignarVino (ArrayList<Plato> listaPlatos) throws Exception {
		System.out.println("Introduce el nombre del plato: ");
		String nombrePlato = teclado.nextLine();
		Plato plato = obtenerPlato (listaPlatos, nombrePlato);
		System.out.println("Introduce el nombre del vino: ");
		String nombreVino = teclado.nextLine();
		System.out.println("Introduce la graduacion del vino: ");
		double graduacion = Double.parseDouble(teclado.nextLine());
		Vino v1 = new Vino (nombreVino, graduacion);
		plato.setVinoRecomendado(v1);
	}
	
	
	public static void mostrarPlatos (ArrayList<Plato> listaPlatos) {
		System.out.println(listaPlatos);
	}

}

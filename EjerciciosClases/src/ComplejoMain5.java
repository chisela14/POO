import java.util.Scanner;

public class ComplejoMain5 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("¿Qué quieres hacer?:\n1. Sumar números complejos\n2. Restar números complejos\n3. Salir\n");
		char opcion = teclado.nextLine().charAt(0);
		do {
			switch(opcion) {
				case('1'):{
					// Crear dos números complejos y mostrar resultado
					Complejo c1 = pedirComplejo();
					Complejo c2 = pedirComplejo();
					System.out.println(c1.suma(c2));
					break;
				}
				case('2'):{
					// Crear dos números complejos y mostrar resultado
					Complejo c1 = pedirComplejo();
					Complejo c2 = pedirComplejo();
					System.out.println(c1.resta(c2));
					break;
				}
			}
			//mostrar de nuevo el menú
			System.out.println("¿Qué quieres hacer?:\n1. Sumar números complejos\n2. Restar números complejos\n3. Salir\n");
			opcion = teclado.nextLine().charAt(0);
			
		}while (opcion !=3);
		
		
	}
	public static Complejo pedirComplejo() {
		System.out.println("Introduce la parte real: ");
		double pReal = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduce la parte imaginaria: ");
		double pImaginaria = Double.parseDouble(teclado.nextLine());
		Complejo resultado = new Complejo (pReal, pImaginaria);
		return resultado;
	}
}

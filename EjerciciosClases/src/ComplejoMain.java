import java.util.Scanner;

public class ComplejoMain {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crear dos números complejos
		Complejo c1 = pedirComplejo();
		Complejo c2 = pedirComplejo();
		//Mostrar suma y resta de estos numeros
		System.out.println(c1.suma(c2));
		System.out.println(c1.resta(c2));
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

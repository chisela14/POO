/* La frecuencia cardíaca máxima recomendada durante la realización de práctica deportiva tipo cardio
no debe exceder el 85% de la frecuencia cardíaca máxima (FCM). Esta última se calcula restando la
edad de la persona a 220. 

Elabora una función o método que reciba un valor entero que será el año
actual y una cadena con la fecha de nacimiento de una persona (formato dd/mm/yyyy) y devuelva un
número real que será la frecuencia cardíaca máxima recomendada durante un ejercicio de tipo cardio
(para el cálculo de la edad no se contempla ni el mes ni el día, es decir, si alguién nació en el 2000 y
estamos en el año 2022, consideraremos que tiene 22 años).

Realizar un programa principal que solicite el año actual y la fecha de nacimiento en el formato
especificado y que muestre la frecuencia cardíaca máxima por pantalla. NO es necesario validar los
datos, pensamos que el usuario siempre lo introduce como debe.*/ 

import java.util.Scanner;

public class Ejercicio2 {
	
	public static Scanner teclado =new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		int anyo;
		String fNacimiento;
		//Pedir año actual y fecha de nacimiento
		System.out.println("Introduce el año actual: ");
		anyo = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy): ");
		fNacimiento = teclado.nextLine();
		//Mostrar frecuencia cardiaca calculada en un método
		System.out.println("Tu frecuencia máxima recomendada es " + frecuencia (anyo, fNacimiento));
	}
	
	public static double frecuencia (int anyo, String fNacimiento) {
		//calcular la edad
		int aNacimiento, edad;
		aNacimiento = fNacimiento.length()-4;
		edad = anyo - aNacimiento;
		//calcular la frecuencia máxima y la recomendada
		int frecuencia = 220 - edad;
		double fRecomendada = frecuencia * 0.85;
		return fRecomendada;
		
	}

}

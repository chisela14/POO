/* Realiza un programa que calcule el precio de unas entradas de cine en función del número de
personas y del día de la semana. El precio general de una entrada son 8 euros. El miércoles (día del
espectador), el precio es de 5 euros. Los jueves es el día de la pareja, por lo que la entrada para dos
cuesta 11 euros.
Por ejemplo, si un jueves, un grupo de 6 personas compran entradas, el precio total sería de 33
euros ya que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más 1 individual
que son 41 euros (33 + 8).
Además si dispone de la tarjeta CineJacaranda se obtiene un 10% de descuento.
Se debe seguir vendiendo entradas hasta que se introduzca 0 en el número de entradas.
Si se confunde al pedir el día de la semana o si tiene tarjeta del CineJacaranda se debe volver a
pedir la información.
No nos importa que salga más de dos decimales.
Realiza el programa para que si en un futuro cambia el precio de las entradas, ya sea el general, el
del día del espectador o el del día de la pareja, se pueda modificar fácilmente.*/

import java.util.Scanner;

public class Ejercicio1 {
	
	public static Scanner teclado =new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		int numPersonas, eDobles, eIndividuales;
		char dia, tarjetaJ;
		final int eGeneral=8, dEspectador=5, dPareja=11;
		double resultado=0.0;
		
		//Pedir datos y realizar el cálculo en un bucle para vender entradas hasta que se introduzca 0 como número de personas
		do {
			//Pedir datos
			System.out.println("Introduce el número de personas: ");
			numPersonas = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce el día de la semana (L/M/X/J/V/S/D): ");
			dia = teclado.nextLine().charAt(0);
			System.out.println("¿Dispone de la tarjeta CineJacaranda? (S/N): ");
			tarjetaJ = teclado.nextLine().charAt(0);
			
			//Calcular el resultado según el día de la semana
			switch (dia) {
				case ('L'):
				case ('M'):
				case ('V'):
				case ('S'):
				case ('D'): {
					//Supongo que con una tarjeta se hace descuento a toda la compra
					if (tarjetaJ == 'S') {
						resultado = numPersonas * eGeneral * 0.10;
					}else {
						resultado = numPersonas * eGeneral;
					}
				}break;
				case ('X'):{
					if (tarjetaJ == 'S') {
						resultado = numPersonas * dEspectador * 0.10;
					}else {
						resultado = numPersonas * dEspectador;
					}
				}break;
				case ('J'): {
					eDobles = numPersonas / 2;
					eIndividuales = numPersonas % 2;
					if (tarjetaJ == 'S') {
						resultado = (eDobles/2 * dPareja) + (eIndividuales * eGeneral)* 0.10;
					}else {
						resultado = eDobles/2 * dPareja + eIndividuales * eGeneral;
					}
					
				}break;
			}
			
			System.out.println("El precio a pagar es " + resultado);
			
		}while (numPersonas !=0);

	}

}

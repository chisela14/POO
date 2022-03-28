import java.util.Scanner;

public class LineaMain {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crear una línea solicitando datos por teclado
		System.out.println("Vamos a crear una línea, introduce el primer punto, separando x de y mendiante un guión (-): ");
		String punto = teclado.nextLine();
		Punto p1 = conseguirPunto (punto);
		System.out.println("Introduce el segundo punto de la línea (separando x de y mendiante un guión (-)): ");
		punto = teclado.nextLine();
		Punto p2 = conseguirPunto (punto);
		Linea l1 = new Linea (p1,p2);
		//Menú
		System.out.println("Introduce la opción deseada: \n1. Mover línea\n2. Mostrar línea\n3. Salir");
		int opcion = Integer.parseInt(teclado.nextLine());
		switch (opcion) {
			case (1):{
				System.out.println("Introduce el tipo de movimiento (A-Arriba, B-Abajo, I-Izquierda, D-Derecha): ");
				char movimiento = teclado.nextLine().charAt(0);
				System.out.println("Introduce la distancia del movimiento: ");
				double distancia = Double.parseDouble(teclado.nextLine());
				switch (movimiento) {
					case ('A'):{
						System.out.println("La nueva línea es: " + l1.moverArriba(distancia)); 
						break;
					}
					case ('B'):{
						System.out.println("La nueva línea es: " + l1.moverAbajo(distancia)); 
						break;
					}
					case ('I'):{
						System.out.println("La nueva línea es: " + l1.moverIzquierda(distancia));
						break;
					}
					case ('D'):{
						System.out.println("La nueva línea es: " + l1.moverDerecha(distancia)); 
						break;
					}
				}break;
			}
			case (2):{
				System.out.println("Tu linea es: " + l1.mostrarPuntos(p1, p2));
				break;
			}
			case (3):{
				System.out.println("Has finalizado el programa con éxito");
				break;
			}
		}
	}
		
	//conseguir un punto a través de un string
	public static Punto conseguirPunto (String punto) {
		//Dividir la cadena en los dos puntos
		final String SEPARADOR = "-";
		String [] partes = punto.split(SEPARADOR);
		String parte1 = partes [0];
		String parte2 = partes [1];
		//Pasar esos puntos a double para crear el Punto resultado que tiene que devolver la función
		double x, y;
		x = Double.parseDouble(parte1);
		y = Double.parseDouble(parte2);
		Punto resultado = new Punto (x,y);
		return resultado;
	}
		

}

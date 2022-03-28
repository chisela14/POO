/* Transforma esta estructura en un bucle for:
int num = 0, a = 3;
do{
a+=num;
num++;
}while(num > 15);
System.out.println(a);*/

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// Declarar variables
		int num = 0, a=3;
		
		//Estructura for
		for (int i=0; num > 15; i++) {
			a = a + num;
			num = num + 1;
		}
		
		//Imprimir a
		System.out.println(a);

	}

}

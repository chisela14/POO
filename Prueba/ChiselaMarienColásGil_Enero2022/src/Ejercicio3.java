/* Un teclado electrónico emite una de las siete notas musicales cada vez que se pulsa la tecla
adecuada. Al pulsar cada tecla el instrumento calcula la frecuencia en Hercios (Hz) de la nota
asociada y emite el sonido correspondiente.
Los valores de cada nota son los siguientes:
Nota
Frecuencia (Hz)
DO 		RE 		MI 		FA 	SOL 	LA SI
523,25 587,33 659,26 698,46 783,99 880 987,77
- Elabora una función que reciba el string de la tecla que se ha pulsado en mayúsculas o
minúsculas (do, re, mi, etc.) y devuelva la frecuencia que le corresponde.
Por ejemplo, si se pulsa la tecla Mi devuelve 659,26.
- Amplía la función anterior para que además de la nota, reciba un parámetro de tipo boolean
de forma que si se pasa un valor true es que se ha pulsado la que es de tipo sostenido,en
cuyo caso la frecuencia será la original por 1,03 y si recibe false, deberá devolver la
frecuencia según la tabla anterior.
Por ejemplo, Mi sostenido (Mi # ) = 659,26*1,03=685,63, Mi normal = 659,26*/

import java.util.Scanner;

public class Ejercicio3 {
	
	//Entiendo que la tecla pulsada no se pedirá por pantalla pero declaro esto para hacer pruebas
	public static Scanner teclado =new Scanner(System.in);
	
	public static void main(String[] args) {
		String nota = "mi";
		boolean sostenido = true;
		System.out.println(devolverFrecuencia (nota, sostenido));
	}
	
	public static double devolverFrecuencia (String nota, boolean sostenido) {
		double frecuencia=0;
		//Guardar la tecla en mayúsculas y minúsculas
		String notaMayus, notaMinus;
		notaMayus = nota.toUpperCase();
		notaMinus = nota.toLowerCase();
		//Devolver la frecuencia dependiendo de la nota que sea
		if (notaMayus.equals("DO") || notaMinus.equals("do")){
			frecuencia = 523.25;
		}else if (notaMayus.equals("RE") || notaMinus.equals("re")){
			frecuencia = 587.33;
		}else if (notaMayus.equals("MI") || notaMinus.equals("mi")){
			frecuencia = 659.26;
		}else if (notaMayus.equals("FA") || notaMinus.equals("fa")){
			frecuencia = 698.46;
		}else if (notaMayus.equals("SOL") || notaMinus.equals("sol")){
			frecuencia = 783.99;
		}else if (notaMayus.equals("LA") || notaMinus.equals("la")){
			frecuencia = 880;
		}else if (notaMayus.equals("SI") || notaMinus.equals("si")){
			frecuencia = 987.77;
		}
		if (sostenido == true) {
			frecuencia = frecuencia * 1.03;
		}
		return frecuencia;
	}

}

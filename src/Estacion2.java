import java.util.Scanner;

/*
 * Programa que determina la estaci�n del a�o en funci�n del mes. 
 * */

public class Estacion2 {

	public static void main(String[] args) {
		int num = 0;
		String estacion = "verano";
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el n�mero de un mes entre 1 y 12");
		num = entrada.nextInt();

		if (num >= 1 && num <= 12) {
			switch (num) {
			case 3:
			case 4:
			case 5:
				estacion = "primavera";
				System.out.println("La estaci�n es " + estacion);
				break;
			case 6:
			case 7:
			case 8:
				estacion = "verano";
				System.out.println("La estaci�n es " + estacion);
				break;
			case 9:
			case 10:
				estacion = "oto�o";
				System.out.println("La estaci�n es " + estacion);
				break;
			case 11:
			case 12:
			case 1:
			case 2:
				estacion = "invierno";
				System.out.println("La estaci�n es " + estacion);
				break;
			}
		} else {
			System.out.println(num + " no es un mes correcto correcto");
		}

	}

}

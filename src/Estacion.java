import java.util.Scanner;

/*
 * Programa que determina la estaci�n del a�o en funci�n de un n�mero
 * */

public class Estacion {

	public static void main(String[] args) {
		int num = 0;
		String estacion = "verano";
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe escribe el n�mero de la estaci�n entre 1 y 4");
		num = entrada.nextInt();

		if (num >= 1 && num <= 4) {
			switch (num) {
			case 1:
				estacion = "primavera";
				System.out.println("La estaci�n es " + estacion);
				break;
			case 2:
				estacion = "verano";
				System.out.println("La estaci�n es " + estacion);
				break;
			case 3:
				estacion = "oto�o";
				System.out.println("La estaci�n es " + estacion);
				break;
			case 4:
				estacion = "invierno";
				System.out.println("La estaci�n es " + estacion);
				break;
			}
		} else {
			System.out.println(num + " no es un n�mero de estaci�n correcto");
		}

	}

}

import java.util.Scanner;

/*
 * Programa que determina la estación del año en función de un número
 * */

public class Estacion {

	public static void main(String[] args) {
		int num = 0;
		String estacion = "verano";
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe escribe el número de la estación entre 1 y 4");
		num = entrada.nextInt();

		if (num >= 1 && num <= 4) {
			switch (num) {
			case 1:
				estacion = "primavera";
				System.out.println("La estación es " + estacion);
				break;
			case 2:
				estacion = "verano";
				System.out.println("La estación es " + estacion);
				break;
			case 3:
				estacion = "otoño";
				System.out.println("La estación es " + estacion);
				break;
			case 4:
				estacion = "invierno";
				System.out.println("La estación es " + estacion);
				break;
			}
		} else {
			System.out.println(num + " no es un número de estación correcto");
		}

	}

}

import java.util.Scanner;

public class Estaciones {

	public static void main(String[] args) {
		int num = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entre 1 y 4");
		num = entrada.nextInt();

		if (num >= 1 && num <= 4) {
			switch (num) {
			case 1:
				System.out.println("La estación es verano");
				break;
			case 2:
				System.out.println("La estación es primavera");
				break;
			case 3:
				System.out.println("La estación es otoño");
				break;
			case 4:
				System.out.println("La estación es invierno");
				break;
			}
		} else {
			System.out.println(num + " no es un número correcto");
		}

	}

}

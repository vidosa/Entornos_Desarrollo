import java.util.Scanner;

public class Estaciones2 {

	public static void main(String[] args) {
		int num = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un n�mero entre 1 y 12");
		num = entrada.nextInt();

		if (num >= 1 && num <= 12) {
			switch (num) {
			case 3:
			case 4:
			case 5:
				System.out.println("La estaci�n es primavera");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("La estaci�n es verano");
				break;
			case 9:
			case 10:
				System.out.println("La estaci�n es oto�o");
				break;
			case 11:
			case 12:
			case 1:
			case 2:
				System.out.println("La estaci�n es invierno");
				break;
			}
		} else {
			System.out.println(num + " no es un n�mero correcto");
		}

	}

	}


import java.util.Scanner;

public class Estaciones {

	public static void main(String[] args) {
		int num = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un n�mero entre 1 y 4");
		num = entrada.nextInt();

		if (num >= 1 && num <= 4) {
			switch (num) {
			case 1:
				System.out.println("La estaci�n es verano");
				break;
			case 2:
				System.out.println("La estaci�n es primavera");
				break;
			case 3:
				System.out.println("La estaci�n es oto�o");
				break;
			case 4:
				System.out.println("La estaci�n es invierno");
				break;
			}
		} else {
			System.out.println(num + " no es un n�mero correcto");
		}

	}

}

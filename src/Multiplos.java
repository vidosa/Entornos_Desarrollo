import java.util.Scanner;

/*
 * Programa que determina si un numero es multiplo de 3 y 5
 * */
public class Multiplos {

	public static void main(String[] args) {
		// Variables
		int numero = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduce un numero. Cuando termines introduce -1");
			numero = teclado.nextInt();
			if (numero % 3 == 0 && numero % 5 == 0) {
				System.out.println(numero + " es múltiplo de 3 y de 5");
			} else {
				System.out.println(numero + " no es múltiplo de 3 y de 5");
			}
		} while (numero != -1);
		if (numero == -1)
			System.out.println("Has salido del programa");
	}
}

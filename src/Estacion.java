import java.util.Scanner;

public class Estacion {

	public static void main(String[] args) {
		int num = 0;
		String estacion = "verano";
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un n�mero entre 1 y 4");
		num = entrada.nextInt();

		if (num >= 1 && num <= 4) {
			switch (num) {
			case 1:
				estacion = "verano";
				System.out.println("La estaci�n es " + estacion);
				break;
			case 2:
				estacion = "primavera";
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
			System.out.println(num + " no es un n�mero correcto");
		}

	}

}

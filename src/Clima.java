import java.util.Scanner;

/*
 * Programa que determina el tipo de clima según la temperatura
 * */

public class Clima {

	public static void main(String[] args) {
		
		float temp = (float) 0.00;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce una temperatura");
		temp = entrada.nextFloat();

		if (temp < 10) {
			System.out.println("El clima es Frio");

		} else if (temp >= 10 && temp <= 20) {
			System.out.println("El clima es Templado");

		} else if (temp >= 21 && temp <= 30) {
			System.out.println("El clima es Cálido");

		} else if (temp > 30) {
			System.out.println("El clima es Tropical");
		}

	}
}

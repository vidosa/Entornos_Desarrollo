import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		
		double importeInicial = 0.00;
		double importeFinal = 0.00;
		final double DESCUENTO_19 = 0.19;
		final double DESCUENTO_20 = 0.20;
		final double IMPUESTO = (float) 0.19;
		double descuento = 0.00;
		double cantidadImpuesto = 0.00;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce importe inicial");
		importeInicial = entrada.nextDouble();

		if (importeInicial <= 100 && importeInicial>0) {
			importeFinal = importeInicial + ((importeInicial - (importeInicial * DESCUENTO_19)) * IMPUESTO);
			descuento = importeInicial * DESCUENTO_19;
			cantidadImpuesto = (importeInicial - (importeInicial * DESCUENTO_19)) * IMPUESTO;
		} else {
			importeFinal = importeInicial + ((importeInicial - (importeInicial * DESCUENTO_20)) * IMPUESTO);
			descuento = importeInicial * DESCUENTO_20;
			cantidadImpuesto = (importeInicial - (importeInicial * DESCUENTO_20)) * IMPUESTO;
		}

		System.out.println(" El importe final es: " + importeFinal +"\n el descuento es: " + descuento + "\n y el impuesto es:  "
				+ cantidadImpuesto);

	}

}

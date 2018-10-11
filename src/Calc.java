import java.util.Scanner;

public class Calc {
	private static Scanner s;
	static double decimales;
	static int enteros;
	
	public static void main(String[] args) {
		//String numerol;
		boolean repetir=true;
		while (repetir==true) {
		double numero;
		s = new Scanner(System.in);
		System.out.println("Introduce el numero");
		numero = s.nextDouble();
		
		
		enteros = (int) numero;
		decimales = numero - enteros;
		

		Calc.calculoenteros();
		System.out.print(".");
		Calc.calculodecimales();
		System.out.println();
		}
	}

	public static void calculodecimales() {
		int i2 = 0;
		int i = 0;
		int[] resultado = new int[101];
		while (decimales != 1 && i < 100) {
			i++;
			decimales = decimales * 2.;
			if (decimales > 1) {
				decimales = decimales - 1.;
				resultado[i] = 1;
			} else {
				resultado[i] = 0;
			}
			if (decimales == 1) {
				resultado[i] = 1;
			}
			// System.out.println(i + " " + resultado[i] + " " + decimales);
		}
		i2 = i; 
		i = 0;
		while (i != i2) {
			i++;
			System.out.print(resultado[i]);
		}
	}

	public static void calculoenteros() {
		int i = 0;
		int[] resultado = new int[101];
		if (enteros >= 1) {
			while (enteros != 0 && i < 100) {

				i++;
				resultado[i] = enteros % 2;
				// System.out.print(i +" " + resultado[i]);
				enteros = enteros / 2;

			}
			while (i != 0) {
				System.out.print(resultado[i]);
				i = i - 1;
			}
		} else {
			System.out.print("0");
		}

	}
}

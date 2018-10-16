import java.util.Scanner;

public class CalcBin {
	private static Scanner s;

	public static void main(String[] args) {
		boolean repetir = true;
		while (repetir == true) {
			double numero;
			double decimales;
			int enteros;
			s = new Scanner(System.in);
			System.out.println("Introduce el numero");
			numero = s.nextDouble();
			enteros = (int) numero;
			decimales = numero - enteros;

			CalcBin.calculoenteros(enteros);
			System.out.print(",");
			CalcBin.calculodecimales(decimales);
			System.out.println();
		}
	}

	public static void calculodecimales(double decimales) {
		int i2 = 0;
		int i = 0;
		if (decimales > 0) {
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
				 //System.out.println(i + " " + resultado[i] + " " + decimales);
				// Muestra el resultado y decimales en cada paso  
			}
			i2 = i;
			i = 0;
			while (i != i2) {
				i++;
				System.out.print(resultado[i]);
			}
		} else {
			System.out.println("0");
		}
	}

	public static void calculoenteros(int enteros) {
		int i = 0;
		int[] resultado = new int[101];
		if (enteros >= 1) {
			while (enteros != 0 && i < 100) {

				i++;
				resultado[i] = enteros % 2;
				//System.out.println(i +" " + resultado[i]+" "+enteros); 
				//Muestra el resultado en cada posicion
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

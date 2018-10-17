import java.util.Scanner;

public class CalcBin {
	private static Scanner s;

	public static void main(String[] args) {
		boolean repetir = true; // Para que pida el
		while (repetir == true) { // numero todo el rato
			double numero; // El numero que introducimos
			double decimales;// La parte decimal del numero
			int enteros;// Parte entera del numero
			s = new Scanner(System.in);
			System.out.println("Introduce el numero");
			numero = s.nextDouble();// Guarda el numero introducido
			enteros = (int) numero; // Separa la parte entera
			decimales = numero - enteros;// Separa la parte decimal

			CalcBin.calculoenteros(enteros);// LLama al calculo de enteros
			System.out.print(",");
			CalcBin.calculodecimales(decimales);// LLama al calculo de decimales
			System.out.println();
		}
	}

	public static void calculodecimales(double decimales) {
		int i2 = 0;
		int i = 0;
		if (decimales > 0) {
			int[] resultado = new int[101]; // definicion de array de para los resultados
			while (decimales != 1 && i < 100) { // repite hasta que llega a 1 o a 100 valores recogidos

				i++;
				decimales = decimales * 2.; // multiplica los decimales por 2
				if (decimales > 1) { // comprueba si es mayor que 1
					decimales = decimales - 1.; // si es mayor que 1 le resta 1
					resultado[i] = 1;
				} else {
					resultado[i] = 0; // si es menor que 1 se pone un 0 en esa posicion
				}
				if (decimales == 1) {
					resultado[i] = 1; // si es igual a 1 se da el valor 1 a esa posicion
				}
				// System.out.println(i + " " + resultado[i] + " " + decimales);
				// Muestra el resultado y decimales en cada paso
			}
			i2 = i;
			i = 0;
			while (i != i2) {
				i++;
				System.out.print(resultado[i]); // pinta los valores dentro del array
			}
		} else {
			System.out.println("0"); //si no hay decimales pone un 0
		}
	}

	public static void calculoenteros(int enteros) {
		int i = 0;// posicion del numero en el aarray
		int[] resultado = new int[101]; // definicion de array de para los resultados
		if (enteros >= 1) {// comprueba si el numero tiene enteros
			while (enteros != 0 && i < 100) { // repite hasta que llega a 0 o a 100 valores recogidos

				i++;
				resultado[i] = enteros % 2; // guarda el modulo de la division
											// para cada posicion
				// System.out.println(i +" " + resultado[i]+" "+enteros);
				// Muestra el resultado en cada posicion
				enteros = enteros / 2;

			}
			while (i != 0) { // pinta los resultados por posiciones
				System.out.print(resultado[i]);
				i = i - 1;
			}
		} else {
			System.out.print("0");// si no hay decimales pone
									// directamente 0
		}

	}
}

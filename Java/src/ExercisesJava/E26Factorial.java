package ExercisesJava;
import java.util.Scanner;

public class E26Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa un numero para calcular su factorial:");
		int numero = input.nextInt();
		int factorial = 1;

		if (numero < 0) {
			System.out.println("No se puede calcular el factorial de un número negativo.");
		} else {
			for (int i = 1; i <= numero; i++) {
				factorial *= i;
			}
			System.out.println("El factorial de " + numero + " es: " + factorial);
		}
		
		input.close();
	}
}

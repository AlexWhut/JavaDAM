package ExercisesJava;
import java.util.Scanner;

public class E27AcumuladoresNePo0 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		while (true) {
			System.out.println("Digita un número o escribe 'stop' para parar:");
			String userInput = input.nextLine();
			

			if (userInput.equalsIgnoreCase("stop")) {
				break;
			}
			
			try {

				int numero = Integer.parseInt(userInput);
				
				if (numero > 0) {
					positivos++;
				} else if (numero < 0) {
					negativos++;
				} else {
					ceros++;
				}
			} catch (NumberFormatException e) {
				System.out.println("error :P , ingresa un numero o 'stop' para salir.");
			}
		}
		
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + ceros);
		input.close();
	}
}

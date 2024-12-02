package ExercisesJava;
import java.util.Scanner;

public class E04Bisiesto {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
			System.out.println("Hola calcular fecha valida");
			
			System.out.println("Digita el año (1 - 9.999)");
			int year = scanner.nextInt();

		    if (year < 1 || year > 9999) {
	            System.out.println("digita año correcto (1 - 9999)");
		    }
			
			
			else {
				if ((year % 4 == 0 && year %  100 != 0)|| year % 400 == 0){
						System.out.println("Es bisiesto");
				}else {
					System.out.println("No es bisiesto");
				}
			}
			
			scanner.close();
			
		}
	}


package ExercisesJava;
import java.util.Scanner;

public class E23Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }

        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
}

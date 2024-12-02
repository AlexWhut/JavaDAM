package ExercisesJava;
import java.util.Scanner;

public class E10DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número del 1 al 7:");
        int inputUser = scanner.nextInt();
        
        switch (inputUser) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número inválido. Por favor, ingresa un número del 1 al 7.");
        }

        scanner.close();
    }
}

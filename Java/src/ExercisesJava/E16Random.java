package ExercisesJava;
import java.util.Scanner;
import java.util.Random;

public class E16Random {
    public static void main(String[] args) {
        // Definir variables
        int randomNumber, lives = 9, attempts = 0, userInput = 0;
        

        // Mostrar mensajes iniciales
        System.out.println("// A D I V I N A   E L   N U M E R O //");
        System.out.println("               REGLAS");
        System.out.println("    Digita un numero del 1 al 1000");
        System.out.println("           Tienes 10 vidas");
        System.out.println("              Good Luck!");

        // Generar número aleatorio entre 1 y 1000
        Random random = new Random();
        randomNumber = random.nextInt(1000) + 1;

        // Crear objeto de entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Bucle del juego
        boolean isActive = true;
        while (isActive) {
            System.out.print("Escribe un número del uno al 1000: ");
            userInput = scanner.nextInt();

            if (userInput == randomNumber) {
                isActive = false; // El usuario adivinó el número
            } else {
                if (userInput < randomNumber) {
                    System.out.println("El numero a buscar es mayor");
                } else {
                    System.out.println("El numero a buscar es menor");
                }

                if (attempts == lives) {
                    isActive = false; // Se acabaron las vidas
                } else {
                    System.out.println("Intenta de nuevo");
                    attempts++;
                }
            }
        }

        // Mensaje final
        if (userInput == randomNumber) {
            System.out.println("GG // ¡GANASTE! Te tomo " + attempts + " intentos.");
        } else {
            System.out.println("F no te quedan intentos.");
        }

        scanner.close();
    }
}

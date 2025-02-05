package ExercisesJava;

import java.util.Scanner;

public class E30Ahorcado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("Digita la palabra secreta");
        String seWord = input.next();
        char[] secretWord = seWord.toCharArray();
        char[] arrGoods = new char[secretWord.length];
        char[] arrErrors = new char[10];
        int contadorErrores = 0;

        for (int i = 0; i < arrGoods.length; i++) {
            arrGoods[i] = '_';
        }

        while (contadorErrores < 10) {
            System.out.print("Palabra: ");
            for (char c : arrGoods) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.println("Digita la letra que crees:");
            char userChar = input.next().charAt(0);

            userChar = Character.toLowerCase(userChar);
            boolean acierto = false;

            for (int i = 0; i < secretWord.length; i++) {
                if (Character.toLowerCase(secretWord[i]) == userChar) {
                    arrGoods[i] = secretWord[i];
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("¡Acierto!");
            } else {
                if (contadorErrores < arrErrors.length) {
                    arrErrors[contadorErrores] = userChar;
                    contadorErrores++;
                }
                System.out.println("Nou! Intentos restantes: " + (10 - contadorErrores));
            }

            System.out.print("Errores: ");
            for (int i = 0; i < contadorErrores; i++) {
                System.out.print(arrErrors[i] + " ");
            }
            System.out.println();

            boolean ganado = true;
            for (char c : arrGoods) {
                if (c == '_') {
                    ganado = false;
                    break;
                }
            }

            if (ganado) {
                System.out.println("¡Has ganado HDKABDKAWBDWO! La palabra es: " + new String(arrGoods));
                break;
            }

            mostrarAhorcado(contadorErrores);
        }

        if (contadorErrores >= 10) {
            System.out.println("¡F! era: " + seWord);
            mostrarAhorcado(contadorErrores);
        }

        input.close();
    }

    private static void mostrarAhorcado(int errores) {
        switch (errores) {
            case 0 ->
                System.out.println("  ");
              
            case 1 -> {
                System.out.println(" |      ");}
            case 2 -> {
                System.out.println(" |      ");
                System.out.println(" |      "); }
            case 3 -> {
                System.out.println(" _______");
                System.out.println(" |     |  ");}
            case 4 -> {
                System.out.println(" _______");
                System.out.println(" |     |  ");
                System.out.println(" |     O  "); }
            case 5 ->{
                System.out.println(" _______");
                System.out.println(" |     |  ");
                System.out.println(" |     O  ");
                System.out.println(" |     |  ");}
            case 6->{
                System.out.println(" _______");
                System.out.println(" |     |  ");
                System.out.println(" |     O  ");
                System.out.println(" |    /|  ");}
            case 7 ->{
                System.out.println(" _______");
                System.out.println(" |     |  ");
                System.out.println(" |     O  ");
                System.out.println(" |    /|\\ ");}
            case 8 ->{
                System.out.println(" _______");
                System.out.println(" |     |  ");
                System.out.println(" |     O  ");
                System.out.println(" |    /|\\ ");
                System.out.println(" |    /   ");}
            case 9 -> {
                System.out.println(" _______");
                System.out.println(" |     |  ");
                System.out.println(" |     O  ");
                System.out.println(" |    /|\\ ");
                System.out.println(" |    / \\ ");}
            case 10 -> {
                System.out.println(" _______");
                System.out.println(" |     |  ");
                System.out.println(" |   `,|  ");
                System.out.println(" |    /|\\ ");
                System.out.println(" | `O / \\ ");
                System.out.println(" ¡F! Try again bro ");}
        }
    }
}

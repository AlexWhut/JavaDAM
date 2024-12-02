package ExercisesJava;
import java.util.Scanner;
import java.util.Random;

public class E17Casino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("✦✦✦ C A S I N O ✦✦✦");
        System.out.println("Compra FICHAS!");
        System.out.println("Cantidad de fichas a convertir, 1€ = 1 Ficha");
        int chipsToBuy = scanner.nextInt();

        int chips = chipsToBuy;
        boolean continuePlaying = true;

        while (continuePlaying) {
            if (chips <= 0) {
                System.out.println("No tienes saldo, compra fichas");
                continuePlaying = false;
            } else {
                System.out.println("// ELIJE UN JUEGO //");
                System.out.println("1 )  D A D O S");
                System.out.println("2 )  C A R A  O  S E L L O");

                int gameChoice = scanner.nextInt();

                switch (gameChoice) {
                    case 1:
                        chips = playDice(scanner, chips);
                        break;

                    case 2:
                        chips = playHeadsOrTails(scanner, chips, random);
                        break;

                    default:
                        System.out.println("El número ingresado no es válido.");
                }
            }
        }

        scanner.close();
    }

    private static int playDice(Scanner scanner, int chips) {
        boolean continueDice = true;
        while (continueDice) {
            System.out.println("DADOS");
            System.out.println("opcion 1 ) COSTE DE TIRO //  10 € Puedes ganar 70 € si sacas PAR //");
            System.out.println("opcion 2 ) COSTE DE TIRO //  5 €  Puedes ganar 35 € si sacas PAR//");
            System.out.println("opcion 3 ) COSTE DE TIRO //  2 €  Puedes ganar 15 € si sacas PAR//");
            System.out.println("opcion 4 ) COSTE DE TIRO //  1 €  Puedes ganar 4 € si sacas PAR//");
            int diceOption = scanner.nextInt();
            int cost = 0;

            switch (diceOption) {
                case 1: cost = 10; break;
                case 2: cost = 5; break;
                case 3: cost = 2; break;
                case 4: cost = 1; break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    continue; 
            }

            System.out.println("Digita la cantidad de tiros");
            int userInput = scanner.nextInt();

            if (userInput * cost <= chips) {
                chips -= userInput * cost;

                for (int i = 1; i <= userInput; i++) {
                    int die1 = (int)(Math.random() * 6) + 1;
                    int die2 = (int)(Math.random() * 6) + 1;
                    System.out.println("tiro de dado 1: " + die1);
                    System.out.println("tiro de dado 2: " + die2);
                    System.out.println("///////////////////////");

                    if (die1 == die2) {
                        int winnings = switch (cost) {
                            case 10 -> 70;
                            case 5 -> 35;
                            case 2 -> 15;
                            case 1 -> 4;
                            default -> 0;
                        };
                        chips += winnings;
                        System.out.println("✦✦✦ HAS GANADO!!! " + winnings + " Fichas ✦✦✦");
                    }
                    System.out.println("Saldo de tus fichas actuales: " + chips);
                }
            } else {
                System.out.println("No tienes suficientes fichas. Compra más.");
            }
            break;
        }
        return chips; // Devolver el nuevo saldo
    }

    private static int playHeadsOrTails(Scanner scanner, int chips, Random random) {
        System.out.println("C A R A  o  S E L L O");
        System.out.println("Elije (1) Cara (2) Sello");
        int choice = scanner.nextInt();
        
        if (choice != 1 && choice != 2) {
            System.out.println("Opción no válida. Debes elegir 1 o 2.");
            return chips; // Retornar el saldo sin cambios
        }

        System.out.println("¿Cuantas fichas apuestas, ganas el doble o pierdes?");
        int bet = scanner.nextInt();

        if (bet <= 0 || bet > chips) {
            System.out.println("Apuesta no válida");
            return chips; // Retornar el saldo sin cambios
        }

        chips -= bet;
       
        int result = random.nextInt(2) + 1; // 1 = Cara, 2 = Sello
        String resultText = result == 1 ? "Cara" : "Sello";
        System.out.println("El resultado es: " + resultText);

        if (result == choice) {
            chips += bet * 2;
            System.out.println("✦✦✦ HAS GANADO!!! Tu saldo ahora es: " + chips + " Fichas ✦✦✦");
        } else {
            System.out.println("Perdiste, tu saldo es: " + chips + " Fichas.");
        }
        
        return chips; // Devolver el nuevo saldo
    }
}

package ExercisesJava;
import java.util.Scanner;

public class E19SuperMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese efectivo de pago (en euros):");
            int payment = (int) (scanner.nextDouble() * 100); 
            System.out.println("Ingrese coste de la compra (en euros):");
            int purchaseCost = (int) (scanner.nextDouble() * 100);  

            int changeValue = payment - purchaseCost;

            if (changeValue == 0) {
                System.out.println("Pago realizado (No hay cambio, pago exacto).");
            } else if (changeValue < 0) {
                System.out.println("Falta dinero, por favor ingrese de nuevo el pago.");
            } else {
                System.out.println("Devolución a realizar: " + (changeValue / 100.0) + " €");

                int[] cashCents = {
                    50000, 20000, 10000, 5000, 2000, 1000, 500,    // Billetes en céntimos
                    200, 100,                                        // Monedas de euros en céntimos
                    50, 20, 10, 5, 2, 1                             // Monedas de céntimos
                };

                // Empezamos a calcular la devolución
                System.out.println("Devolución en billetes y monedas:");

                for (int cashValue : cashCents) {
                    if (changeValue >= cashValue) {
                        int quantity = changeValue / cashValue;
                        changeValue -= cashValue * quantity;

                        if (cashValue >= 500) {
                            // Billetes
                            System.out.println(quantity + (quantity == 1 ? " billete de " : " billetes de ") + (cashValue / 100) + " euros");
                        } else if (cashValue >= 100) {
                            // Monedas de euros
                            System.out.println(quantity + (quantity == 1 ? " moneda de " : " monedas de ") + (cashValue / 100) + " euros");
                        } else {
                            // Monedas de céntimos
                            System.out.println(quantity + (quantity == 1 ? " moneda de " : " monedas de ") + cashValue + " céntimos");
                        }
                    }
                }
            }

            // Preguntar si desea hacer otra operación
            System.out.println("¿Desea realizar otra operacion? (s/n)");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("s")) {
                System.out.println("Gracias por la compra ¡Hasta luego!");
                break;
            }
        }

        scanner.close();
    }
}

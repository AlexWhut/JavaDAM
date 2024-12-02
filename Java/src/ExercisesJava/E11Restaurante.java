package ExercisesJava;
import java.util.Scanner;

public class E11Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        String pedido = "";

        while (continuar) {
            System.out.println("//// M E N U ////");
            System.out.println("1 ) EMPANADAS");
            System.out.println("2 ) AREPAS");
            System.out.print("Digita la opcion del menu: ");
            int opcionPrincipal = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcionPrincipal) {
                case 1 -> {
                    System.out.println("//////// E M P A N A D A S ////////");
                    System.out.println("1) Empanada de carne");
                    System.out.println("2) Empanada de pollo");
                    System.out.println("3) Empanada mixta");
                    System.out.println("4) Empanada de queso");
                    System.out.println("5) Empanada de chorizo");
                    System.out.print("Elige una empanada (1-5): ");
                    int opcionEmpanada = scanner.nextInt();

                    System.out.print("¿Cuantas deseas? ");
                    int cantidad = scanner.nextInt();

                    switch (opcionEmpanada) {
                        case 1 -> pedido += cantidad + " Empanada(s) de carne\n";
                        case 2 -> pedido += cantidad + " Empanada(s) de pollo\n";
                        case 3 -> pedido += cantidad + " Empanada(s) mixta(s)\n";
                        case 4 -> pedido += cantidad + " Empanada(s) de queso\n";
                        case 5 -> pedido += cantidad + " Empanada(s) de chorizo\n";
                        default -> System.out.println("Opcion no valida.");
                    }

                    System.out.println("Digita 1 para regresar al menu principal, 2 para finalizar:");
                    int opcionSecundaria = scanner.nextInt();
                    if (opcionSecundaria == 1) {
                        System.out.println("Regresando al menu principal...");
                    } else if (opcionSecundaria == 2) {
                        continuar = false;
                        System.out.println("Finalizando el programa...");
                        System.out.println("Tu pedido es:\n" + pedido);
                    } else {
                        System.out.println("Opcion no valida, regresando al menu principal...");
                    }
                }

                case 2 -> {
                    System.out.println("//////// A R E P A S ////////");
                    System.out.println("1) Arepa de pollo");
                    System.out.println("2) Arepa de carne");
                    System.out.println("3) Arepa mixta");
                    System.out.println("4) Arepa de queso");
                    System.out.println("5) Arepa con chorizo");
                    System.out.print("Elige una arepa (1-5): ");
                    int opcionArepa = scanner.nextInt();

                    System.out.print("¿Cuantas deseas? ");
                    int cantidadArepa = scanner.nextInt();

                    switch (opcionArepa) {
                        case 1 -> pedido += cantidadArepa + " Arepa(s) de pollo\n";
                        case 2 -> pedido += cantidadArepa + " Arepa(s) de carne\n";
                        case 3 -> pedido += cantidadArepa + " Arepa(s) mixta(s)\n";
                        case 4 -> pedido += cantidadArepa + " Arepa(s) de queso\n";
                        case 5 -> pedido += cantidadArepa + " Arepa(s) con chorizo\n";
                        default -> System.out.println("Opcion no valida.");
                    }

                    System.out.println("Digita 1 para regresar al menu principal, 2 para finalizar:");
                    int opcionTerciaria = scanner.nextInt();
                    if (opcionTerciaria == 1) {
                        System.out.println("Regresando al menu principal...");
                    } else if (opcionTerciaria == 2) {
                        continuar = false;
                        System.out.println("Finalizando el programa...");
                        System.out.println("Tu pedido es:\n" + pedido);
                    } else {
                        System.out.println("Opcion no valida, regresando al menu principal...");
                    }
                }

                default -> System.out.println("Opcion no valida.");
            }
        }

        scanner.close();
    }
}

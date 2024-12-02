package ExercisesJava;
import java.util.Scanner;

public class E06FechaValida {
    public static void main(String[] args) {
        System.out.println("Hola, calcular fecha valida");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digita el dia (max 31)");
        int day = scanner.nextInt();
        System.out.println("Digita el mes (1 - 12)");
        int month = scanner.nextInt();
        System.out.println("Digita el year (1 - 9999)");
        int year = scanner.nextInt();
        
        if ((year < 1 || year > 9999) || (month < 1 || month > 12) || (day < 1 || day > 31)) {
            System.out.println("Fecha invalida codigo 1");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (month == 2 && day <= 29) {
                    System.out.println("Es una fecha valida de year bisiesto codigo 2");
                } 
                if (month == 2 && day >= 30) {
                    System.out.println("No es una fecha valida codigo 2");
                }
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day <= 31) {
                        System.out.println("Es una fecha válida de 31 días codigo 3.1");
                    } else {
                        System.out.println("No es una fecha válida codigo 3.1");
                    }
                }
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day <= 30) {
                        System.out.println("Es una fecha válida de 30 días codigo 4.1 ");
                    } else {
                        System.out.println("No es una fecha válida codigo 4.1");
                    }
                }
            } else if ((year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day <= 31) {
                        System.out.println("Es una fecha válida de 31 días codigo 3");
                    } else {
                        System.out.println("No es una fecha válida codigo 3");
                    }
                }
            } else if ((year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))) {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day <= 30) {
                        System.out.println("Es una fecha válida de 30 días codigo 4");
                    } else {
                        System.out.println("No es una fecha válida codigo 4");
                    }
                }
            } else if ((year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))) {
                if (month == 2) {
                    if (day <= 28) {
                        System.out.println("Es una fecha válida de 28 días codigo 5");
                    } else {
                        System.out.println("No es una fecha válida codigo 5");
                    }
                }
            }
        }
        
        scanner.close();
    }
}

package ExercisesJava;
import java.util.Scanner;

public class E14Salarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salaryHigh = -1; // Empezar con -1 para indicar que no hay sueldos válidos aún
        int salaryLow = -1;  // Igual que arriba
        int totalInputs = 0;
        int totalSalaries = 0;

        
        boolean whileCondition = true;
        while (whileCondition) {
            System.out.println("Digite un salario (Escriba -1 para terminar):");
            int inputUser = scanner.nextInt();

            // Verificar el valor de salida
            if (inputUser == -1) {
                whileCondition = false; // Salir del bucle
            }

            
            if (inputUser >= 0) {
                totalInputs++;
                totalSalaries += inputUser;

                if (salaryHigh == -1 || inputUser > salaryHigh) {
                    salaryHigh = inputUser;
                }

                if (salaryLow == -1 || inputUser < salaryLow) {
                    salaryLow = inputUser;
                }
            }
        }


        float averageSalary = totalInputs > 0 ? (float) totalSalaries / totalInputs : 0;

        // Mostrar resultados
        System.out.println("    //  Respuestas  //    ");
        System.out.println("Sueldo más alto: " + (salaryHigh == -1 ? "No se ingresaron sueldos válidos" : salaryHigh));
        System.out.println("Sueldo más bajo: " + (salaryLow == -1 ? "No se ingresaron sueldos válidos" : salaryLow));
        System.out.println("Promedio de sueldos: " + (totalInputs > 0 ? averageSalary : "No se ingresaron sueldos válidos"));

        scanner.close();
    }
}

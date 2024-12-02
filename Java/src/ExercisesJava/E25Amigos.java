package ExercisesJava;
import java.util.Scanner;

public class E25Amigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        int sumaDivisoresNum1 = 0;
        int sumaDivisoresNum2 = 0;


        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sumaDivisoresNum1 += i;
            }
        }


        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sumaDivisoresNum2 += i;
            }
        }


        if (sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1) {
            System.out.println(num1 + " y " + num2 + " son numeros amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son numeros amigos.");
        }

        scanner.close();
    }
}

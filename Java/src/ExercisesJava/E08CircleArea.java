package ExercisesJava;
import java.util.Scanner;

public class E08CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digita el radio de la circunferencia:");
        double radio = scanner.nextDouble();
        
        double area = 3.141592653589793; // Valor aproximado de PI
        
        if (radio >= 1) {
            double output = area * (radio * radio);
            System.out.println("El area de la circunferencia es: " + output);
        } else {
            System.out.println("Digita un numero 1 o superior");
        }
        
        scanner.close();    
    }
}

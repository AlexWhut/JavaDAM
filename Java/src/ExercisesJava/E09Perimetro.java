package ExercisesJava;
import java.util.Scanner;
public class E09Perimetro {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digita el radio de la circunferencia:");
	        double radio = scanner.nextDouble();
	        
	        double perimetro = 2 * 3.141592653589793 * radio;
	        
	        if (radio >= 1) {
	            System.out.println("El perimetro de la circunferencia es: " + perimetro);
	        } else {
	            System.out.println("Digita un numero 1 o superior");
	        }
	        
	        scanner.close();    
	    }

}

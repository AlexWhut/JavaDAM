package ExercisesJava;
import java.util.Scanner;

public class E05EcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el coeficiente a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Ingresa el coeficiente b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Ingresa el coeficiente c: ");
        double c = scanner.nextDouble();
        
        double discriminante = b * b - 4 * a * c;
        
        if (discriminante > 0) {
            double x1 = (-b + calcularRaiz(discriminante)) / (2 * a);
            double x2 = (-b - calcularRaiz(discriminante)) / (2 * a);
            System.out.println("Las raices son reales y distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Las raices son reales e iguales:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Las raices son complejas y no se pueden calcular en numeros reales.");
        }
        
        scanner.close();
    }
    
    public static double calcularRaiz(double numero) {
        double resultado = 0;
        for (double i = 0; i * i <= numero; i += 0.0001) {
            resultado = i;
        }
        return resultado;
    }
}

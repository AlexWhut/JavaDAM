package ExercisesJava;
import java.util.Scanner;


public class E22Fibonacci {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Digita hasta donde quieres el fibo");
    	int inputUser = scanner.nextInt();
    	System.out.println("input " + inputUser);
    	
        
        long a = 0;
        long b = 1;
        
        System.out.println("Terminos de Fibo");
        
        for (int i = 1; i <= inputUser; i++) {
        	System.out.println(a);
        	long siguiente = a + b;
        	a = b;
        	b = siguiente;
        }
        scanner.close();
    }}



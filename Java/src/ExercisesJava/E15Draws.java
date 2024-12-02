package ExercisesJava;
import java.util.Scanner;

public class E15Draws {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int inputUser = scanner.nextInt();
        
        System.out.println("Draw 01");        
        for(int i = 1; i <= inputUser; i++) {
            for (int k = 1; k <= inputUser; k++) {
                System.out.print(" * ");
            }
            System.out.println(); 
        }
        
        System.out.println("\nDraw 02\n");
        
        String output02 = "";
        for (int i = 1; i <= inputUser; i++) {
            output02 += " * ";
            System.out.println(output02);
        }
        
        System.out.println("\nDraw 03\n");
        
        for (int i = inputUser; i >= 1; i--) {            
            for (int y = 1; y <= i; y++) {
                System.out.print(" * ");
            }
            System.out.println(); 
        } 
        
        System.out.println("\nDraw 04\n");

       
        if (inputUser % 2 == 0) {
            inputUser++; 
        }
        
        int espace = inputUser / 2;


        for (int i = 1; i <= inputUser; i += 2) {
            for (int j = 0; j < espace; j++) {
                System.out.print("   "); 
            }
            espace--;
            for (int j = 0; j < i; j++) {
                System.out.print(" * "); 
            }
            System.out.println(); 
        }

      
        espace = 1;
        for (int i = inputUser - 2; i >= 1; i -= 2) {
            for (int j = 0; j < espace; j++) {
                System.out.print("   "); 
            }
            espace++;
            for (int j = 0; j < i; j++) {
                System.out.print(" * "); 
            }
            System.out.println();
        }

        scanner.close();
    }
}

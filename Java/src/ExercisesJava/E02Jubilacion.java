package ExercisesJava;
import java.util.Scanner;

public class E02Jubilacion {
	public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);


        System.out.println("Introduce el día de tu nacimiento:");
        int diaNacimiento = input.nextInt();
        System.out.println("Introduce el mes de tu nacimiento (1-12):");
        int mesNacimiento = input.nextInt();
        System.out.println("Introduce el año de tu nacimiento:");
        int anoNacimiento = input.nextInt();

 
        System.out.println("Introduce el día actual:");
        int diaActual = input.nextInt();
        System.out.println("Introduce el mes actual (1-12):");
        int mesActual = input.nextInt();
        System.out.println("Introduce el año actual:");
        int anoActual = input.nextInt();

        int edad = anoActual - anoNacimiento;


        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--; 
        }


        if (edad >= 65) {
            System.out.println("Te puedes jubilar. Tienes " + edad + " años.");
        } else {
            System.out.println("No te puedes jubilar. Aún tienes " + edad + " años.");
        }


        input.close();
    }
}



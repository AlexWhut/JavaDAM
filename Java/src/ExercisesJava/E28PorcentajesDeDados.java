package ExercisesJava;
import java.util.Random;

public class E28PorcentajesDeDados {
	public static void main(String[] args) {
		
		Random dieRandom = new Random();
		
		int [] arr = new int[1000];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = dieRandom.nextInt(6) + 1;
		}
		/*
		for (int num : arr) {
            System.out.print(num + " ");
        } */
		
		int die1 = 0;	
		int die2 = 0;	
		int die3 = 0;	
		int die4 = 0;	
		int die5 = 0;	
		int die6 = 0;	
		
		for (int die : arr) {
			if(die == 1) {
				die1++;
			}
			else if(die == 2) {
				die2++;
			}
			else if(die == 3) {
				die3++;
			}
			else if(die == 4) {
				die4++;
			}
			else if(die == 5) {
				die5++;
			}
			else if(die == 6) {
				die6++;
			}
		}
		
		int formula1 = (die1 * 100) / arr.length;
		int formula2 = (die2 * 100) / arr.length;
		int formula3 = (die3 * 100) / arr.length;
		int formula4 = (die4 * 100) / arr.length;
		int formula5 = (die5 * 100) / arr.length;
		int formula6 = (die6 * 100) / arr.length;
		
		
		System.out.println("Cantidad y sus respectivos porcentajes:\n");
		System.out.println("Dado 1: " + die1 + " // con un " + formula1 + "% de probabilidad");
		System.out.println("Dado 2: " + die2 + " // con un " + formula2 + "% de probabilidad");
		System.out.println("Dado 3: " + die3 + " // con un " + formula3 + "% de probabilidad");
		System.out.println("Dado 4: " + die4 + " // con un " + formula4 + "% de probabilidad");
		System.out.println("Dado 5: " + die5 + " // con un " + formula5 + "% de probabilidad");
		System.out.println("Dado 6: " + die6 + " // con un " + formula6 + "% de probabilidad");
	}
}

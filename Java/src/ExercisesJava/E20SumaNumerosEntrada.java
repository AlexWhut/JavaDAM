package ExercisesJava;
import java.util.Scanner;

public class E20SumaNumerosEntrada {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double acumulador = 0;
			
			while(true) {
			double aSumar = input.nextDouble();
		
			
				if(aSumar == -1){
					
					break;
				}	
				
				if(aSumar >= 0) {
					acumulador += aSumar;
				}
				
			}System.out.println("La suma es: " + acumulador);
			
			
			
			input.close();
		} 
			
	
	
	}	
		
		
		
		
		



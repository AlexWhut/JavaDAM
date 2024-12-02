package ExercisesJava;

public class E21TablasDeMultiplicar {
	public static void main(String[] args) {
	
		
		for (int i = 0; i <= 10; i++) {		
				
			System.out.println("Tabla del " + i);
			System.out.println(" ");
			
			for (int k = 0; k <= 10; k++) {
					
				int output = k * i;				
				System.out.println(i + " x " + k + " = " + output);
				
			}
			System.out.println(" ");
		}
		
		
		
	}
}

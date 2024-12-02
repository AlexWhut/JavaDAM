package ExercisesJava;

public class E29ArrayEnteros {

	public static void main(String[] args) {
		
	int[] arr = {
		1,2,3,4,5,6,7,8,9,0,11,12,13,-14,-15,-16,-17,0,19,20	
	};

	int ceros = 0;
	int negativos = 0;
	int positivos = 0;
	
	for (int i : arr) {
		
		if (i < 0) {
			negativos++;
		}
		else if(i > 0) {
			positivos++;
		}
		else if(i == 0) {
			ceros++;
		}
	}
	
	System.out.println("Cantidad de ceros: "+ceros);
	System.out.println("Cantidad de positivos: "+positivos);
	System.out.println("Cantidad de negativos: "+negativos);
	
	
	}

}

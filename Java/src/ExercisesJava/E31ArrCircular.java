package ExercisesJava;

import java.util.Arrays;

public class E31ArrCircular {
    public static void main(String[] args) {
        
        int[] arr = {1, 10, 27, 30, 40};
        
        if (arr.length > 0) {
    
            int firstElement = arr[0];
            
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            
            arr[arr.length - 1] = firstElement;
        }
        // forma 1 de impresion
        for (int i : arr) {
        	System.out.println(i);
        }
        // forma 2 de impresion, convertiendo el primiv a obj para que el String no imprima direccion de memoria
        System.out.println(Arrays.toString(arr)); 
    }
}

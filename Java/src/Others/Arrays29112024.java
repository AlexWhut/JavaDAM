package Others;
import java.util.Scanner;
import java.util.Arrays;


// suma dos arr llamados a y b que sean float en un arr llamado suma que sera del mismo tamano de los nateriores y se imprimen a b y suma
// encuentra un elemento en el array y di las veces que sea repetido dentro el array es decir si hay 2 cuantos 2 hay        
// duplica todos los valores de un arr
// fusiona dps arr en un tercer arr sabiendo que no estan ordenados. ordenarlos y luego incorporarlos en el tercer 3 arr
// intercesion de dos arr y dar la respuesta en otro arr  


public class Arrays29112024{
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
    float [] a = {1, 2, 3};
    float [] b = {4, 5, 6};
    float [] suma = new float [a.length];
    
    System.out.println("a");
    for (float i : a) {
    	System.out.println(i);
    }
    System.out.println("b");
    for (float i : b) {
    	System.out.println(i);
    }    
    for(float i = 0; i < a.length; i++) {
    	suma[(int)i] = a[(int) i] + b[(int)i];
    }
    System.out.println("Suma");
    for (float i : suma) {
    	System.out.println(i);
    }
    
    

	
	/////////
    System.out.println(" ");
	System.out.println("c");
	int [] c = {1, 1, 2, 4, 5, 6, 5, 8};
	
	int aux = 0;
	
	
	for (int i = 0; i < c.length; i++) {
		if(c[i] == 1) {
			aux+=1;
		}
	}
	
	System.out.println(aux);
	
	
  
    
    
    
    ///////////
	System.out.println(" ");
    float [] d = {1, 2, 3, 4 ,5};
    
    float [] e = new float [d.length];
    
    for(int i = 0; i < d.length; i++) {
    	e[i] = d[i];
    }
    System.out.println(" ");
    System.out.println("e");
    for(float i : e) {
    	System.out.println(i);
    }
    
    //////////////////
    // unir array f y g en el array h
    System.out.println(" ");
    System.out.println("Ejercicio unir f y g");
    
   	int [] f = {5, 3, 2, 4};
    int [] g = {1, 6, 8, 7};
    
    int acum = f.length;
    int acum2 = g.length;
    int total = acum + acum2;
    int [] h = new int [total];
    
    
    for(int i = 0; i < h.length /2 ; i++) {
    	h[i] = f[i];	
    }
    
    for (int i = 0; i < g.length; i++) {
        h[f.length + i] = g[i];
    }
    
    
    
    Arrays.sort(h);
    
    System.out.println(Arrays.toString(h));
  
    
    /////////////
    // ejercicio de insercion 
    
    System.out.println(" ");
    System.out.println("Arrays para insercion");
    
   	int [] o = {5, 3, 2, 4, 75};
    int [] p = {1, 5, 3, 7, 75};
    int acumQ = o.length;
    int acumR = p.length;
    int totalS = acumQ + acumR;
    int [] t = new int [totalS]; // array de ambos arrays
    int [] z = new int[t.length]; // array de iguales
    
    for(int i = 0; i < o.length /2 ; i++) {
    	t[i] = o[i];	
    }
    
    for (int i = 0; i < o.length; i++) {
        t[o.length + i] = p[i];
    }
    
    System.out.println("Impresion de conjunto a");
    for(int i : o) {
    	System.out.println(i);
    }
    System.out.println("Impresion de conjunto b");
    for(int i : p) {
    	System.out.println(i);
    }
    
   	System.out.println("Contenido de ambos conjuntos");
    for (int i : t) {
    	System.out.println(i);
    }
    
    System.out.println("/////////////");
    // este es para agregar solo los iguales al nuevo arr z
    // Comprobar los elementos comunes de o y p e insertarlos en z
    
    int zIndex = 0; // Índice para z
    for (int i = 0; i < o.length; i++) {
        for (int j = 0; j < p.length; j++) {
            if (o[i] == p[j]) { // Si el elemento de o es igual al de p
                z[zIndex] = o[i];
                zIndex++;
                break; // Ya que el elemento común se ha encontrado, no seguimos buscando para este elemento
            }
        }
    }
    
    
    // usamos bucle general para
    for (int i = 0; i < zIndex; i++) {
        System.out.println(z[i]);
    }
    
    
   

    
    
    
    
    s.close();
	}
}
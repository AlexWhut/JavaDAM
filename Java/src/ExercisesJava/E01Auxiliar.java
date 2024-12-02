package ExercisesJava;

public class E01Auxiliar {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        
        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        
        int aux = a;
        a = c;
        c = b;
        b = aux;
        
        System.out.println("Despues del intercambio:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}

package Others;
import java.util.Scanner;

public class TriquiConsole {
    private static char[][] tablero = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };
    private static char turno = 'X';
    private static boolean esPrimeraVez = true;

    public static void main(String[] args) {
        boolean juegoEnCurso = true;
        Scanner scanner = new Scanner(System.in);

        while (juegoEnCurso) {
            imprimirTablero();
            System.out.print("Turno de " + turno + ". Elige una posición (1-9): ");
            int posicion;

            try {
                posicion = scanner.nextInt();
                if (posicion < 1 || posicion > 9) {
                    System.out.println("Posición inválida. Intenta de nuevo.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor ingresa un número.");
                scanner.next();
                continue;
            }

            if (!marcarPosicion(posicion)) {
                System.out.println("La posición ya está ocupada. Intenta de nuevo.");
                continue;
            }

            if (verificarGanador()) {
                imprimirTablero();
                System.out.println("¡El jugador " + turno + " ha ganado!");
                juegoEnCurso = false;
            } else if (esEmpate()) {
                imprimirTablero();
                System.out.println("¡Es un empate!");
                juegoEnCurso = false;
            } else {
                turno = (turno == 'X') ? 'O' : 'X'; // Cambia el turno
            }

            // Después de la primera impresión, mostrar el tablero vacío
            esPrimeraVez = false;
        }

        scanner.close();
    }

    private static void imprimirTablero() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Imprime los números solo la primera vez, después imprime espacios vacíos
                if (esPrimeraVez) {
                    System.out.print(tablero[i][j]);
                } else {
                    char celda = tablero[i][j];
                    System.out.print((celda == 'X' || celda == 'O') ? celda : ' ');
                }
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
        System.out.println();
    }

    private static boolean marcarPosicion(int posicion) {
        int fila = (posicion - 1) / 3;
        int columna = (posicion - 1) % 3;

        if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
            return false; // La posición ya está ocupada
        }

        tablero[fila][columna] = turno;
        return true;
    }

    private static boolean verificarGanador() {
        // Verifica filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == turno && tablero[i][1] == turno && tablero[i][2] == turno) return true;
            if (tablero[0][i] == turno && tablero[1][i] == turno && tablero[2][i] == turno) return true;
        }
        if (tablero[0][0] == turno && tablero[1][1] == turno && tablero[2][2] == turno) return true;
        if (tablero[0][2] == turno && tablero[1][1] == turno && tablero[2][0] == turno) return true;

        return false;
    }

    private static boolean esEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] != 'X' && tablero[i][j] != 'O') {
                    return false; // Hay al menos una casilla vacía
                }
            }
        }
        return true; // No hay casillas vacías y nadie ha ganado
    }
}

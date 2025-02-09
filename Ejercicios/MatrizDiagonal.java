package Ejercicios;
import java.util.Scanner;

public class MatrizDiagonal {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        try {
            // Llenar la matriz con valores ingresados por el usuario
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Calcular la suma de la diagonal principal
            int sumaDiagonal = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaDiagonal += matriz[i][i];  // Los elementos de la diagonal tienen i = j
            }

            // Mostrar la matriz y el resultado
            System.out.println("Matriz ingresada:");
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
            System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        } finally {
            // Cerrar el Scanner en el bloque finally para asegurarse de que se cierre
            scanner.close();
        }
    }
}
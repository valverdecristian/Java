package Sec13Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("numero de filas: "+ numeros.length);
        System.out.println("numero de columnas: "+ numeros[0].length);
        System.out.println("primer elemento de la matriz: "+ numeros[0][0]);

        // recorremos la matriz para mostrar sus valores
        System.out.println("iterando con for:");
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("iterando con foreach:");
        for(int[] fila: numeros){
            for(int numero: fila){
                System.out.print(numero + "\t");
            }
            System.out.println();
        }
    }
}

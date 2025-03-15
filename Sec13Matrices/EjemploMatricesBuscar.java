package Sec13Matrices;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1994},
                {15, 20, 1, 2020},
                {677, 127, 3211, 1999}
        };

        int elementoBuscar = 15;
        boolean encontrado = false;

        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if(matrizDeEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }

        }

        if(encontrado){
            System.out.println("Encontrado "+ elementoBuscar + " en las coordenadas " + i);
        } else {
            System.err.println(elementoBuscar + " no se encontro en la matriz");
        }
    }
}

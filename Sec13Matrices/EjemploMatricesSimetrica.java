package Sec13Matrices;

public class EjemploMatricesSimetrica {
    public static void main(String[] args) {

        boolean simetrica = true;

        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i,j;
        i = 0;

        // recorremos con for o while
        while (i < matriz.length && simetrica == true){
            j = 0;
            while(j < i && simetrica == true){
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        if(simetrica){
            System.out.println("la matriz es simetrica");
        } else {
            System.err.println("la matriz no es simetrica");
        }

    }
}

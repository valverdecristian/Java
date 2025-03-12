package Sec12Arreglos;

import java.util.Arrays;

public class EjemploArregloMutable {
    public static void main(String[] args) {

        String[] productos = {"pendrive", "notebook", "monitor", "mouse", "teclado",
                                "auriculares", "lampara"};

        int total = productos.length;

        Arrays.sort(productos);

        for (int i = 0; i < total; i++){
            System.out.println("para indice = " + i + ": " + productos[i]);
        }

        System.out.println("--INVERTIR EL ARREGLO--");
        arregloInverso(productos);

        for (int i = 0; i < total; i++){
            System.out.println("para indice = " + i + ": " + productos[i]);
        }

    }

    public static void arregloInverso(String[] productos){
        int total = productos.length;
        for(int i = 0; i < total/2; i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }
    }
}

/**
 * LOS ARRAYS EN JAVA SON MUTABLES, LO QUE SIGNIFICA QUE SI SE CAMBIA EL VALOR
 * DE UNA VARIABLE QUE APUNTA A LA MISMA DIRECCION QUE OTRA VARIABLE (arr2 y arr1)
 * AFECTARA EN AMBAS EL VALOR CAMBIADO.
 *
 * SOLO SE PUEDE CAMBIAR SUS VALORES, NO SU TAMAÑO.
 *
 * PARA HACER UNA COPIA INDEPENDIENTE SE PUEDE USAR EL METODO clone()
 *
 */
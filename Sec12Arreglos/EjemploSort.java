package Sec12Arreglos;

import java.util.Arrays;

public class EjemploSort {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "pendrive";
        productos[1] = "notebook";
        productos[2] = "monitor";
        productos[3] = "mouse";
        productos[4] = "teclado";
        productos[5] = "auriculares";
        productos[6] = "lampara";

        // para poder ordenar usamos el metodo sort de la clase Arrays
        Arrays.sort(productos);

        for(String p:productos){
            System.out.println("producto ordenado: "+ p);
        }
    }
}

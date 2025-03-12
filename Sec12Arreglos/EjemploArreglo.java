package Sec12Arreglos;

public class EjemploArreglo {
    public static void main(String[] args) {

        // reserva en memoria espacio para 4 elementos
        int[] numeros = new int[4];

        // inicializar o asignar datos
        // sino los valores por defecto son zero.
        numeros[0] = 12;
        numeros[1] = 15;
        numeros[2] = 8;
        numeros[3] = 1;

        for(int num: numeros){
            System.out.println("num = " + num);
        }
    }
}
package Sec12Arreglos;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese una posicion a eliminar entre 0-9: ");

        int posicion = scanner.nextInt();

        for (int i = posicion; i < a.length -1; i++) {
            a[i] = a[i+1];
        }

        int[] b = new int[a.length -1];
        System.arraycopy(a,0,b,0,b.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }

    }
}

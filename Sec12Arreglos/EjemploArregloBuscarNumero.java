package Sec12Arreglos;

import java.util.Scanner;

public class EjemploArregloBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\r\nIngrese un numero a buscar: ");
        int num = scanner.nextInt();

        int i = 0;
        while(i < a.length && a[i] != num){
            i++;
        }

        if(i == a.length){
            System.err.println("Numero no encontrado");
        } else if (a[i] == num){
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}

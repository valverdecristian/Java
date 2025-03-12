package Sec12Arreglos;

import java.util.Scanner;

public class EjemploDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros:");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }


        boolean asc = false;
        boolean des = false;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] > a[i+1]) {
                des = true;
            }

            if (a[i] < a[i+1]) {
                asc = true;
            }
        }

        if(asc == true && des == true){
            System.out.println("Arreglo desordenado");
        } else if (asc == true){
            System.out.println("Arreglo ascendente");
        } else if(des == true){
            System.out.println("Arreglo descendente");
        } else {
            System.out.println("Todos son iguales");
        }

        // SI QUEREMOS REALIZAR ESTO MISMO CON STRING EN VEZ DE USAR < >
        // USAR COMPARETO
    }
}

package Sec12Arreglos;

public class EjemploOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i +1;
        }

        // mostramos los numeros en pares: 1-10 2-9 3-8 ...
        for (int i = 0; i < numeros.length/2; i++) {
            System.out.print(numeros[i] + " - ");
            System.out.println(numeros[numeros.length -1 - i]);
        }
    }
}

package Ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int primerIngreso = scanner.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        int segundoIngreso = scanner.nextInt();

        int resultado = primerIngreso + segundoIngreso;

        System.out.print("El resultado es: " + resultado);

        scanner.close();
    }
}

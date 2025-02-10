package Metodos;

import java.util.Scanner;

public class MetodosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer una cadena
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Leer un entero
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Leer un número decimal
        System.out.print("Ingrese su altura (en metros): ");
        double altura = scanner.nextDouble();

        // Leer un carácter
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);

        // Leer un booleano
        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();

        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Letra: " + letra);
        System.out.println("Es estudiante: " + esEstudiante);

        // Cerrar el Scanner
        scanner.close();
    }
}

/**
 * El metodo next lee una palabra (cadena hasta el espacio)
 */
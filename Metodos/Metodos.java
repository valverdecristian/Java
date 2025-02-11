package Metodos;
public class Metodos {
    public static void main(String[] args) {
        int resultado = suma(5, 3);
        System.out.println("El resultado es: " + resultado);
    }

    // Método para sumar dos números
    public static int suma(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public static int resta(int a, int b) {
        return a - b;
    }
}

/**
 * El metodo es static porque nuestro main es static
 */

/**
 * Return se encarga de devolver el valor que le indicamos
 */
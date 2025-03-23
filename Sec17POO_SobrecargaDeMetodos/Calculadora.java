package Sec17POO_SobrecargaDeMetodos;

public class Calculadora {
    // Método para sumar dos números
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static float suma(float a, float b) {
        return a + b;
    }

    public static float suma(float a, int b) {
        return a + b;
    }

    // VAR-ARGS
    public static int suma(int... argumentos){
        int total = 0;
        for(int a: argumentos){
            total += a;
        }
        return total;
    }

    // Método para restar dos números
    public static int resta(int a, int b) {
        return a - b;
    }

    public static int resta(int a, int b, int c) {
        return a - b - c;
    }

}
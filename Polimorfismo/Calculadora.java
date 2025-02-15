package Polimorfismo;

// Method Overloading

public class Calculadora {
    // Método para sumar dos números enteros
    int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga del método sumar para sumar tres números
    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga con números decimales
    double sumar(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(5, 10));       // Llama a sumar(int, int)
        System.out.println(calc.sumar(5, 10, 20));   // Llama a sumar(int, int, int)
        System.out.println(calc.sumar(5.5, 2.3));    // Llama a sumar(double, double)
    }
}


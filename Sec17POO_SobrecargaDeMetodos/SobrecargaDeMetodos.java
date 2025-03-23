package Sec17POO_SobrecargaDeMetodos;

public class SobrecargaDeMetodos {
    // Método con dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método con tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método con dos números de tipo double
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        SobrecargaDeMetodos calc = new SobrecargaDeMetodos();
        System.out.println(calc.sumar(5, 10));       // Llama al método con 2 enteros
        System.out.println(calc.sumar(5, 10, 15));   // Llama al método con 3 enteros
        System.out.println(calc.sumar(5.5, 2.5));    // Llama al método con doubles
    }
}


/** Overloading = Sobrecarga de metodos
 *  - los metodos deben tener el mismo nombre.
 *  - deben diferenciarse por el numero, tipo u orden de los parametros.
 *  - puede aplicarse a constructores y metodos.
 *  x NO se puede hacer sobrecarga solo cambiando el tipo de retorno.
 * 
 */
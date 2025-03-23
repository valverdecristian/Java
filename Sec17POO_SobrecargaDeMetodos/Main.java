package Sec17POO_SobrecargaDeMetodos;

public class Main {
    public static void main(String[] args) {

        System.out.println("suma int: " + Calculadora.suma(10, 5, 4));
        System.out.println("suma ...args: " + Calculadora.suma(10, 5, 4, 7));
        System.out.println("suma float: " + Calculadora.suma(10.0f, 5f));
    }
}

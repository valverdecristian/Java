package Sec04Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // conversion implicita
        byte a = 1;
        double b = 15.15;
        double c = a + b;
        System.out.println(c);

        // conversion explicita
        int x = 15;
        double y = 15.01;
        int z = (int)(x + y);
        System.out.println(z);

        // conversion de String a tipo numerico
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k;
        System.out.println(l);
    }
}

/** ORDEN DE LAS OPERACIONES (PENDAS)
 *  1) parentesis
 *  2) potencia
 *  3) multiplicacion
 *  4) division
 *  5) suma
 *  6) resta
 */

/** CONVERSION DE TIPOS
 *
 */
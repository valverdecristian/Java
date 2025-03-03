package Operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        
        int i = 14, j = 8, k = 20;

        double promedio = i+j+k/3d;
        double promedio2 = (i+j+k)/3d;
        double promedio3 = (i+j+k)/ 3d * 10; // (14+8+20)/3 > 42/3 = 14 y luego *10

        System.out.println(promedio); // 28,66666
        System.out.println(promedio2); // 14
        System.out.println(promedio3); // 140
    }
}

/* Predencia
 *  ++  --                          incremento-decremento
 *  ()                              parentesis
 *  *   /   %                       multiplicacion,division,modulo
 *  +   -                           suma,resta
 *  >   >=  <   <=  instanceof
 *  ==  !=
 */
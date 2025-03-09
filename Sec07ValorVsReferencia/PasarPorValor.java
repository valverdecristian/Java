package Sec07ValorVsReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("iniciamos el metodo main con i = " + i);

        test(i); // 35

        System.out.println("Finaliza main con el valor de i = " + i); // 10
    }

    public static void test(int i) {
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo con el valor de i = " + i);
    }

    // ciertos objetos y clases en Java son INMUTABLES
    // cada vez que se modifica el valor se retorna una nueva instancia.

    // ✅ Resultado: La variable i en main sigue con su valor original (10) después de llamar al método test().
}

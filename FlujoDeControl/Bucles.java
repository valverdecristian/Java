package FlujoDeControl;
public class Bucles {
    public static void main(String[] args) {
        // Bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Bucle while
        int j = 0;
        while (j < 5) {
            System.out.println("Iteración " + j);
            j++;
        }

        // Bucle do-while
        int k = 0;
        do {
            System.out.println("Iteración " + k);
            k++;
        } while (k < 5);
    }
}
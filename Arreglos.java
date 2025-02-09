import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {

        // Inicializacion con tamaño fijo [los valores se asignan posteriormente]
        int[] numeros = new int[5];
        String[] nombres = new String[3];

        numeros[0] = 12;
        numeros[4] = 16;

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(nombres));

        
        // Inicializacion con valores
        int[] numeros2 = {1, 2, 4, 8, 16};
        String[] nombres2 = {"Alexis", "Luciano", "Ezequiel"};

        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(nombres2));
    }
}

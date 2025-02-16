import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int numero;
            boolean esValido;

            do {
                System.out.print("Ingrese un número entre -100 y 100: ");
                numero = scanner.nextInt();
                esValido = Validator.Validar(numero);

                if (!esValido) {
                    System.out.println("Número fuera de rango. Intente nuevamente.");
                }
            } while (!esValido);

            // Actualizamos suma, mínimo y máximo
            suma += numero;
            if (numero < min) min = numero;
            if (numero > max) max = numero;
        }

        float promedio = (float) suma / 5;

        // Mostrar resultados
        System.out.println("Valor mínimo ingresado: " + min);
        System.out.println("Valor máximo ingresado: " + max);
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}
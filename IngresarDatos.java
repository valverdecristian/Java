import java.util.Scanner;

public class IngresarDatos {
    public static void main(String[] args) {

        // 2) crear un Objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        // 3) leer datos desde la consola
        String nombre = scanner.nextLine();  // Lee una línea completa
        System.out.println("Hola, " + nombre + "!");

        // 4) cerrar el Scanner
        scanner.close();
    }
}

/**
 * 1) importar la Clase Scanner
 * 2) crear un Objeto Scanner
 * 3) leer datos desde la consola
 * 4) cerrar el Scanner
 * 5) manejo de errores: se puede usar un bloque try-catch.
 * 6) alternativa: usar BufferedReader
 */
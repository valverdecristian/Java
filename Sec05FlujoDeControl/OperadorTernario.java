package Sec05FlujoDeControl;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = scanner.nextInt();

        String mensaje = edad > 17 ? "Puede votar":"no puede votar";

        System.out.println(mensaje);

        scanner.close();
    }
}

// ALTERNATIVA COMPACTA A if-else
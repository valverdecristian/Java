package FlujoDeControl;

import java.util.Scanner;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        // solicitar una contraseña hasta que sea la correcta
        Scanner scanner = new Scanner(System.in);
        String password;
        String correctPsw = "cristian123";

        do {
            System.out.println("Ingresa la contraseña: ");
            password = scanner.nextLine();

            if (!password.equals(correctPsw)) {
                System.out.println("Contraseña incorrecta, intentarlo de nuevo");
            }
        } while (!password.equals(correctPsw));

        System.out.println("Acceso al usuario");
        scanner.close();
    }
}

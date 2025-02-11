package Ejercicios;

import java.util.Scanner;

public class AppDeTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("salir")){
            System.out.println("Ingresa comando: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        scanner.close();
    }
}

/** WHILE y DO-WHILE
 * 
 *  La diferencia entre ambos es EL MOMENTO EN EL QUE SE EVALUA LA CONDICION.
 *  WHILE: evalua la condicion antes de ejecutar el codigo.
 *  DO-WHILE: ejecuta el codigo al menos una vez. Util en menus, validaciones y
 *  procesos donde siempre hay una primera ejecucion.
 */
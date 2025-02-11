package FlujoDeControl;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para seleccionar un dia: ");
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Día no válido");
        }

        scanner.close();
    }
}

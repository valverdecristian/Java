package Sec08DateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato yyyy-mm-dd");
        try {
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            // COMPARAR FECHAS
            Date fecha2 = new Date();

            if (fecha.after(fecha2)){
                System.out.println("fecha del usuario es despues que fecha actual");
            } else if(fecha.before(fecha2)){
                System.out.println("fecha del usuario es anterior que fecha actual");
            } else if(fecha.equals(fecha2)){
                System.out.println("ambas fechas son iguales");
            }
            // TAMBIEN PODRIAMOS COMPARAR CON EL METODO compareTo()

        } catch (ParseException e) {
            // e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser yyyy-MM-dd");

            // puedo volver a invocar el main
            main(args);
        }
    }
}

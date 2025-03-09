package Sec08DateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        // fecha actual de formato standar
        System.out.println("fecha = " + fecha);

        // se puede simplificar con SimpleDateFormat
        // MM -> numero del mes     MMMM -> nombre del mes
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("Fecha formateada = " + fechaStr);

        long j = 0;
        for (int i = 0; i < 100000; i++) {
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal); // promedio 100ms

    }
}

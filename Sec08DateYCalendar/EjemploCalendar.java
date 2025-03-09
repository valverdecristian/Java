package Sec08DateYCalendar;

// en este caso siempre importar de java util
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploCalendar {
    public static void main(String[] args) {

        // no podemos hacer un new porque es una clase abstracta
        // la instancia la maneja la propia clase por debajo (del metodo getInstance() )
        Calendar calendario = Calendar.getInstance();

        Date fecha = calendario.getTime();

        System.out.println("calendario = " + fecha);

        // mes empieza con 0 (enero), 1(feb), etc.
        calendario.set(1994,Calendar.AUGUST,4);
        Date fechaNacimiento = calendario.getTime();

        System.out.println("fecha de Nacimiento = " + fechaNacimiento);

        System.out.println("\n=== OTRA FORMA: asignar parte por parte ===");

        calendario.set(Calendar.YEAR, 2025);
        calendario.set(Calendar.MONTH, 7);
        calendario.set(Calendar.DAY_OF_MONTH, 4);
        calendario.set(Calendar.HOUR_OF_DAY, 21);

        Date otraFecha = calendario.getTime();
        System.out.println("otra forma de asignar fecha = " + otraFecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH");
        String fechaConFormato = formato.format(otraFecha);

        System.out.println("fecha Con Formato = " + fechaConFormato);
    }
}

package Colecciones;

import java.util.ArrayDeque;
import java.util.Deque;

public class EjemploDeque {
    public static void run() {
        Deque<String> q = new ArrayDeque<>();
        q.addFirst("Goku"); // agrega al principio
        q.addFirst("Vegeta");
        q.addLast("Freezer"); // agrega al final
        q.addLast("Cell");

        System.out.println(q);

        // ver primer elemento con peekFirsh
        System.out.println(q.peekFirst());
    }
}

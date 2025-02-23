package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Creacion {
    public static void creacion() {
        ArrayList<Integer> al = new ArrayList<>();

        // al.stream();
        // para poder crear un stream de otra forma:
        // a partir de un array
        int [] xs = {1,2,3};
        Arrays.stream(xs);

        // otra forma de crea un stream
        Stream.of(3,4,5);

        
        // Streams infinitos: tenemos dos formas
        // 1) con el metodo iterate
        var s = Stream.iterate(0, x -> x +1);
        s.limit(5).forEach(x -> System.out.println(x)); // no olvidar el metodo LIMIT
    

        // 2) con generate
        // al igual que con el stream anterior esto no va a ejecutar absolutamente nada hasta
        // que nosotros no llamemos al metodo for-each
        Stream.generate(() -> new Random().nextInt(100))
            .limit(5)
            .forEach(x -> System.out.println(x));
    }
}

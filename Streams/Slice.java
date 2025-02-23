package Streams;

import java.util.stream.Stream;

public class Slice {
    public static void run() {
        Stream<Integer> s = Stream.of(1,2,3,4,5,6);

        // dividir nuestro stream
        // le paso el metodo por referencia
        // s.skip(2).forEach(System.out::println); // 3,4,5,6
        
        // comentar la operacion anterior.
        // s.limit(2).forEach(System.out::println); // 1,2

        // otra forma de dividir nuestro Stream con dropWhile() o takeWhile()
        // dropWhile: salta los elementos segun la condicion.
        // s.dropWhile(i -> i <3).forEach(System.out::println); // 3,4,5,6
        s.takeWhile(i -> i <3).forEach(System.out::println); // 1,2
    }
}

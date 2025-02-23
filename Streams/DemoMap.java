package Streams;

import java.util.List;
import java.util.stream.Stream;

public class DemoMap {

    public static void run() {

        // queremos obtener los emails de estos usuarios para mandar una notificacion
        List<User> users = List.of(
            new User(14, "cristian@holamundo.io"),
            new User(12, "alexis@holamundo.io"),
            new User(18, "ezequiel@holamundo.io"),
            new User(48, "max@holamundo.io")
        );

        users.stream()
            .map(u -> u.email)
            .forEach(email -> System.out.println(email));
    }


    public static void flatMap() {
        var stream = Stream.of(List.of(1,2,3), List.of(4,5));

        stream.flatMap(l -> l.stream())
            .forEach(System.out::println);
    }

}

package Streams;

import java.util.List;
import java.util.stream.Collectors;;

public class Collector {
    public static void run() {
        List<User> users = List.of(
            new User(14, "cristian@holamundo.io"),
            new User(12, "alexis@holamundo.io"),
            new User(18, "ezequiel@holamundo.io"),
            new User(48, "max@holamundo.io")
        );

        var resultado = users.stream()
            .map(x -> x.email)
            .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }

    public static void particionado() {
        List<User> users = List.of(
            new User(14, "cristian@holamundo.io"),
            new User(12, "alexis@holamundo.io"),
            new User(18, "ezequiel@holamundo.io"),
            new User(48, "max@holamundo.io")
        );

        var particion = users.stream()
            .collect(Collectors.partitioningBy(x -> x.age > 17));

        System.out.println(particion.get(true)); // obtener a mayores de edad
    }

    public static void grouping () {
        List<User> users = List.of(
            new User(14, "cristian@holamundo.io", Mandos.MEDIO),
            new User(12, "alexis@holamundo.io", Mandos.MEDIO),
            new User(18, "ezequiel@holamundo.io", Mandos.ALTO),
            new User(48, "max@holamundo.io", Mandos.ALTO)
        );

        var groupedByMando = users.stream()
            .collect(Collectors.groupingBy(x -> x.mando));

        System.out.println("grupedByMando = " + groupedByMando);
    }
}

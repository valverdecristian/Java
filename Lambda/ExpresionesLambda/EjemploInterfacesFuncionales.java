package Lambda.ExpresionesLambda;

import java.util.function.*;

public class EjemploInterfacesFuncionales {
    public static void main(String[] args) {
        // Consumer: imprime el mensaje (retorna void)
        Consumer<String> consumer = message -> System.out.println("Mensaje: " + message);
        consumer.accept("Hola");

        // Supplier: retorna un valor sin recibir parámetros
        // sirve para poder retrasar la ejecucion de un metodo, util para fechas en DB.
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Número aleatorio: " + supplier.get());

        // Function: transforma un String a su longitud
        // se trabaja mucho cuando trabajamos con Strings
        Function<String, Integer> function = String::length;
        System.out.println("Longitud: " + function.apply("Lambda"));

        // Predicate: verifica si la longitud de una palabra es mayor a 5
        Predicate<String> predicate = word -> word.length() > 5;
        System.out.println("¿Es largo? " + predicate.test("Lambda"));
    }
}
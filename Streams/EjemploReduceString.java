package Streams;

import java.util.List;

public class EjemploReduceString {
    public static void main(String[] args) {
        List<String> palabras = List.of("Java", "Stream", "Reducer");

        String resultado = palabras.stream()
                                   .reduce("", (a, b) -> a + " " + b);

        System.out.println("Concatenación: " + resultado.trim()); // "Java Stream Reducer"
    }
}
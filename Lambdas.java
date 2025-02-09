import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> lenguajes = Arrays.asList("Java", "Python", "JavaScript");

        // Usando lambda para imprimir cada elemento
        lenguajes.forEach(lenguaje -> System.out.println(lenguaje));

        // Usando streams para filtrar y transformar datos
        lenguajes.stream()
                 .filter(lenguaje -> lenguaje.startsWith("J"))
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}
package Excepciones;

// clase propia que implementa AutoCloseable
public class MiRecurso implements AutoCloseable {
    public void usar() {
        System.out.println("Usando el recurso...");
    }

    @Override
    public void close() {
        System.out.println("Cerrando el recurso...");
    }
}
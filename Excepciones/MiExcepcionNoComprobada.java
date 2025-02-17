package Excepciones;

// Excepcion NO comprobada (unchecked)
// Extiende de RuntimeException
public class MiExcepcionNoComprobada extends RuntimeException {
    public MiExcepcionNoComprobada(String mensaje) {
        super(mensaje);
    }
}
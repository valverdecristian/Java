package Excepciones;

public class Validador {
    public void verificar(boolean condicion) throws MiExcepcion {
        if (!condicion) {
            throw new MiExcepcion("Ocurrió un error personalizado.");
        }
    }
}

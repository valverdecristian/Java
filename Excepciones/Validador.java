package Excepciones;

public class Validador {
    public void verificar(boolean condicion) throws MiExcepcionComprobada {
        if (!condicion) {
            throw new MiExcepcionComprobada("Ocurrió un error personalizado.");
        }
    }
}

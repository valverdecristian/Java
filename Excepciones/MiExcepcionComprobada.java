package Excepciones;

// Excepcion personalizada comprobada (Checked)
// Extiende de Exception
public class MiExcepcionComprobada extends Exception {
    public MiExcepcionComprobada(String mensaje) {
        super(mensaje);
    }
}
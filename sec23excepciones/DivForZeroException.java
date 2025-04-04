package sec23excepciones;

// heredados de Exception para que sea chequeada
public class DivForZeroException extends Exception {
    public DivForZeroException(String mensaje){
        super(mensaje);
    }
}

package Sec19POO_HerenciaYClasesAbstractas.org.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "El campo %s tiene un formato de correo invalido";

    // esta es una validacion muy simple
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}

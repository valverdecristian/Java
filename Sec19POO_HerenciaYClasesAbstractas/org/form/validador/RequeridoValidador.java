package Sec19POO_HerenciaYClasesAbstractas.org.form.validador;

public class RequeridoValidador extends Validador {

    protected String mensaje = "el campo %s requerido";

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
        return valor != null && !valor.isBlank();
    }
}

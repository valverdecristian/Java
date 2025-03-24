package Sec19POO_HerenciaYClasesAbstractas.org.form.validador;

public class NumeroValidador extends Validador {

    protected String mensaje = "El campo %s debe ser numero";

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
        try{
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}

package Sec19POO_HerenciaYClasesAbstractas.org.form.validador;

import Sec19POO_HerenciaYClasesAbstractas.org.form.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "El campo %s debe tener minimo de %d caracteres y maximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador(){
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        // this.mensaje = String.format(this.mensaje, this.min, this.max);
        if(valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    }

    /*public String getMensajeFormateado (String campo){
        return String.format(this.mensaje, campo, this.min, this.max);
    }*/
}

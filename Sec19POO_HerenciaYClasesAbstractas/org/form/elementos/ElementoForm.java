package Sec19POO_HerenciaYClasesAbstractas.org.form.elementos;

import Sec19POO_HerenciaYClasesAbstractas.org.form.validador.Validador;
import Sec19POO_HerenciaYClasesAbstractas.org.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador v:validadores){
            if(!v.esValido(this.valor)){ // si la validacion falla
                if(v instanceof MensajeFormateable){
                    // deberia ser instanceof de la interfaz, pero LargoValidador la implementa
                    this.errores.add(((MensajeFormateable)v).getMensajeFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre)); // agrega el mensaje de error
                }
            }
        }
        return this.errores.isEmpty(); // devuelve true si no hay errores
    }

    abstract public String dibujarHtml();
}

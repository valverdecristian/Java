package Sec20POO_Interfaces.imprenta.modelo;

abstract public class Hoja {
    protected String contenido;

    public Hoja(String contenido){
        this.contenido = contenido;
    }

    abstract public String imprimir();
}

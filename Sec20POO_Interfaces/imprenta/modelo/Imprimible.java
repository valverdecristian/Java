package Sec20POO_Interfaces.imprenta.modelo;

public interface Imprimible {

    final static String TEXTO_DEFECTO = "Imprimiendo valor por defecto";

    String imprimir();

    // en este caso no estan oblidos a implementar este metodo
    // sirve para metodos opcionales
    default String imprimir2(){
        return TEXTO_DEFECTO;
    }
}

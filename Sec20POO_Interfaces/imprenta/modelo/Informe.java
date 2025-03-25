package Sec20POO_Interfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    private Persona autor;
    private Persona revisor;

    public Informe(Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por " + autor.getNombre() + " revisador por: " + revisor.getNombre()
                + "\n" + this.contenido;
    }
}

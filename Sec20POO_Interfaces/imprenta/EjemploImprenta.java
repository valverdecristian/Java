package Sec20POO_Interfaces.imprenta;

import Sec20POO_Interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Cristian", "Valverde"), "Programación", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patron de diseños: Elementos reusables de la POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observdor"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fouler"),
                new Persona("James", "Gosling"),
                "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Imprimiendo desde una clase anonima";
            }
        });

    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}

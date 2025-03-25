package Sec20POO_Interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    // para poder agregar experiencia a la lista
    public Curriculum addExperiencia(String exp){
        experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ")
                .append(persona.getNombre()).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesión: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");

        for (String exp: experiencias){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}

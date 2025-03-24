package Sec19POO_HerenciaYClasesAbstractas.org.form.elementos;

import Sec19POO_HerenciaYClasesAbstractas.org.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    // List es una interface
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpciones(Opcion opcion){
        this.opciones.add(opcion);

        // esto se hace para poder encadenar los add
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for(Opcion opcion: this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">").append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}

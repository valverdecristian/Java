// se usa la interfaz Atendible como restriccion
// genericos en tipo de retorno

import java.util.ArrayList;

public class Lista2<T extends Atendible> {
    private ArrayList<T> elementos = new ArrayList<>();

    public Lista2<T> add(T t){
        elementos.add(t);
        return this;
    }

    // queremos obtener un elemento
    public T get(int index) {
        return elementos.get(index);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}

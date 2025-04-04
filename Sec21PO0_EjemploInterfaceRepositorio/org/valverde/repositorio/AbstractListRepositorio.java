package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;

// en vez de implementar multiples interfaces, implementamos una sola full
public abstract class AbstractListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrud<T> {

    // la idea es que dataSource sea inmutable (se ve afectado por el sort)
    protected List<T> dataSource; // contenedor de los datos

    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    // se puede reutilizar este metodo
    @Override
    public T porId(Integer id) {
        T resultado = null; // por default null
        for (T t: dataSource){
            if(t.getId() != null && t.getId().equals(id)){
                resultado = t;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }


    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}

package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import java.util.List;

// IMPLEMENTANDO GENERICS
public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}

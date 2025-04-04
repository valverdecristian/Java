package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

// interfaz principal que agrupa todas
public interface OrdenablePaginableCrud<T> extends OrdenableRepositorio<T>,
PaginableRepositorio<T>, CrudRepositorio<T>, Contable {
}

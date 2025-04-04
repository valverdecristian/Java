package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}

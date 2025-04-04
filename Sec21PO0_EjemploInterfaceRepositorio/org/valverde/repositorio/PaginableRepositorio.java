package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}

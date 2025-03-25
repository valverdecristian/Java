package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}

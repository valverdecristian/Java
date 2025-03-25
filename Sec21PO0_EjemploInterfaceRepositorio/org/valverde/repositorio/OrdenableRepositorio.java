package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}

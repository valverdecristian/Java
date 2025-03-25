package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}

package Sec21PO0_EjemploInterfaceRepositorio.org.valverde;

import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo.Cliente;
import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        // PRINCIPIO DE INVERSION DE DEPENDENCIAS (DIP)
        OrdenablePaginableCrud<Cliente> repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Joaquin", "Abal"));
        repo.crear(new Cliente("Cristian", "Valverde"));
        repo.crear(new Cliente("Alexis", "Aranda"));
        repo.crear(new Cliente("Matias", "Cantero"));
        repo.crear(new Cliente("Nicolas", "Brites"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("\n===subconjunto paginable===");
        List<Cliente> paginable = repo.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("\n===ordenar ASC por nombre===");
        List<Cliente> clientesOrdenAscNombre = repo.listar("nombre", Direccion.ASC);
        for (Cliente cliente : clientesOrdenAscNombre) {
            System.out.println(cliente);
        }

        System.out.println("\n===ordenar DESC por nombre===");
        List<Cliente> clientesOrdenDescNombre = repo.listar("nombre", Direccion.DESC);
        for (Cliente cliente : clientesOrdenDescNombre) {
            System.out.println(cliente);
        }

        System.out.println("\n===ordenar ASC por apellido===");
        List<Cliente> clientesOrdenAscApellido = repo.listar("apellido", Direccion.ASC);
        for (Cliente cliente : clientesOrdenAscApellido) {
            System.out.println(cliente);
        }

        System.out.println("\n===ordenar DESC por apellido===");
        List<Cliente> clientesOrdenDescApellido = repo.listar("apellido", Direccion.DESC);
        for (Cliente cliente : clientesOrdenDescApellido) {
            System.out.println(cliente);
        }

        System.out.println("\n===editar===");
        Cliente dianActualizar = new Cliente("Dian", "Yrigay");
        dianActualizar.setId(2);
        repo.editar(dianActualizar);
        Cliente dian = repo.porId(2);
        System.out.println("cliente editado: " + dian);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("==eliminar===");
        repo.eliminar(2);
        clientes.forEach(System.out::println);

        System.out.println("===total registros===");
        System.out.println(repo.total());
    }
}

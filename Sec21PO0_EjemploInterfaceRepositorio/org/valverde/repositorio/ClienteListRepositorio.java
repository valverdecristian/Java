package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.repositorio;

import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }


    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,b) -> {
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo,a,b);
            } else if(dir == Direccion.DESC){
                resultado = ordenar(campo,b,a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }

        return resultado;
    }
}

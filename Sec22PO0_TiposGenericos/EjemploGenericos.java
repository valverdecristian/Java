package Sec22PO0_TiposGenericos;

import Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Cristian","Valverde"));
        clientes.add(new Cliente("Sebastian","Valverde"));

        Cliente cristian = clientes.iterator().next();
        // otra forma es con (Cliente)clientes.get(0);

        Cliente[] clientesArreglo = {new Cliente("Andres", "Guzman"),
                new Cliente("Luci", "Martinez")};

        Integer[] enterosArreglo = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        System.out.println("===lista de clientes===");
        clientesLista.forEach(System.out::println);
        System.out.println("\n===lista de enteros===");
        enterosLista.forEach(System.out::println);

        System.out.println("===sobrecarga de metodo===");
        List<String> nombres = fromArrayToList(new String[]{"Pepe", "Momo","Jorge"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Mayra", "Soria")
        });

        System.out.println("==METODO IMPRIMIR CLIENTES==");
        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList); // gracias al wildcard

        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Maximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9 , 11.6, 7.78));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: " +
                maximo("zanahoria", "arandanos", "manzana"));

    }

    // necesitamos realizar metodos mas reutilizables
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    // SOBRECARGA
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    // PUEDO SEGUIR RESTRINGIENDO
    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    // SOBRECARGA
    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for (G elemento : g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    // WILDCARD
    // al agregar ? extends puedo pasar una clase hija tambien.
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}

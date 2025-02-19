package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceList {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        Collections.addAll(lista, 1,2,3,5,7);

        var elemento = lista.get(4);
        System.out.println("elemento: "+elemento);

        lista.set(3, 40);

        // donde se encuentra el elemento
        // si el elemento no existe devuelve -1
        System.out.println(lista.indexOf(40));
        System.out.println(lista.lastIndexOf(4));
    }
}

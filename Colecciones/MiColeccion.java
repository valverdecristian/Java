package Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MiColeccion {
    public static void run(){

        // aca le indico que el tipo es Collection en vez de ArrayList
        // porque lo que yo quiero es que mi software se encuentre mas desacoplado.
        Collection<Number> coleccion = new ArrayList<>();

        // metodos de las colecciones
        coleccion.add(3);
        coleccion.add(5);
        coleccion.add(9);

        // otra forma de agregar elementos (con addAll())
        // el el 1er argumento va la coleccion donde voy a agregar los elementos
        // desde el 2do argumento le pasamos los elementos a agregar.
        Collections.addAll(coleccion, 1,4,6);

        coleccion.remove(3);
        
        System.out.println("Existe: " + coleccion.contains(9));

        System.out.println(coleccion);

        // tomar esta coleccion y transformarla en un array.
        // Number[] x = coleccion.toArray(new Number[5]);

        // verificar si esta coleccion tiene elementos
        coleccion.isEmpty(); // devuelve false

        // eliminar todos los elementos de la coleccion
        coleccion.clear();
        System.out.println("Despues de clear: " + coleccion);

        // comparar
        Collection<Number> otraColeccion = new ArrayList<>();
        otraColeccion.add(12);
        otraColeccion.add(11);
        coleccion.equals(otraColeccion); // devuelve falso

        // concatenar ambas colecciones
        coleccion.addAll(otraColeccion);
        System.out.println("Despues de concatenar: " + coleccion);

        // las podemos iterar con for-each
        for (Number number : coleccion) {
            System.out.println("Elemento: " + number);
        }
    }
}

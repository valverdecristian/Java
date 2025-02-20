package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MiColeccion.run();;


        // creamos una nueva instancia de Lista
        var lista = new Lista<>();
        lista.add(3);
        lista.add(5);
        lista.add(7);

        // podemos empezar a iterar sobre esta lista (que es iterable)
        for (var elemento : lista) {
            System.out.println(elemento);
        }

        // iterator nos va a crear un puntero que apuntara a cada uno de los elementos
        // esto se hizo comentando el for-each (lineas 12-14)
        var iterator = lista.iterator();

        while (iterator.hasNext()) {
            var e = iterator.next();
            System.out.println(e);
        }

        // el trabajo que hace while es el trabajo que hace Java detras cuando
        // usamos el for-each en las lineas 12-14
        // CONCLUSION: ambos hacen lo mismo

        System.out.println("--- INTERFACE COMPARABLE ---");

        List<EjemploComparable> listaComparable = new ArrayList<EjemploComparable>();

        EjemploComparable e1 = new EjemploComparable("Cris", 30);
        EjemploComparable e3 = new EjemploComparable("Alexis", 27);
        EjemploComparable e2 = new EjemploComparable("Tian", 10);

        listaComparable.add(e1);
        listaComparable.add(e2);
        listaComparable.add(e3);

        Collections.sort(listaComparable, new Comparator<EjemploComparable>() {
            @Override
            public int compare(EjemploComparable o1, EjemploComparable o2) {
                // return o1.getEdad().compareTo(o2.getEdad().intValue());
                
                // otra forma de retornar lo mismo
                return Integer.compare(o1.getEdad(), o2.getEdad());
            }
        });
        // NOTA: para optimizar el codigo, se puede probar con lambdas Comparator.comparingInt()

        // Refactorizado lineas 51 a 59 (con expresiones Lambdas)
        Collections.sort(listaComparable, Comparator.comparingInt(EjemploComparable::getEdad));

        System.out.println(listaComparable);


        // SET
        System.out.println("--- SET ---");
        EjemploSet.run();


        System.out.println("--- DEQUE ---");
        EjemploDeque.run();
    }
}

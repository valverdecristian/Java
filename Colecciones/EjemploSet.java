package Colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// SET: no garantiza el orden de los elementos, es solo para verificar que los elementos son unicos
public class EjemploSet {

    public static void run(){
        // Creamos un Set con valores iniciales
        Set<String> conjunto = new HashSet<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes"));
        Set<String> conjunto2 = new HashSet<>(Arrays.asList("Viernes", "Sabado", "Domingo"));

        // se le puede agregar elementos a este conjunto
        conjunto.add("Sabado");
        conjunto.add("Lunes"); // este elemento no se vuelve a agregar

        // UNION: usamos el metodo addAll
        conjunto.addAll(conjunto2);

        // DIFERENCIA
        conjunto.removeAll(conjunto2);

        // INTERSECCION
        conjunto.retainAll(conjunto2); // la interseccion seria Viernes y Sabado [si comento addAll y removeAll]

        System.out.println(conjunto);
    }
}

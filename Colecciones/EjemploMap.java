package Colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        // Declaración del HashMap
        Map<String, Integer> stock = new HashMap<>();

        // Agregar elementos
        stock.put("Manzanas", 50);
        stock.put("Naranjas", 30);
        stock.put("Peras", 20);

        // Acceder a un valor
        System.out.println("Stock de Naranjas: " + stock.get("Naranjas")); // 30

        // Recorrer el mapa
        for (Map.Entry<String, Integer> entrada : stock.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        // tambien podemos usar un replace
    }
}
